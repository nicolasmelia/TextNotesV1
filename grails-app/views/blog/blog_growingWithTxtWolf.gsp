<!DOCTYPE HTML>
<!--
	Frequency by Pixelarity
	pixelarity.com @pixelarity
	License: pixelarity.com/license
-->
<html>
	<head>
		<title>TxtWolf - Blog</title>
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
					<header class="major special">
						<h2>Growing with TxtWolf</h2>
						<p>Reach customers in less time, collect important data, and promote your company</p>
					</header>
					<div class="row 200%">
						<div class="4u 12u$(medium)">

							<!-- Sidebar -->
								<section id="sidebar">
									<section>
									
										<h3>Engagement 101</h3>
										<p>When a customer sees your advertisement they can send a text message to a keyword, obtaining promotional material from you and...</p>
										<footer>
											<ul class="actions">
												<li><a href="${createLink(controller: 'blog', params: [blogID: '3'])}" class="button small alt">Learn More</a></li>
											</ul>
										</footer>
									</section>
									<hr />
									<section>
										<a href="#" class="image fit"><img src="${resource(dir: 'images', file: 'blog/keywords/blog1Thumbnail.jpg')}"  alt="" /></a>
										<h3>Using Keywords</h3>
										<p>The possibilities when it comes to keyword text messaging are limitless. Learn how to use this to your advantage.</p>
										<footer>
											<ul class="actions">
												<li><a href="${createLink(controller: 'blog', params: [blogID: '1'])}" class="button small alt">Learn More</a></li>
											</ul>
										</footer>
									</section>
								</section>

						</div>
						<div class="8u$ 12u$(medium) important(medium)">

							<!-- Content -->
								<section id="content">
									<div class="image main"><img src="${resource(dir: 'images', file: 'blog/growing1.jpg')}" alt="" /></div>
									<h3>Reaching Your Customers</h3>
									
									<p>SMS marketing is a way of reaching customers through text messaging. Using a web-based program, you can send mass texts to 
									subscribing customers, set up campaigns where coupons are sent automatically over time, engage customers in polls and questionnaires, or even run a sweepstakes contest.
									By running an SMS campaign TxtWolf will instantly collect important data from your customers for you, including their phone numbers for future campaigns and contacting.
									</p>
		
									<p>
									 From the online dashboard you can mass-send messages and setup your automated campaigns. You can create more keywords. Also from the online menu, you can view a list of customers and generate reports on their activity, such as when users are signing up and by what sources, who has responded to which messages and even track reasons for opting out to figure out which campaigns didn’t work.
									 </p>									
															
									<h3>Why SMS Promotion?</h3>								
									<p>
									Texting has by far the best engagement rate of any marketing medium. Whereas emails can sit unread, phone calls can go can go unanswered and leaflets can be thrown out before given a second glance, text messages are almost always read, and read quickly. As studies have shown,
									95 out of 100 of your customers who have opted into your text messaging program <b>OPEN</b> and <b>READ</b> your mobile messages within 3 minutes.					
									</p>
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

	</body>
</html>