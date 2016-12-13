package txtWolfMain

class CouponIn {
	String phoneNumber
	String couponCode
	String keywordID
	Date dateRedeemed
	Date date
	int redeemAmount
	
	
    static constraints = {
		phoneNumber(nullable:true)
		couponCode(nullable:true)
		keywordID(nullable:true)	
		redeemAmount(nullable:true)		
		dateRedeemed(nullable:true)
		date(nullable:true)	
    }
}
