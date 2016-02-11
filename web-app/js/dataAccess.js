	var searchHault = false;
	
	function search(url) {
		var searchInput = $("#searchInput").val();
		 $('#contactTable').html(""); // clear the table
		searchContact(searchInput, url);
	}
		
	function searchContact(searchString, url) {
		var serverResult = "";
				allowUserNameCheck = false;
				// to checkUserName
				
			if (!searchHault) {
				searchHault = true;
				  $.ajax({
					  type: 'post',
					    url: url,
					    async: true,
					    data: {searchString : searchString},
				  }).done(function(result){
					  searchHault = false;
					  console.log(result)
					  serverResult = result;
					  if (serverResult != null) {
						  if (serverResult != "NONE" && $("#searchInput").val() != "") {					  
							  $.each(serverResult[0], function(idx, obj) {
								  $('#contactTable').append("<tr class = 'pointer' >" +
								  		"<td>" + obj.firstName + " " + obj.lastName + "</td>" +
								  		"<td>" + obj.phoneNumber + "</td>" +
								  		"<td>" + obj.city + ", " + obj.state +  ", " + obj.zip + "</td>" +
								  		"</tr>");													
								});	  
						  } else {
							  // No result
							  $('#contactTable').append("<tr class = 'pointer' >" +
								  		"<td>No Results for " + searchString + " </td>" +
								  		"<td>-</td>" +
								  		"<td>-</td>" +
								  		"</tr>");					  
						  }
					  }
				  });
			}
	}