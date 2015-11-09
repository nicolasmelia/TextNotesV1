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
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='mainBoot.css'/>">
		
		<!--Modal CSS-->	
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='remodal/remodal.css'/>">
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='remodal/remodal-default-theme.css'/>">
		
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie9.css'/>"><![endif]-->
	</head>
	<body>

		<!-- Page Wrapper -->
			<div id="page-wrapper">

				<!-- Header -->
					<header id="header">
						<h1><a href="index.html">Spectral</a></h1>
						<nav id="nav">
							<ul>
								<li class="special">
									<a href="#menu" class="menuToggle"><span>Menu</span></a>
									<div id="menu">
										<ul>
											<li><a href="index.html">Home</a></li>
											<li><a href="generic.html">Generic</a></li>
											<li><a href="elements.html">Elements</a></li>
											<li><a href="#">Sign Up</a></li>
											<li><a href="#">Log In</a></li>
										</ul>
									</div>
								</li>
							</ul>
						</nav>
					</header>

				<!-- Main -->
					<article id="main">

						<section class="wrapper style5">

							<div class="inner" style = "max-width: 400px;">
								<h2  style = "text-align: center;" class="form-signin-heading">Sign into <b>TxtWolf</b></h2>
								<span style = "width: 100%; font-size: 150px; text-align: center; margin-top: -10px; " class = "fa fa-mobile"></span>

								  	<g:form class="form-signin" controller="Login" action="attemptLogin" enctype="multipart/form-data" >
								  
									<label  style = "width: 100%; text-align:center;" for="inputEmail" class="sr-only">Your Phone Number</label>
									<input name = "number" onkeypress="return isNumberKey(event)"  type="text" id="inputPhoneNum" class="form-control" placeholder="Phone Number"  autofocus>
									
									<div class = "alert" id = "errorList" style = "margin-top: 10px; display: none; " ></div>
									<g:actionSubmit  id = "submitBtn" onclick="return validateForm()" value = "Next"  action = "attemptLogin" style = "margin-top: 15px; width: 100%"/>
									
							</g:form>

							</div>

							
						<div style = "max-width: 600px; margin: auto;">
									<h4>First Time?</h4>
									<p>With <b>TxtWolf</b> you sign in with your phone number. No need to create an account. 
									When you log in for the first time you will be asked to varify your phone number (only have to do this once) and then create
									an awesome password so your notes stay safe and cozy.  - <span class = "fa fa-paw"></span></p>
								</div>						
						</section>
					</article>

				<!-- Footer -->
					<footer id="footer">
						<ul class="icons">
							<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>
							<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
							<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>
							<li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li>
							<li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
						</ul>
						<ul class="copyright">
							<li>&copy; Untitled</li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
						</ul>
					</footer>

			</div>	
			
				<div class="remodal" data-remodal-id="loadingModal" role="dialog" aria-labelledby="modal1Title" aria-describedby="modal1Desc" data-remodal-options="hashTracking: false, closeOnOutsideClick: false">
  				<button data-remodal-action="close" class="remodal-close" aria-label="Close"></button>
				  <div>
				    <h2 id="modal1Title" style = "color: #414141;" >Validating Number...</h2>
				    <p id="modal1Desc">				    
                        <span style = "color: #61B7FE; font-size: 70px;" class="fa fa-spinner fa-pulse"></span>
                        <p id = "loadingText" style = "margin: auto; width: 80%;"></p>
				    </p>
				  </div>
				  <br>
				</div>

				<!-- Scripts -->
			   <g:javascript src="jquery.min.js" />  
			   <g:javascript src="jquery.scrollex.min.js" />  
		       <g:javascript src="jquery.scrolly.min.js" />  
		       <g:javascript src="skel.min.js" />  
		       <g:javascript src="util.js" /> 
		       <g:javascript src="main.js" /> 
		       <g:javascript src="formValidation/validation.js" /> 
		       <g:javascript src="remodal/remodal.min.js" /> 
		       <g:javascript src="remodal/remodalControls.js" /> 
		       
		       <!--[if lte IE 8]><g:javascript src="ie/respond.min.js" /><![endif]-->

				<script>

				var errors = [];
				function validateForm() {
				var hasErrors = false;
				var number = $("#inputPhoneNum").val();
				$("#errorList").css("display", "none");
				errors = [];

					if (number == "" || number.length < 7) {
						hasErrors = true;
						errors.push("Number too short. :(");
					} 
					
					if (number.length > 15) {
						hasErrors = true;
						errors.push("Number too long. 15 digit max. :(");
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