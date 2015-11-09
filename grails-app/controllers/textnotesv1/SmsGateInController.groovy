package textnotesv1

import com.twilio.sdk.verbs.TwiMLResponse;
import com.twilio.sdk.verbs.TwiMLException;
import com.twilio.sdk.verbs.Message;
import com.twilio.sdk.verbs.Media;

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
			String welcomeMessage = "TxtWolf: Wolf! Welcome to TxtWolf! Login to TxtWolf.com or text me 'my messages' to retrieve your notes. Go to TxtWolf.com for more awesome features."
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
					returnMessages();
					 break;
			case "my text":     
					 returnMessages();
					 break;
			case "my notes":     
					returnMessages();
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
		message.date = new Date()
		message.messageType = 'Message'
		
		message.save(flush:true)
	
	}
	
	def returnMessages() {
		
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
