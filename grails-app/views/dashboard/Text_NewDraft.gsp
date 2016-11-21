<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
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
	<!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
	<link rel="stylesheet" type="text/css" href="<g:resource dir='css' file='dashboard/skins/skin-purple.min.css'/>">
	<link rel="stylesheet" type="text/css" href="<g:resource dir='js' file='dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css'/>">
	<link rel="stylesheet" type="text/css" href="<g:resource dir='js' file='dashboard/plugins/select2/select2.min.css'/>">
	<link rel="stylesheet" type="text/css" href="<g:resource dir='js' file='tagsinput/dist/bootstrap-tagsinput.css'/>">
	<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body class="hold-transition skin-purple sidebar-mini">
	<div class="wrapper">
		<!-- Main Header -->
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
						<!-- Notifications Menu -->
						<li class="dropdown notifications-menu">
							<!-- Menu toggle button -->
							<a href="#" class="dropdown-toggle" data-toggle="dropdown"> <i class="fa fa-envelope-o"></i>
								<span class="label label-success">${notiCount}</span>
							</a>
							<ul class="dropdown-menu">
								<li class="header">Keyword Inbox (Recent)</li>
								<li>
									<!-- Inner Menu: contains the notifications -->
									<ul class="menu">
										<li>
											<!-- start notification -->
											<g:if test="${keywordsIn != 'NONE'}">
												<g:each in="${keywordsIn}">
													<a href="${createLink(controller: 'Dashboard', action: 'keywordInbox')}"> <i class="fa fa-paw text-aqua"></i>  <b>${it.keyword}</b>: ${it.phoneNumber}, <i><g:formatDate format="MM-dd-yyyy" date="${it.date}"/> </i> 
													</a>
												</g:each>
											</g:if>
											<g:else>
												<a href="${createLink(controller: 'Dashboard', action: 'keywordInbox')}"> <i class="fa fa-paw text-aqua"></i> 0 new keywords recieved.</a>
											</g:else>
										</li>
										<!-- end notification -->
									</ul>
								</li>
								<li class="footer"> <a href="${createLink(controller: 'Dashboard', action: 'keywordInbox')}">View all</a>
								</li>
							</ul>
						</li>
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
									<div class="col-xs-4 text-center"> <a href="${createLink(controller: 'tips')}">Tips</a>
									</div>
									<div class="col-xs-4 text-center"> <a href="${createLink(controller: 'help')}">Help</a>
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
									<div class="pull-left"> <a href="${createLink(controller: 'login', action: 'accountSettings')}" class="btn btn-default btn-flat">Settings</a>
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
			<section class="sidebar">
				<!-- Sidebar user panel (optional) -->
				<div class="user-panel">
					<div class="pull-left image">
						<img src="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}" class="img-circle" alt="User Image">
					</div>
					<div class="pull-left info">
						<p>${session.firstName} ${session.lastName}</p>
						<!-- Status --> <a href="#"><i class="fa fa-circle text-success"></i> Active</a>
					</div>
				</div>
				<!-- search form (Optional) -->
				<g:form controller="Dashboard" action="contacts" enctype="multipart/form-data" class="sidebar-form">
					<div class="input-group">
						<input type="text" name="searchQuery" class="form-control" placeholder="Search Contacts..."> <span class="input-group-btn">
              <button action="contacts" name="search" id="search-btn" class="btn btn-flat" ><i class="fa fa-search"></i></button>
              </span>
					</div>
				</g:form>
				<!-- /.search form -->
				<!-- Sidebar Menu -->
				<ul class="sidebar-menu">
					<li class="header">Menu</li>
					<!-- Optionally, you can add icons to the links -->
					<li>
						<a href="${createLink(controller: 'Dashboard', action: 'Dashboard')}"> <i class="fa fa-home"></i>  <span>Home</span>
						</a>
					</li>
					<li> <a href="#"><i class="fa fa-book"></i> <span>Address Book</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a class="" href="${createLink(controller: 'Dashboard', action: 'newContact')}"><b>New Contact</b></a>
							</li>
							<li>
								<a class="" href="${createLink(controller: 'Dashboard', action: 'createGroup')}"> <b>New Group</b>
								</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'contacts')}">View Contacts</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'groups')}">View Groups</a>
							</li>
						</ul>
					</li>
					<li class="active" class="treeview"> <a href="#"><i class="fa fa-comment"></i> <span>Send Text</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="${createLink(controller: 'Dashboard', action: 'sendTxt')}"><b>Compose Text</b></a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'newDraft')}"><b>Compose Draft</b></a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'drafts')}">View Drafts</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'secheduledTxt')}">View Secheduled</a>
							</li>
							<li> <a href="#">Quick Tools (External) <i class="fa fa-angle-left pull-right"></i></a>
								<ul class="treeview-menu">
									<li> <a href="${createLink(controller: 'Dashboard', action: 'tips')}">TxtWolf Tips</a>
									</li>
									<li><a href="http://www.dictionary.com/" target="_blank">Dictionary</a>
									</li>
									<li><a href="http://www.thesaurus.com/" target="_blank">Thesaurus</a>
									</li>
									<li><a href="https://goo.gl/" target="_blank">Google Link Shortner</a>
									</li>
									<li><a href="https://maps.google.com" target="_blank">Google Maps</a>
									</li>
									<li><a href="https://wordcounter.net/" target="_blank">Word Counter</a>
									</li>
								</ul>
							</li>
						</ul>
					</li>
					<li class="treeview"> <a href="#"><i class="fa fa-inbox"></i> <span>Keywords</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="${createLink(controller: 'Dashboard', action: 'newKeyWord')}"><b>New Keyword</b></a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'keywords')}">View Keywords</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'keywordInbox')}">Keyword Inbox</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'validateCoup')}">Validate Coupon Code</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect'])}">Contest Winner Select</a>
							</li>
						</ul>
					</li>
					<li class="treeview"> <a href="#"><i class="fa fa-paw"></i> <span>Account</span> <i class="fa fa-angle-left pull-right"></i></a>
						<ul class="treeview-menu">
							<li><a href="${createLink(controller: 'Dashboard', action: 'balance')}">My Balance</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'history')}">My Activity</a>
							</li>
							<li><a href="${createLink(controller: 'Dashboard', action: 'accountSettings')}">My Settings</a>
							</li>
						</ul>
					</li>
				</ul>
				<!-- /.sidebar-menu -->
			</section>
			<!-- /.sidebar -->
		</aside>
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<section class="content-header">
				<h1>
            Compose
            <small>New Draft</small>
          </h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Send Text</a>
					</li>
					<li class="active">Compose Draft</li>
				</ol>
			</section>
				<!-- /.col -->
				
			<!-- Main content -->
			<section class="content">
				<!-- Horizontal Form -->
				<div class="box box-info" style="max-width: 600px;">
					<div class="box-header with-border">
						<h3 class="box-title">Compose Draft</h3>
					</div>
					<!-- /.box-header -->
					<!-- form start -->
							<g:form id="txtForm" class="form-signin" controller="Dashboard" action="newDraft" enctype="multipart/form-data">
								<div class="box-body">
							
								<div id="ModalAlert" style="display: none;" class="alert alert-danger alert-dismissable">
									<h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
									<p id="ModalAlertText"></p>
								</div>		
								
									<div class="form-group">
										<input id="draftName" name="draftName" class="form-control" placeholder="Draft Name">
									</div>
									
									<hr>								
									
									<div class="form-group">
										<input id="subject" name="subject" class="form-control" placeholder="Subject: Not Required">
									</div>
									<div class="form-group">
										<textarea placeholder="Message" id="compose-textarea" name="body" class="form-control" style="height: 150px"></textarea>
									</div>
									<div class="form-group">
										<p style="margin: 0px;" id='charCount' class="help-block">0/260 characters</p>
									</div>
								</div>
								<!-- /.box-body -->
								<!-- hidden to hide ro send via modal! -->
							<div class="box-footer">
								<div class="pull-right">
								<button class=" btn btn-primary" onclick = "return validateMainForm()" id="submitBtn" value="Send" action="newDraft" /> <i class="fa fa-save"> </i> Save Draft</button>
								</div> <a href="${createLink(controller: 'Dashboard', action: 'dashboard')}" type="submit" class="btn btn-default">Cancel</a>
							</div>
						</g:form>
				</div>
				<!-- /.box -->
			</section>
			<!-- /.content -->
		</div>
			
			<!-- /.content -->
		<!-- /.content-wrapper -->
		<!-- Main Footer -->
		<footer class="main-footer">
			<!-- To the right -->
			<div class="pull-right hidden-xs">Powered by TxtWolf</div>
			<!-- Default to the left --> <strong>Copyright &copy; 2017 <a href="http://www.TxtWolf.com">TxtWolf LLC</a>.</strong>
		</footer>
	</div>
	<!-- ./wrapper -->
