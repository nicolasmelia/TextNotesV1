package txtWolfMain

class AffiliateMember {
	String affiliateMemberUserID
	String usedAffiliateID
	String memberEmail
	String status
	
	
	boolean affiliateMemberPaid
	boolean affiliateCashOut
	boolean paid
	Date joinDate
	Date paidDate	

    static constraints = {
		paidDate(nullable:true)
    }
}
