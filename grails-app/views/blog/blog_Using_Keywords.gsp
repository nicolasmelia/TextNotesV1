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
			<header id="header" class="">
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
					<header class="major special">
						<h2>Using Keywords</h2>
						<p>Offering keyword promotions will build traction and customers!</p>
					</header>
					<div class="row 200%">
						<div class="4u 12u$(medium)">

							<!-- Sidebar -->
								<section id="sidebar">
									<section>
									
										<h3>Engagement 101</h3>
										<p>Sed tristique purus vitae volutpat commodo suscipit amet sed nibh. Proin a ullamcorper sed blandit. Sed tristique purus vitae volutpat commodo suscipit ullamcorper commodo suscipit amet sed nibh. Proin a ullamcorper sed blandit..</p>
										<footer>
											<ul class="actions">
												<li><a href="${createLink(controller: 'blog', params: [blogID: '3'])}" class="button small alt">Learn More</a></li>
											</ul>
										</footer>
									</section>
									<hr />
									<section>
										<a href="#" class="image fit"><img src="${resource(dir: 'images', file: 'blog/keywords/blog3Thumbnail.jpg')}"  alt="" /></a>
										<h3>Growing with TxtWolf</h3>
										<p>Using a web-based program, you can send mass texts to subscribing customers, set up campaigns and...</p>
										<footer>
											<ul class="actions">
												<li><a href="${createLink(controller: 'blog', params: [blogID: '2'])}" class="button small alt">Learn More</a></li>
											</ul>
										</footer>
									</section>
								</section>

						</div>
						<div class="8u$ 12u$(medium) important(medium)">

							<!-- Content -->
								<section id="content">
									<div class="image main"><img src="${resource(dir: 'images', file: 'blog/keywords/keyword4.jpg')}" alt="" /></div>
									<h3>What are keywords?</h3>
									<p>
									Keywords are words that are texted to an SMS number. These SMS keywords tell a phone number what mobile messaging campaign you're trying to interact with.
									In SMS marketing, an SMS keyword is what a consumer uses to initially interact with an SMS phone number on their mobile phone. The SMS keyword is sent in a text message to a specific SMS phone number, which will return a text message response based on what SMS campaign that keyword is associated with.
									In the example SMS marketing campaign below, the SMS keyword is "Burger", where the SMS short code is "83733". There are no restrictions on SMS keywords, as they can be any length of characters, and be made up of any types of characters, including numbers, letters and symbols.
									</p>
									
									<div style = "width: 80%; margin: 15px auto 20px auto;" class="image main">
									<img src="${resource(dir: 'images', file: 'blog/keywords/blog1Thumbnail.jpg')}" alt="" />
									</div>
									
									<p>
										Keyword actions could include opting the customer into a mobile marketing program, responding with a text message confirmation, or even storing the information the customer text messaged to you, including their phone number for later use. The possibilities when it comes to keyword text messaging are limitless.
									</p>									
									
									
									<h3>Keyword Uses</h3>
									<p>SMS short codes can be used for a variety of different purposes, including the following.</p>
									<ul>																	
										<li>SMS Contests/Giveaways</li>
										<li>Text Message Offers</li>
										<li>SMS Shipping Notifications</li>
										<li>SMS Pickup Notifications and Reminders</li>
										<li>SMS Appointment Reminders</li>
										<li>SMS Voting/Polling</li>
										<li>Employee Text Messaging Communications</li>		
										<li>Many More!</li>				
									</ul>
								</section>

						</div>
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

	</body>
</html>