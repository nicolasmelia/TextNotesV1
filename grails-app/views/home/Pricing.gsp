<!DOCTYPE HTML>
<!--
	Frequency by Pixelarity
	pixelarity.com @pixelarity
	License: pixelarity.com/license
-->
<html>
	<head>
		<title>TxtWolf - Pricing</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		<link rel="icon" href="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}">
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='main.boot.css'/>">
		<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='pricing/main.pricing.css'/>">
		
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
		
		<!--[if lte IE 8]><g:javascript src="ie/html5shiv.js" /><![endif]-->
		<!--[if lte IE 8]><link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='ie8.css'/>"><![endif]-->
	</head>
	
	<body>

		<!-- Header -->
			<header id="header">
				<h1 id="logo"><a href="${createLink(controller: 'Home')}">TxtWolf</a></h1>
				<nav id="nav">
					<ul>
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
					
						<h2>It's Free.</h2>
						<br>
						<p> TxtWolf offers its full feature set for free, up to 500 text a month.</p>
							
						<g:if test="${error}">
							<div class="alert" id="errorList" style="margin: 10px auto 0px auto; display: block; max-width: 450px; ">${error}</div>
						</g:if>
						<g:else>
							<div class="alert" id="errorList" style="margin: 10px auto 0px auto; display: none; max-width: 450px; "></div>						
						</g:else>
								
								
					</header>
					
					<!-- Form -->

			<div class="">
								
					<div class="columns">
					  <ul class="price">
					    <li class="header" style="background-color:#56b6da" >Free</li>
					    <li class="grey">$ 0 / year</li>
					    <li>500 SMS</li>
					    <li>Unlimited Keywords!</li>
					    <li>Unlimited Contacts</li>
					    <li>Unlimited Promotions</li>
					    <li class="grey"><a href="${createLink(controller: 'login')}" style="background-color:#7773c8" class="columnBtn">Sign Up</a></li>
					  </ul>
					</div>
					
					<div class="columns">
					  <ul class="price">
					    <li class="header" style="background-color:#605ca8">Pro</li>
					    <li class="grey">$ 39.99 / month</li>
					    <li>3000 SMS</li>
					    <li>Unlimited Keywords!</li>
					    <li>Unlimited Contacts</li>
					    <li>Unlimited Promotions</li>
					    <li class="grey"><a href="${createLink(controller: 'login')}"  style="background-color:#7773c8" class="columnBtn">Sign Up</a></li>
					  </ul>
					</div>
					
					<div class="columns">
					  <ul class="price">
					    <li class="header" style="background-color:#4998b6" >Premium</li>
					    <li class="grey">Contact Us</li>
					    <li>*Unlimited SMS</li>				    
					    <li>Unlimited Keywords!</li>
					    <li>Unlimited Contacts</li>
					    <li>Unlimited Promotions</li>
					    <li class="grey"><a href="${createLink(controller: 'login')}" style="background-color:#7773c8" class="columnBtn">Sign Up</a></li>
					  </ul>
					</div>
					
					   <span class="clear"></span>

				</div>

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

					
			</script>

	</body>
</html>