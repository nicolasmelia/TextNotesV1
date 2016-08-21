package textnotesv1

import java.util.Date;

class MessageIn {
	
	String userID
	String messageID
	String phoneNumber
	String promotionID
	String keyword
	String messageType
	Date date
	byte[] image
	
	// For contest Keywords
	Date dateWon
	boolean winner
		
	boolean deleted

	static constraints = {
		image(nullable:true, maxSize: 1024 * 1024 * 5 /* 5MB */)
		keyword(nullable:true)	
		promotionID(nullable:true)
		dateWon(nullable:true)
		winner(nullable:true)	
	}

}
