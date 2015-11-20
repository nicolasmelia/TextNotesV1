	var selectedNoteID;
	
	function openNote(noteID, message, date) {
		selectedNoteID = noteID;
	    var inst = $('[data-remodal-id=noteModal]').remodal();	
		inst.open();
		$("#modalMessage").text(message);
		$("#modal1Title").text(date);		
	}
	
	function showDeleteModal() {
		// Close main modal and show delete warnning
	    var inst = $('[data-remodal-id=noteModal]').remodal();	
		inst.close();
	    var timer = setInterval(function(){ 
		    var inst = $('[data-remodal-id=modalDelete]').remodal();	
			inst.open();
			clearInterval(timer);
	    }, 200);
	}
	
	// ********************** AJAX request ********************** 
	// Check if user has entered a valid code before full validation on server:: NOT USED.. YET.
	function deleteMsg(url) {	
		
		// Hide the delete modal warning message
	    var inst = $('[data-remodal-id=modalDelete]').remodal();	
		inst.close();
		
		// Hide the TR being deleted
		$("#ntr" + selectedNoteID).children('td, th').css('background-color','#f2dede');
		$("#ntdNOTE" + selectedNoteID).html("<span style = 'color:#a94442' >Note Removed Successfully</span>");
		$("#ntdDATE" + selectedNoteID).html("<span style = 'color:#a94442' >-</span>");
		
		// Remove the onClick function
		$("#ntdRMDR" + selectedNoteID).prop('onclick',null).off('click');
		$("#ntdRMDR" + selectedNoteID).removeClass("remndHover");
		$("#ntdNOTE" + selectedNoteID).prop('onclick',null).off('click');
		$("#ntdDATE" + selectedNoteID).prop('onclick',null).off('click');
		
		try {
				  $.ajax({
					  type: 'post',
					    url: url,
					    async: true,
					    data: {"messageID" : selectedNoteID},
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
	
	
	
	
		