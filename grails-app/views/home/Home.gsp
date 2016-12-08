<!DOCTYPE HTML>
<!--
	Frequency by Pixelarity
	pixelarity.com @pixelarity
	License: pixelarity.com/license
-->
<html>
	<head>
		<title>TxtWolf - Home</title>
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
	
	
	
	<body class="landing">
		<!-- Header -->
			<header id="header" class="alt">
				<h1 id="logo"><a href="${createLink(controller: 'Home')}">TxtWolf LLC</a></h1>
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

		<!-- Banner -->
			<section id="banner">
				<h2>TxtWolf <br/> Sms Solutions</h2>
				<p>Reach more people in less time for <i>free</i>.</p>
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
						<b>Drive sales</b> with simple, affordable <i>(Free)</i>, and effective sms text messages.</p>
					</header>
					<ul class="icons-grid">
						<li>
							<span class="icon major style4 fa-paw"></span>
							<h3>Keywords</h3>
							<p>Create a keyword and have people join your promotion by texting in your keyword. Build your <b>customer list</b> quickly with a small campaign. <a href="${createLink(controller: 'blog', params: [blogID: '1'])}" >Learn More</a></p>
						</li>
						<li>
							<span class="icon major style3 fa-paper-plane"></span>
							<h3>Mass Text</h3>
							<p>Reach and retain your customers by sending updates and promotions to thousands instantly! Send individual or group text, quickly and easily.</p>
						</li>
						<li>
							<span class="icon major style2 fa-credit-card-alt"></span>
							<h3>Affordable</h3>
							<p><b>TxtWolf is Free!</b> SMS marketing is not only the most effective form of communication, it’s also the most affordable.</p>
						</li>
						<li>
							<span class="icon major style1 fa-bar-chart"></span>
							<h3>Grow Your Business</h3>
							<p>More engagement, more leads, more business! TxtWolf offers text coupons, contest and custom campaigns!</p>
						</li>
					</ul>
				</div>
			</section>

		<!-- Two -->
			<section id="two" class="wrapper style2 special">
				<div class="container">
					<header class="major">
						<h2>Some Awesome Stats</h2>
						<p>Your business is growing fast and affordable success never looked so good. <br> More than 95% of text messages are read within five minutes of receipt. <b><a href = '#'></a></b></p>
					</header>
					<ul class="counters">
						<li class="style1">
							<strong>80%</strong> Cust. Return Rate
						</li>
						<li class="style2">
							<strong>98%</strong> Text Read
						</li>
						<li class="style3">
							<strong>85%</strong> Keyword Optin 
						</li>
						<li class="style4">
							<strong>90%</strong> Promo Optin
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
								<span class="image full"><img src="${resource(dir: 'images', file: 'home/blog/blog4Thumbnail.jpg')}" alt="" /></span>
								<h3>Using Keywords</h3>
								<p>The possibilities when it comes to keyword text messaging are limitless. Learn how to use this to your advantage.</p>
								<ul class="actions">
									<li><a href="${createLink(controller: 'blog', params: [blogID: '1'])}" class="button alt">More</a></li>
								</ul>
							</div>
						</section>
						<section class="4u 6u(medium) 12u$(small)">
							<div class="box style2">
								<span class="image full"><img src="${resource(dir: 'images', file: 'home/blog/blog3Thumbnail.jpg')}" alt="" /></span>
								<h3>Growing with TxtWolf</h3>
								<p>Using a web-based program, you can send mass texts to subscribing customers, set up campaigns and collect customer data.</p>
								<ul class="actions">
									<li><a href="${createLink(controller: 'blog', params: [blogID: '2'])}" class="button alt">More</a></li>
								</ul>
							</div>
						</section>
						<section class="4u$ 6u$(medium) 12u$(small)">
							<div class="box style4">
								<span class="image full"><img src="${resource(dir: 'images', file: 'home/blog/blog5Thumbnail.jpg')}"alt="" /></span>
								<h3>Engagement 101</h3>
								<p>
									When a customer sees your advertisement they can send a text message to a keyword, obtaining promotional material from you and...		
								</p>
								<ul class="actions">
									<li><a href="${createLink(controller: 'blog', params: [blogID: '3'])}" class="button alt">More</a></li>
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
						<p>Tired of paying a monthly subscription 'per keyword'?  <br> Well you can officially cancel
							your current subscription, as TxtWolf is completely free & it always will be.</p>
					</header>
					<ul class="actions uniform">
						<li><a href="${createLink(controller: 'login', action: 'newAccount')}"class="button special">Sign Up</a></li>
						<li><a href="${createLink(controller: 'Home', action: 'pricing')}" class="button alt">Pricing</a></li>
					</ul>
				</div>
			</section>

		<!-- Footer -->
			<div id="footer">
				<div class="container">
					<div class="row 200% uniform">
						<section class="4u 12u$(medium) 12u$(xsmall) footer-info">
							<h2>Nonprofit</h2>
							<p>Nonprofit Organizations are eligible for the "At Cost" subscription plan, up to 60,000 text. If you are a Nonprofit, please contact us today.
							We are more than happy to accommodate your organization.</p>
							<ul class="actions">
								<li><a href="${createLink(controller: 'Home', action: 'pricing')}" class="button alt">Learn more</a></li>
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

	</body>
</html>
