<!DOCTYPE HTML>
<!--
	Frequency by Pixelarity
	pixelarity.com @pixelarity
	License: pixelarity.com/license
-->
<html>

	<head>
		<title>Untitled</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='main.boot.css'/>">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">		
		<!--[if lte IE 8]><g:javascript src="ie/html5shiv.js" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
	</head>
	
	<body>

		<!-- Header -->
			<header id="header">
				<h1 id="logo"><a href="index.html">TxtWolf</a></h1>
				<nav id="nav">
					<ul>
						<li><a href="index.html">Home</a></li>
						<li>
							<a href="#">Layouts</a>
							<ul>
								<li><a href="left-sidebar.html">Left Sidebar</a></li>
								<li><a href="right-sidebar.html">Right Sidebar</a></li>
								<li><a href="no-sidebar.html">No Sidebar</a></li>
								<li>
									<a href="#">Submenu</a>
									<ul>
										<li><a href="#">Option 1</a></li>
										<li><a href="#">Option 2</a></li>
										<li><a href="#">Option 3</a></li>
										<li><a href="#">Option 4</a></li>
									</ul>
								</li>
							</ul>
						</li>
						<li><a href="elements.html">Elements</a></li>
						<li><a href="#" class="button alt">Sign Up</a></li>
					</ul>
				</nav>
			</header>

		<!-- Main -->
			<section id="main" class="wrapper style1">
				<div class="container box big bordered">
					<header class="major special" style = "padding: 0px;" >
						<h2>Create an Account</h2>
						<br>
						<p> Welcome. Create a <b>free</b> account below to get started!</p>
						
						<g:if test="${error}">
							<div class="alert" id="errorList" style="margin: 10px auto 0px auto; display: block; max-width: 450px; ">${error}</div>
						</g:if>
						<g:else>
							<div class="alert" id="errorList" style="margin: 10px auto 0px auto; display: none; max-width: 450px; "></div>						
						</g:else>	
										
					</header>
					
					<!-- Form -->
						<section>

								
							<g:form class="form-signin" controller="Login" action="createAccount" enctype="multipart/form-data" >

										<div style = " display: block; margin: auto; max-width: 400px; ">
		
		
								<label class = 'inputLabel' >First Name</label>	
								<input type="text" name="firstname" id="firstname" value="" placeholder="Name" /> 
								
								<label class = 'inputLabel' >Last Name</label>	
								<input type="text" name="lastname" id="lastname" value="" placeholder="Last Name" /> 
			
								<label class = 'inputLabel' >Bussiness Name</label>	
								<input type="text" name="companyname" id="companyname" value="" placeholder="Company Name" /> 
		
								<hr>
		
								<label class = 'inputLabel' >Your Email (Login with email)</label>	
								<input type="email" name="email" id="email" value="" placeholder="Email" /> 

								
								<label class = 'inputLabel' >Password</label>
								<input type="password" name="passwordtwo" id="passwordone" value="" placeholder="Password" />	

								<label class = 'inputLabel' >Re-enter Password</label>
								<input type="password" name="passwordone" id="passwordtwo" value="" placeholder="Re-enter Password" />		

									<div class="6u 12u$(small)" style = "margin-top: 15px;" >
										<input type="checkbox" id="rememberme" name="rememberme">
										<label for="rememberme">Remember Me</label>
									</div>
										
										<div class="12u$">
										<ul class="actions">
											<li  style = "width: 100%;">
											<g:actionSubmit  class="special" id = "submitBtn" onclick="return validateForm()" value = "Create Account"  action = "createAccount" style = "width: 100%"/>	
											</li>											
											<a  style = "display:block; margin-top: 4px;" href = "#">I forgot my password</a>
										</ul>
									</div>

								
								</div>

							</g:form>
						</section>

				</div>
			</section>

		<!-- Footer -->
			<div id="footer">
				<div class="container">
					<div class="row 200% uniform">
						<section class="4u 12u$(medium) 12u$(xsmall) footer-info">
							<h2>Ipsum dolor sed consequat</h2>
							<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Soluta molestiae eius dolorem quod deserunt esse libero, dolorum temporibus, aliquid nemo vitae sit enim quas ipsam dicta et veritatis excepturi suscipit. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Odio incidunt, tempora quasi, impedit laudantium totam.</p>
							<ul class="actions">
								<li><a href="#" class="button alt">Learn more</a></li>
							</ul>
						</section>
						<section class="4u 6u(medium) 12u$(xsmall)">
							<h3>Recent News</h3>
							<ul class="updates">
								<li>
									<p><a href="#">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Earum tenetur sequi eos porro minima laborum!</a></p>
									<span class="timestamp">Posted 2 hours ago</span>
								</li>
								<li>
									<p><a href="#">Perferendis deserunt, iure ipsum animi quidem molestiae esse quisquam rerum quas placeat.</a></p>
									<span class="timestamp">Posted 6 hours ago</span>
								</li>
								<li>
									<p><a href="#">Ex est veniam, ratione voluptas quidem eveniet accusantium impedit explicabo error, commodi.</a></p>
									<span class="timestamp">Posted 8 hours ago</span>
								</li>
							</ul>
						</section>
						<section class="4u$ 6u$(medium) 12u$(xsmall)">
							<h3>Contact Us</h3>
							<ul class="labeled-icons">
								<li>
									<h4 class="icon fa-home"><span class="label">Address</span></h4>
									1234 Somewhere Road #5403<br />
									Nashville, TN 00000
								</li>
								<li>
									<h4 class="icon fa-phone"><span class="label">Phone</span></h4>
									(000) 555-0000 x12345
								</li>
								<li>
									<h4 class="icon fa-envelope"><span class="label">Email</span></h4>
									<a href="#">hello@untitled.tld</a>
								</li>
								<li>
									<h4 class="icon fa-facebook"><span class="label">Facebook</span></h4>
									<a href="#">facebook.com/untitled-tld</a>
								</li>
								<li>
									<h4 class="icon fa-twitter"><span class="label">Twitter</span></h4>
									<a href="#">twitter.com/untitled-tld</a>
								</li>
							</ul>
						</section>
					</div>
				</div>
				<div class="copyright">
					&copy; Untitled. All rights reserved.
				</div>
			</div>

			<!-- Scripts -->
			<g:javascript src="jquery.min.js" />  
			<g:javascript src="jquery.dropotron.min.js" /> 	
			<g:javascript src="jquery.scrollgress.min.js" />  
			<g:javascript src="skel.min.js" />  
			<g:javascript src="util.js" /> 
			<g:javascript src="main.js" /> 
			<g:javascript src="jquery.scrolly.min.js" /> 
			<!--[if lte IE 8]><g:javascript src="ie/respond.min.js" /><![endif]-->
			
			<script>

			// When the form is submitted disable the resend button
			$('form').submit(function() {
				$("#submitBtn").prop("disabled",true);		
			});
		
			var errors = [];
			function validateForm() {
			var hasErrors = false;
			var email = $("#email").val();			
			var passwordone = $("#passwordone").val();
			var passwordtwo = $("#passwordtwo").val();
			var firstname = $("#firstname").val();			
			var lastname = $("#lastname").val();			
			var companyname = $("#companyname").val();			

			
			$("#errorList").css("display", "none");
			errors = [];

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

				if (passwordone.length > 0 && passwordtwo.length > 0)  {
					if (passwordone.length < 6) {
						hasErrors = true;
						errors.push("Password too short. Password must be atleast 6 characters.");
					} 
	
					if (passwordone.length > 16) {
						hasErrors = true;
						errors.push("Password too long. 16 character max.");
					} 
	
					if (passwordone != passwordtwo) {
						hasErrors = true;
						errors.push("Passwords dont match. Please re-enter your password.");
					}
				} else {
					hasErrors = true;
					errors.push("Please enter a password in both password fields.");
				}

				if (firstname.length < 1) {
					hasErrors = true;
					errors.push("Please enter a valid first name.");
				} 	

				if (lastname.length < 1) {
					hasErrors = true;
					errors.push("Please enter a valid last name.");
				} 	

				if (companyname.length < 1) {
					hasErrors = true;
					errors.push("Please enter a valid company name.");
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