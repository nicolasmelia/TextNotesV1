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

				<div class="inner" style="max-width: 400px;">
					<h2 style="text-align: center; margin-bottom: 0px;"
						class="form-signin-heading">
						Welcome Back <br> <b>${phoneNumber}</b>
					</h2>

					<span
						style="width: 100%; margin: 5px; font-size: 100px; text-align: center;"
						class="fa fa-paw"></span>

					<g:form class="form-signin" controller="Login" action="password"
						enctype="multipart/form-data">
						<label style="width: 100%; text-align: center;" for="inputEmail"
							class="sr-only">Enter Your Password.</label>
						<input type="password" id="password" name="password"
							class="form-control" placeholder="Your password" autofocus>

						<g:if test="${status == 'wrongPassword'}">
							<div class="alert" id="errorList"
								style="margin-top: 10px; display: block;">
								*Oh snap! Wrong password entered for <i> ${phoneNumber}
								</i>, please try again.
							</div>
						</g:if>
						<g:elseif test="${status == 'init'}">
							<div class="alert" id="errorList"
								style="margin-top: 10px; display: none;"></div>
						</g:elseif>


						<g:actionSubmit id = "submitBtn" onclick="return validateForm()" value="Login"
							action="password" style="margin-top: 15px; width: 100%" />

										<div class="6u$ 12u$(small)" style = "margin-top: 10px;" >
												<input type="checkbox" id="demo-human" name="remeberMe" checked>
												<label for="demo-human">Remember Me</label>
											</div>


						<a style="">I forgot my password :(</a>
					</g:form>
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

	<div class="remodal" data-remodal-id="loadingModal" role="dialog"
		aria-labelledby="modal1Title" aria-describedby="modal1Desc"
		data-remodal-options="hashTracking: false, closeOnOutsideClick: false">
		<button data-remodal-action="close" class="remodal-close"
			aria-label="Close"></button>
		<div>
			<h2 id="modal1Title" style="color: #414141;">Logging In...</h2>
			<p id="modal1Desc">
				<span style="color: #61B7FE; font-size: 70px;"
					class="fa fa-spinner fa-pulse"></span>
				<p id="loadingText" style="margin: auto; width: 80%;"></p>
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

	<script type="text/javascript">
	
		var errors = [];
		function validateForm() {
			var hasErrors = false;
			var password = $("#password").val();
			$("#errorList").css("display", "none");
			errors = [];

			if (password.length > 0) {
				if (password.length < 6) {
					hasErrors = true;
					errors.push("Password too short. Password must be atleast 6 characters.");
				}

				if (password.length > 16) {
					hasErrors = true;
					errors.push("Password too long. 16 character max.");
				}
			} else {
				hasErrors = true;
				errors.push("Please enter a password.");
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
				//displayLoadingModal();
				return true;				
			}
		}
	</script>


			</body>
</html>