package textnotesv1

class Contact {
	
	String firstName
	String lastName
	String fullName
	String zip
	String city
	String state
	String phoneNumber
	String contactID
	String userID
	String address
	String aptNo
	boolean subbed
	
	Date addDate
	
    static constraints = {
		zip(nullable:true)
		city(nullable:true)
		state(nullable:true)
		address(nullable:true)
		aptNo(nullable:true)
		phoneNumber(nullable:true)	
		subbed(nullable:true)		
    }
}
