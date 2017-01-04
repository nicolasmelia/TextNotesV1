<!DOCTYPE HTML>
<!--
	Frequency by Pixelarity
	pixelarity.com @pixelarity
	License: pixelarity.com/license
-->
<html>
	<head>
		<title>TxtWolf - Login</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="icon" href="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}">
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='main.boot.css'/>">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
		
		<!--[if lte IE 8]><g:javascript src="ie/html5shiv.js" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
		
		<script type="text/javascript">
		window.$zopim||(function(d,s){var z=$zopim=function(c){z._.push(c)},$=z.s=
		d.createElement(s),e=d.getElementsByTagName(s)[0];z.set=function(o){z.set.
		_.push(o)};z._=[];z.set._=[];$.async=!0;$.setAttribute("charset","utf-8");
		$.src="https://v2.zopim.com/?4UBUexrzEbn1D1IOK7cXCttTMqRa1rB7";z.t=+new Date;$.
		type="text/javascript";e.parentNode.insertBefore($,e)})(document,"script");
		</script>
		<!--End of Zendesk Chat Script-->
		
	</head>
	
	<body>

		<!-- Header -->
			<header id="header">
				<h1 id="logo"><a href="${createLink(controller: 'Home')}" >TxtWolf</a></h1>
				<nav id="nav">
					<ul>
						<li><a href="${createLink(controller: 'Home')}">Home</a></li>
						<li><a href="${createLink(controller: 'blog', params: [blogID: '1'])}">Blog</a></li>			
						<li><a href="${createLink(controller: 'Home', action: 'pricing')}">Pricing</a></li>
						
						<g:if test="${session.userID}">
							<li><a href="${createLink(controller: 'Dashboard')}">Dashboard</a></li>				
						</g:if>
						<g:else>
							<li><a href="${createLink(controller: 'login')}">Login</a></li>
						</g:else>
						
						<g:if test="${session.userID}">
							<li><a href="${createLink(controller: 'Login', action: 'logout')}" class="button alt">Sign Out</a></li>
						</g:if>
						<g:else>
							<li><a href="${createLink(controller: 'login', action: 'newAccount')}" class="button alt">Sign Up</a></li>
						</g:else>						
					</ul>
				</nav>
			</header>

		<!-- Main -->
			<section id="main" class="wrapper style1">
				<div class="container box big bordered">
					<header class="major special" style = "padding: 0px;" >
					
						<h2>Login to TxtWolf</h2>
						<br>
						<p> Welcome back. Enter your credentials below to get started.</p>
							
						<g:if test="${error}">
							<div class="alert" id="errorList" style="margin: 10px auto 0px auto; display: block; max-width: 450px; ">${error}</div>
						</g:if>
						<g:else>
							<div class="alert" id="errorList" style="margin: 10px auto 0px auto; display: none; max-width: 450px; "></div>						
						</g:else>
								
								
					</header>
					
					<!-- Form -->
						<section>		
							<g:form class="form-signin" controller="Login" action="attemptLogin" enctype="multipart/form-data" >
								<div style = " display: block; margin: auto; max-width: 400px;">		
								<input type="email" name="email" id="email" value="" placeholder="Email" /> <br>
								<input type="password" name="password" id="password" value="" placeholder="Password" />		
								
									<div class="6u 12u$(small)" style = "margin-top: 15px;" >
										<input type="checkbox" id="rememberme" name="rememberme">
										<label for="rememberme">Remember Me</label>
									</div>
										
										<div class="12u$">
										<ul class="actions">
											<li  style = "width: 100%;">
											<g:actionSubmit  class="special" id = "submitBtn" onclick="return validateForm()" value = "Login"  action = "attemptLogin" style = "width: 100%"/>	
											</li>											
											<a onclick="return forgotPassword();" style = "display:block; margin-top: 4px;" href = "#">I forgot my password</a>
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
							<h2>Affiliate Program</h2>
							<p>
								Do you think your employer or other businesses you interact with would benefit from using TxtWolf? If so, you should consider becoming a TxtWolf affiliate! 
								Earn money for each business that joins our "Pro" plan.
							</p>
							<ul class="actions">
								<li><a href="${createLink(controller: 'affiliateProgram')}" class="button alt">Learn more</a></li>
							</ul>
						</section>
						<section class="4u 6u(medium) 12u$(xsmall)">
							<h3>Recent Blogs</h3>
							<ul class="updates">
								<li>
									<p><a href="${createLink(controller: 'blog', params: [blogID: '1'])}" >The possibilities when it comes to keyword text messaging are limitless. Learn how to use this to your advantage.</a></p>
									<span class="timestamp">- TxtWolf Blogs</span>
								</li>
								<li>
									<p><a href="${createLink(controller: 'blog', params: [blogID: '2'])}" >Using a web-based program, you can send mass texts to subscribing customers, set up campaigns and collect customer data.</a></p>
									<span class="timestamp">- TxtWolf Blogs</span>
								</li>
							</ul>
						</section>
						<section class="4u$ 6u$(medium) 12u$(xsmall)">
							<h3>Contact Us</h3>
							<ul class="labeled-icons">
								<li>
									<h4 class="icon fa-home"><span class="label">Address</span></h4>
									Cleveland, OH<br />
								</li>
								<li>
									<h4 class="icon fa-phone"><span class="label">Phone</span></h4>
									(330) 540-8023
								</li>
								<li>
									<h4 class="icon fa-envelope"><span class="label">Email</span></h4>
									<a href="mailto:Support@TxtWolf.com">Support@TxtWolf.com </a>
								</li>
								<li>
									<h4 class="icon fa-facebook"><span class="label">Facebook</span></h4>
									<a href="https://www.facebook.com/TxtWolf">www.facebook.com/TxtWolf</a>
								</li>
							</ul>
						</section>
					</div>
				</div>
				<div class="copyright">
					&copy; 2017, TxtWolf LLC.
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
			var password = $("#password").val();
			
			$("#errorList").css("display", "none");
			errors = [];

				try {
					// Email regex for validation
				    var re = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i;
					if (re.test(email) == false) {
						hasErrors = true;
						errors.push("Please enter a valid email. ");
					} 
				}
				catch(err) {
					// Do nothing
				}

				if (password.length < 6) {
					hasErrors = true;
					errors.push("Password must be atleast 6 characters. ");
				} 

				if (hasErrors) {
					$('body, html').animate({ scrollTop: 0 }, 800);
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


			function forgotPassword() {
				$('body, html').animate({ scrollTop: 0 }, 800);
				$("#errorList").html("");
				$("#errorList").css("display", "none");
				$("#errorList").append("Please email <b>support@TxtWolf.com</b> for lost password inquiries.");		
				$("#errorList").slideDown("800");
				return false;
			}	
	
					
			</script>

	</body>
</html>