</body>
<!-- REQUIRED JS SCRIPTS -->
<!-- jQuery 2.1.4 -->
<g:javascript src="dashboard/plugins/jQuery/jQuery-2.1.4.min.js" />
<!-- Bootstrap 3.3.5 -->
<g:javascript src="dashboard/bootstrap/js/bootstrap.min.js" />
<!-- AdminLTE App -->
<g:javascript src="dashboard/app.min.js" />
<g:javascript src="dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js" />
<g:javascript src="dashboard/plugins/select2/select2.full.min.js" />
<g:javascript src="tagsinput/dist/bootstrap-tagsinput.min.js" />
<g:javascript src="dataAccess.js" />
<!-- InputMask -->
<g:javascript src="dashboard/plugins/input-mask/jquery.inputmask.js" />
<g:javascript src="dashboard/plugins/input-mask/jquery.inputmask.date.extensions.js" />
<g:javascript src="dashboard/plugins/input-mask/jquery.inputmask.extensions.js" />
<!-- date-range-picker -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<g:javascript src="dashboard/plugins/daterangepicker/daterangepicker.js" />
<!-- bootstrap color picker -->
<g:javascript src="dashboard/plugins/colorpicker/bootstrap-colorpicker.min.js" />
<!-- bootstrap time picker -->
<g:javascript src="dashboard/plugins/timepicker/bootstrap-timepicker.min.js" />
<!-- iCheck 1.0.1 -->
<g:javascript src="dashboard/plugins/iCheck/icheck.min.js" />
<!-- JQUERY UI -->
<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>

