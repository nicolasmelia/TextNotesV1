package textnotesv1

import java.util.Date;

class Messages {
	
	String userID
	String messageID
	String phoneNumber
	String message
	String messageType
	byte[] image
	boolean deleted
	Date date

	static constraints = {
		image(nullable:true, maxSize: 1024 * 1024 * 5 /* 5MB */)
	}

}
