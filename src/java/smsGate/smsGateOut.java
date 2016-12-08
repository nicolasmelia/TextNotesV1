package smsGate;
import com.twilio.sdk.resource.factory.MessageFactory;
import com.twilio.sdk.resource.instance.Account;
import com.twilio.sdk.TwilioRestClient;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

public class smsGateOut {
	
	public static void sendMessage(String numberTo, String body){		
		TwilioRestClient client = new TwilioRestClient("AC37b4c98359cd408db79405a07a46cb65", "7d7d0d2d95fa8d535ab844ef1f081ec2");
		Account account = client.getAccount();
 
		MessageFactory messageFactory = account.getMessageFactory();
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("To", numberTo)); // Replace with a valid phone number for your account.
		params.add(new BasicNameValuePair("From", "+13303675213")); // Replace with a valid phone number for your account.
		params.add(new BasicNameValuePair("Body", body));
		
		try{
		com.twilio.sdk.resource.instance.Message sms = messageFactory.create(params);
		} catch (Exception ex) {
			System.out.print(ex.toString());
		}
		
	}

}
