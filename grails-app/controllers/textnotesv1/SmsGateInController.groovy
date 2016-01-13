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


	
}
