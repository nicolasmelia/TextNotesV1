package textnotesv1

class HomeController {

    def index() {
		if (request.getCookie('user') && !session["userID"]) {
			createSession(request.getCookie('user').toString())
			render (view: "Home")
		} else if (session["userID"]) {
			render (view: "Home")
		} else {
			render (view: "Home")	
		}
	}	
	
	def pricing() {
		render (view: "Pricing")
	}
	
	def createSession(String userID) {
		// Creates a session if one does not exist
		if (!session["userID"]) {
			User user = User.findByUserID(userID)
			if (user != null) { // User may have been deleted
				session["userID"] = user.userID
				session["firstName"] = user.firstName
				session["lastName"] = user.lastName
				session["signUpDate"] = user.signUpDate
				return true
			} else {
				return false
			}
		} else {
			return false
		}
	}
	
}
