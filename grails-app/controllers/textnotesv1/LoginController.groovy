package textnotesv1

import smsGate.smsGateOut

class LoginController {

    def index() { 		
		render(view:"Login", model:["error":"none"])
	}
	
	def login() {
		render(view:"Login", model:["error":"none"])
	}
	
	def newAccount(){
		render(view:"CreateAccount")
	}
	
	def logout() {
		session.invalidate()
		redirect(controller: "Home", action: "home")		
	}
	

	def attemptLogin(){		
		User user = User.findByEmail(params.email.toString().toLowerCase().trim())
		def error = "none";
		if (user != null) {
			if (user.password.equals(params.password.toString().trim())){
				 render "Success"		
			} else {
				render "Fail"
			}
		} else {
			error = "That email address does not exist. Please try again."
			render(view:"Login", model:["error":error])
		}
		
	}

	
	def createAccount() {
				User user = new User()
				user.password = params.passwordone.toString().trim()
				user.username = ""
				user.email = params.email.toString().toLowerCase().trim()
				user.accountType = "Full"
				user.banned = false
				user.lastLogin =  new Date()
				
				user.firstName = params.firstname
				user.lastName = params.lastname
				
				// Create a UUID and cut it in half
				String uniqueID = UUID.randomUUID().toString().replace("-", "");
				int midpoint = uniqueID.length() / 2;
				String halfUUID = uniqueID.substring(0, midpoint)
				
				user.userID = halfUUID
				
				user.allowedTxt = 10
				user.sentTxt = 0
				
				user.validated = true
				user.save(flush:true)
				session["userID"] = user.userID
				
				render "created"	
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
	
	 def joinBeta() {	 
		 render(view:"JoinBeta")
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
