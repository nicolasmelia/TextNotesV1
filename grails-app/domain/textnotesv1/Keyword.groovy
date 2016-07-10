package textnotesv1

class Keyword {
	
	String userID
	String promotionID
	Date dateEff
	Date dateExp
	Date dateCreated
	
	String keyword
	String description
	String campaignType
	String responceText
	
	boolean endless
	boolean multipleEntries
	int replys
	
	boolean deleted
	boolean suspened
	
    static constraints = {
		dateEff(nullable:true)
		dateExp(nullable:true)
		userID(nullable:true)
		promotionID(nullable:true)
		endless(nullable:true)
		campaignType(nullable:true)	
		replys(nullable:true)
		dateCreated(nullable:true)
		suspened(nullable:true)
		deleted(nullable:true)
		multipleEntries(nullable:true)	
		responceText(nullable:true)
		
    }
	
	
	
}
