package txtWolfMain

import grails.converters.JSON

import java.text.SimpleDateFormat

import txtWolfMain.Balance;
import txtWolfMain.Contact;
import txtWolfMain.CouponIn;
import txtWolfMain.GroupMember;
import txtWolfMain.Groups;
import txtWolfMain.History;
import txtWolfMain.Keyword;
import txtWolfMain.MessageDraft;
import txtWolfMain.MessageIn;
import txtWolfMain.MessageOut;
import txtWolfMain.Notification;
import txtWolfMain.PhoneNumber;
import txtWolfMain.User;
import txtWolfMain.UserAccountInfo;
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
		int clientCount = Contact.countByUserID(session["userID"])

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
			render(view:"home",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch:isSearch, contacts: getContactList(offset, searchQuery, true)])
		} else {
			redirect(controller: "Home")
		}
	}

	def affiliateDash() {
		if (session["userID"]) {
			AffiliateAccountInfo AAI = AffiliateAccountInfo.findByUserID(session["userID"])
			if (params.join) {
				User user = User.findByUserID(session["userID"])
				user.affiliateMember = true
				user.save(flush:true)
				
				if (AAI == null) {
					AAI = new AffiliateAccountInfo()
					AAI.userID = session["userID"]
					AAI.avalEarnings = 0.00
					AAI.totalEarned = 0.00		
					AAI.memberCount = 0
					AAI.affiliateID = user.affiliateID
					AAI.save(flush:true)
				}
			}			
			
			def members = AffiliateMember.findAllByUsedAffiliateID(AAI.affiliateID)
			int memberCount = members.size()
			render(view:"affiliate_dashboard", model: [UAI: getUserAccountInfo(), members: members, memberCount:memberCount, AAI: AAI, notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true,false)])
		} else {
			redirect(controller: "Home")
		}
	}


	def balance() {
		if (session["userID"]) {
			Balance balance = Balance.findByUserID(session["userID"])
			render(view:"view_Balance", model: [UAI: getUserAccountInfo(), bal:balance, notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true,false), number: getUserKeywordNum()])
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
		int clientCount = Contact.countByUserID(session["userID"])

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
			render(view:"view_Contacts",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true,false), offset: offset, up: params.up, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch:isSearch, contacts: getContactList(offset, searchQuery, false)])
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
		int clientCount = MessageIn.countByUserID(session["userID"])

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
			resetKeywordNotificationCount();
			render(view:"Keyword_Inbox",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), clientCount: clientCount, searchQueryHidden: searchQuery, isSearch:isSearch, messages: getKeywordInboxList(offset, 10, searchQuery, false, false), contacts : getKeywordInboxList(offset, 10, searchQuery, false, true) ])
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

				if (contact.firstName.equals("Unknown")) {
					preContactName = contact.firstName
				} else {
					preContactName = contact.fullName
				}

				preContactID = contact.contactID
			}

			MessageDraft draft
			if (params.draftID) {
				draft = MessageDraft.findByDraftID(params.draftID)
			}

			Balance bal = Balance.findByUserID(session["userID"])

			// Check if user has a remaining balance
			if (bal.totalBalanceSpent < bal.monthlyBalance) {
				render(view:"text_SendTxt", model: [UAI: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), bal: bal, preClientName: preContactName, draft : draft, preClientID: preContactID, groups: getGroupList(0, true)])
			} else {
				// Remaining balance is 0
				String monthlyResetDate = new SimpleDateFormat("MM/dd/yyyy").format(bal.monthlyResetDate);
				displayUserError("Empty Text Balance","Your current remaning text balance is 0. Your balance will reset to " +
						bal.monthlyBalance + " on " + monthlyResetDate + "." +
						" You can increase your monthly balance by upgrading to a paid subscription on the 'My Balance' page.", "");
			}
		} else {
			redirect(controller: "Home")
		}
	}

	def secheduledTxt() {
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
		int groupCount = ScheduledText.countByUserID(session["userID"])

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

		def groups = ScheduledText.findAllByUserID(session["userID"])
		
		if (session["userID"]) {
			render(view:"view_Scheduled",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), offset: offset, up: params.up, addToGroup: addToGroup, contactGroupAdd: contactGroupAdd, groupCount: groupCount, groups: groups])
		} else {
			redirect(controller: "Home")
		}	
		
	}

	def newDraft() {
		if (session["userID"]) {
			if (params.body != null) {
				MessageDraft MD = new MessageDraft()
				MD.title = params.subject
				MD.message = params.body
				MD.draftName = params.draftName
				MD.dateCreated = new Date()
				MD.userID = session["userID"]

				// Create a UUID and cut it in half
				String uniqueID = UUID.randomUUID().toString().replace("-", "");
				int midpoint = uniqueID.length() / 2;
				String halfUUID = uniqueID.substring(0, midpoint)

				MD.draftID = halfUUID
				MD.save()

				// Log this into history
				createHistoryLog("Created draft " + MD.draftName, "Draft", null)

				redirect(action: "Drafts", params: [added: true])

			} else {
				render(view:"Text_NewDraft", model: [UAI: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
			}
		} else {
			redirect(controller: "Home")
		}
	}

	def drafts() {
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

		// Checks if a draft has newly been added (from a redirect)
		boolean added = (params.added) ? true : false;

		// check to see if contacts exist
		int clientCount = MessageDraft.countByUserID(session["userID"])

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
			render(view:"view_Drafts",  model: [accountInfo: getUserAccountInfo(), offset: offset, up: params.up, notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), newlyAdded: added, clientCount: clientCount, draftList: getDraftList(offset, 10)])
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
			render(view:"add_Contact", model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
		} else {
			redirect(controller: "Home")
		}
	}

	def editContact() {
		if (session["userID"]) {

			if (!params.firstName) {
				Contact contact = Contact.findByContactID(params.contactID)
				if (contact) {
					render(view:"contact_Edit", model: [accountInfo: getUserAccountInfo(), contact: contact,  notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
				} else {
					render "uh oh! Error, please contact support."
				}
			} else {
				// Edit the contact

				Contact contact = Contact.findByContactID(params.contactID)

				// Contact does not have a name, do not update history yet
				if (!contact.fullName.equals("Unknown")) {
					createHistoryLog("Edited " + contact.fullName, "Edit Contact", params.phoneNumber.toString().trim())
				}

				contact.firstName = params.firstName.toString().trim()
				contact.lastName = params.lastName.toString().trim()
				contact.fullName = contact.firstName + " " + contact.lastName
				contact.phoneNumber = params.phoneNumber.toString().trim()
				
				contact.city = params.city.toString().trim()
				contact.state = params.state.toString().trim()
				contact.zip = params.zip.toString().trim()
				contact.address = params.address.toString().trim()

				contact.userID = session["userID"]
				
				// Contact NOW has a name, do not update history yet
				if (contact.fullName.equals("Unknown")) {
					createHistoryLog("Edited " + contact.fullName, "Edit Contact", params.phoneNumber.toString().trim())
				}		
				
				contact.save(flush:true)
				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "editContact", name: contact.fullName.toString(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), number: contact.phoneNumber.toString(), contactID: contact.contactID])
			}

		} else {
			redirect(controller: "Home")
		}
	}


	def addNewContact() {

		Contact testCon =  Contact.findByUserIDAndPhoneNumberAndFirstName(session["userID"], params.phoneNumber.toString().trim(), params.firstName.toString().trim())

		if (testCon == null) {

			// Check if contact has sent in a keyword an is an 'Unknown' contact
			Contact contact = Contact.findByUserIDAndPhoneNumberAndFirstName(session["userID"], params.phoneNumber.toString().trim(), "Unknown")
			if (contact == null) {
				contact = new Contact()
			}

			contact.firstName = params.firstName.toString().trim()
			contact.lastName = params.lastName.toString().trim()
			contact.fullName = contact.firstName + " " + contact.lastName
			contact.phoneNumber = params.phoneNumber.toString().trim()

			contact.city = params.city.toString().trim()
			contact.state = params.state.toString().trim()
			contact.zip = params.zip.toString().trim()
			contact.address = params.address.toString().trim()

			if (contact == null) {
				contact.subbed = false
			}

			contact.addDate = new Date()

			// Create a UUID and cut it in half
			String uniqueID = UUID.randomUUID().toString().replace("-", "");
			int midpoint = uniqueID.length() / 2;
			String halfUUID = uniqueID.substring(0, midpoint)

			if (contact.contactID == null) {
				contact.contactID = halfUUID
			}

			contact.userID = session["userID"]

			contact.save(flush:true)

			createHistoryLog("Added " + contact.fullName + " to contact book", "Contact", null)

			redirect(controller: "Dashboard", action: "confirmation", params: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), conType: "AddContact", name: contact.firstName, contactID: contact.contactID])
		} else {
			// User exist with the same number and name under this usersID
			redirect(controller: "Dashboard", action: "confirmation", params: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), conType: "FAILEDAddContact"])
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
		int groupCount = Groups.countByUserID(session["userID"])

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
			render(view:"view_Groups",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), offset: offset, up: params.up, addToGroup: addToGroup, contactGroupAdd: contactGroupAdd, groupCount: groupCount, groups: getGroupList(offset, false)])
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
		int keywordCount = Keyword.countByUserID(session["userID"])

		// Get searchInfo if any
		def searchQuery
		if (!params.searchQuery && !params.searchQueryHidden) {
			searchQuery = null
		} else if (params.searchQueryHidden) {
			searchQuery = params.searchQueryHidden
		} else if (params.searchQuery) {
			searchQuery = params.searchQuery
		}

		// Type of detail to display on the keywords page
		String type = (params.type == null) ? "All" : params.type;

		if (session["userID"]) {
			render(view:"view_Keywords",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), dateNow: new Date(), type: type, offset: offset, up: params.up, number:getUserKeywordNum(), keywordCount: keywordCount, keywords: getKeywordList(offset, type)])
		} else {
			redirect(controller: "Home")
		}

	}

	def validateCoup() {
		if (params.coupCode == null) {
			render(view:"keyword_ValidateCoup",  model: [accountInfo: getUserAccountInfo()])
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
							" under keyword " + keyword.keyword + ". Redeemed for " + coupon.phoneNumber , "Coupon Code", coupon.phoneNumber)
					History hist = History.findByHistoryID(histID)
					render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), conType: "Coupon Code", hist: hist])
				} else {
					// Coupon code has been used
					render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), conType: "Coupon Code Used", coupon: coupon ])
				}

			} else {
				// Coupon code does not exist
				displayUserError("Code Not Found","This coupon code does not exist, please go back and try again.", "Coupon-None");
			}
		}
	}

	def contestSelect () {
		if (params.winnerAmt == null){
			Keyword keyword = Keyword.findByPromotionID(params.promotionID)
			render(view:"keyword_ChooseConWinner",  model: [accountInfo: getUserAccountInfo(), keyword: keyword])
		} else {
			Keyword keyword = Keyword.findByPromotionID(params.promotionID);

			if (!keyword.suspened) {
				List contestMessages = MessageIn.findAllByPromotionID(params.promotionID)
				SmsGateOutController gateOut = new SmsGateOutController()
				// Get random numbers
				Random random = new Random();
				ArrayList selectedNumbers =  new ArrayList<MessageIn>()
				int winnerCount = 0
				int winnerAmt = Integer.parseInt(params.winnerAmt);
				StringBuilder winnersSB = new StringBuilder();

				if (!contestMessages.isEmpty()) {
					while (winnerCount <= winnerAmt) {
						for (int i; i <= winnerAmt; i++) {

							if (winnerCount == winnerAmt) break;

							int index = 0;
							if (contestMessages.size() >= 2) {
								index = random.nextInt(contestMessages.size);
							}

							if (!selectedNumbers.contains(contestMessages[index])) {
								selectedNumbers.add(contestMessages[index])
								winnerCount++

								winnersSB.append(contestMessages[index].phoneNumber)

								if (contestMessages.size() > winnerAmt && winnerCount < winnerAmt) {
									winnersSB.append(", ");
								}

								contestMessages[index].dateWon = new Date()
								contestMessages[index].winner = true
								contestMessages[index].save(flush:true)

								// Notify the winners and send them the message
								gateOut.sendMessage(contestMessages[index].phoneNumber, params.body)
							}
						}
						if (winnerCount == winnerAmt || contestMessages.size() == winnerCount) break;
					}

					keyword.winners = winnersSB.toString()
					keyword.suspened = true
					keyword.eligible = false
					keyword.save(flush:true)

					render(view:"keyword_ConWinners",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), winners: selectedNumbers, winnerCount: winnerCount, keyword: keyword])
				} else {
					render("Something went wrong, please contact TxtWolf Support with error code 'TW501'.");
				}
			} else {
				displayUserError("Winners Selected...","It looks like you have already selected winners for this keyword!", "");
			}
		}
	}

	def upgradeSub() {
		User user = User.findByUserID(session["userID"])
		render(view:"buy_updateSub",  model: [accountInfo: getUserAccountInfo(), user: user, notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
	}

	def toggleIncomingText() {
		displayUserError("You need permission.","This account does not have permission to toggle incoming text. Please contact Support@TxtWolf.com for more" +
				" information on the text toggle feature.", "");
	}

	def addAdmins() {
		displayUserError("Add an admin.","This account does not have permission to add multiple admins. You may request acceess for multiple" +
				" admins by contacting Support@TxtWolf.com.", "");
	}

	def changePassword() {
		if (session["userID"] != null) {
			if (params.passwordone != null) {
				if (params.passwordone.toString().equals(params.passwordtwo.toString())) {
					User user = User.findByUserID(session["userID"])
					if (params.passwordold.toString().equals(user.password)) {
						user.password = params.passwordone
						user.save(flush:true)
						render(view:"view_Confirmation",  model: [accountInfo: getUserAccountInfo(), conType:  "passwordChangeSuccess", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
					} else {
						// old password does not match
						render(view:"view_Confirmation",  model: [accountInfo: getUserAccountInfo(), conType:  "passwordChangeFail", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
					}
				} else {
					render("ERROR.")
				}
			} else {
				render(view:"account_changePassword",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
			}
		} else {
			dashboard();
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
		int groupCount = History.countByUserID(session["userID"])

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
			render(view:"history",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), offset: offset, up: params.up, addToGroup: addToGroup, groupCount: groupCount, history: getHistoryList(offset, params.activityType), activityType: params.activityType])
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
		int clientCount = Contact.countByUserID(session["userID"])
		int groupMemberCount = GroupMember.countByGroupID(params.groupID)

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
			render(view:"group_Detailed",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), offset: offset, up: params.up, groupMemberCount : groupMemberCount, clientCount: clientCount, searchQueryHidden: searchQuery, isSearch: isSearch, contacts: getContactListByGroup(offset, searchQuery, params.groupID), group: group])
		} else {
			redirect(controller: "Home")
		}

	}

	def createGroup() {
		if (session["userID"]) {
			if (!params.name) {
				render(view:"add_Group",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
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

					createHistoryLog("Created group " + group.groupName, "Group", null)

					redirect(controller: "Dashboard", action: "confirmation", params: [conType: "addGroup", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), groupID: group.groupID, name: group.groupName])

				} else {
					//Group exist
					redirect(controller: "Dashboard", action: "confirmation", params: [conType: "FAILEDaddGroup", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false),groupID: testGroup.groupID, name: testGroup.groupName])
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

				createHistoryLog("Added " + contact.fullName + " to group " + group.groupName, "Group", null)

				groupMember.save(flush:true)

				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "AddContactToGroupSuccess", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), groupName: group.groupName, name: contact.fullName])
			} else {
				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "AddContactToGroupFail", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), groupName: group.groupName, name: contact.fullName])
			}
		} else {
			redirect(controller: "Home")
		}
	}

	def getContactList(offset, search, dateAdded){
		def contacts
		if (search == null) {
			if (!dateAdded) {
				contacts =  Contact.findAll("from Contact as c where c.userID=? order by c.firstName",
						[session["userID"]], [max: 10, offset: offset])
			} else if (dateAdded) {
				contacts =  Contact.findAll("from Contact as c where c.userID=? order by c.addDate",
						[session["userID"]], [max: 10, offset: offset])
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

	def getKeywordInboxList(offset, max, search, notifacation, toContacts){
		def Messages
		if (search == null) {
			if (notifacation == false) {
				Messages =  MessageIn.findAll("from MessageIn as m where m.userID=? order by m.date DESC",
						[session["userID"]], [max: max, offset: offset])

				// Getting all keywords, set noti count to 0
				resetKeywordNotificationCount();

			} else {
				Messages =  MessageIn.findAll("from MessageIn as m where viewed = FALSE and m.userID=? order by m.date DESC",
						[session["userID"]], [max: max, offset: offset])
			}
		} else {
			Messages = searchMessageIn(search, offset)
		}

		if (Messages.size > 0) {
			if (toContacts) {
				ArrayList<Contact> contacts = new ArrayList<Contact>()
				for (MessageIn MI : Messages) {
					Contact c = Contact.findByPhoneNumberAndUserID(MI.phoneNumber, session["userID"])
					contacts.add(c)
				}
				return contacts
			}
		}

		if (Messages.size > 0) {
			return Messages
		} else {
			return "NONE"
		}
	}

	def getDraftList(offset, max){
		def drafts =  MessageDraft.findAll("from MessageDraft as m where m.userID=? order by m.dateCreated DESC",
				[session["userID"]], [max: max, offset: offset])

		if (drafts.size > 0) {
			return drafts
		} else {
			return "NONE"
		}
	}


	def getGroupList(offset, getAll){
		def groups;
		if (!getAll) {
			groups =  Groups.findAll("from Groups as g where g.userID=? order by g.groupName",
					[session["userID"]], [max: 10, offset: offset])
		} else {
			groups =  Groups.findAll("from Groups as g where g.userID=? order by g.groupName",
					[session["userID"]], [max: 50])
		}

		if (groups.size > 0) {
			return groups
		} else {
			return "NONE"
		}
	}

	def getKeywordList(offset, type){
		def keywords
		if (type == "contestSelect") {
			keywords =  Keyword.findAll("from Keyword as k where k.userID=? AND k.campaignType = 'con' order by k.dateEff DESC",
					[session["userID"]], [max: 10, offset: offset])
		} else {
			keywords =  Keyword.findAll("from Keyword as k where k.userID=? order by k.dateEff DESC",
					[session["userID"]], [max: 10, offset: offset])
		}

		// Expire keywords that are expired
		for (Keyword keyword : keywords) {
			Date todaysDate = new Date()
			if ((todaysDate < keyword.dateEff) || ((keyword.dateExp <= todaysDate) && keyword.endless == false) && keyword.suspened == false) {
				// Keyword is expired
				keyword.suspened = true
				keyword.save(flush:true)
			}
		}

		if (keywords.size > 0) {
			return keywords
		} else {
			return "NONE"
		}
	}

	def getHistoryList(offset, type){
		def history;

		if (type == null) {
			history =  History.findAll("from History as h where h.userID=? order by h.date DESC",
					[session["userID"]], [max: 10, offset: offset])
		} else {
			switch (type){
				case "messages":
				// Return all history MESSAGE records
					history = History.findAll("from History as h where h.userID=? and type = 'Message' order by h.date DESC",
					[session["userID"]], [max: 10, offset: offset]);
					break;
				case "all":
				// Return all history records
					history = History.findAll("from History as h where h.userID=? order by h.date DESC",
					[session["userID"]], [max: 10, offset: offset]);
				default:
				// Return all history records
					history = History.findAll("from History as h where h.userID=? order by h.date DESC",
					[session["userID"]], [max: 10, offset: offset]);
					break;
			}
		}

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
			con.add(Contact.findAll("from Contact as c where (c.fullName like ?" +
					"or c.firstName like ? or c.lastName like ?) and c.userID = ? order by c.firstName", ["%" + searchString + "%", "%" + searchString + "%", "%" + searchString + "%", session["userID"]], [max: 10]))
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
			contacts = Contact.findAll("from Contact as c where (c.fullName like ?" +
					"or c.firstName like ? or c.lastName like ?) and c.userID = ? order by c.firstName", ["%" + searchString + "%", "%" + searchString + "%", "%" + searchString + "%", session["userID"]], [max: 10, offset: offset])
		} else {

		}

		return contacts
	}

	def searchMessageIn(searchString, offset) {
		def message
		if (!searchString.equals("") && !searchString.equals(" ") && searchString != "NONE") {
			message = MessageIn.findAll("from MessageIn as m where m.phoneNumber = ?", [searchString], [max: 10, offset: offset])
		}

		return message
	}

	def confirmation() {
		if (session["userID"]) {
			render(view:"view_Confirmation",  model: [accountInfo: getUserAccountInfo(), number:getUserKeywordNum(), conType:  params.conType, notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
		} else {
			redirect(controller: "Home")
		}
	}

	def details() {
		if (session["userID"]) {
			if (params.conType == "Contact") {
				Contact contact = Contact.findByContactID(params.contactID)
				render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), contact: contact, conType:  params.conType])
			} else if (params.conType == "History") {
				History hist = History.findByHistoryID(params.historyID)
				boolean showNumber = (params.showNumber) ? true : false; // Display the histories phone number in the TR?
				render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), history: hist, conType:  params.conType, showNumber: showNumber])

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
				render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), message: message, conType:  params.conType, res: res.toString(), contactCount: message.contactCount])
			} else if (params.conType == "keyword") {
				Keyword keyword = Keyword.findByPromotionID(params.promotionID)
				render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), keyword: keyword, number:getUserKeywordNum(), conType:  params.conType])
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
				int keywordCount = Keyword.countByUserID(session["userID"])
				UserAccountInfo account = UserAccountInfo.findByUserID(session["userID"])				
				if (!account.accountType.equals("Free") || keywordCount < 1) {
					def groups = Groups.findAllByUserID(session["userID"])
					render(view:"add_Keyword",  model: [accountInfo: getUserAccountInfo(), groups: groups,  notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), number:getUserKeywordNum()])			
				} else {	
					render(view:"details",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), conType: "KeywordLimit", keyword:Keyword.findByUserID(session["userID"])])				
				}			
			} else {
				if (!Keyword.findByKeywordAndUserID(params.keyword.toString().trim(),session["userID"])) {
					Keyword keyword = new Keyword()

					keyword.keyword = params.keyword.toString().toLowerCase().trim()

					if (params.desc != null) {
						keyword.description = params.desc.toString().trim()
					} else {
						keyword.description = "None"
					}

					keyword.dateCreated = new Date()
					keyword.suspened = false
					keyword.eligible = true
					keyword.incomingGroup = params.incomingGroup

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
					redirect(controller: "Dashboard", action: "confirmation", params: [conType: "addKeyword", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false),keyword: keyword.keyword,  promotionID: keyword.promotionID, endless: keyword.endless, dateEff: formatter.format(keyword.dateEff), dateExp: formatter.format(keyword.dateExp), number:getUserKeywordNum()])
				} else {
					displayUserError("Keyword Exist", "Your keyword '" + params.keyword.toString().trim() + "' already exist. Think of a new keyword or delete the old one to re-create it.", "keyword");
				}
			}
		} else {
			redirect(controller: "Home")
		}
	}

	def keywordAvalCheck(){
		Keyword keyword = Keyword.findByKeyword(params.keyword)
		if (keyword == null) {
			render "true"
		} else {
			render "false"
		}
	}

	def suspendKeyword() {
		Keyword keyword = Keyword.findByPromotionID(params.promotionID)
		keyword.suspened = true
		keyword.deleted = false
		keyword.save(flush:true)

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

		redirect(controller: "Dashboard", action: "confirmation", params: [conType: "suspendKeyword", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), keyword: keyword.keyword, promotionID: params.promotionID, dateEff: formatter.format(keyword.dateEff), dateExp: formatter.format(keyword.dateExp), phoneNumber: session["phoneNumber"]])

	}

	def displayUserError(header, body, button) {
		if (session["userID"]) {
			render(view:"userError",  model: [accountInfo: getUserAccountInfo(), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), header: header, body: body, button: button])
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
		Date todaysDate = new Date();
		if (keyword.dateExp > todaysDate) {
			redirect(controller: "Dashboard", action: "confirmation", params: [conType: "reactivateKeyword", notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false), keyword: keyword.keyword, promotionID: params.promotionID, dateEff: formatter.format(keyword.dateEff), dateExp: formatter.format(keyword.dateExp), phoneNumber: session["phoneNumber"]])
		} else {
			// Can't reactivate an expired keyword
			displayUserError("Cant Reactivate", "You can't reactivate an expired keyword. This keyword expired on " + formatter.format(keyword.dateExp).toString() + ". Create a new keyword or delete this one.", "Home")
		}
	}

	def resetKeywordNotificationCount() {
		Notification noti = Notification.findByNotiTypeAndUserID("keywordNoti",session["userID"])
		noti.incrementCount = 0
		noti.lastIncrementDate = new Date()
		noti.save(flush:true)

		// Reset all messages in that are keywords
		List MI = MessageIn.findAllByUserIDAndViewed(session["userID"], false)
		for (MessageIn message : MI) {
			message.viewed = true
			message.save(flush:true)
		}

	}

	def proccessTxtSend() {
		render params.tags
	}

	def help() {
		render (view:"view_Help")
	}
	
	def tips() {
		render (view:"view_Help")
	}

	def accountSettings () {
		render(view:"account_Settings",  model: [accountInfo: getUserAccountInfo(), user: User.findByUserID(session["userID"]), notiCount: getNotificationCount(session["userID"]), keywordsIn: getKeywordInboxList(0, 5, null, true, false)])
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

	def getUserKeywordNum(){
		PhoneNumber ph = PhoneNumber.findByAccountType('free')
		return ph
	}

	static public int getNotificationCount(String userID){
		try {
			Notification noti = Notification.findByUserIDAndNotiType(userID, "keywordNoti")
			return noti.incrementCount	
		} catch (NullPointerException ex) {
			// Session or userID does not exist
			redirect(controller: "Home")		
		}
	}

	String createHistoryLog(String description, String type, String phoneNumber) {
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

		if (phoneNumber != null) history.phoneNumber
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
