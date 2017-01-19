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
		
		<!--Start of Zendesk Chat Script-->
		<script type="text/javascript">
		window.$zopim||(function(d,s){var z=$zopim=function(c){z._.push(c)},$=z.s=
		d.createElement(s),e=d.getElementsByTagName(s)[0];z.set=function(o){z.set.
		_.push(o)};z._=[];z.set._=[];$.async=!0;$.setAttribute("charset","utf-8");
		$.src="https://v2.zopim.com/?4UBUexrzEbn1D1IOK7cXCttTMqRa1rB7";z.t=+new Date;$.
		type="text/javascript";e.parentNode.insertBefore($,e)})(document,"script");
		</script>
		<!--End of Zendesk Chat Script-->
		
		<script>
		  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
		  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
		  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
		  })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');
		  ga('create', 'UA-89949087-1', 'auto');
		  ga('send', 'pageview');
		</script>
		
    <style>
        /* code for animated blinking cursor */
        .typed-cursor{
            opacity: 1;
            font-weight: 100;
            -webkit-animation: blink 0.7s infinite;
            -moz-animation: blink 0.7s infinite;
            -ms-animation: blink 0.7s infinite;
            -o-animation: blink 0.7s infinite;
            animation: blink 0.7s infinite;
        }
        @-keyframes blink{
            0% { opacity:1; }
            50% { opacity:0; }
            100% { opacity:1; }
        }
        @-webkit-keyframes blink{
            0% { opacity:1; }
            50% { opacity:0; }
            100% { opacity:1; }
        }
        @-moz-keyframes blink{
            0% { opacity:1; }
            50% { opacity:0; }
            100% { opacity:1; }
        }
        @-ms-keyframes blink{
            0% { opacity:1; }
            50% { opacity:0; }
            100% { opacity:1; }
        }
        @-o-keyframes blink{
            0% { opacity:1; }
            50% { opacity:0; }
            100% { opacity:1; }
        }
    </style>
				
	</head>
		
	<body class="landing">
		<!-- Header -->
			<header id="header" class="alt">
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

		<!-- Banner -->
			<section id="banner">
				<h2> Engagement. promotions. alerts. </h2>
				
				<div id="typed-strings" style = "display:none;">
					<p>business</p>
					<p>retail store</p>
					<p>restaurant</p>
					<p>school</p>
					<p>online shop</p>
					<p>health center</p>
					<p>nightclub</p>
					<p>cafe</p>				
					<p>nonprofit</p>				
					<p>event</p>
					<p>business</p>
				</div>
						
				<p id = "typedText">
					Text message marketing for your
					<span  id="typed" style="white-space:pre;"></span>
				</p>
				

				<ul class="actions">
					<li><a href="#one" class="button special scrolly">Learn More</a></li>
				</ul>
				
			</section>

		<!-- One -->
			<section id="one" class="wrapper style1 special">
				<div class="container box alt bordered">
					<header class="major">
						<h2>Drive Traffic And Engage Customers</h2>
						<p>Send out targeted sms promotions and notifications to your customers.<br />
						<b>Drive sales</b> with simple, affordable, and effective sms text messages.</p>
					</header>
					<ul class="icons-grid">
						<li>
							<span class="icon major style4 fa-paw"></span>
							<h3>Keywords</h3>						
							<p>
							Have people join promotions by text message and build your contact list, with minimal effort. Every paid plan includes <b>UNLIMITED</b> keywords. <a href="${createLink(controller: 'blog', params: [blogID: '1'])}" >Learn More</a>			
							</p>	
						</li>
						<li>
							<span class="icon major style3 fa-paper-plane"></span>
							<h3>Mass Text</h3>
							<p>Reach and retain your customers by sending updates and promotions to thousands instantly! Send individual or group text, quickly and easily.</p>
						</li>
						<li>
							<span class="icon major style2 fa-credit-card-alt"></span>
							<h3>Affordable</h3>
							<p>TxtWolf is proud to be the most <b>affordable</b> text marketing solution available. SMS marketing is one of the most effective forms of communication by value!</p>
						</li>
						<li>
							<span class="icon major style1 fa-bar-chart"></span>
							<h3>Grow Your Business</h3>
							<p>More engagement, more leads, more loyalty! TxtWolf offers text coupons, contest and custom campaigns.</p>
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
								<span class="image full"><img src="${resource(dir: 'images', file: 'home/blog/blog1Thumbnail.jpg')}"alt="" /></span>
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
						<p>Tired of paying a monthly subscription 'per keyword'?  <br> Well, you can officially
						 cancel your overpriced subscription,
						 as TxtWolf has it all, at an affordable price.</p>
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
		<g:javascript src="UI/typed.js" /> 
		
		<!--[if lte IE 8]><g:javascript src="ie/respond.min.js" /><![endif]-->

	</body>
	
	<script>



	
	$(window).on("resize", function(event){
		if ($(this).width() < 460) {
		  console.log( $(this).width());
		  $("#typedText").text("Text Message Marketing");
		}
	});

    $(function(){
        
        $("#typed").typed({
            // strings: ["Typed.js is a <strong>jQuery</strong> plugin.", "It <em>types</em> out sentences.", "And then deletes them.", "Try it out!"],
            stringsElement: $('#typed-strings'),
            typeSpeed: 50,
            backDelay: 1400,
            loop: false,
            contentType: 'html', // or text
            // defaults to false for infinite loop
            loopCount: false,
            callback: function(){ foo(); },
            resetCallback: function() { newTyped(); }
        });

        $(".reset").click(function(){
            $("#typed").typed('reset');
        });


		if ($(window).width() < 460) {
			  console.log( $(this).width());
			  $("#typedText").text("Text Message Marketing");
		}

    });

    function newTyped(){ /* A new typed object */ }

    function foo(){ console.log("Callback"); }

    </script>
	
</html>
