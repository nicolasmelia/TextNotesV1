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
		
						

						
						<section class="wrapper style5" style = "padding: 20px;">
						<div style = "max-width: 800px; margin: auto;">
						
						<div class="info"  style = " display: none; text-align: center;  margin-bottom: 8px; width: 100%;">	
											
						<span style = "font-size: 21px; color: #fff; font-weight: 800; letter-spacing: 0.2em; line-height: 1em;" >
						<b>#${phoneNumber}</b> <br> 						</span>
						
						<p style = "font-size: 15px; color: #3d3d3d; padding: 0px; margin:0px;"> 
						<span class = "fa fa-sticky-note-o"></span> 23 Notes 
						<span class = "fa fa-picture-o"></span> 23 Notes 
						
						</p>
					
						</div>
						
						
						<div style = "width: 100%; text-align: left;">
						
						<h5>

							<div style = "curser: default; height: 24px; border-bottom: solid 2px #3cc8f6; margin: 0px 4px 10px 0px; display: inline-block; "> 
									Notes
							</div>	
							
							<div style = "height: 24px;  border-bottom: solid 2px #c1c1c1;  margin: 0px 4px 10px 0px; display: inline-block; "> 
									Reminders
							</div>	
							
							<div style = "height: 24px;  border-bottom: solid 2px #c1c1c1; margin: 0px 4px 10px 0px; display: inline-block; "> 
									More <span class = "fa fa-caret-down"></span>
							</div>	

						</h5>

						</div>						
						
									<div class="table-wrapper" style = "min-width: 300px;">
										<table class="alt" >
											<tbody>
												<tr style = "">
													<td style = "min-width:90px;max-height: 70px; "><span class = "fa fa-calendar"></span> <b>Date</b></td>
													<td style = "max-height: 70px;" ><span class = "fa fa-sticky-note-o"></span>  <b>NOTES</b></td>
												</tr>
									
										<g:if test="${messages}">									
                							  <g:each in="${messages}">
													<tr onClick = "openNote('${it.message}', '<g:formatDate format="MM/dd/yyyy hh:mm a" date="${it.date}"/>')"class = 'tblRow'>
														<td><g:formatDate format="MM-dd-yyyy" date="${it.date}"/></td>
														<td>${it.message}</td>
													</tr>
												</g:each>
											</g:if>
											<g:else>
													<tr>
														<td>Nothing</td>
														<td>Nothing</td>
													</tr>
											</g:else>

											</tbody>
										</table>
										
									</div>
									
									
					<div style=" margin: auto;">
					<h4>What's new?</h4>
					<p>
						Verifying yourself will ensure that your number can <b>never</b>
						be used by anyone else but you. This keeps <i>everything and
						anything</i> you send to TxtWolf safe and secure. - <span
							class="fa fa-paw"></span>
					</p>
				</div>
						
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
			
				<div class="remodal" data-remodal-id="noteModal" role="dialog" aria-labelledby="modal1Title" aria-describedby="modal1Desc" data-remodal-options="hashTracking: false">
  				<button data-remodal-action="close" class="remodal-close" aria-label="Close"></button> <br>

				  <div>
  
				    
				    <h5 id="modal1Title" style = "color: #414141;" > 11/12/2015 </h5>
				    <p id="modalMessage">		
				    Hmm, something went wrong...    
				    </p>
				  </div>

				  				  
				  				 
				  	<a href = "#" style = "margin-right: 12px;"><span class = 'fa fa-share'><br> Resend</span></a>  
					<a href = "#" style = "margin-right: 12px;"><span class = 'fa fa-trash'><br> Delete</span></a>  
				    <a href = "#" style = "margin-right: 12px;"><span class = 'fa fa-times'><br> Close</span></a>
				  	  
				  
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

				function openNote(message, date) {
				    var inst = $('[data-remodal-id=noteModal]').remodal();	
					inst.open();

					$("#modalMessage").text(message);
					$("#modal1Title").text(date);
					

				}



				</script>

	</body>
</html>