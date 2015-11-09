function isNumberKey(evt) {
	var charCode = (evt.which) ? evt.which : evt.keyCode;
	if (charCode != 46 && charCode > 31 
			&& (charCode < 48 || charCode > 57))
		return false;

	return true;
}

function inputLimitCharMax(num, id) {
	var element = $('#' + id).val();
	if (element.length >= num) return false;
	return true;
}

// When a form is submitted disable the submit button
$('form').submit(function() {
	try {
		$("#submitBtn").prop("disabled",true);		
	} catch (err) {
		// Do nothing		
	}
});
