package textnotesv1

class MessageOut {
	
	String title
	String message
	
	boolean recurring
	boolean scheduled 
	Date scheduleTime

    static constraints = {
		message(maxSize: 2000) // Max from sms service is 1600
		scheduleTime(nullable:true)	
    }
}
