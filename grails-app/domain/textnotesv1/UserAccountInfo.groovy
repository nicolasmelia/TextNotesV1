package textnotesv1

class UserAccountInfo {
	
	String userID
	
	// Payment information
	String accountType
	
	Date SubscriptionEff	
	Date SubscriptionExp
	
	Date trialDateExp
	int monthlyTextBalance
	int remainingMonthlyTextBalance
	

    static constraints = {
    }
}
