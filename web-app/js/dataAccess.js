	var searchHault = false;
	var searchURL;
	
	function search(url) {
		var searchInput = $("#searchInput").val();
		 $('#contactTable').html(""); // clear the table
		searchContact(searchInput, url);
	}
		
	function searchContact(searchString, url) {
		var serverResult = "";
		var clientCount = 0;
		searchURL = url
		allowUserNameCheck = false;
		
		// clear the old results
		  $('#contactTable').html("");
		  
		// Display loading spinner
		  $('#contactTable').append("<tr class = 'pointer' >" +
			  		"<td><i class='fa fa-spinner fa-pulse'></i></td>" +
			  		"<td><i class='fa fa-spinner fa-pulse'></i></td>" +
			  		"<td><i class='fa fa-spinner fa-pulse'></i></td>" +
			  		"</tr>");	
		  
		  $("#resultOver").css("display","none");	
				
			if (!searchHault) {
				searchHault = true;
				  $.ajax({
					  type: 'post',
					    url: url,
					    async: true,
					    data: {searchString : searchString},
				  }).done(function(result){
					  searchHault = false;
					  serverResult = result;
					  
						// clear the old results
						  $('#contactTable').html("");
						  
					  if (serverResult != null && serverResult != "NONE") {
						  if (serverResult != "" && serverResult != "NONE") {					  
							  $.each(serverResult[0], function(idx, obj) {
								  clientCount = clientCount + 1;
								  if (clientCount < 16) {
									  var fullName = obj.firstName + " " + obj.lastName;
									  var rowID = 'TR' + obj.contactID;
									  var location;
									  
									  if (obj.city != null && obj.state != null && obj.zip != null && 
											  obj.city != "" && obj.state != "" && obj.zip != "") {
										  location = obj.city + ", " + obj.state + ", " + obj.zip;		  
									  } else {
										  location = 'None';								  
									  }	  
									  
									  $('#contactTable').append("<tr id = '" + rowID + "' class = 'pointer' >" +
									  		"<td>" + fullName + "</td>" +
									  		"<td>" + obj.phoneNumber + "</td>" +
									  		"<td>" + location + "</td>" +
									  		"</tr>");	
									  
									  // Add the onClick
									  $('#' + rowID).click(function(){
										  addNumberPick(fullName, obj.contactID);
										});
									  
									  // Fast typing may make the results incorrect
									  if ($("#searchInput").val() != searchString) {
										  $('#contactTable').html("");
										  searchContact($("#searchInput").val(),searchURL);	  
									  }
									  
								  } else {
									  $("#resultOver").css("display","block");								  
								  }
								  
								});	  
							  
							  if (clientCount < 16) {							  
								  $("#resultOver").css("display","none");								  
							  }
							  
						  } else {
							  // No result
							  if ($("#searchInput").val() != "") {
							  $('#contactTable').append("<tr class = 'pointer' >" +
								  		"<td>No Results</td>" +
								  		"<td>-</td>" +
								  		"<td>-</td>" +
								  		"</tr>");	
							  
							  $("#resultOver").css("display","none");	
							  } else {
								  $('#contactTable').append("<tr class = 'pointer' >" +
									  		"<td>Please enter a search.</td>" +
									  		"<td>-</td>" +
									  		"<td>-</td>" +
									  		"</tr>");	
								  
								  $("#resultOver").css("display","none");	
								  
							  }

						  }
					  } else {
						  $('#contactTable').append("<tr class = 'pointer' >" +
							  		"<td>Please enter a search.</td>" +
							  		"<td>-</td>" +
							  		"<td>-</td>" +
							  		"</tr>");	
						  
						  $("#resultOver").css("display","none");						  
					  }
				  });
			}
	}
	
	function getRecpCount(url, tags){
		
		$.ajax({
		    url: url,
		    type: "post",
		    async: true,
		    data: {tags : tags},
		  }).done(function(result){
				$("#attachedRecipientsCount").html(result);
				$("#attachedRecipientsCountTwo").html(result);			
				$("#recipCount").val(result) // Set the value to be returned to the server
		  });
		
		  
	}
		  