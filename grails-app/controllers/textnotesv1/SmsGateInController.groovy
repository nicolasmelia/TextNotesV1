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
import java.util.Formatter.DateTime
import org.apache.http.NameValuePair
import org.apache.http.message.BasicNameValuePair
import org.joda.time.format.DateTimeFormatter

import com.joestelmach.natty.*;


import smsGate.smsGateOut

class SmsGateInController {
	
    def index() { 
		render "TEST"	
	}
		
	def gateIn(){	
		boolean messageSuccess = false
		String from = params.From.toString()
		String body = params.Body.toString().toLowerCase().trim()
		String messageSid = params.MessageSid.toString() // Twilio message sid
		
		// test if this is a keyword.
		Keyword keyword = Keyword.findByKeyword(body)

		if (keyword != null) {
			
			// Create a UUID and cut it in half for MessageIn ID
			String uniqueID = UUID.randomUUID().toString().replace("-", "");
			int midpoint = uniqueID.length() / 2;
			String halfUUID = uniqueID.substring(0, midpoint)
			
			// Log the incoming message
			MessageIn MI = new MessageIn()
			MI.phoneNumber = from.substring(2, from.length()) // Remove first 2 characters from string
			MI.messageID = halfUUID
			MI.messageType = "keyword"
			MI.userID = keyword.userID
			MI.keyword = keyword.keyword
			MI.promotionID = keyword.promotionID
			MI.deleted = false
			MI.viewed = false
			MI.date = new Date()
			
			// Decrement users balance by 1,
			Balance balance = Balance.findByUserID(keyword.userID);
			balance.currentBalance = balance.currentBalance - 1;
			balance.totalBalanceSpent = balance.totalBalanceSpent + 1;
			balance.save(flush:true);

			keyword.replys = new Integer(keyword.replys.intValue() + 1);
			keyword.save(flush:true)
			

			
			if (balance.currentBalance <= balance.monthlyBalance) {				
				Date todaysDate = new Date()
				if ((todaysDate >= keyword.dateEff) && ((keyword.dateExp >= todaysDate) && keyword.suspened == false || keyword.endless == true)) {				
					switch (keyword.campaignType) {
						case "coup": // Coupon
						
							sendMessage(from, keyword.responceText)
						
							CouponIn coupon = new CouponIn()
							coupon.keywordID =  keyword.promotionID
							coupon.date = new Date()
							coupon.phoneNumber = MI.phoneNumber 
							
							// Create a UUID and cut it in half for the COUPON CODE
							String uniqueIDCoup = UUID.randomUUID().toString().replace("-", "");
							int midpoint2 = uniqueIDCoup.length() / 4;
							String couponCode = uniqueIDCoup.substring(0, midpoint2)
							
							coupon.couponCode = couponCode
							coupon.save(flush:true)
							
							sendMessage(from, "Here is your coupon code for keyword " + keyword.keyword + ", " + coupon.couponCode + ". Use your code to redeem this offer.")
							MI.save(flush:true);
							
							// Increment the counter
							incrementNoti(keyword)
							
						break; 
						
						case "con": // Contest					
							// check to see if this number already sent into this contest			
							MessageIn MITest = MessageIn.findByPromotionIDAndPhoneNumber(MI.promotionID, MI.phoneNumber)
							if (MITest == null) {
								sendMessage(from, keyword.responceText)
								SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");					
								sendMessage(from, "You have been entered in a contest for keyword " + keyword.keyword + ". This contest ends on " + dateFormatter.format(keyword.dateExp) + ". You will recieve a text if you win! Good Luck!")
								MI.save(flush:true);
								
								// Increment the counter
								incrementNoti(keyword)
								
							} else {
								SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
								sendMessage(from, "You have already entered a submission for this contest. This contest ends on " + dateFormatter.format(keyword.dateExp) + ".")
								// MI.save(flush:true); Multiple text by the same person, do not save
							}						
						break;
						
						case "cust": // Custom
							sendMessage(from, keyword.responceText)				
							MI.save(flush:true);
							
							// Increment the counter
							incrementNoti(keyword)
							
						break;
						
						default:
						
						break;
				}
	
				} else {
					messageSuccess = sendMessage(from, "It look likes this keyword (" + keyword.keyword + ") is currently not active. This service is powered by TxtWolf.com!")	
				}
			} else {
					messageSuccess = sendMessage(from, "It look likes this keyword (" + params.Body.toString().toLowerCase().trim() + ") does not exist. Please try again! This service is powered by TxtWolf.com!")
			}
		
		} else {
			// TODO: Users monthly balance is in overage, notify them!!!
			//messageSuccess = sendMessage(from, "It look likes this keyword (" + params.Body.toString().toLowerCase().trim() + ") does not exist. Please try again! This service is powered by TxtWolf.com!")
		}

		if (messageSuccess){
			render(status:204)
		} else if (from.equals(null) && body.equals(null)) {
			render(status:404)
		} else {
			render(status:404)
		}

	}
	
	boolean sendMessage(String number, String message) {		
		/* Find your sid and token at twilio.com/user/account */
		String ACCOUNT_SID = "AC37b4c98359cd408db79405a07a46cb65";
		String AUTH_TOKEN = "7d7d0d2d95fa8d535ab844ef1f081ec2"
		String FromNumber = "3303675213"
	
		TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
 
		Account account = client.getAccount();
 
		try{
			MessageFactory messageFactory = account.getMessageFactory();
			List<NameValuePair> param = new ArrayList<NameValuePair>();
			param.add(new BasicNameValuePair("To", number)); // Replace with a valid phone number for your account.
			param.add(new BasicNameValuePair("From", "+1" + FromNumber)); // Replace with a valid phone number for your account.
			param.add(new BasicNameValuePair("Body", message));
			//params.add(new BasicNameValuePair("MediaUrl", "https://static0.twilio.com/recources/logos/twilio-loco-circle-50x50.png"));
			com.twilio.sdk.resource.instance.Message mms = messageFactory.create(param);
			return true // Success 
		} catch (Exception ex) {
			return false
		}		
	}
	
	public void incrementNoti(Keyword keyword) {
		Notification noti = Notification.findByNotiTypeAndUserID("keywordNoti",keyword.userID)
			noti.incrementCount = noti.incrementCount + 1
			noti.lastIncrementDate = new Date()
			noti.save(flush:true)	
	}


	
}
