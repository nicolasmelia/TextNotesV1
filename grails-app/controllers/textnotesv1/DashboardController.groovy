package textnotesv1

import grails.converters.JSON
import java.text.SimpleDateFormat

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
		boolean isSearch = false
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden	
			isSearch = true
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
			isSearch = true
		}
			
		if (session["userID"]) {		
			 render(view:"dashboard_home",  model: [accountInfo: getUserAccountInfo(), keywordsIn: getKeywordInboxList(0, 5, null), history: getHistoryList(0),  offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch:isSearch, contacts: getContactList(offset, searchQuery, true)])		 
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	def balance() {
		if (session["userID"]) {
			Balance balance = Balance.findByUserID(session["userID"])								
			render(view:"dashboard_balance", model: [UAI: getUserAccountInfo(), bal:balance])		
	   } else {
		   redirect(controller: "Home")
	   }
}
	
	def contacts() {	
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
		boolean isSearch = false
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden	
			isSearch = true
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
			isSearch = true
		}
			
		if (session["userID"]) {		
			 render(view:"dashboard_contacts",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch:isSearch, contacts: getContactList(offset, searchQuery, false)])		 
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	def keywordInbox() {
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
		int clientCount = MessageIn.countByUserID(session.userID)
		
		// Get searchInfo if any
		def searchQuery
		boolean isSearch = false
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
			isSearch = true
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
			isSearch = true
		}

	if (session["userID"]) {
			render(view:"dashboard_keyword_inbox",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch:isSearch, messages: getKeywordInboxList(offset, 10, searchQuery)])
	   } else {
		   redirect(controller: "Home")
	   }
		
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
				
				Balance bal = Balance.findByUserID(session["userID"])
								
				render(view:"dashboard_SendTxt", model: [UAI: getUserAccountInfo(), bal: bal, preClientName: preContactName, preClientID: preContactID, groups: getGroupList(0, true) ])
				
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
				case "G":
					String groupID = tag.split(":")[1]
					Groups group = Groups.findByGroupID(groupID);
					clientCount += group.memberCount
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
						render(view:"dashboard_editContact", model: [accountInfo: getUserAccountInfo(), contact: contact])
					} else {
						render "uh oh and error"
					}					
				} else {
					// Edit the contact 

					Contact contact = Contact.findByContactID(params.contactID)
					
					createHistoryLog("Edited " + contact.fullName, "Edit Contact")
					
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
			
			createHistoryLog("Added " + contact.fullName + " to contact book", "Contact")
			
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
			
		// Check if a user is being added to a group
		boolean addToGroup = false
		def contactGroupAdd = null
		if (params.addToGroup.toString().equals("True")) {
			contactGroupAdd = Contact.findByContactID(params.contactID)
			addToGroup=true
		}
		
		// Get searchInfo if any
		def searchQuery
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
		}
					
		if (session["userID"]) {
			 render(view:"dashboard_groups",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, addToGroup: addToGroup, contactGroupAdd: contactGroupAdd, groupCount: groupCount, groups: getGroupList(offset, false)])
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	def keywords() {
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
		int keywordCount = Keyword.countByUserID(session.userID)

		// Get searchInfo if any
		def searchQuery
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
		}
					
		if (session["userID"]) {
			 render(view:"dashboard_keywords",  model: [accountInfo: getUserAccountInfo(), dateNow: new Date(), offset: offset, up: params.up, keywordCount: keywordCount, keywords: getKeywordList(offset)])
		} else {
			redirect(controller: "Home")
		}
		
	}
	
	def validateCoup() {
		print params.coupCode
		if (params.coupCode == null) {
			render(view:"dashboard_validateCoup",  model: [accountInfo: getUserAccountInfo()])
		} else {
			// CoupCode Recieved
			CouponIn coupon = CouponIn.findByCouponCode(params.coupCode)
			if (coupon != null) {		
				if (coupon.dateRedeemed == null) {
					coupon.dateRedeemed = new Date()
					Date redeemDate = new Date()
					Keyword keyword = Keyword.findByPromotionID(coupon.keywordID)
					coupon.save(flush:true)
					String histID = createHistoryLog("Coupon Code " + coupon.couponCode + " redeemed on " + redeemDate +
						" for keyword " + keyword.keyword , "Coupon Code")
					History hist = History.findByHistoryID(histID)
					render(view:"dashboard_details",  model: [accountInfo: getUserAccountInfo(), conType: "Coupon Code", hist: hist ])
				} else {
					// Coupon code has been used
				print "used"
				}

			} else {
				// Coupon code does not exist
			print "NONE"
			}
		
		}

	}
	
	def history() {
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
		int groupCount = History.countByUserID(session.userID)
			
		// Check if a user is being added to a group
		boolean addToGroup = false
		
		// Get searchInfo if any
		def searchQuery
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
		}
		
		if (session["userID"]) {
			 render(view:"dashboard_history",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, addToGroup: addToGroup, groupCount: groupCount, history: getHistoryList(offset)])
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
		boolean isSearch = false
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
			isSearch = true
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
			isSearch = true
		}
		
		// Get group 
		Groups group = Groups.findByGroupID(params.groupID)
	
		if (session["userID"]) {
			 render(view:"dashboard_DetailedGroup",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch: isSearch, contacts: getContactListByGroup(offset, searchQuery, params.groupID), group: group])
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
					
					createHistoryLog("Created group " + group.groupName, "Group")	
					
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
	
	def addToGroup(){
		if (session["userID"]) {
			def contact = Contact.findByContactID(params.contactID)
			def group = Groups.findByGroupID(params.groupID)
			def groupMember = new GroupMember()
			
			// Check if member already exist in group			
			GroupMember testmember = GroupMember.findByGroupIDAndContactID(params.groupID, params.contactID)
			if (testmember == null) {
				// Create the groupMember
				groupMember.groupID = group.groupID
				groupMember.contactID = contact.contactID
				groupMember.dateAdded =  new Date()
				groupMember.userID =  session["userID"]
				
				group.memberCount = group.memberCount += 1
				
				
				group.save(flush:true)
				
				createHistoryLog("Added " + contact.fullName + " to group " + group.groupName, "Group")
							
				groupMember.save(flush:true)
				
				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "AddContactToGroupSuccess", groupName: group.groupName, name: contact.fullName])		
			} else {
				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "AddContactToGroupFail", groupName: group.groupName, name: contact.fullName])			
			}
			

			
			render "SUCCESS"
		} else {
			redirect(controller: "Home")	
		}
	}
	
	def getContactList(offset, search, dateAdded){
		def contacts
		if (search == null) {
			if (!dateAdded) {
			contacts =  Contact.findAll("from Contact as c where c.userID=? order by c.firstName",
					 [session.userID], [max: 10, offset: offset])
			} else if (dateAdded) {
			contacts =  Contact.findAll("from Contact as c where c.userID=? order by c.addDate",
				[session.userID], [max: 10, offset: offset])
			} 	
		} else {
			contacts = searchContact(search, offset)
		}
		
		if (contacts.size > 0) {
			return contacts
		} else {
			return "NONE"
		}
	}
	
	def getKeywordInboxList(offset, max, search){
		def Messages
		if (search == null) {
			Messages =  MessageIn.findAll("from MessageIn as m where m.userID=? order by m.date DESC",
					 [session.userID], [max: max, offset: offset])
		} else {
			Messages = searchMessageIn(search, offset)
		}
		
		if (Messages.size > 0) {
			return Messages
		} else {
			return "NONE"
		}
	}
	
	
	def getGroupList(offset, getAll){
		def groups;
		if (!getAll) {
			groups =  Groups.findAll("from Groups as g where g.userID=? order by g.groupName",
					 [session.userID], [max: 10, offset: offset])
		} else {
			groups =  Groups.findAll("from Groups as g where g.userID=? order by g.groupName",
			[session.userID], [max: 50])
		}
		
		if (groups.size > 0) {
			return groups
		} else {
			return "NONE"
		}
	}
	
	def getKeywordList(offset){
		def keywords =  Keyword.findAll("from Keyword as k where k.userID=? order by k.dateEff DESC",
					 [session.userID], [max: 10, offset: offset])
		if (keywords.size > 0) {
			return keywords
		} else {
			return "NONE"
		}
	}
	
	def getHistoryList(offset){
		def history;
		
			history =  History.findAll("from History as h where h.userID=? order by h.date DESC",
					 [session.userID], [max: 10, offset: offset])

		
		if (history.size > 0) {
			return history
		} else {
			return "NONE"
		}
	}
	
	def getContactListByGroup(offset, search, groupID){
		List contacts = new ArrayList<Contact>()
		if (search == null) {		
			def members = GroupMember.findAllByGroupID(groupID, [max: 10, offset: offset])	
			for (GroupMember member : members) {
				if (member.contactID != null) {
					Contact c = Contact.findByContactID(member.contactID)
					contacts.add(c)
				}	
			}	
		} else {
			contacts = searchContact(search, offset)
		}
		
		if (contacts.size > 0) {
			return contacts
		} else {
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
	
	def searchMessageIn(searchString, offset) {
		def message
		if (!searchString.equals("") && !searchString.equals(" ") && searchString != "NONE") {
			 message = MessageIn.findAll("from MessageIn as m where m.phoneNumber = ?", [searchString], [max: 10, offset: offset])
		} else {
		
		}
		
		return message
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
			} else if (params.conType == "History") {
				History hist = History.findByHistoryID(params.historyID)
				render(view:"dashboard_details",  model: [accountInfo: getUserAccountInfo(), history: hist, conType:  params.conType])
			} else if (params.conType == "Message") {
				MessageOut message = MessageOut.findByMessageID(params.messageID)
				ArrayList<String> tags = message.recipients.split("/")
				StringBuilder res = new StringBuilder();
				int contactCount = 0
				for (String tag : tags)	 {			
					if (!tag.toUpperCase().matches("NULL") && tag != null) {
						String contactType = tag.split(":")[0]						
						switch (contactType) {
							case "N":  // Single number						
							res.append(tag.split(":")[1]);							
							if (res.length() != 0) {
								res.append(', ');
							}
							contactCount += 1
								break;
							case "ID":
								String clientID = tag.split(":")[1]
								Contact contact = Contact.findByContactID(clientID)

								res.append(contact.fullName);
								
								if (res.length() != 0) {
									res.append(', ');
								}
								
								contactCount += 1		
								break;
							case "G":
								String groupID = tag.split(":")[1]
								Groups group = Groups.findByGroupID(groupID)
								def allMemebers = GroupMember.findAllByGroupIDAndUserID(group.groupID, session["userID"])
								int loopCount = 0
								for (GroupMember member : allMemebers){
									Contact contact = Contact.findByContactID(member.contactID)
									res.append(contact.fullName);								
									loopCount += 1
									res.append(', ');	
								}
								contactCount += group.memberCount				
								break;			
							default:
								break;
						}
					}
				}
								
				render(view:"dashboard_details",  model: [accountInfo: getUserAccountInfo(), message: message, conType:  params.conType, res: res.toString(), contactCount: message.contactCount])
			} else if (params.conType == "keyword") {
			Keyword keyword = Keyword.findByPromotionID(params.promotionID)
			
			render(view:"dashboard_details",  model: [accountInfo: getUserAccountInfo(), keyword: keyword, conType:  params.conType])
			
			}	else {
				render("Something went wrong. Please go back and try again.")
			}	
	   } else {
		   redirect(controller: "Home")
	   }	
	}
	
	def newKeyWord() {
		if (session["userID"]) {
			if (!params.keyword) {
				render(view:"dashboard_addKeyword",  model: [accountInfo: getUserAccountInfo()])
			} else {			
				if (!Keyword.findByKeywordAndUserID(params.keyword.toString().trim(),session["userID"])) {
					Keyword keyword = new Keyword()
					
					keyword.keyword = params.keyword.toString().trim()
					keyword.description = params.desc.toString().trim()
					keyword.dateCreated = new Date()
					keyword.replys = 0
					keyword.responceText = params.responceText.toString().trim()
					
					SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
					
					if (params.dateRange) {
						keyword.dateEff = formatter.parse(params.dateRange.toString().split("-")[0].trim());
						keyword.dateExp = formatter.parse(params.dateRange.toString().split("-")[1].trim());	
					} else {
						keyword.dateEff = new Date()	
						keyword.endless = true
						keyword.dateExp = formatter.parse("01/01/2999");	
					}
					
					if (params.endless) {
						keyword.endless = true
					} else {
						keyword.endless = false			
					}
				
						// Create a UUID and cut it in half
						String uniqueID = UUID.randomUUID().toString().replace("-", "");
						int midpoint = uniqueID.length() / 2;
						String halfUUID = uniqueID.substring(0, midpoint)
						
						if (params.campaignSelected) {
							keyword.campaignType = params.campaignSelected
						} else {
							params.campaignType = "norm"
						}				
						keyword.userID = session["userID"]					
						keyword.promotionID = halfUUID					
						keyword.save(flush:true)		
						redirect(controller: "Dashboard", action: "confirmation", params: [conType: "addKeyword", keyword: keyword.keyword,  promotionID: keyword.promotionID, endless: keyword.endless, dateEff: formatter.format(keyword.dateEff), dateExp: formatter.format(keyword.dateExp), phoneNumber: session["phoneNumber"]])	
				} else {
					displayUserError("Keyword Exist", "Your keyword '" + params.keyword.toString().trim() + "' already exist. Think of a new keyword or delete the old one to re-create it.", "keyword");
				}
			}
		} else {
			redirect(controller: "Home")
		}	
	}
	

	def suspendKeyword() {
		Keyword keyword = Keyword.findByPromotionID(params.promotionID)
		keyword.suspened = true
		keyword.deleted = false
		keyword.save(flush:true)
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		redirect(controller: "Dashboard", action: "confirmation", params: [conType: "suspendKeyword", keyword: keyword.keyword, promotionID: params.promotionID, dateEff: formatter.format(keyword.dateEff), dateExp: formatter.format(keyword.dateExp), phoneNumber: session["phoneNumber"]])
		
	}
	
	def displayUserError(header, body, button) {
		if (session["userID"]) {			
			render(view:"dashboard_userError",  model: [accountInfo: getUserAccountInfo(), header: header, body: body, button: button])
		} else {
			redirect(controller: "Home")
		}		
	}
	
	
	def reactivateKeyword() {
		Keyword keyword = Keyword.findByPromotionID(params.promotionID)
		keyword.suspened = false
		keyword.deleted = false
		keyword.save(flush:true)
		
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		
		redirect(controller: "Dashboard", action: "confirmation", params: [conType: "reactivateKeyword", keyword: keyword.keyword, promotionID: params.promotionID, dateEff: formatter.format(keyword.dateEff), dateExp: formatter.format(keyword.dateExp), phoneNumber: session["phoneNumber"]])
		
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
	
	String createHistoryLog(String description, String type) {
		History history = new History()
		
		// Create a UUID and cut it in half
		String uniqueID = UUID.randomUUID().toString().replace("-", "");
		int midpoint = uniqueID.length() / 2;
		String halfUUID = uniqueID.substring(0, midpoint)
		
		history.userID = session["userID"]
		history.historyID = halfUUID
		history.description = description
		history.type = type
		history.date = new Date()
		history.save(flush:true)
		
		return history.historyID
		
	}
	
	
	def createSession(String userID) {
		// Creates a session if one does not exist
		if (!session["userID"]) {
			User user = User.findByUserID = userID
			session["userID"] = user.userID
			session["firstName"] = user.firstName
			session["lastName"] = user.lastName
			session["phoneNumber"] = "(330)540-8023"
			return true
		} else {
			return false
		}	
	}
	
	
	
}
