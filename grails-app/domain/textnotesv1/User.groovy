package textnotesv1

class User {
	
	String username
	String password
	String email
	String validationCode
	String authCode
	String userID
	String phoneNumber
	Date lastLogin
	String accountType
	
	String firstName
	String lastName
	String businessName
	
	Date dateTxt
	int allowedTxt
	int sentTxt // Resets on a new day
	int totaltxt // total amount of text we recieved from the user
	
	
	boolean validated // Has this number been validated
	boolean banned
	
    static constraints = {
		email(nullable:true)
		password(nullable:true)		
		username(nullable:true)		
		phoneNumber(nullable:true)
		authCode(nullable:true)
		validationCode(nullable:true)
		lastLogin(nullable:true)
		accountType(nullable:true)
		banned(nullable:true)
		
		firstName(nullable:true)
		lastName(nullable:true)
		businessName(nullable:true)
		
		allowedTxt(nullable:true)
		sentTxt(nullable:true)
		banned(nullable:true)
		dateTxt(nullable:true)
		totaltxt(nullable:true)
    }
}
