package txtWolfMain

class ScheduledText {

	String userID	
	String messageID
	String displayMessage
	Date sendOnDate
	Date dateCreated	
	Date recurringTime
	
	boolean active
	boolean recurring

    static constraints = {
		sendOnDate(nullable:true)
		displayMessage(nullable:true)	
		dateCreated(nullable:true)
		active(nullable:true)
		recurring(nullable:true)
		recurringTime(nullable:true)		
    }
}
