package textnotesv1

class User {
	
	String username
	String password
	String email
	String userID
	String phoneNumber
	Date signUpDate
	Date lastLoginDate
	
	// Personal Information
	String firstName
	String lastName
	String businessName

	String validationCode
	boolean validated 
	
	boolean banned
	
    static constraints = {
		email(nullable:true)
		password(nullable:true)		
		username(nullable:true)		
		phoneNumber(nullable:true)
		validationCode(nullable:true)
		lastLoginDate(nullable:true)
		banned(nullable:true)
		signUpDate(nullable:true)
		
		firstName(nullable:true)
		lastName(nullable:true)
		businessName(nullable:true)
		
		banned(nullable:true)
    }
}
