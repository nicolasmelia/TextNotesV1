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
	
	
	def createSession(String userID) {
		// Creates a session if one does not exist
		if (!session["userID"]) {
			User user = User.findByUserID(userID)
			session["userID"] = user.userID
			session["firstName"] = user.firstName
			session["lastName"] = user.lastName
			session["signUpDate"] = user.signUpDate
			return true
		} else {
			return false
		}
	}
	
}
