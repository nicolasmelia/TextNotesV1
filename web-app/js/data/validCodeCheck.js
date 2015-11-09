// Check if user has entered a valid code before full validation on server:: NOT USED.. YET.
	var codeSent = false;
	function checkCode(url, code) {	
		try {
				  $.ajax({
					  type: 'post',
					    url: url,
					    async: true,
					    data: {code : code},
				  }).done(function(result){
					  if (result == "True") {
						  return true;
					  } else if (result == "False") {
						 return false;
					  } 
				  });
		}
		catch(err) {
			// Something happened to the request, default to full server validation
		    return true;
		}
	}
	
	// Resends current validation code based on server sessions.
	function resendValidationCode(url) {		
		// Open the modal
	    var inst = $('[data-remodal-id=modalResend]').remodal();	
		inst.open();
		if (!codeSent) { // Don't allow more than 1 resends
			codeSent = true;
			try {
					  $.ajax({
						  type: 'post',
						    url: url,
						    async: true,
						    data: {allow : 'True'},
					  }).done(function(result){
						  if (result == "True") {
							  return true;
						  } else if (result == "False") {
							 return false;
						  } 
					  });
			}
			catch(err) {
				// Something happened to the request. Wtf?
			}
		}
	}