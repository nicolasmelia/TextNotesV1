<!DOCTYPE html>
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" fcontent="IE=edge">
	<title>TxtWolf</title>
	<link rel="icon" href="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}">
	<!-- Tell the browser to be responsive to screen width -->
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.5 -->
	<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='dashboard/bootstrap/css/bootstrap.min.css'/>">
	<!-- Font Awesome -->
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	<!-- Ionicons -->
	<link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
	<!-- Theme style -->
	<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='dashboard/AdminLTE.min.css'/>">
	<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='dashboard/CustomCSS.css'/>">
	<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='help/style.css'/>">
	
	<!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='dashboard/skins/skin-purple.min.css'/>">
    <link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='dashboard/skins/_all-skins.min.css'/>">    
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

  <body class="skin-purple fixed" data-spy="scroll" data-target="#scrollspy">
    <div class="wrapper">

		<header class="main-header">
			<!-- Logo -->
			<a href="${createLink(controller: 'Dashboard', action: 'dashboard')}" class="logo">
				<!-- mini logo for sidebar mini 50x50 pixels --> <span class="logo-mini"><b>W</b>olf</span>
				<!-- logo for regular state and mobile devices --> <span class="logo-lg"><b>Txt</b>Wolf</span>
			</a>
			<!-- Header Navbar -->
			<nav class="navbar navbar-static-top" role="navigation">
				<!-- Sidebar toggle button-->
				<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button"> <span class="sr-only">Toggle navigation</span>
				</a>
				<!-- Navbar Right Menu -->
				<div class="navbar-custom-menu">
					<ul class="nav navbar-nav">
						<!-- User Account Menu -->
						<li class="dropdown user user-menu">
							<!-- Menu Toggle Button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<!-- The user image in the navbar--> <i class="fa fa-question-circle"></i>
								<!-- hidden-xs hides the username on small devices so only the image appears. --> <span class="hidden-xs">Help</span>
							</a>
							<ul class="dropdown-menu">
								<!-- The user image in the menu -->
								<li style="height: 90px;" class="user-header">
									<p>Help? Give us a call.
										<br>(330) 540-8023</p>
								</li>
								<!-- Menu Body -->
								<li class="user-body">
									<div class="col-xs-4 text-center"> <a href="${createLink(controller: 'dashboard')}">Home</a>
									</div>
									<div class="col-xs-4 text-center"> <a href="${createLink(controller: 'Blog')}">Tips</a>
									</div>
									<div class="col-xs-4 text-center"> <a href="${createLink(controller: 'dashboard', action: 'help')}">Help</a>
									</div>
								</li>
								<!-- Menu Footer-->
							</ul>
						</li>
						<!-- Control Sidebar Toggle Button -->
						<!-- User Account Menu -->
						<li class="dropdown user user-menu">
							<!-- Menu Toggle Button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<!-- The user image in the navbar-->
								<img src="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}" class="user-image" alt="User Image">
								<!-- hidden-xs hides the username on small devices so only the image appears. --> <span class="hidden-xs">My Account</span>
							</a>
							<ul class="dropdown-menu">
								<!-- The user image in the menu -->
								<li class="user-header">
									<img src="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}" class="img-circle" alt="User Image">
									<p>${session.firstName} ${session.lastName} - Admin <small>Member since <g:formatDate format="yyyy" date="${session.signUpDate}"/></small>
									</p>
								</li>
								<!-- Menu Footer-->
								<li class="user-footer">
									<div class="pull-left">
										<!--  <a href="#" class="btn btn-default btn-flat">Profile</a> -->
									</div>
									<div class="pull-left"> <a href="${createLink(controller: 'dashboard', action: 'accountSettings')}" class="btn btn-default btn-flat">Settings</a>
									</div>
									<div class="pull-right"> <a href="${createLink(controller: 'login', action: 'logout')}" class="btn btn-default btn-flat">Sign out</a>
									</div>
								</li>
							</ul>
						</li>
						<!-- Control Sidebar Toggle Button -->
					</ul>
				</div>
			</nav>
		</header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <div class="sidebar" id="scrollspy">

          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="nav sidebar-menu">
            <li class="header">TABLE OF CONTENTS</li>
            
            <li class="active"><a href="#introduction"><i class="fa fa-circle-o"></i> Introduction</a></li>
            <li><a href="#AddressBook"><i class="fa fa-circle-o"></i> Address Book</a></li>
            <li><a href="#SendingText"><i class="fa fa-circle-o"></i> Sending Text</a></li>
            <li><a href="#UsingKeywords"><i class="fa fa-circle-o"></i> Using Keywords</a></li>
            
            
            
            <li class="header">Menu</li>
			<li><a href="${createLink(controller: 'Dashboard', action: 'Dashboard')}"> <i class="fa fa-home"></i><span>Home</span> </a> </li>
			<li><a href="${createLink(controller: 'blog')}"> <i class="fa fa-info-circle"></i><span>Tips</span> </a> </li>			
            
          </ul>
        </div>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
          <h1>
            TxtWolf Documentation
            <small>Current version 2.1.0</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Help</li>
          </ol>
        </div>

        <!-- Main content -->
        <div class="content body">

<section id="introduction">
  <h2 class="page-header"><a href="#introduction">Introduction</a></h2>
  <p class="lead">
		<b>TxtWolf</b> is a refreshingly simple web-based text messaging service. We've been very focused on building and refining the intuitive user interface that our 
		clients use every day. Creating groups of contacts for sending out text messages is increadibly simple: just select one of your groups, type your message, and hit 
		send. Of course we also have a full set of advanced SMS marketing features for those who need them.
  </p>
</section><!-- /#introduction -->


<!-- ============================================================= -->

