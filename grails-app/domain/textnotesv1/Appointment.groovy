package textnotesv1

class Appointment {

	String appointmentID
	String messageID
	String message
	Date date // Date and time of the appointment
	boolean notifed // User notified day/hour before the appointment date

	
    static constraints = {
		
    }
}
