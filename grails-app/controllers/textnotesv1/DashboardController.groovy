package textnotesv1

import grails.converters.JSON

class DashboardController {

    def index() { 
		dashboard()
	}
	
	def dashboard() {	
		int offset = 0
		if (params.offset != null) {
			offset = Integer.parseInt(params.offset)
			if (params.up.toString().equals("true")) {
				offset = offset + 10
			} else {
				if (offset > 0) {
				offset = offset - 10
				}
			}
		}
		
		// check to see if contacts exist
		int clientCount = Contact.countByUserID(session.userID)
		
		// Get searchInfo if any
		String searchQuery
		if (!params.searchQuery) {
			searchQuery = "NONE"	
		} else {
			searchQuery = params.searchQuery
		}
		
		print getContactList(offset, params.up, searchQuery)

		if (session["userID"]) {		
			 render(view:"dashboard_home",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, clientCount: clientCount, contacts: getContactList(offset, params.up, searchQuery)])		 
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	def test() {
		print params.offset
	}
	
	
	def sendTxt() {	
			if (session["userID"]) {	
				
				// Check is a preuser was added from address book					
				String preContactName = "NONE"
				String preContactID = "NONE"
				if (params.contactID) {
					Contact contact = Contact.findByContactID(params.contactID)
					preContactName = contact.firstName + " " + contact.lastName
					preContactID = contact.contactID					
				}
								
				render(view:"dashboard_SendTxt", model: [accountInfo: getUserAccountInfo(), preClientName: preContactName, preClientID: preContactID ])
			
		   } else {
			   redirect(controller: "Home")
		   }		
	}
	

	
	def newContact() {
			if (session["userID"]) {
				render(view:"dashboard_addContact", model: [accountInfo: getUserAccountInfo()])	
		   } else {
			   redirect(controller: "Home")
		   }
	}

	
	def addNewContact() {	
		
		Contact testCon =  Contact.findByUserIDAndPhoneNumberAndFirstName(session["userID"], params.phoneNumber.toString().trim(), params.firstName.toString().trim())
		
		if (testCon == null) {		
			Contact contact = new Contact()
			contact.firstName = params.firstName.toString().trim()
			contact.lastName = params.lastName.toString().trim()
			contact.fullName = contact.firstName + " " + contact.lastName
			contact.phoneNumber = params.phoneNumber.toString().trim()
			
			contact.city = params.city.toString().trim()
			contact.state = params.state.toString().trim()
			contact.zip = params.zip.toString().trim()
			contact.address = params.address.toString().trim()
			contact.subbed = false
			
			contact.addDate = new Date()
			
			// Create a UUID and cut it in half
			String uniqueID = UUID.randomUUID().toString().replace("-", "");
			int midpoint = uniqueID.length() / 2;
			String halfUUID = uniqueID.substring(0, midpoint)
					
			contact.contactID = halfUUID
			contact.userID = session["userID"]
			
			contact.save(flush:true)	
			redirect(controller: "Dashboard", action: "confirmation", params: [conType: "AddContact"])			
		} else {
			// User exist with the same number and name under this usersID
			redirect(controller: "Dashboard", action: "confirmation", params: [conType: "FAILEDAddContact"])		
		}
		
	}
	
	def getContactList(offset, up, search){
		def contacts
		if (search == 'NONE') {
			contacts =  Contact.findAll("from Contact as c where c.userID=? order by c.firstName",
					 [session.userID], [max: 10, offset: offset])
		} else {
			contacts = searchContact(search)
		}
		
		return contacts
	}
	
	def searchContactAjax() {	
		String searchString = params.searchString
		ArrayList con = new ArrayList<Contact>()
		if (searchString) {
			con.add(Contact.findAll("from Contact as c where c.fullName like ?" +
				 	 "or c.firstName like ? or c.lastName like ? order by c.firstName", ["%" + searchString + "%", "%" + searchString + "%", "%" + searchString + "%"], [max: 10]))		 
		

			 
		} else {
		
		}	
		
			if (con.size == 0) {
				render "NONE"
			} else {
				render con as JSON	
			}
	}
	
	def searchContact(searchQuery) {

		def contacts
		if (searchQuery != "NONE") {
			 contacts = Contact.findAll("from Contact as c where c.fullName like ?" +
				 	 "or c.firstName like ? or c.lastName like ? order by c.firstName", ["%" + searchQuery + "%", "%" + searchQuery + "%", "%" + searchQuery + "%"], [max: 10])			 
		} else {
		
		}

		if (contacts.isEmpty() || contacts.size() == 0) {
			return "NONE"
		} else {
			return contacts
		}

	}
	
	
	def confirmation() {				
		 if (session["userID"]) {			 
			 render(view:"dashboard_confirmation",  model: [accountInfo: getUserAccountInfo(), conType:  params.conType])		 
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
	
	def getUserAccountInfo(){
		UserAccountInfo accountInfo = UserAccountInfo.findByUserID(session["userID"])
		return accountInfo
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