<script>

	$( document ).ready(function() {
		
	});
	

		
		$('#searchInput').on('input', function() {
	    	$( "#searchContactBtn" ).trigger( "click" );
		});
	
		// When the form is submitted disable the resend button
		$('form').submit(function() {			
			$("#submitBtn").prop("disabled",true);	
		});
	

		function validateForm(){
			return true;
		}
	
		function openPreview(url) {
			validateMainForm();
			if ($("#compose-textarea").val().length > 0) {
				$("#preMessageBody").text($("#compose-textarea").val());
			} else {
				$("#preMessageBody").html("No Message (REQUIRED)");
			}
	
			if ($("#subject").val().length > 0) {
				$("#preMessageSubject").text($("#subject").val());
			} else {
				$("#preMessageSubject").html("No Subject");		
			}	
	
			
				getRecpCount(url, $('#tags').val());		
			
		}
		
	
		// Dont allow form submit with ENTER key
		$(document).on("keypress", "form", function(event) { 
		    return event.keyCode != 13;
		});
	
		
		// ******* CUSTOM NUMBER MODAL ******* 
		
	
	  $('#compose-textarea').keyup(updateCount);
	  $('#compose-textarea').keydown(updateCount);
	  
	  $('#subject').keyup(updateCount);
	  $('#subject').keydown(updateCount);
	
	  function updateCount() {
	      var cs = $("#compose-textarea").val().length;
	      var sub = $("#subject").val().length;
	      var count = sub + cs;
	      $('#charCount').text(count + '/260 characters');
	     // $( "#txtForm" ).submit();
	  }
	
	  // Form Validation
	    var errors = [];

	  
	  function validateMainForm() {		  
		  	var error = false;	
		  	
		  	//Clear old values
		  	errors = [];
			$("#ModalAlertText").html("");  
			$("#ModalAlert").css("display","none");
			
						
		  	if ($("#compose-textarea").val().length < 11) {
				error = true;
				errors.push("Please enter a message longer than 10 characters.");			
		  	}
		
		  	if ($("#compose-textarea").val().length > 260) {
				error = true;
				errors.push("Your message can not be longer than 260 characters.");			
		  	}
		  	
			if ($("#draftName").val().length < 1) {
				error = true;
				errors.push("Please enter a name for this draft.");						
			}
	
			if (error){
			
				for (i = 0; i < errors.length; i++) { 
					$("#ModalAlertText").append("*" + errors[i] + "<br/>");		
				}		
				
				$("#ModalAlert").slideDown();
			
				return false;
			} else {
				return true;
			}
				
	  }
	
	  
	
	  function clearWarnings() {
		  	// Clear all warnings
			$("#addNumberModalAlert").css("display","none");
	  }
	
	  function removeToPlaceHolder() {
		  $("input[placeholder~='Recipients']").attr('placeholder','');
	  }
</script>

</html>