//Custom js for modal window - Nicolas melia

function displayLoadingModal() {
    var inst = $('[data-remodal-id=loadingModal]').remodal();
	inst.open();	
	var saying = [
			"The last time I tried this the monkey didn't survive. Let's hope it works better this time.",
			"My other load screen is much faster. You should try that one instead.",
			"The bits are breeding.", "Don't think of purple hippos.",
			"at least you're not on hold...",
			"Hum something loud while others stare.",
			"QUIET! I'm trying to think here!" ];

	// load a random "saying" into the text field
	$("#loadingText").text(
			saying[Math.floor(Math.random() * saying.length) + 0]);

}