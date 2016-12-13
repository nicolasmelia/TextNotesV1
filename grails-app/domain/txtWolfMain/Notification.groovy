package txtWolfMain

class Notification {
	
	String userID
	String notiType
	int incrementCount
	Date lastIncrementDate

    static constraints = {
		userID(nullable:true)
		notiType(nullable:true)
		incrementCount(nullable:true)
		lastIncrementDate(nullable:true)		
    }
}
