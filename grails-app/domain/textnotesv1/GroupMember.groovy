package textnotesv1

class GroupMember {

	String groupID
	String userID
	String contactID
	Date dateAdded
	
    static constraints = {
		groupID(nullable:true)
		userID(nullable:true)
		contactID(nullable:true)
		dateAdded(nullable:true)		
    }
}
