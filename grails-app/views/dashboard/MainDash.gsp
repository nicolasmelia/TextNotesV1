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
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='jquery.dropdown.min.css'/>">
		
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie9.css'/>"><![endif]-->
		
		<!-- Dashboard JS controls -->
		<g:javascript src="data/dashboard.js" /> 
		
		
	</head>
	<body>

		<!-- Page Wrapper -->
			<div id="page-wrapper">

				<!-- Header -->
					<header id="header">
						<h1><a href="index.html">TxtWolf</a></h1>
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
						
						
						<div style = "width: 100%; margin-top: 5px; text-align: left;">
						
						<h5>

							<div class = "optionSelectorSelected"> 
									Notes
							</div>	
							
							<div class = "optionSelector"> 
									Reminders
							</div>	
							
							<div  data-jq-dropdown="#jq-dropdown-1" class = "optionSelector"> 
									More <span class = "fa fa-caret-down"></span>
							</div>	
							
							<div id="jq-dropdown-1" class="jq-dropdown jq-dropdown-tip">
							    <ul class="jq-dropdown-menu">
							        <li><a style = "border: 0px;"  href="#1">Item 1</a></li>
							        <li><a style = "border: 0px;" href="#2">Item 2</a></li>
							        <li><a style = "border: 0px;" href="#3">Item 3</a></li>
							    </ul>
							</div>
							
							
					</h5>

						</div>						
									<div class="table-wrapper" style = "min-width: 300px;">
										<table class="alt" style = "margin-bottom: 5px;" >
											<tbody>
												<tr style = "">
													<td style = "width:140px!important; "><span class = "fa fa-calendar"></span> <b>Date</b></td>
													<td style = "max-height: 70px;" ><span class = "fa fa-sticky-note-o"></span>  <b>NOTES</b></td>
													<td style = "width:40px!important; "><span class = "fa fa-bell-o"></span></td>
												</tr>								
										<g:if test="${messages}">									
                							  <g:each in="${messages}">
													<tr style = "" id = "ntr${it.messageID}" class = 'tblRow'>
														<td  onClick = 'openNote("${it.messageID}", "${it.message}", "<g:formatDate format='MM/dd/yyyy hh:mm a' date='${it.date}'/>")'   style = "width:140px!important; max-height: 70px; " id = "ntdDATE${it.messageID}"><g:formatDate format="MM-dd-yyyy" date="${it.date}"/></td>
														<td  onClick = 'openNote("${it.messageID}", "${it.message}", "<g:formatDate format='MM/dd/yyyy hh:mm a' date='${it.date}'/>")'  id = "ntdNOTE${it.messageID}">${it.message}</td>
														
														<g:if test="${it.messageType == 'Appointment'}">
															<td align="center" valign="center" class = "remndHover" onclick = "ass()" id = "ntdRMDR${it.messageID}" style = "width:40px!important; background-color:#FFFFEB; "><span class = "fa fa-check-circle-o addRemind"></span></td>
														</g:if>	
														<g:else>
															<td align="center" valign="center" class = "remndHover" onclick = "ass()" id = "ntdRMDR${it.messageID}" style = "width:40px!important; "><span class = "fa fa-plus-square-o addRemind"></span></td>
														</g:else>	
														
													</tr>
												</g:each>
											</g:if>
											<g:else>
													<tr>
														<td>Woof!</td>
														<td>Looks like you dont have any notes. Text me to use me.</td>
														<td><span class = "fa fa-hourglass-half"></span></td>
													</tr>
											</g:else>

											</tbody>
											
										</table>
										
									<a href ="" style = "padding-top: -200px;" ><span class = "fa fa-angle-left" ></span> Back</a> 
									<b> 1 </b>
									<a href ="" style = "padding-top: -200px;" >Next <span class = "fa  fa-angle-right" ></span></a>
										
										
									</div>
															

									
									
					<div style=" margin: auto; margin-top: 40px;">
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
				  	<a  style = "margin-right: 12px; cursor:pointer;"><span class = 'fa fa-share '><br> Resend</span></a>  
					<a  onClick = "showDeleteModal()" style = "margin-right: 12px; cursor:pointer; "><span class = 'fa fa-trash'><br> Delete</span></a>  
				    <a  onClick = "closeModal()" style = "margin-right: 12px; cursor:pointer; "><span class = 'fa fa-times'><br> Close</span></a>
					<a  style = "margin-right: 12px; display: none; cursor:pointer; "><span class = 'fa fa-bell'><br> Remind</span></a>
				  <br>
				</div>
				
							
				<!-- DELETE MODAL -->
				<div class="remodal" data-remodal-id="modalDelete" role="dialog" aria-labelledby="modal1Title" aria-describedby="modal1Desc">
				  <button data-remodal-action="close" class="remodal-close" aria-label="Close"></button>
				  <div>
				    <h2 id="modal1Title" style = "color: #414141;" ><span class = "fa fa-fire" ></span>Delete Note</h2>
				    <p id="modal1Desc">
						Are you sure you want to delete this note?
				    </p>
				  </div>
				  <br>
				  <button data-remodal-action="confirm" class="remodal-confirm">Cancel</button>
			 	  <button onClick = "deleteMsg('${createLink(controller: 'Dashboard', action: 'deleteNote')}')" class="remodal-cancel">Delete</button>	  
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
		       <g:javascript src="jquery.dropdown.min.js" /> 

		       
		       <!--[if lte IE 8]><g:javascript src="ie/respond.min.js" /><![endif]-->

				<script>


				function closeModal() {
					// Close main modal and show delete warnning
				    var inst = $('[data-remodal-id=noteModal]').remodal();	
					inst.close();
				}

				function ass(){
					alert("Not working");
					}



				</script>

	</body>
</html>