package textnotesv1

class Keyword {
	
	String userID
	String promotionID
	Date dateEff
	Date dateExp
	String keyword
	String description
	String campaignType
	boolean endless
	boolean multipleEntries
	
    static constraints = {
		dateEff(nullable:true)
		dateExp(nullable:true)
		userID(nullable:true)
		promotionID(nullable:true)
		endless(nullable:true)
		campaignType(nullable:true)	
		multipleEntries(nullable:true)	
    }
	
	
	
}
