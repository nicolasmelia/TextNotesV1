package textnotesv1

class DashboardController {

    def index() { }
	
	
	
	def dashboard() {
	//	User user = User.findByUserID(session["userID"])
	//	String phoneNumber = session["phoneNumber"]
		
	//	if (params.requestType == null)  params.requestType = "All"
		
		//def messages = getUserContent(user.userID, params.requestType)
		
		//render(view:"dashboard_home", model: ["phoneNumber" : phoneNumber, "messages" : messages])
		render(view:"dashboard_home")
		
	}
	
	def getUserContent(String userID, String requestType) {
		//ArrayList<Messages> messages =  new ArrayList<Messages>()
		def messages		
		switch (requestType) {
			case "All":
				messages = Messages.executeQuery("FROM Messages m WHERE m.userID = ? AND m.deleted = false ORDER BY date DESC)", [userID], [max: 15])
				break;
			case "Notes":
				messages = Messages.executeQuery("FROM Messages m WHERE m.userID = ? AND m.messageType = ? AND m.deleted = false ORDER BY date DESC)", [userID, "Note"], [max: 15])
				break;
		}

		return messages
		
	}
	
	def deleteNote() {
		Messages message = Messages.findByMessageID(params.messageID)
		if (message.userID.toString().equals(session["userID"])) {
			message.deleted = true
			message.save(flush:true)
			render("True")
		} else {
			render("False")		
		}	
	}
	
	
}
