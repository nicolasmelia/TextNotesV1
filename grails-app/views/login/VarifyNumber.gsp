<!DOCTYPE HTML>
<!--
	Spectral by HTML5 UP
	html5up.net | @n33co
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<title>Spectral by HTML5 UP</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!--[if lte IE 8]><g:javascript src="ie/html5shiv.js" /><![endif]-->
<link rel="stylesheet" type="text/css"
	href="<g:resource dir='css' file='mainBoot.css'/>">

<!--Modal CSS-->
<link rel="stylesheet" type="text/css"
	href="<g:resource dir='css' file='remodal/remodal.css'/>">
<link rel="stylesheet" type="text/css"
	href="<g:resource dir='css' file='remodal/remodal-default-theme.css'/>">

<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie9.css'/>"><![endif]-->
</head>
<body>

	<!-- Page Wrapper -->
	<div id="page-wrapper">

		<!-- Header -->
		<header id="header">
			<h1>
				<a href="index.html">Spectral</a>
			</h1>
			<nav id="nav">
				<ul>
					<li class="special"><a href="#menu" class="menuToggle"><span>Menu</span></a>
						<div id="menu">
							<ul>
								<li><a href="index.html">Home</a></li>
								<li><a href="generic.html">Generic</a></li>
								<li><a href="elements.html">Elements</a></li>
								<li><a href="#">Sign Up</a></li>
								<li><a href="#">Log In</a></li>
							</ul>
						</div></li>
				</ul>
			</nav>
		</header>

		<!-- Main -->
		<article id="main">
			<section class="wrapper style5">
				<span
					style="width: 100%; font-size: 80px; text-align: center; margin-bottom: 16px;"
					class="fa  fa-envelope-o"></span>

				<h2 style="text-align: center;" class="form-signin-heading">Verify
					Your Number</h2>
				<div style="max-width: 600px; margin: auto;">
				
					<g:if test="${status == 'wrongPassword'}">
						<p style = "color:#a94442; ">
						Oh Snap! The 6 digit verification code you entered was incorrect. If you lost 
						your code or your code is not working correctly press the <i>&#34;Resend Code&#34;</i> button 
						below to have your code resent to ${phoneNumber}.
						</p>
					</g:if>
					<g:elseif test="${status == 'init'}">
						<p>
						In a few seconds <i>(Please be patient)</i> you will receive a 6
						digit verification code to <b>${phoneNumber}</b> in a text. When you
						receive this code enter it in the text box below and you will be
						ready to go!
						</p>
					</g:elseif>
				</div>

				<div class="inner" style="max-width: 400px;">

					<g:form class="form-signin" controller="Login" action="createAccount"
						enctype="multipart/form-data">

						<label style="margin-bottom: 5px; width: 100%; text-align: left;"
							for="inputEmail" class="sr-only">Your 6 Digit Code</label>
						<input type="text"
							onkeypress="return inputLimitCharMax(6, 'code')" id="code"
							name="code" class="form-control" placeholder="My Code" autofocus>

						<label
							style="margin-top: 10px; margin-bottom: 5px; padding: 0px; width: 100%; text-align: left;"
							for="inputEmail" class="sr-only">Your Email</label>
						<input type="email" id="email" name="email" class="form-control"
							placeholder="Email">


						<label
							style="margin-top: 10px; margin-bottom: 5px; padding: 0px; width: 100%; text-align: left;"
							for="inputEmail" class="sr-only">Create Password</label>
						<input type="password" id="password" name="password"
							class="form-control" placeholder="Password">


						<label
							style="margin-top: 10px; margin-bottom: 5px; width: 100%; text-align: left;"
							for="inputEmail" class="sr-only">Re-enter Password</label>
						<input type="password" id="repassword" class="form-control"
							placeholder="Re-enter Password">
							
							<div class="alert" id="errorList"
								style="margin-top: 10px; display: none;"></div>

						<g:actionSubmit id="submitBtn" onclick="return validateForm()"
							value="Create Account" action="createAccount"
							style="margin-top: 15px; width: 100%" />
						<a id="codeResendBtn"
							onClick="resendValidationCode('${createLink(controller: 'Login', action: 'resendValidationCode')}')"
							style="margin-top: 15px; width: 100%" class="button fit">Resend Code</a>

						<div class="6u$ 12u$(small)" style="margin-top: 10px;">
							<input type="checkbox" id="demo-human" name="demo-human" checked>
							<label for="demo-human">Remember Me</label>
						</div>

					</g:form>
				</div>


				<div style="max-width: 600px; margin: auto;">
					<h4>Why Verify?</h4>
					<p>
						Verifying yourself will ensure that your number can <b>never</b>
						be used by anyone else but you. This keeps <i>everything and
						anything</i> you send to TxtWolf safe and secure. - <span
							class="fa fa-paw"></span>
					</p>
				</div>
			</section>
		</article>

		<!-- Footer -->
		<footer id="footer">
			<ul class="icons">
				<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
				<li><a href="#" class="icon fa-facebook"><span
						class="label">Facebook</span></a></li>
				<li><a href="#" class="icon fa-instagram"><span
						class="label">Instagram</span></a></li>
				<li><a href="#" class="icon fa-dribbble"><span
						class="label">Dribbble</span></a></li>
				<li><a href="#" class="icon fa-envelope-o"><span
						class="label">Email</span></a></li>
			</ul>
			<ul class="copyright">
				<li>&copy; Untitled</li>
				<li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
			</ul>
		</footer>

	</div>

	<div class="remodal" data-remodal-id="modalResend" role="dialog" aria-labelledby="modal1Title" aria-describedby="modal1Desc">
	  <button data-remodal-action="close" class="remodal-close" aria-label="Close"></button>
	  <div>
	    <h2 id="modal1Title" style = "color: #414141;" >Incoming!</h2>
	    <p id="modal1Desc">
			Your validation code has been resent to ${phoneNumber}. Please allow up to 1 minute for this message to reach you.
	    </p>
	  </div>
	  <br>
	  <button data-remodal-action="confirm" class="remodal-confirm">OK</button>
	</div>


	<!-- Scripts -->
	<g:javascript src="jquery.min.js" />
	<g:javascript src="jquery.scrollex.min.js" />
	<g:javascript src="jquery.scrolly.min.js" />
	<g:javascript src="skel.min.js" />
	<g:javascript src="util.js" />
	<g:javascript src="main.js" />
	<g:javascript src="formValidation/validation.js" />
	<g:javascript src="data/validCodeCheck.js" />
	<g:javascript src="remodal/remodal.min.js" />
	<g:javascript src="remodal/remodalControls.js" />

	<!--[if lte IE 8]><g:javascript src="ie/respond.min.js" /><![endif]-->

	<script>

			// When the form is submitted disable the resend button
			$('form').submit(function() {
				$("#codeResendBtn").prop("disabled",true);		
			});
		
			var errors = [];
			function validateForm() {
			var hasErrors = false;
			var number = $("#inputPhoneNum").val();
			var email = $("#email").val();			
			var code = $("#code").val();
			var password = $("#password").val();
			var repassword = $("#repassword").val();
			
			$("#errorList").css("display", "none");
			errors = [];

				if (code == "" || code.length != 6) {
					hasErrors = true;
					errors.push("Please enter a valid varification code of 6 digits (numbers).");
				}

				try {
					// Email regex for validation
				    var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
					if (re.test(email) == false) {
						hasErrors = true;
						errors.push("Please enter a valid email.");
					} 
				}
				catch(err) {
					// Do nothing
				}

				if (password.length > 0 && repassword.length > 0)  {
					if (password.length < 6) {
						hasErrors = true;
						errors.push("Password too short. Password must be atleast 6 characters.");
					} 
	
					if (password.length > 16) {
						hasErrors = true;
						errors.push("Password too long. 16 character max.");
					} 
	
					if (password == repassword) {} else {
						hasErrors = true;
						errors.push("Passwords dont match. Please re-enter your password.");
					}
				} else {
					hasErrors = true;
					errors.push("Please enter a password in both password fields.");
				}

				if (hasErrors) {
					$("#errorList").html("");
					for (i = 0; i < errors.length; i++) { 
						$("#errorList").append("*" + errors[i] + "<br/>");		
					}								
					$("#errorList").slideDown("800");
					return false;
				} else {
				// Validate success
					return true; 
				}	
			}			

			</script>


</body>
</html>