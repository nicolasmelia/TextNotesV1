package textnotesv1

import java.util.Date;

class Groups {
	
	String groupName
	String groupID
	String userID
	int memberCount	
	String description
	Date addDate
	String state
	
	static constraints = {
		groupName(nullable:true)
		groupID(nullable:true)
		userID(nullable:true)
		memberCount(nullable:true)
		addDate(nullable:true)
		description(nullable:true)
		state(nullable:true)
		
		
	}
	
}
