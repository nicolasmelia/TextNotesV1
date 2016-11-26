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
            <small>New Text</small>
          </h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Send Text</a>
					</li>
					<li class="active">Compose Text</li>
				</ol>
			</section>
			<!-- Main content -->
			<section class="content">
				<div class="row">
					<div class="col-md-3"> <a onclick = "return false" href="${createLink(controller: 'Dashboard', action: 'contacts')}" class="btn btn-primary btn-block margin-bottom">Address Book</a>
						<div class="box box-solid">
							<div class="box-header with-border">
								<h3 class="box-title">Add Recipients</h3>
								<div class="box-tools">
									<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<div class="box-body no-padding">
								<ul class="nav nav-pills nav-stacked">
									<li><a data-toggle="modal" data-target="#addContactModal" class="pointer"><i class="fa fa-plus-square"></i> Add Contact </a>
									</li>
									<li><a data-toggle="modal" data-target="#addGroupModal" class="pointer"><i class="fa fa-plus-square"></i> Add Group</a>
									</li>
									<li><a data-toggle="modal" data-target="#addNumberModal" class="pointer"><i class="fa fa-plus-square"></i> Add Number </a>
									</li>
								</ul>
							</div>
							<!-- /.box-body -->
						</div>
						<!-- /. box -->
						<div class="box box-solid">
							<div class="box-header with-border">
								<h3 class="box-title">Messages</h3>
								<div class="box-tools">
									<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
									</button>
								</div>
							</div>
							<!-- /.box-header -->
							<div class="box-body no-padding">
								<ul class="nav nav-pills nav-stacked">
									<li> <a href="${createLink(controller: 'Dashboard', action: 'drafts')}"><i class="fa fa-file-text-o"></i> Drafts</a>
									</li>									
									<li><a href="${createLink(controller: 'Dashboard', action: 'history', params:[activityType: 'messages'])}" ><i class="fa fa-envelope-o"></i> Sent</a>
									</li>
								</ul>
							</div>
							<!-- /.box-body -->
						</div>
						<!-- /.box -->
					</div>
					<!-- /.col -->
					<div class="col-md-9">
						<div class="box box-primary">
							<div class="box-header with-border">
								<h3 class="box-title">Compose Text</h3>
							</div>
							<!-- /.box-header -->
							<g:form id="txtForm" class="form-signin" controller="SmsGateOut" action="messageOut" enctype="multipart/form-data">
								<div class="box-body">
									<!-- If added client is coming from the address book feel these values-->
									<input type="hidden" id="preClientName" value="${preClientName}">
									<input type="hidden" id="preClientID" value="${preClientID}">
									<div class="form-group">
										<input type="hidden" name="allTags" value="">
										<input id="recipCount" type="hidden" name="recipCount" value="">
										<input id="tags" name="tags" placeholder="Recipients" class="form-control" type="text" data-role="tagsinput" />
									</div>
									<div class="form-group">
										<input id="subject"  value = "<g:if test="${draft}">${draft.title}</g:if>" name="subject" class="form-control" placeholder="Subject: Not Required">
									</div>
									<div class="form-group">
										<textarea placeholder="Message" id="compose-textarea" name="body" class="form-control" style="height: 150px"><g:if test="${draft}">${draft.message}</g:if></textarea>
									</div>
									<div class="form-group">
										<p style="margin: 0px;" id='charCount' class="help-block">0/260 characters</p>
									</div>
								</div>
								<!-- /.box-body -->
								<!-- hidden to hide ro send via modal! -->
								<button style="display:none;" class=" btn btn-primary" id="submitBtn" value="Send" action="messageOut" /></button>
							</g:form>
							<div class="box-footer">
								<div class="pull-right">
									<button onClick="openPreview('${createLink(action: 'getRecipCount')}')" data-toggle="modal" data-target="#previewModal" type="button" class="btn btn-primary"><i class="fa fa-envelope-o"></i> Send</button>
								</div> <a href="${createLink(controller: 'Dashboard', action: 'dashboard')}" type="submit" class="btn btn-default">Cancel</a>
							</div>
							<!-- /.box-footer -->
						</div>
						<!-- /. box -->
					</div>
					<!-- /.col -->
				</div>
				<!-- /.row -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->
		<!-- Main Footer -->
		<footer class="main-footer">
			<!-- To the right -->
			<div class="pull-right hidden-xs">Powered by TxtWolf</div>
			<!-- Default to the left --> <strong>Copyright &copy; 2017 <a href="http://www.TxtWolf.com">TxtWolf LLC</a>.</strong>
		</footer>
		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Create the tabs -->
			<ul class="nav nav-tabs nav-justified control-sidebar-tabs">
				<li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a>
				</li>
				<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a>
				</li>
			</ul>
			<!-- Tab panes -->
			<div class="tab-content">
				<!-- Home tab content -->
				<div class="tab-pane active" id="control-sidebar-home-tab">
					<h3 class="control-sidebar-heading">Recent Activity</h3>
					<ul class="control-sidebar-menu">
						<li>
							<a href="javascript::;"> <i class="menu-icon fa fa-birthday-cake bg-red"></i>
								<div class="menu-info">
									<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
									<p>Will be 23 on April 24th</p>
								</div>
							</a>
						</li>
					</ul>
					<!-- /.control-sidebar-menu -->
					<h3 class="control-sidebar-heading">Tasks Progress</h3>
					<ul class="control-sidebar-menu">
						<li>
							<a href="javascript::;">
								<h4 class="control-sidebar-subheading">
                    Custom Template Design
                    <span class="label label-danger pull-right">70%</span>
                  </h4>
								<div class="progress progress-xxs">
									<div class="progress-bar progress-bar-danger" style="width: 70%"></div>
								</div>
							</a>
						</li>
					</ul>
					<!-- /.control-sidebar-menu -->
				</div>
				<!-- /.tab-pane -->
				<!-- Stats tab content -->
				<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>
				<!-- /.tab-pane -->
				<!-- Settings tab content -->
				<div class="tab-pane" id="control-sidebar-settings-tab">
					<form method="post">
						<h3 class="control-sidebar-heading">General Settings</h3>
						<div class="form-group">
							<label class="control-sidebar-subheading">Report panel usage
								<input type="checkbox" class="pull-right" checked>
							</label>
							<p>Some information about this general settings option</p>
						</div>
						<!-- /.form-group -->
					</form>
				</div>
				<!-- /.tab-pane -->
			</div>
		</aside>
		<!-- /.control-sidebar -->
		<!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
		<div class="control-sidebar-bg"></div>
	</div>
	<!-- ./wrapper -->
	<!-- addNumberModal -->
	<div class="modal" id="addNumberModal" role="dialog" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
					</button>
					<h4 id="modalHeading" class="modal-title">Add Phone Number</h4>
				</div>
				<div class="modal-body">
					<div id="addNumberModalAlert" style="display: none;" class="alert alert-danger alert-dismissable">
						<h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
						<p id="addNumberModalAlertText"></p>
					</div>
					<!-- phone mask -->
					<div class="form-group">
						<label>Phone Number:</label>
						<div class="input-group">
							<div class="input-group-addon"> <i class="fa fa-phone"></i>
							</div>
							<input placeholder="Required" id="customNumber" type="text" class="form-control" data-inputmask='"mask": "(999) 999-9999"' data-mask>
						</div>
						<!-- /.input group -->
					</div>
					<!-- /.form group -->
				</div>
				<div class="modal-footer">
					<button onClick="addCustomNumber()" type="button" class="btn btn-primary pull-left">Add Number</button>
					<button onClick="clearWarnings()" type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<!-- DRAFT MODAL -->
	<div class="modal" id="previewModal" role="dialog" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
					</button>
					<h4 id="modalHeading" class="modal-title">Message Overview</h4>
				</div>
				<div class="modal-body">
					<div id="PreviewModalAlert" style="display: none;" class="alert alert-danger alert-dismissable">
						<h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
						<p id="previewModalAlertText"></p>
					</div>
					<div class="box box-solid">
						<div class="box-header with-border">
							<h3 class="box-title">Preview</h3>
						</div>
						<!-- /.box-header -->
						<div class="box-body"> <span id="preMessageSubject">No Subject</span>
							<p id="preMessageBody">No Message</p>
						</div>
						<!-- /.box-body -->
					</div>
					<!-- /.box -->
					<div class="box box-solid">
						<div class="box-header with-border">
							<h3 class="box-title">Details</h3>
						</div>
						<!-- /.box-header -->
						<div class="box-body">
							<input id="remainingMonthlyTextBalance" type="hidden" value="${bal.currentBalance}">Recipients Attached: <span id="attachedRecipientsCount">0</span> 
							<br>Remaining Text Balance: <span>${bal.currentBalance}/${bal.monthlyBalance}</span>
							<br>Scheduled Send Time: <span id="ScheduledSendTime"><b>Now</b></span> 
							<hr>You will be spending a text balance of	<b><span id = "attachedRecipientsCountTwo" >0</span></b> using your remaning balance of <b>${bal.currentBalance}</b> 
						</div>
						<!-- /.box-body -->
					</div>
					<!-- /.box -->
				</div>
				<div class="modal-footer">
					<button onClick="submitForm(${bal.currentBalance}, ${bal.monthlyBalance} )" type="button" class="btn btn-primary pull-left">SEND</button>
					<button onClick="clearWarnings()" type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<!-- DRAFT MODAL -->
	<div class="modal" id="noTypeModal" role="dialog" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span>
					</button>
					<h4 id="modalHeading" class="modal-title">Help: How to add recipients...</h4>
				</div>
				<div class="modal-body">Please add recipients to your text message by using the <b>"Add Recipients"</b> tool menu. WIth the tool menu you can add a <i>contact</i>, a <i>group</i>, or a <i>phone number</i>.</div>
				<div class="modal-footer">
					<button onClick="clearWarnings()" type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<!-- DRAFT MODAL -->
	<div class="modal" id="loadingModal" role="dialog" data-backdrop="static">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h4 id="modalHeading" class="modal-title">Sending...</h4>
				</div>
				<div class="modal-body">
					<div id="PreviewModalAlert" style="display: none;" class="alert alert-danger alert-dismissable">
						<h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
						<p id="previewModalAlertText"></p>
					</div>
					<div style="width: 100%; margin-top: 15px; text-align: center;">	<i style="font-size: 55px; color: #605ca8;" class="fa fa-spinner fa-pulse"></i>
					</div>
					<p style=" margin-top: 20px; width: 100%; font-size: 16px; text-align: center; ">Our pigeons are delievering your messages! please hold tight...</p>
				</div>
				<div style="text-align: left;" class="modal-footer">Messages proccessed by TxtWolf.</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<!-- DRAFT MODAL -->
	<div class="modal" id="addGroupModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="box-body">
					<div class="box-header with-border" style="padding-left: 0px;">
						<h3 class="box-title">Add Group -</h3>
					</div>
					<!-- /.box-header -->
					<div class="input-group margin" style="width: 100%; margin: 0px 10px 10px 0px;"></div>
					<!-- /input-group -->
					<table id="groupTable" class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>Name</th>
								<th>Members</th>
								<th>Description</th>
							</tr>
						</thead>
						<tbody>
							<g:if test="${groups != 'NONE'}">
								<g:each in="${groups}">
									<g:if test="${addToGroup}">
										<tr data-toggle="modal" data-target="#myModal${it.groupID}" class="pointer">
									</g:if>
									<g:else>
										<tr onClick="addGroupPrePick('${it.groupID}', '${it.groupName}')" class="pointer">
									</g:else>
									<td><a href="#"><b>${it.groupName}</b></a>
									</td>
									<td>${it.memberCount}</td>
									<g:if test="${it.description}">
										<td>${it.description}</td>
									</g:if>
									<g:else>
										<td>None</td>
									</g:else>
									</tr>
								</g:each>
							</g:if>
							<g:else>
								<tr onclick="document.location = '${createLink(controller: 'Dashboard', action: 'createGroup')}';" class="pointer">
									<td><a href="#"><b>Click here to add your first group!</b></a>
									</td>
									<td>-</td>
									<td>-</td>
									<td>-</td>
								</tr>
							</g:else>
						</tbody>
						<tfoot></tfoot>
					</table>
					<div id="resultOver" style="display: none; margin-top: 10px;" class="alert alert-info alert-dismissable">
						<h4><i class="icon fa fa-exclamation-circle"></i>Top 15 results displayed.</h4>
						<p id="previewModalAlertText">Too many results, please narrow down your search.</p>
					</div>
				</div>
				<!-- /.box-body -->
				<div class="modal-footer">
					<button onClick="clearWarnings()" type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<!-- DRAFT MODAL -->
	<div class="modal" id="addContactModal" role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="box-body">
					<div class="box-header with-border" style="padding-left: 0px;">
						<h3 class="box-title">Add Contact -</h3>
					</div>
					<!-- /.box-header -->
					<div class="input-group margin" style="width: 100%; margin: 0px 10px 10px 0px;">
						<input id="searchInput" placeholder="Name, address..." type="text" class="form-control"> <span class="input-group-btn">
                      <button id = "searchContactBtn" onClick = "search('${createLink(controller: 'Dashboard', action: 'searchContactAjax')}')" class="btn btn-info btn-flat" type="button">Search</button>                      
                    </span> 
					</div>
					<!-- /input-group -->
					<table id="example1" class="table table-bordered table-hover">
						<thead>
							<tr>
								<th>Name</th>
								<th>Number</th>
								<th>Location</th>
							</tr>
						</thead>
						<tbody id="contactTable">
							<tr class="pointer">
								<td>Please enter a search.</td>
								<td>-</td>
								<td>-</td>
							</tr>
						</tbody>
						<tfoot></tfoot>
					</table>
					<div id="resultOver" style="display: none; margin-top: 10px;" class="alert alert-info alert-dismissable">
						<h4><i class="icon fa fa-exclamation-circle"></i>Top 15 results displayed.</h4>
						<p id="previewModalAlertText">Too many results, please narrow down your search.</p>
					</div>
				</div>
				<!-- /.box-body -->
				<div class="modal-footer">
					<button onClick="clearWarnings()" type="button" class="btn btn-default pull-left" data-dismiss="modal">Close</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
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
		addCustomNumberPrePick();
			
		$('.bootstrap-tagsinput > :input').keydown(function() {
			// Dont allow user to type in the recip input field
			$('#noTypeModal').modal('show');	
		   return false;
		});
	
		
	});
	
	
	  // initialize datamask for inputs
	  $("[data-mask]").inputmask();
	
		$('#tags').tagsinput({
			 tagClass: function(item) {
				    switch (item.optionType) {
				      case 'Pick'   : return 'label label-info';
				      case 'none'  : return 'label label-important';
				      case 'custom': return 'label label-success';
				      case 'group'   : return 'badge badge-inverse';
				      case 'Asia'     : return 'badge badge-warning';
				    }
				  },
					    
			itemValue: 'value',	
			itemText: 'text',							  
			trimValue: true,
		  	freeInput: false
		  	
		});
		
		// on search box enter
		$("#searchInput").keypress(function(event) {
		    if (event.which == 13) {
		   	 $( "#searchContactBtn" ).trigger( "click" );
		    }
		});
		
		$('#searchInput').on('input', function() {
	    	$( "#searchContactBtn" ).trigger( "click" );
		});
	
		// When the form is submitted disable the resend button
		$('form').submit(function() {
			$('#loadingModal').modal('show');	
			$('#previewModal').modal('hide');	
			
			$("#submitBtn").prop("disabled",true);	
		});
	
		function submitForm(currentBal, MonthlyBal){
			if (parseInt($('#attachedRecipientsCountTwo').html()) > parseInt(currentBal)) {
					$("#previewModalAlertText").html("The current amount of recipents exceeds your remaining balance. " +
					"Increase your monthly balance in the subscription menu or remove recipents from this text.");  
					$("#PreviewModalAlert").css("display","block");
				    $("#PreviewModalAlert").effect("bounce", { times:3 }, 400);
			} else {
				if (!errors.length) {
					$('#submitBtn').click()		
					//console.log(parseInt($('#attachedRecipientsCountTwo').html()) + " :: " + currentBal  );		
				} else {
					$("#PreviewModalAlert").css("display","block");
				    $("#PreviewModalAlert").effect("bounce", { times:3 }, 400);
				}	
			}
		}
		
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
		function addCustomNumber() {
			// Number set from addNumber modal for custom numbers not in address book.
			if (validateAddNumber()) {
				var number = $('#customNumber').val();
				$('#tags').tagsinput('add', { "value":  'N:' + number , "text": number, "optionType": "custom"});	
				$('#customNumber').val(""); // Clear the input field
				$('#addNumberModal').modal("hide");
				removeToPlaceHolder();			 
			}
		}
	
		  // ******* CUSTOM CONTACT ******* 
		function addCustomNumberPrePick() {
			// Number set from addNumber modal for custom numbers not in address book.	
				var name = $('#preClientName').val();
				var clientID = $('#preClientID').val();
				if (name != "NONE") {
					$('#tags').tagsinput('add', { "value":  'ID:' + clientID , "text": name, "optionType": "Pick"});	
					removeToPlaceHolder();	
					return true;
				} else {
					return false;
				}		 
		}
		
			  // ******* CUSTOM NUMBER MODAL ******* 
		function addNumberPick(name, clientID) {
			// Number set from addNumber modal for custom numbers not in address book.	
				if (name != "NONE") {
					$('#tags').tagsinput('add', { "value":  'ID:' + clientID , "text": name, "optionType": "Pick"});	
					removeToPlaceHolder();	
					$('#addContactModal').modal("hide");
					return true;
				} else {
					return false;
				}		 
		}
	
		  // ******* CUSTOM CONTACT ******* 
		function addGroupPrePick(groupID, groupName) {
			// Number set from addNumber modal for custom numbers not in address book.	
				if (groupName != "NONE") {
					$('#tags').tagsinput('add', { "value":  'G:' + groupID , "text": groupName, "optionType": "group"});	
					removeToPlaceHolder();	
					$('#addGroupModal').modal("hide");		
					return true;
				} else {
					return false;
				}		 
		}
	
	  	// Set focus to number input
		$('#addNumberModal').on('shown.bs.modal', function () {
		    $('#customNumber').focus();
		})
		
	  	// Set focus to anme input
		$('#addContactModal').on('shown.bs.modal', function () {
		    $('#searchInput').focus();
		    $('#searchInput').val("");
		    $("#example1 > tbody").html("");
		    
		$('#contactTable').append("<tr class = 'pointer' >" +
			"<td>Please enter a search.</td>" +
			"<td>-</td>" +
			"<td>-</td>" +
			"</tr>");	
			$("#resultOver").css("display","none");		 
		})
		
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
	  
	  function validateAddNumber() {
		  var error = false;
		  var number = $('#customNumber').val();
		  	if (number.length < 10) {
				error = true;
				$("#addNumberModalAlertText").html("Please enter a <b>10</b> digit phone number.")
			} else if (number.replace(/[^0-9]/g,"").length < 10) {
				error = true;
				$("#addNumberModalAlertText").html("Please enter a valid phone number");			
			}
	
			if (error){
				$("#addNumberModalAlert").slideDown();
				return false;
			} else {
				return true;
			}
				
	  }
	
	  
	  function validateMainForm() {		  
		  var error = false;
		  var number = $('#customNumber').val();
	
		  	//Clear old values
		  	errors = [];
			$("#previewModalAlertText").html("");  
			
		  	if ($("#compose-textarea").val().length < 11) {
				error = true;
				errors.push("Please enter a message longer than 10 characters.");			
		  	}
		
		  	if ($("#compose-textarea").val().length > 260) {
				error = true;
				errors.push("Your message can not be longer than 260 characters.");			
		  	}
		  	
			if (!$("#tags").val()) {
				error = true;
				errors.push("Please add atleast (1) recipient.");						
			}
	
			if (error){
				for (i = 0; i < errors.length; i++) { 
					$("#previewModalAlertText").append("*" + errors[i] + "<br/>");		
				}			
				$("#PreviewModalAlert").css("display","block");
				return false;
			} else {
				$("#PreviewModalAlert").css("display","none");		
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