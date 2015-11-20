package textnotesv1

class DashboardController {

    def index() { }
	
	
	
	def openDashboard() {
		User user = User.findByUserID(session["userID"])
		String phoneNumber = session["phoneNumber"]
		
		if (params.requestType == null)  params.requestType = "Notes"
		
		def messages = getUserContent(user.userID, params.requestType)
		
		render(view:"MainDash", model: ["phoneNumber" : phoneNumber, "messages" : messages])
		
	}
	
	def getUserContent(String userID, String requestType) {
		//ArrayList<Messages> messages =  new ArrayList<Messages>()
		def messages		
		switch (requestType) {
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
