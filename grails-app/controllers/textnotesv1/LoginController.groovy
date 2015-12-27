package textnotesv1

import smsGate.smsGateOut

class LoginController {

    def index() { 		
		login()
	}
	
	def login() {
		if (request.getCookie('user')) {
			session["userID"] = request.getCookie('user') // Create the session
			redirect(controller: "Dashboard", action: "dashboard")
		} else {
			render(view:"Login")	
		}	
	}
	
	def newAccount(){
		render(view:"CreateAccount")	
	}
	
	def logout() {
		session.invalidate()
		response.deleteCookie('user')
		redirect(controller: "Home", action: "home")		
	}
	

	def attemptLogin(){
		User user = User.findByEmail(params.email.toString().toLowerCase().trim())
		def error = "none";
		if (user != null) {
			if (user.password.equals(params.password.toString().trim())){				
				if (params.rememberme) {
					// Create a cookie for the user
					response.setCookie('user', user.userID.toString(), 604800) // 1 week	
				}					
				session["userID"] = user.userID // Create the session
				redirect(controller: "Dashboard", action: "dashboard")						
			} else {
				error = "*Incorrect email or password. Please try again."
				render(view:"Login", model:["error":error])
			}
		} else {
			error = "*That email address does not exist. Please try again."
			render(view:"Login", model:["error":error])
		}
		
	}

	
	def createAccount() {
		User testUser = User.findByEmail(params.email.toString().toLowerCase().trim())
		def error = ""
		if (testUser == null && params.email != null) {
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
					
		} else if (testUser != null) {
			// user exist, display an error that the account did not create 
			error = "*That email already exist in our system. Go to our login page to login."
			render(view:"CreateAccount", model:["error":error])	
		} else {
			render(view:"CreateAccount")		
		}
	}
	
	// ********** Login steps **********

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
