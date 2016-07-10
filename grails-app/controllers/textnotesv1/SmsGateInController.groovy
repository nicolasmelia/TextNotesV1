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
		String messageSid = params.MessageSid.toString() // Twilio message sid
		
		
		if (from != null && body != null){
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
							
		
		// test if this is a keyword.
		Message message
		Keyword keyword = Keyword.findByKeyword(body.toLowerCase())
		
		
	//	6/30/2016 < 6/13/2016
		
		if (Keyword != null) {
			Date todaysDate = new Date()
			if (((keyword.dateEff > todaysDate) && (keyword.dateExp < todaysDate)) || keyword.endless == true) {
				message = new Message(keyword.responceText);	
			} else {
				message = new Message("Sorry this keyword is currently not active.") ;			
			}	
			
			if (keyword.campaignType == "Coup") {
				CouponIn coupon = new CouponIn()
				coupon.keywordID =  keyword.promotionID
				coupon.DateRedeemed = new Date()
				// Create a UUID and cut it in half
				String uniqueID = UUID.randomUUID().toString().replace("-", "");
				int midpoint = uniqueID.length() / 4;
				String halfUUID = uniqueID.substring(0, midpoint)			
				coupon.couponCode = halfUUID	
			}
		
		} else {
			message = new Message("Sorry this is not a valis keyword. Try again?") ;	
		}
		
		 
		Media media = new Media("https://demo.twilio.com/owl.png")
		try {
			message.append(media);
			twiml.append(message);
		} catch (TwiMLException e) {
			e.printStackTrace();
		}

		render(text: twiml.toXML(), contentType: "application/xml", encoding: "UTF-8")
	}
	
	def sendMessage(String number, String message) {		
		/* Find your sid and token at twilio.com/user/account */
		String ACCOUNT_SID = "AC37b4c98359cd408db79405a07a46cb65";
		String AUTH_TOKEN = "7d7d0d2d95fa8d535ab844ef1f081ec2"
		String FromNumber = "3303675213"
	
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
		Account account = client.getAccount();
 
		try{
			MessageFactory messageFactory = account.getMessageFactory();
			List<NameValuePair> param = new ArrayList<NameValuePair>();
			param.add(new BasicNameValuePair("To", "+1" + number)); // Replace with a valid phone number for your account.
			param.add(new BasicNameValuePair("From", "+1" + FromNumber)); // Replace with a valid phone number for your account.
			param.add(new BasicNameValuePair("Body", message));
			//params.add(new BasicNameValuePair("MediaUrl", "https://static0.twilio.com/recources/logos/twilio-loco-circle-50x50.png"));
			com.twilio.sdk.resource.instance.Message mms = messageFactory.create(param);
			return true // Success 
		} catch (Exception ex) {
			return false
		}
		
		render "SUCCESS"
	}


	
}
