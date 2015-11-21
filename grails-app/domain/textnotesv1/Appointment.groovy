package textnotesv1

class Appointment {

	String appointmentID
	String messageID
	String message
	Date date // Date and time of the appointment
	boolean notifed // User notified day/hour before the appointment date
	boolean recurring 
	
	
    static constraints = {
		message(maxSize: 2000) // Max from sms service is 1600
    }
}
