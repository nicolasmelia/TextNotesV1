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

class SmsGateOutController {

    def index() {
		render("You do not have permission to view this page.")
	}
	
	def messageOut(){
		
		if (session["userID"]) {
			String message = "NO BODY"
			String title = "NO TITLE"
			boolean success = false;
			if (params.subject != null) {
				title = params.subject
				message = params.subject + "\n" + params.body		
			} else {
				message = params.body	
			}
			
			ArrayList<String> tags = params.tags.toString().split(",")	
			for (String tag : tags)	 {
				String contactType = tag.split(":")[0]
				switch (contactType) {
					case "N":  // Single number	
						success = sendMessage(tag.split(":")[1], message)
						break;
					case "ID":
						String clientID = tag.split(":")[1]
						Contact contact = Contact.findByContactID(clientID)
						success = sendMessage(contact.phoneNumber, message)				
						break;
					case "G":
						String groupID = tag.split(":")[1]
						Groups group = Groups.findByGroupID(groupID)				
						def allMemebers = GroupMember.findAllByGroupIDAndUserID(group.groupID, session["userID"])
						for (GroupMember member : allMemebers){
							Contact contact = Contact.findByContactID(member.contactID)
							success = sendMessage(contact.phoneNumber, message)
						}
						break;
					default: 
						break;
				}				
			}
			
				
			if (success) {			
				String messageID = logMessage(tags, message, title)
				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "Message", totalRecp: tags.size.toString(), messageID: messageID])
			} else {
				redirect(controller: "Dashboard", action: "confirmation", params: [conType: "FAILEDtext"])
			}
		} else {
			render "Please go home and log in."
		}
	}
	
	def sendMessage(String number, String message) {
		/* Find your sid and token at twilio.com/user/account */
		String ACCOUNT_SID = "AC37b4c98359cd408db79405a07a46cb65";
		String AUTH_TOKEN = "7d7d0d2d95fa8d535ab844ef1f081ec2"
		String fromNumber = "3303675213"
		
		// Clean up the phone number
		String toNumber = number.replaceAll("[^0-9]", "");
	
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
		Account account = client.getAccount();
 
		try{
			MessageFactory messageFactory = account.getMessageFactory();
			List<NameValuePair> param = new ArrayList<NameValuePair>();
			param.add(new BasicNameValuePair("To", "+1" + toNumber)); // Replace with a valid phone number for your account.
			param.add(new BasicNameValuePair("From", "+1" + fromNumber)); // Replace with a valid phone number for your account.
			param.add(new BasicNameValuePair("Body", message));
			//params.add(new BasicNameValuePair("MediaUrl", "https://static0.twilio.com/recources/logos/twilio-loco-circle-50x50.png"));
			com.twilio.sdk.resource.instance.Message mms = messageFactory.create(param);
			return true // Success
		} catch (Exception ex) {
			return false
		}		
	}
	
	def testMessage() {
		sendMessage("3305408023", "THIS IS A TEST")
	}
	
	def logMessage(ArrayList<String> tags, String body, String title) {
		
		// Create a UUID and cut it in half
		String uniqueID = UUID.randomUUID().toString().replace("-", "");
		int midpoint = uniqueID.length() / 2;
		String halfUUID = uniqueID.substring(0, midpoint)
		
		MessageOut ms = new MessageOut()
		ms.messageID = halfUUID
		ms.userID = session["userID"]
		ms.message = body
		ms.title = title
		ms.lastSentDate = new Date()
		
		String saveableList
		for (String recep : tags) {		
			saveableList = saveableList + "/" + recep
		}
		
		ms.recipients = saveableList	
		
		// scheduled or recurring
		ms.recurring = false
		ms.scheduled = false
			
		ms.save(flush:true)
		return ms.messageID 
			
	}

	
	
}