<section id="AddressBook">
  <h2 class="page-header"><a href="#AddressBook">Address Book</a></h2>
  
    <h3>Adding Contacts</h3>
  
  <p class="lead">
    Contacts can be added to your address book through either opted-in customers by <i>keyword</i> or manually entering their contact information. 
	To navigate to the “New Contact” page, click on “Address Book” in the left side bar and click “New Contact”. You can now begin to enter your 
	contacts information. You are only requred to enter their phone number, first name and last name. Location information is not required.
  </p>
  
    <h3>Editing Contacts</h3>
  
  <p class="lead">
    Contacts can be edited by navigating to the "View Contacts" page located in the left side bar under "Address Book". You can now search for the contact 
    you want to edit by either name or address. Once found, clicking on their name in the table will pop up an options menu that displays actions you can take
    with the current contact. Click "Edit contact" to open the "Edit Contact" page, which allows you to edit all details of this contact.
  </p>
  
   <h3>More Contact Actions</h3>
  
  <p class="lead">
    When clicking on a specific contact this will pop up a sub menu with actions you can take towards your contact. This includes viewing your contacts 
    details (Location, number, etc), editing your contact, adding your contact to a group, and texting your contact. 
  </p>
  
    <h3>Adding Groups</h3>
  
  <p class="lead">
    Groups allow you to group together specific contacts, which makes mass texting as easy as one step. Groups can be added to your address book by navigating to the “New Group” page. Click on “Address Book” in the left side bar and click “New Group”. You can now begin to enter your 
	groups information. You are only requred to enter a group name. Description and state is not required. 
  </p>
  
  
</section>


<!-- ============================================================= -->


<section id="SendingText">
  <h2 class="page-header"><a href="#SendingText">Sending Text</a></h2>
  
    <h3>Sending a Text</h3>
  
  <p class="lead">
  You can send a text by navigating to the "Compose Text" page by clicking on "Compose Text" located in the 
  left side bar under "Send Text". This message is limited to 260 characters. *Each recipients attached to this
  text will use <b>1</b> of your available ballance. 
   </p>
  
  
    <h3>Adding Recipients</h3>
  
  <p class="lead">
  	You can add recipients to your out going text by selecting one of the three options in the "Add Recipients" menu located on the "Compose Text" page while 
  	you compose your text. Selecting an option will open a pop up menu based on the selection you choose. This will not open a new page so it is safe to add
  	contacts while you compose your text. These options include:
   </p>
   
   	<ul>
	  <li><b>Add Contact:</b> This selection will allow you to add any contact in your adress book by searching, using their name or adress.</li>
	  <li><b>Add Group:</b> This option will allow you to add an entire group by selecting a group in your list of gourps.</li>
	  <li><b>Add Number:</b> You can add any phone number using this option. A contact or group containing this number is not needed.</li>
	</ul>
	  	
   <h3>Composing Drafts</h3>
  
  <p class="lead">
  You can compose a draft by navigating to the "Compose Draft" page by clicking on "Compose Text" located in the 
  left side bar under "Send Text". Once there you can begin to compose a draft by entering a required draft name and 
  text message. This message is limited to 260 characters and follows the constraints of composing a text message from scratch. 
  </p>
  
   <h3>Selecting a Draft</h3>
  
  <p class="lead">
  You can select a draft for use by navigating to the "View Drafts" page by clicking on "View Drafts" located in the 
  left side bar under "Send Text". Once at the "View Drafts" simply click on a draft you wish to compose a text with. This will
  open the "Compose Text" page with your draft text in the compose text box.
  </p>
  

   
  
</section>


<section id="UsingKeywords">
  <h2 class="page-header"><a href="#UsingKeywords">Using Keywords</a></h2>
  
    <h3>Creating a Keyword</h3>
  
  <p class="lead">
	  You can create a keyword by navigating to the "New Keyword" page by clicking on "New Keywords" located in the 
	  left side bar under "Keywords". Once there, you are required to create a keyword name (The keyword your contacts will send in), and 
	  a valid date range for which keyword will be active for, along with a compaain type, listed below.
   </p>
   
   	<ul>
   	<li><b>Custom:</b> This is not a contest or a coupon, but rather allows you to customize its use and need by responding with custom text.</li>
	<li><b>Coupon:</b> When your customer sends in your keyword they will be sent a coupon code that you can validate in the 'Validate Code' page located in the keyword menu.</li>  
	<li><b>Contest</b> When your customer sends in your keyword they will be entered into your contest. A contest allows you to randomly select winners from the recieved keywords.</li> 	
	</ul>

</section>



        </div><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 2.1.0
        </div>
        <strong>Copyright &copy; 2017 <a href="http://TxtWolf.com">TxtWolf LLC</a>.</strong> All rights reserved.
      </footer>

      <!-- Control Sidebar -->
      <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <div class="pad">
          This is an example of the control sidebar.
        </div>
      </aside><!-- /.control-sidebar -->
      <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
      <div class="control-sidebar-bg"></div>

    </div><!-- ./wrapper -->

	<!-- REQUIRED JS SCRIPTS -->
	<!-- jQuery 2.1.4 -->
	<g:javascript src="dashboard/plugins/jQuery/jQuery-2.1.4.min.js" />
	<!-- Bootstrap 3.3.5 -->
	<g:javascript src="dashboard/bootstrap/js/bootstrap.min.js" />
	<!-- AdminLTE App -->
	<g:javascript src="dashboard/app.min.js" />
    <!-- SlimScroll 1.3.0 -->
    <script src="https://google-code-prettify.googlecode.com/svn/loader/run_prettify.js"></script>
    <g:javascript src="help/docs.js" />
    
  </body>
</html>
