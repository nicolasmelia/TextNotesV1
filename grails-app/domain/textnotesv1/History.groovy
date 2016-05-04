package textnotesv1

class History {
	String userID
	String historyID
	String type
	String description 
	
	String hashOne
	String hashTwo
	
	Date date
    static constraints = {
		userID(nullable:true)
		historyID(nullable:true)
		type(nullable:true)
		description(nullable:true)	
		date(nullable:true)
		hashOne(nullable:true)		
		hashTwo(nullable:true)		
    }
}
