package textnotesv1

import java.text.SimpleDateFormat
import smsGate.smsGateOut

class LoginController {

    def index() { 		
		login()
	}
	
	def login() {		
		if (request.getCookie('user') && !session["userID"]) {
			if (createSession(request.getCookie('user').toString())) {
				redirect(controller: "Dashboard")		
			} else {
				logout()
			}
		} else if (session["userID"]) {
			redirect(controller: "Dashboard")
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
		redirect(controller: "Home")		
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
											
				createSession(user.userID) // Create the session	
				
				// Set the last login date
				user.lastLoginDate = new Date()
				user.save(flush:true)
				
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
				user.banned = false
				user.lastLoginDate =  new Date()
				user.signUpDate = new Date()
				
				user.firstName = params.firstname
				user.lastName = params.lastname
				
				// Create a UUID and cut it in half
				String uniqueID = UUID.randomUUID().toString().replace("-", "");
				int midpoint = uniqueID.length() / 2;
				String halfUUID = uniqueID.substring(0, midpoint)
				
				user.userID = halfUUID
				
				user.validated = true
				user.save(flush:true)
				
				// create account info and set 14 day free trial
				UserAccountInfo account = new UserAccountInfo()
				account.userID = user.userID
				account.accountType = "Trial"
				account.monthlyTextBalance = 500
				account.remainingMonthlyTextBalance = 500
				
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String minDate = "11/10/1989";
				
				account.SubscriptionEff = sdf.parse(minDate);
				account.SubscriptionExp = sdf.parse(minDate);
				
				
				// Set trial date to 14 days in the future
				Calendar c = Calendar.getInstance();
				c.setTime(new Date()); // Now use today date.
				c.add(Calendar.DATE, 14); // Adding 5 days
				//String output = sdf.format(c.getTime());
				
				account.trialDateExp = c.getTime()
				account.save(flush:true)

				if (params.rememberme) {
					// Create a cookie for the user
					response.setCookie('user', user.userID.toString(), 604800) // 1 week
				}
					
				createSession(user.userID) // Create the session
				redirect(controller: "Dashboard", action: "dashboard")
					
		} else if (testUser != null) {
			// user exist, display an error that the account did not create 
			error = "*That email already exist in our system. Go to our login page to login."
			render(view:"CreateAccount", model:["error":error])	
		} else {
			render(view:"CreateAccount")		
		}
	}
	
	// ********** Login steps **********

	
	def createSession(String userID) {
		// Creates a session if one does not exist
		if (!session["userID"]) {
			User user = User.findByUserID(userID)
			if (user) {
				session["userID"] = user.userID
				session["firstName"] = user.firstName
				session["lastName"] = user.lastName
				session["signUpDate"] = user.signUpDate	
				return true
			} else {
				// User has been deleted and a cookie still exist...
				return false		
			}		
		} else {
			return false
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
