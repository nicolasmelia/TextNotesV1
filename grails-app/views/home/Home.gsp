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
	
	
	
	<body class="landing">

		<!-- Header -->
			<header id="header" class="alt">
				<h1 id="logo"><a href="index.html">TxtWolf LLC</a></h1>
				<nav id="nav">
					<ul>
						<li><a href="${createLink(controller: 'Blog')}">Blog</a></li>			
						<li><a href="index.html">Pricing</a></li>
						
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

		<!-- Banner -->
			<section id="banner">
				<h2>TxtWolf <br/> Sms Solutions</h2>
				<p>Reach more people in less time</p>
				<ul class="actions">
					<li><a href="#one" class="button special scrolly">Learn More</a></li>

				</ul>
			</section>

		<!-- One -->
			<section id="one" class="wrapper style1 special">
				<div class="container box alt bordered">
					<header class="major">
						<h2>Quickly Drive sales</h2>
						<p>Send out targeted sms promotions and notifications to your customers.<br />
						<b>Drive sales</b> with simple, affordable, and effective sms text messages.</p>
					</header>
					<ul class="icons-grid">
						<li>
							<span class="icon major style4 fa-paw"></span>
							<h3>KeyWords</h3>
							<p>Create a keyword and have people join your promotion by texting in your keyword. Build your <b>customer list</b> quickly with a small campaign. <a href = '#' >Learn More</a></p>
						</li>
						<li>
							<span class="icon major style3 fa-paper-plane"></span>
							<h3>Mass Text</h3>
							<p>Reach and retain your customers by sending updates and promotions to thousands instantly! Send individual or group text.</p>
						</li>
						<li>
							<span class="icon major style2 fa-ticket"></span>
							<h3>Affordable</h3>
							<p>At only pennies per text, SMS marketing is not only the most effective form of communication, it’s also the most affordable.</p>
						</li>
						<li>
							<span class="icon major style1 fa-calendar-check-o"></span>
							<h3>Notifications</h3>
							<p>Want to send a message next week and already know what you're going to say? Contact Groups of customers with scheduled messages.</p>
						</li>
					</ul>
				</div>
			</section>

		<!-- Two -->
			<section id="two" class="wrapper style2 special">
				<div class="container">
					<header class="major">
						<h2>Some Awesome Stats</h2>
						<p>TextWolf is growing fast and so is our stats! Affordable success never looked so good. <b><a href = '#'>Learn More</a></b></p>
					</header>
					<ul class="counters">
						<li class="style1">
							<strong>80%</strong> Cust. Return Rate
						</li>
						<li class="style2">
							<strong>96%</strong> Text Read
						</li>
						<li class="style3">
							<strong>90%</strong> Keyword Optin 
						</li>
						<li class="style4">
							<strong>75%</strong> Optin Rate
						</li>
					</ul>
				</div>
			</section>

		<!-- Three -->
			<section id="three" class="wrapper style1 special">
				<div class="container">
					<div class="row 150%">
						<section class="4u 12u$(medium) 12u$(small)">
							<div class="box style1">
								<span class="image full"><img src="images/pic01.jpg" alt="" /></span>
								<h3>Lorem ipsum</h3>
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cumque esse quas dolores, unde!</p>
								<ul class="actions">
									<li><a href="#" class="button alt">More</a></li>
								</ul>
							</div>
						</section>
						<section class="4u 6u(medium) 12u$(small)">
							<div class="box style2">
								<span class="image full"><img src="images/pic02.jpg" alt="" /></span>
								<h3>Minima odio</h3>
								<p>Tempora, dignissimos maxime quis reprehenderit, quos quia, blanditiis facilis totam iure dolor vel unde.</p>
								<ul class="actions">
									<li><a href="#" class="button alt">More</a></li>
								</ul>
							</div>
						</section>
						<section class="4u$ 6u$(medium) 12u$(small)">
							<div class="box style4">
								<span class="image full"><img src="images/pic03.jpg" alt="" /></span>
								<h3>Consequuntur odit</h3>
								<p>Porro, cupiditate soluta quam maxime reiciendis ut, molestias itaque eum assumenda veritatis?</p>
								<ul class="actions">
									<li><a href="#" class="button alt">More</a></li>
								</ul>
							</div>
						</section>
					</div>
				</div>
			</section>

		<!-- Four -->
			<section id="four" class="wrapper style3 special">
				<div class="container">
					<header class="major">
						<h2>Join Us</h2>
						<p>We work for your business.</p>
					</header>
					<ul class="actions uniform">
						<li><a href="#" class="button special">Sign Up</a></li>
						<li><a href="#" class="button alt">Learn More</a></li>
					</ul>
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
