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
		def searchQuery
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden	
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery	
		}
		
		print clientCount

		
		if (session["userID"]) {		
			 render(view:"dashboard_home",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, contacts: getContactList(offset, searchQuery)])		 
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
				Contact contact
				if (params.contactID) {
					contact = Contact.findByContactID(params.contactID)
					preContactName = contact.fullName
					preContactID = contact.contactID					
				}
				
				render(view:"dashboard_SendTxt", model: [UAI: getUserAccountInfo(), preClientName: preContactName, preClientID: preContactID ])
				
		   } else {
			   redirect(controller: "Home")
		   }		
	}
	
	def getRecipCount () {
		int clientCount = 0 
		ArrayList<String> tags = params.tags.toString().split(",")
		for (String tag : tags)	 {
			String contactType = tag.split(":")[0]
			switch (contactType) {
				case "N":  // Single number
					clientCount += 1
					break;
				case "ID":
					clientCount += 1
					break;
				default:
					break;
			}
		}
		
		render clientCount.toString()
	}
	

	
	def newContact() {
			if (session["userID"]) {
				render(view:"dashboard_addContact", model: [accountInfo: getUserAccountInfo()])	
		   } else {
			   redirect(controller: "Home")
		   }
	}
	
	
	def editContact() {
			if (session["userID"]) {
				
				if (!params.firstName) {
					Contact contact = Contact.findByContactID(params.contactID)
					if (contact) {   
						print  contact.firstName
						render(view:"dashboard_editContact", model: [accountInfo: getUserAccountInfo(), contact: contact])
					} else {
						render "uh oh and error"
					}					
				} else {
					// Edit the contact 
					Contact contact = Contact.findByContactID(params.contactID)
					contact.firstName = params.firstName.toString().trim()
					contact.lastName = params.lastName.toString().trim()
					contact.fullName = contact.firstName + " " + contact.lastName
					contact.phoneNumber = params.phoneNumber.toString().trim()
					
					contact.city = params.city.toString().trim()
					contact.state = params.state.toString().trim()
					contact.zip = params.zip.toString().trim()
					contact.address = params.address.toString().trim()

					contact.userID = session["userID"]
					
					contact.save(flush:true)
					redirect(controller: "Dashboard", action: "confirmation", params: [conType: "editContact", name: contact.fullName.toString(), number: contact.phoneNumber.toString(), contactID: contact.contactID])
	
				}
	
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

			redirect(controller: "Dashboard", action: "confirmation", params: [accountInfo: getUserAccountInfo(), conType: "AddContact", name: contact.firstName, contactID: contact.contactID])			
		} else {
			// User exist with the same number and name under this usersID
			redirect(controller: "Dashboard", action: "confirmation", params: [accountInfo: getUserAccountInfo(), conType: "FAILEDAddContact"])		
		}
		
	}
	
	
	def groups() {
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
		int groupCount = Groups.countByUserID(session.userID)
				
		if (session["userID"]) {
			 render(view:"dashboard_groups",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, groupCount: groupCount, groups: getGroupList(offset)])
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	def detailedGroup() {
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
		def searchQuery
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
		}
		
		// Get group 
		Groups group = Groups.findByGroupID(params.groupID)
	
		if (session["userID"]) {
			 render(view:"dashboard_DetailedGroup",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, contacts: getContactListByGroup(offset, searchQuery, params.groupID), group: group])
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	
	def createGroup() {
		if (session["userID"]) {			
			if (!params.name) {
				render(view:"dashboard_addGroup",  model: [accountInfo: getUserAccountInfo()])
			} else {
				Groups testGroup = Groups.findByGroupNameAndUserID(params.name, session["userID"]); 			
				if (!testGroup) {
					Groups group = new Groups()
					group.groupName = params.name
					group.description = params.desc
					group.state = params.state
					group.memberCount = 0
					group.addDate = new Date()
					group.userID = session["userID"]
					// Create a UUID and cut it in half
					String uniqueID = UUID.randomUUID().toString().replace("-", "");
					int midpoint = uniqueID.length() / 2;
					String halfUUID = uniqueID.substring(0, midpoint)
					
					group.groupID = halfUUID
					group.save(flush:true) 
					redirect(controller: "Dashboard", action: "confirmation", params: [conType: "addGroup", groupID: group.groupID, name: group.groupName])
					
				} else {
					//Group exist 
					redirect(controller: "Dashboard", action: "confirmation", params: [conType: "FAILEDaddGroup", groupID: testGroup.groupID, name: testGroup.groupName])	
				}
			}		
		} else {
			redirect(controller: "Home")	
		}
	}
	
	def getContactList(offset, search){
		def contacts
		if (search == null) {
			contacts =  Contact.findAll("from Contact as c where c.userID=? order by c.firstName",
					 [session.userID], [max: 10, offset: offset])
		} else {
			contacts = searchContact(search, offset)
		}
		
		if (contacts.size > 0) {
			return contacts
		} else {
			return "NONE"
		}
	}
	
	
	def getGroupList(offset){
		def	groups =  Groups.findAll("from Groups as g where g.userID=? order by g.groupName",
					 [session.userID], [max: 10, offset: offset])
		
		if (groups.size > 0) {
			return groups
		} else {
			return "NONE"
		}
	}
	
	def getContactListByGroup(offset, search, groupID){
		List contacts = new ArrayList<Contact>()
		if (search == null) {		
			def members = GroupMember.findAllByGroupID(groupID)	
			print groupID		
			for (GroupMember member : members) {
				if (member.contactID != null) {
					println member.contactID	
					Contact c = Contact.findByContactID(member.contactID)
					println c.firstName
					contacts.add(c)
				}	
			}	
		} else {
			contacts = searchContact(search, offset)
		}
		
		if (contacts != null) {
			print "MEEE"
			return contacts
		} else {
			print "NONE"
			return "NONE"
		}
	}
	
	
	def searchContactAjax() {	
		String searchString = params.searchString
		ArrayList con = new ArrayList<Contact>()
		if (params.searchString && !searchString.equals("") && !searchString.equals(" ") && searchString != "NONE") {			
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
	
	def searchContact(searchString, offset) {
		def contacts
		if (!searchString.equals("") && !searchString.equals(" ") && searchString != "NONE") {			
			 contacts = Contact.findAll("from Contact as c where c.fullName like ?" +
				 	 "or c.firstName like ? or c.lastName like ? order by c.firstName", ["%" + searchString + "%", "%" + searchString + "%", "%" + searchString + "%"], [max: 10, offset: offset])			 
		} else {
		
		}
		
		return contacts
	}
	
	
	def confirmation() {				
		 if (session["userID"]) {			 
			 render(view:"dashboard_confirmation",  model: [accountInfo: getUserAccountInfo(), conType:  params.conType])		 
		} else {
			redirect(controller: "Home")
		}
	}
	
	def details() {
		if (session["userID"]) {
			if (params.conType == "Contact") {		
				Contact contact = Contact.findByContactID(params.contactID)
				render(view:"dashboard_details",  model: [accountInfo: getUserAccountInfo(), contact: contact, conType:  params.conType])
			} else if (params.conType == "Message") {
				MessageOut message = MessageOut.findByMessageID(params.messageID)
				ArrayList<String> tags = message.recipients.split("/")
				StringBuilder res = new StringBuilder();
				def contactCount = (tags.size - 1)
				for (String tag : tags)	 {
					
					if (!tag.toUpperCase().matches("NULL") && tag != null) {
						String contactType = tag.split(":")[0]						
						switch (contactType) {
							case "N":  // Single number
							if (res.length() != 0) {
								res.append(', ');
							}
							res.append(tag.split(":")[1]);
								break;
							case "ID":
								String clientID = tag.split(":")[1]
								Contact contact = Contact.findByContactID(clientID)
								if (res.length() != 0) {
									res.append(', ');
								}
								res.append(contact.fullName);
								break;
							default:
								break;
						}
					}
				}
								
				render(view:"dashboard_details",  model: [accountInfo: getUserAccountInfo(), message: message, conType:  params.conType, res: res.toString(), contactCount: contactCount])
			}
			
			
				
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
