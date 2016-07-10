package textnotesv1

class CouponIn {
	String phoneNumber
	String couponCode
	String keywordID
	Date DateRedeemed
	int redeemAmount
	
	
    static constraints = {
		phoneNumber(nullable:true)
		couponCode(nullable:true)
		keywordID(nullable:true)	
		redeemAmount(nullable:true)		
    }
}
