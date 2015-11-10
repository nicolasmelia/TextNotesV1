package textnotesv1

import smsGate.smsGateOut

class LoginController {

    def index() { 		
		render(view:"Login")
	}
	
	def login() {
		render(view:"Login")
	}
	
	def logout() {
		session.invalidate()
		redirect(controller: "Home", action: "home")		
	}
	
	
	def varify(){
		render(view:"VarifyNumber")	
	}
	
	def attemptLogin(){		
		if (params.number != null && isNumeric(params.number.toString())) {
			String phoneNumber = "+1" + params.number.toString().trim()
			
			if (numberExist(phoneNumber)) {	
				User user = User.findByPhoneNumber(phoneNumber)
				
				// Create the users session
				session["userID"] = user.userID	
				session["number"] = params.number.toString().trim()
				
				if (user.validated) {
					if (user.banned == false) {
						// User is valid, next step is the password form
						render(view:"password", model:["phoneNumber":user.phoneNumber, "status": "init"])
					} else {
						render "This account has been locked ("+ phoneNumber +"). Contact customer serivce at service@TxtWolf.com for information."
					}
				} else {
					// SEMIACCOUNT! User not validated but has entered their number before, show account creation form
					if (session["sentValidCode"] == null) {
						String code
						if (user.validationCode.toString().equals("None")) {
							code = generateRandomCode()
						} else {
							code = user.validationCode
						}
						sendValidationCode(phoneNumber, code)
						session["sentValidCode"] = "True"
					}			
					render(view:"VarifyNumber", model:["phoneNumber": phoneNumber, "status": "init"])	
				}				
			} else {	
				// ****** FIRST TIME USER CREATE A partialAccount ******
				// Send user a validation code
				String code = sendValidationCode(phoneNumber, generateRandomCode())
				session["sentValidCode"] = "True"
				
				//  Create a new user and save their validation code
				User newUser = new User()
				newUser.phoneNumber = phoneNumber
				newUser.validationCode = code
				newUser.accountType = "partialAccount"
				newUser.validated = false
				
				newUser.allowedTxt = 10
				newUser.sentTxt = 0
						
				// Create a UUID and cut it in half
				String uniqueID = UUID.randomUUID().toString().replace("-", "");
				int midpoint = uniqueID.length() / 2;
				String halfUUID = uniqueID.substring(0, midpoint)
				
				newUser.userID = halfUUID	
				
				// Create the users session
				session["userID"] = newUser.userID
				session["number"] = phoneNumber
				newUser.save(flush:true)
								
				render(view:"VarifyNumber", model:["phoneNumber": phoneNumber, "status": "init"])	
			}
		} else {
			render("Number not found in request.")
		}
	}

	def password() {
		if (session["userID"]) {
			User user = User.findByUserID(session["userID"])
			if (params.password.toString().equals(user.password)) {
				// Correct password
				user.lastLogin = new Date()
				redirect(controller: "Dashboard", action: "openDashboard")			
			} else {
				// Wrong password
				render(view:"password", model:["phoneNumber":user.phoneNumber, "status": "wrongPassword"])
			}
		} else {
			redirect(action: "login")		
		}		
	}
	
	def createAccount() {
		if (session["userID"]) {
			User user = User.findByUserID(session["userID"])
			if (compareValidationCode(params.code)) {
				user.password = params.password.toString().trim()
				user.username = ""
				user.email = params.email.toString().trim()
				user.accountType = "Full"
				user.banned = false
				user.lastLogin =  new Date()
				
				user.allowedTxt = 10
				user.sentTxt = 0
				
				user.validated = true
				user.save(flush:true)
				render "created"
			} else {
				render(view:"VarifyNumber", model:["phoneNumber": user.phoneNumber, "status": "wrongPassword"])	
			}		
		} else {
			redirect(action: "login")		
		}	
	}
	
	def compareValidationCode(code) {
		// Render result to ajax request
		if (session["userID"]) {
			User user = User.findByUserID(session["userID"])	
			if (user.validationCode.equals(code.toString().trim())) {
				return true
			} else {
				return false
			}	
		} else {
			// user does not exist - wtf hackers?
			return false	
		}	
	}
	
	// ********** Login steps **********
	def numberExist(number) {
		// Checks if phone number exist in database and tied to user
		String phoneNumber = number.toString().trim()
		User user = User.findByPhoneNumber(phoneNumber)	
		if (user != null) {
			return true
		} else {		
			return false
		}
	}
	
	def sendValidationCode(number, code){
		// Sends validation code to number defined. 
		// Function also Returns code sent to number
		String message = "Your validation code sent from TxtWolf: " + code
		smsGateOut.sendMessage(number, message)	
		return code
	}
	
	def resendValidationCode() {
		// Ajax request
		if (session["userID"]) {
			User user = User.findByUserID(session["userID"])
			if (user != null) {
				sendValidationCode(user.phoneNumber, user.validationCode)
			}
			render "True"
		}  else {
			render "False"
			
		}
	}
	
	def generateRandomCode() {
		// Generates the six digit random validation code
		int[] randomNumbers = new Random().ints(1, 9).distinct().limit(6).toArray();	
		String randomNumberString = ""
		for (int number : randomNumbers){
			randomNumberString = randomNumberString + number		
		}	
		return randomNumberString
	}
	
	public boolean isNumeric(String s) {
		return s.matches("[-+]?\\d*\\.?\\d+");
	}
	
}
