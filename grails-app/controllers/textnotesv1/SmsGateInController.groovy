package textnotesv1

import com.twilio.sdk.verbs.TwiMLResponse;
import com.twilio.sdk.verbs.TwiMLException;
import com.twilio.sdk.verbs.Message;
import com.twilio.sdk.verbs.Media;

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.Map;
import java.util.HashMap;
 
import com.twilio.sdk.resource.factory.MessageFactory
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.TwilioRestClient;
import com.twilio.sdk.TwilioRestException;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair
import org.apache.http.message.BasicNameValuePair

import com.joestelmach.natty.*;


import smsGate.smsGateOut

class SmsGateInController {

    def index() { 
		render "TEST"	
	}
	
	
	def gateIn(){
		String from = params.From.toString()
		String body = params.Body.toString().trim()
		
		if (from != null && body != null){
			proccessRequest(from, body)
			render(status:204)
		} else {
			render(status:404)
		}

	}
	
	def gateInTest(){
		String from = params.From.toString()
		String body = params.Body.toString().trim()
		TwiMLResponse twiml = new TwiMLResponse();
		
		if (from == null) from = "No Number"
		if (body == null) body = "No Message"
							
		Message message = new Message("Hello, You texted from" + from + "and you sent me: " + body) ;
		Media media = new Media("https://demo.twilio.com/owl.png")
		try {
			message.append(media);
			twiml.append(message);
		} catch (TwiMLException e) {
			e.printStackTrace();
		}

		render(text: twiml.toXML(), contentType: "application/xml", encoding: "UTF-8")
	}
	
	def proccessRequest(phoneNumber, message) {
		String userID = ""
		User user = User.findByPhoneNumber(phoneNumber);
		if (user == null) {
			userID = createPartialAccount(phoneNumber);
			String welcomeMessage = "Wolf! Welcome to TxtWolf! Login to TxtWolf.com or text me \"my notes\" to" +
									"retrieve your notes. Go to TxtWolf.com to learn more about my awesome features."
			smsGateOut.sendMessage(phoneNumber, welcomeMessage)
		} else {
			userID = user.userID
			// User exist
		}
		
		proccessMessage(message, userID, phoneNumber)
		
	}
	
	
	def proccessMessage(message, userID, phoneNumber) {
		String text = message.toString().toLowerCase().trim()
		switch (text) {
			case "my messages":	 
					returnMessages(message, userID, phoneNumber);
					 break;
			case "my text":     
					returnMessages(message, userID, phoneNumber);
					 break;
			case "my notes":     
					returnMessages(message, userID, phoneNumber);
					 break;
			case "my appointments":
					returnAppointments()
					break
			case "my dates":
					returnAppointments()
					break
			default:
					processMessage(message, userID, phoneNumber)
					break;
		}
		
	}
	
	def processMessage(text, userID, phoneNumber) {
		User user = User.findByUserID(userID.toString())
		Messages message = new Messages()
		message.userID = userID
		message.phoneNumber = phoneNumber
		
		// Create a UUID and cut it in half
		String uniqueID = UUID.randomUUID().toString().replace("-", "");
		int midpoint = uniqueID.length() / 2;
		String halfUUID = uniqueID.substring(0, midpoint)
		
		message.messageID = halfUUID
		message.message = text.toString().trim()
		message.deleted = false
				
		try {
			// Parse message date
			String rfcDate = params.DateSent
			String pattern = "EEE, dd MMM yyyy HH:mm:ss Z";
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			message.date = format.parse(rfcDate);	
		} catch(Exception ex) {
			message.date = new Date()
		}
		
		if (proccessDates(message.message, message.messageID)){
			message.messageType = 'Appointment'		
		} else {
			message.messageType = 'Note'
		}
				
		message.save(flush:true)
	
	}
	
	def proccessDates(message, messageID) {
		boolean appt = false
		try {
			List<Date> dates = new Parser().parse(message.toString()).get(0).getDates();
			if (!dates.isEmpty()) {
				Appointment appointment = new Appointment()			
				appointment.date = dates.get(0)
				appointment.messageID = messageID.toString()
				
				// Create a UUID and cut it in half
				String uniqueID = UUID.randomUUID().toString().replace("-", "");
				int midpoint = uniqueID.length() / 2;
				String halfUUID = uniqueID.substring(0, midpoint)
				
				appointment.appointmentID = halfUUID
				appointment.notifed = false
				appointment.message = message.toString()
				appointment.save(flush:true)
				appt = true	
				
			} else {
				appt = false
			}
			
		} catch(Exception ex) {
			appt = false
		}

		return appt	
	}
	
	def returnMessages(text, userID, phoneNumber) {
		User user = User.findByUserID(userID)	
		if (user != null) {
		def messages = new ArrayList<Messages>()
		
		messages = Messages.executeQuery("FROM Messages as m WHERE m.userID = ? AND m.deleted = false ORDER BY date DESC", [userID], [max: 10])
		
		String allMessages = "Wolf! I fetched some notes! \n"
		for (Messages message : messages) {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String formatedDate = df.format(message.date).toString();
			allMessages = allMessages + formatedDate + ": " + message.message + " \n "
		}
		
		allMessages = allMessages + "Go to TxtWolf.com to view more."
		
		
		if (messages.isEmpty()) {
			allMessages = "TxtWolf: You need to send us notes before we can fetch them!"		
		}
		
		smsGateOut.sendMessage(phoneNumber, allMessages)
		} else {
			// Nothing user does not exist and has never sent a note
		}	
	}
	
	def returnAppointments() {
	
	}
	
	def createPartialAccount(phoneNumber) {
		// ****** FIRST TIME USER CREATE A partialAccount ******
		// Send user a validation code
		session["sentValidCode"] = "True"
		
		//  Create a new user and save their validation code
		User newUser = new User()
		newUser.phoneNumber = phoneNumber
		newUser.validationCode = "None"
		newUser.accountType = "partialAccount"
		newUser.validated = false
		
		newUser.allowedTxt = 10
		newUser.sentTxt = 0
				
		// Create a UUID and cut it in half
		String uniqueID = UUID.randomUUID().toString().replace("-", "");
		int midpoint = uniqueID.length() / 2;
		String halfUUID = uniqueID.substring(0, midpoint)
		
		newUser.userID = halfUUID
		
		// Create the users session
		///session["userID"] = newUser.userID
		//session["number"] = phoneNumber
		newUser.save(flush:true)
		return halfUUID
	}

	

	
}
