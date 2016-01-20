package textnotesv1

class DashboardController {

    def index() { 
		dashboard()
	}
	
	def dashboard() {	
				
		 if (session["userID"]) {
			 
			 // Pull latest account information
			 UserAccountInfo accountInfo = UserAccountInfo.findByUserID(session["userID"])	 
			 render(view:"dashboard_home",  model: [accountInfo: accountInfo])
			 
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	
	def sendTxt() {
			
			if (session["userID"]) {
				
				// Pull latest account information
				UserAccountInfo accountInfo = UserAccountInfo.findByUserID(session["userID"])
				render(view:"dashboard_SendTxt", model: [accountInfo: accountInfo])
				
		   } else {
			   redirect(controller: "Home")
		   }		
	}
	
	def newContact() {
			if (session["userID"]) {
				
				// Pull latest account information
				UserAccountInfo accountInfo = UserAccountInfo.findByUserID(session["userID"])
				render(view:"dashboard_addContact", model: [accountInfo: accountInfo])
				
		   } else {
			   redirect(controller: "Home")
		   }
	}

	
	def addNewContact() {	
		Contact contact = new Contact()
		contact.firstName = params.firstName	
		contact.lastName = params.lastName
		contact.phoneNumber = params.phoneNumber
		
		contact.city = params.city
		contact.state = params.state
		contact.zip = params.zip
		
		contact.addDate = new Date()
		
		// Create a UUID and cut it in half
		String uniqueID = UUID.randomUUID().toString().replace("-", "");
		int midpoint = uniqueID.length() / 2;
		String halfUUID = uniqueID.substring(0, midpoint)
				
		contact.contactID = halfUUID
	
		
		contact.save(flush:true)		
	}
	
	
	def confirmation() {
						
		 if (session["userID"]) {
			 
			 // Pull latest account information
			 UserAccountInfo accountInfo = UserAccountInfo.findByUserID(session["userID"])	 
			 render(view:"dashboard_confirmation",  model: [accountInfo: accountInfo])
			 
		} else {
			redirect(controller: "Home")
		}
	}
	
	def proccessTxtSend() {
		render params.tags
	}
	
	def getUserContent(String userID, String requestType) {
		//ArrayList<Messages> messages =  new ArrayList<Messages>()
		def messages		
		switch (requestType) {
			case "All":
				messages = MessageIn.executeQuery("FROM Messages m WHERE m.userID = ? AND m.deleted = false ORDER BY date DESC)", [userID], [max: 15])
				break;
			case "Notes":
				messages = MessageIn.executeQuery("FROM Messages m WHERE m.userID = ? AND m.messageType = ? AND m.deleted = false ORDER BY date DESC)", [userID, "Note"], [max: 15])
				break;
		}
		return messages	
	}
	
	def deleteNote() {
		MessageIn message = MessageIn.findByMessageID(params.messageID)
		if (message.userID.toString().equals(session["userID"])) {
			message.deleted = true
			message.save(flush:true)
			render("True")
		} else {
			render("False")		
		}	
	}
	
	def createSession(String userID) {
		// Creates a session if one does not exist
		if (!session["userID"]) {
			User user = User.findByUserID = userID
			session["userID"] = user.userID
			session["firstName"] = user.firstName
			session["lastName"] = user.lastName
			return true
		} else {
			return false
		}	
	}
	
}
