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
		String message = params.subject + "<br>" + params.body
		ArrayList<String> tags = params.tags.toString().split(",")	
		for (String tag : tags)	 {
			String contactType = tag.split(":")[0]
			switch (contactType) {
				case "N":  // Single number	
					sendMessage(tag.split(":")[1], message)
					break;
				default: 
					break;
			}	
		}
	}
	
	
	def sendMessage(String number, String message) {
		/* Find your sid and token at twilio.com/user/account */
		String ACCOUNT_SID = "AC37b4c98359cd408db79405a07a46cb65";
		String AUTH_TOKEN = "7d7d0d2d95fa8d535ab844ef1f081ec2"
		String fromNumber = "3303675213"
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
		
		render "SUCCESS"
	}
	
	def testMessage() {
		sendMessage("3305408023", "THIS IS A TEST")
	}

	
	
}
