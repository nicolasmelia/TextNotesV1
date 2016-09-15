package textnotesv1

import java.util.Date;

class MessageDraft {
	
	String title
	String message
	String draftName
	
	Date dateCreated
	
	// Creds yo
	String userID
	String draftID

	static constraints = {
		message(maxSize: 2000) // Max from sms service is 1600
		title(nullable:true)
		title(nullable:true)
		dateCreated(nullable:true)
	}
}
