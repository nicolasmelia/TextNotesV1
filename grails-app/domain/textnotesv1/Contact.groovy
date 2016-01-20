package textnotesv1

class Contact {
	String firstName
	String lastName
	String zip
	String city
	String state
	String phoneNumber
	String contactID
	Date addDate
	
    static constraints = {
		zip(nullable:true)
		city(nullable:true)
		state(nullable:true)
		phoneNumber(nullable:true)	
    }
}
