<!DOCTYPE HTML>
<!--
	Frequency by Pixelarity
	pixelarity.com @pixelarity
	License: pixelarity.com/license
-->
<html>

	<head>
		<title>TxtWolf - Create Account</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="icon" href="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}">
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='main.boot.css'/>">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">		
		<!--[if lte IE 8]><g:javascript src="ie/html5shiv.js" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
	</head>
	
<!-- begin olark code -->
<script data-cfasync="false" type='text/javascript'>/*<![CDATA[*/window.olark||(function(c){var f=window,d=document,l=f.location.protocol=="https:"?"https:":"http:",z=c.name,r="load";var nt=function(){
f[z]=function(){
(a.s=a.s||[]).push(arguments)};var a=f[z]._={
},q=c.methods.length;while(q--){(function(n){f[z][n]=function(){
f[z]("call",n,arguments)}})(c.methods[q])}a.l=c.loader;a.i=nt;a.p={
0:+new Date};a.P=function(u){
a.p[u]=new Date-a.p[0]};function s(){
a.P(r);f[z](r)}f.addEventListener?f.addEventListener(r,s,false):f.attachEvent("on"+r,s);var ld=function(){function p(hd){
hd="head";return["<",hd,"></",hd,"><",i,' onl' + 'oad="var d=',g,";d.getElementsByTagName('head')[0].",j,"(d.",h,"('script')).",k,"='",l,"//",a.l,"'",'"',"></",i,">"].join("")}var i="body",m=d[i];if(!m){
return setTimeout(ld,100)}a.P(1);var j="appendChild",h="createElement",k="src",n=d[h]("div"),v=n[j](d[h](z)),b=d[h]("iframe"),g="document",e="domain",o;n.style.display="none";m.insertBefore(n,m.firstChild).id=z;b.frameBorder="0";b.id=z+"-loader";if(/MSIE[ ]+6/.test(navigator.userAgent)){
b.src="javascript:false"}b.allowTransparency="true";v[j](b);try{
b.contentWindow[g].open()}catch(w){
c[e]=d[e];o="javascript:var d="+g+".open();d.domain='"+d.domain+"';";b[k]=o+"void(0);"}try{
var t=b.contentWindow[g];t.write(p());t.close()}catch(x){
b[k]=o+'d.write("'+p().replace(/"/g,String.fromCharCode(92)+'"')+'");d.close();'}a.P(2)};ld()};nt()})({
loader: "static.olark.com/jsclient/loader0.js",name:"olark",methods:["configure","extend","declare","identify"]});
/* custom configuration goes here (www.olark.com/documentation) */
olark.identify('6667-512-10-8779');/*]]>*/</script><noscript><a href="https://www.olark.com/site/6667-512-10-8779/contact" title="Contact us" target="_blank">Questions? Feedback?</a> powered by <a href="http://www.olark.com?welcome" title="Olark live chat software">Olark live chat software</a></noscript>
<!-- end olark code -->
	
	
	<body>

		<!-- Header -->
			<header id="header">
				<h1 id="logo"><a href="${createLink(controller: 'Home')}">TxtWolf</a></h1>
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
								<input type="text" name="firstname" id="firstname" value="" placeholder="Required" /> 
								
								<label class = 'inputLabel' >Last Name</label>	
								<input type="text" name="lastname" id="lastname" value="" placeholder="Required" /> 
			
								<label class = 'inputLabel' >Business Name</label>	
								<input type="text" name="companyname" id="companyname" value="" placeholder="Not Required" /> 
								
								<label class = 'inputLabel' >Time Zone</label>		
			                      <select name = "timeZone" id  = "timeZoneSelected"  class="form-control">
										<option value="Pacific/Honolulu">(GMT-10:00) Hawaii</option>
										<option value="America/Anchorage">(GMT-09:00) Alaska</option>
										<option value="America/Vancouver">(GMT-08:00) Pacific Time (US &amp; Canada)</option>
										<option value="America/Phoenix">(GMT-07:00) Arizona</option>
										<option value="America/Denver">(GMT-07:00) Mountain Time (US &amp; Canada)</option>
										<option value="America/Chicago" >(GMT-06:00) Central Time (US &amp; Canada)</option>
										<option value="America/New_York" selected="selected" >(GMT-05:00) Eastern Time (US &amp; Canada)</option>
										<option value="America/Indiana/Knox">(GMT-05:00) Indiana (East)</option><option value="" disabled="disabled">-------------</option>
										<option value="America/Atka, US/Aleutian">(GMT-11:00) International Date Line West</option>
										<option value="America/Atka, US/Aleutian">(GMT-11:00) Midway Island</option>
										<option value="America/New_York">Other (Not Listed)</option>									
			                      </select>
			                      
								<label class = 'inputLabel' >Affiliate ID <a href = "${createLink(controller: 'affiliateProgram')}" target="_blank"><span class = "fa fa-question-circle"></span></a></label>	
								<input type="text" name="affiliateID" id="affiliateID" value="" placeholder="Not Required" /> 

								
								<hr>
								
								
		
								<label class = 'inputLabel' >Your Email (Login with email)</label>	
								<input type="email" name="email" id="email" value="" placeholder="Required" /> 

								
								<label class = 'inputLabel' >Password</label>
								<input type="password" name="passwordtwo" id="passwordone" value="" placeholder=Required />	

								<label class = 'inputLabel' >Re-enter Password</label>
								<input type="password" name="passwordone" id="passwordtwo" value="" placeholder="Required" />		

								
									<div class="6u 12u$(small)" style = "margin-top: 15px;" >
										<input type="checkbox" id="rememberme" name="rememberme">
										<label for="rememberme">Remember Me</label>
									</div>
										
										<div class="12u$">
										<ul class="actions">
											<li  style = "width: 100%;">
											<g:actionSubmit  class="special" id = "submitBtn" onclick="return validateForm()" value = "Create Account"  action = "createAccount" style = "width: 100%"/>	
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

			//	if (companyname.length < 1) {
			//		hasErrors = true;
			//		errors.push("Please enter a valid company name.");
			//	} 	
		
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