<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" fcontent="IE=edge">
    <title>AdminLTE 2 | Starter</title>
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
        <a href="index2.html" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini"><b>W</b>olf</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>Txt</b>Wolf</span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <!-- Navbar Right Menu -->
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- Messages: style can be found in dropdown.less-->
              <li class="dropdown messages-menu">
                <!-- Menu toggle button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-envelope-o"></i>
                  <span class="label label-success">0</span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">You have 0 messages</li>
                  <li>
                    <!-- inner menu: contains the messages -->
                    <ul class="menu">
                      <li><!-- start message -->
                        <a href="#">
                          <div class="pull-left">
                            <!-- User Image -->
                            <img src="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}" class="img-circle" alt="User Image">
                          </div>
                          <!-- Message title and timestamp -->
                          <h4>
                            Support Team
                            <small><i class="fa fa-clock-o"></i> 5 mins</small>
                          </h4>
                          <!-- The message -->
                          <p>Why not buy a new awesome theme?</p>
                        </a>
                      </li><!-- end message -->
                    </ul><!-- /.menu -->
                  </li>
                  <li class="footer"><a href="#">See All Messages</a></li>
                </ul>
              </li><!-- /.messages-menu -->

              <!-- Notifications Menu -->
              <li class="dropdown notifications-menu">
                <!-- Menu toggle button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-bell-o"></i>
                  <span class="label label-warning">0</span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">You have 0 notifications</li>
                  <li>
                    <!-- Inner Menu: contains the notifications -->
                    <ul class="menu">
                      <li><!-- start notification -->
                        <a href="#">
                          <i class="fa fa-users text-aqua"></i> 5 new members joined today
                        </a>
                      </li><!-- end notification -->
                    </ul>
                  </li>
                  <li class="footer"><a href="#">View all</a></li>
                </ul>
              </li>   

              <!-- User Account Menu -->
              <li class="dropdown user user-menu">
                <!-- Menu Toggle Button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <!-- The user image in the navbar-->
                  <img src="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}" class="user-image" alt="User Image">
                  <!-- hidden-xs hides the username on small devices so only the image appears. -->
                  <span class="hidden-xs">${session.firstName} ${session.lastName}</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- The user image in the menu -->
                  <li class="user-header">
                    <img src="${resource(dir: 'images', file: 'dashboard/default_avatar.png')}" class="img-circle" alt="User Image">
                    <p>
                      ${session.firstName} ${session.lastName} - Admin
                      <small>Member since <g:formatDate format="yyyy" date="${session.signUpDate}"/></small>
                    </p>
                  </li>
                  <!-- Menu Body -->
                  <li class="user-body">
                    <div class="col-xs-4 text-center">
                      <a href="${createLink(controller: 'Home')}">Home</a>
                    </div>
                    <div class="col-xs-4 text-center">
                      <a href="#">Blog</a>
                    </div>
                    <div class="col-xs-4 text-center">
                      <a href="#">Help</a>
                    </div>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                    <!--  <a href="#" class="btn btn-default btn-flat">Profile</a> -->
                    </div>
                    <div class="pull-right">
                      <a href="${createLink(controller: 'login', action: 'logout')}" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
              <!-- Control Sidebar Toggle Button -->
              <li>
                <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
              </li>
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
              <!-- Status -->
              <a href="#"><i class="fa fa-circle text-success"></i> Active</a>
            </div>
          </div>

          <!-- search form (Optional) -->
          <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
              <input type="text" name="q" class="form-control" placeholder="Search Contacts...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
              </span>
            </div>
          </form>
          <!-- /.search form -->

          <!-- Sidebar Menu -->
          <ul class="sidebar-menu">
            <li class="header">Tools</li>
            <!-- Optionally, you can add icons to the links -->
            
            <li class="">
              <a href="#"><i class="fa fa-book"></i> <span>Address Book</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="#">Contacts</a></li> 
                <li><a href="#">Groups</a></li>                
                <li><a href="#">New Contact</a></li>    
              </ul>
            </li>

             <li class="treeview active">
              <a href="#"><i class="fa fa-comment"></i> <span>Send Text</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="${createLink(controller: 'Dashboard', action: 'sendTxt')}">Compose Text</a></li>
                <li><a href="#">Scheduled Text</a></li>       
              </ul>
            </li>
       
             <li class="treeview">
              <a href="#"><i class="fa fa-ticket"></i> <span>Promotions</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="#">View Promotions</a></li>
                <li><a href="#">Validate Promo Code</a></li>       
                <li><a href="#">Create Promotion</a></li>
              </ul>
            </li>
       
          </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
           <!-- Content Header (Page header) -->
       <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Compose
            <small>New Text</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Send Text</a></li>
            <li class="active">Compose Text</li>
          </ol>
        </section>

        <!-- Main content -->
        <section class="content">
          <div class="row">
            <div class="col-md-3">
              <a href="mailbox.html" class="btn btn-primary btn-block margin-bottom">Address Book</a>
              <div class="box box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">Add Recipients</h3>
                  <div class="box-tools">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div>
                </div>
                <div class="box-body no-padding">
                  <ul class="nav nav-pills nav-stacked">
                    <li><a data-toggle="modal" data-target="#addContactModal" class = "pointer" ><i class="fa fa-plus-square"></i> Add Contact </a></li>
                    <li><a data-toggle="modal" data-target="#myModal" class = "pointer" ><i class="fa fa-plus-square"></i> Add Group</a></li>
                    <li><a data-toggle="modal" data-target="#addNumberModal" class = "pointer" ><i class="fa fa-plus-square"></i> Add Number </a></li>   
                  </ul>
                </div><!-- /.box-body -->
              </div><!-- /. box -->
              <div class="box box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">Labels</h3>
                  <div class="box-tools">
                    <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                  </div>
                </div><!-- /.box-header -->
                <div class="box-body no-padding">
                  <ul class="nav nav-pills nav-stacked">
                    <li><a href="#"><i class="fa fa-envelope-o"></i> Sent</a></li>
                    <li><a href="#"><i class="fa fa-file-text-o"></i> Drafts</a></li>
                  </ul>
                </div><!-- /.box-body -->
              </div><!-- /.box -->
            </div><!-- /.col -->
            <div class="col-md-9">
              <div class="box box-primary">
                <div class="box-header with-border">
                  <h3 class="box-title">Compose Text</h3>
                </div><!-- /.box-header -->
                
		       <g:form id = "txtForm" class="form-signin" controller="SmsGateOut" action="messageOut" enctype="multipart/form-data" >

                <div class="box-body">
		             
		           <!-- If added client is coming from the address book feel these values-->
		          <input type="hidden" id="preClientName" value="${preClientName}">
		          <input type="hidden" id="preClientID" value="${preClientID}">
		             
		             
                  <div class="form-group">
                    <input type="hidden" name="allTags" value="">
		            <input id = "tags"   name = "tags" placeholder = "Recipients" class="form-control"  type="text" data-role="tagsinput" />
		          </div>		              
		          
                  <div class="form-group">
                    <input id = "subject" name = "subject"  class="form-control" placeholder="Subject: Not Required">
                  </div>
                  <div class="form-group">
                    <textarea placeholder="Message"  id="compose-textarea" name = "body" class="form-control" style="height: 150px"></textarea>
                  </div>
                  <div class="form-group">
                    <p style = "margin: 0px;" id = 'charCount' class="help-block">0/260 characters</p>
                  </div>
                </div><!-- /.box-body -->
                
                <!-- hidden to hide ro send via modal! --> 
               <button style = "display:none;"   class=" btn btn-primary" id = "submitBtn" value = "Send"  action = "messageOut"/></button>	
                
               </g:form>
 
                <div class="box-footer">
                  <div class="pull-right">
                  
                    <button onClick = "openPreview()" data-toggle="modal" data-target="#previewModal"  type="button" class="btn btn-primary"><i class="fa fa-envelope-o"></i> Send</button>
           
                  </div>
                  <button class="btn btn-default"><i class="fa fa-times"></i> Discard</button>
                </div><!-- /.box-footer -->   
                
              </div><!-- /. box -->
              						
              
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section><!-- /.content -->
        
      </div><!-- /.content-wrapper -->

      <!-- Main Footer -->
      <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
          Anything you want
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2015 <a href="#">Company</a>.</strong> All rights reserved.
      </footer>

      <!-- Control Sidebar -->
      <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
          <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
          <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
          <!-- Home tab content -->
          <div class="tab-pane active" id="control-sidebar-home-tab">
            <h3 class="control-sidebar-heading">Recent Activity</h3>
            <ul class="control-sidebar-menu">
              <li>
                <a href="javascript::;">
                  <i class="menu-icon fa fa-birthday-cake bg-red"></i>
                  <div class="menu-info">
                    <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
                    <p>Will be 23 on April 24th</p>
                  </div>
                </a>
              </li>
            </ul><!-- /.control-sidebar-menu -->

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
            </ul><!-- /.control-sidebar-menu -->

          </div><!-- /.tab-pane -->
          <!-- Stats tab content -->
          <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div><!-- /.tab-pane -->
          <!-- Settings tab content -->
          <div class="tab-pane" id="control-sidebar-settings-tab">
            <form method="post">
              <h3 class="control-sidebar-heading">General Settings</h3>
              <div class="form-group">
                <label class="control-sidebar-subheading">
                  Report panel usage
                  <input type="checkbox" class="pull-right" checked>
                </label>
                <p>
                  Some information about this general settings option
                </p>
              </div><!-- /.form-group -->
            </form>
          </div><!-- /.tab-pane -->
        </div>
      </aside><!-- /.control-sidebar -->
      <!-- Add the sidebar's background. This div must be placed
           immediately after the control sidebar -->
      <div class="control-sidebar-bg"></div>
    </div><!-- ./wrapper -->
    
    
    		<!-- addNumberModal --> 
                <div class="modal" id="addNumberModal" role="dialog" data-backdrop="static">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 id = "modalHeading" class="modal-title">Add Phone Number</h4>
                  </div>
                  <div class="modal-body">
                  
                  <div id = "addNumberModalAlert"  style = "display: none;"  class="alert alert-danger alert-dismissable">
                    <h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
                    <p id = "addNumberModalAlertText"></p>
                  </div>
                  
                  <!-- phone mask -->
                  <div class="form-group">
                    <label>Phone Number:</label>
                    <div class="input-group">
                      <div class="input-group-addon">
                        <i class="fa fa-phone"></i>
                      </div>
                      <input placeholder="Required" id = "customNumber" type="text" class="form-control" data-inputmask='"mask": "(999) 999-9999"' data-mask>
                    </div><!-- /.input group -->
                  </div><!-- /.form group -->

                  </div>
                  <div class="modal-footer">
                    <button onClick = "addCustomNumber()" type="button" class="btn btn-primary pull-left" >Add Number</button>
                    <button onClick = "clearWarnings()"  type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
                  </div>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->  
                    
            <!-- DRAFT MODAL --> 
        <div class="modal" id="previewModal" role="dialog" data-backdrop="static">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 id = "modalHeading" class="modal-title">Message Overview</h4>
                  </div>
                  <div class="modal-body">
                  
                  <div id = "PreviewModalAlert"  style = "display: none;"  class="alert alert-danger alert-dismissable">
                    <h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
                    <p id = "previewModalAlertText"></p>
                  </div>
					
 				 <div class="box box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">Preview</h3>
                </div><!-- /.box-header -->
                <div class="box-body">

                  <span id = "preMessageSubject">No Subject</span>
                  <p id = "preMessageBody"> No Message</p>
                  
                </div><!-- /.box-body -->
              </div><!-- /.box -->
              
 					
 				<div class="box box-solid">
                <div class="box-header with-border">
                  <h3 class="box-title">Details</h3>
                </div><!-- /.box-header -->
                <div class="box-body">
              
              	<g:each in="${accountInfo}">
                Recipients Attached: <span id = "attachedRecipientsCount" >0</span> <br>
				Remaining Text Balance: <span>${it.remainingMonthlyTextBalance}/${it.monthlyTextBalance}</span><br>
				Scheduled Send Time: <span id = "ScheduledSendTime" ><b>Now</b></span>
                </g:each>
                
                </div><!-- /.box-body -->
              </div><!-- /.box -->


                  </div>
                  <div class="modal-footer">
                    <button onClick = "submitForm()" type="button" class="btn btn-primary pull-left" >SEND</button>
                    <button onClick = "clearWarnings()"  type="button" class="btn btn-default" data-dismiss="modal" >Close</button>
                  </div>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->            
            
   
                 <!-- DRAFT MODAL --> 
        <div class="modal" id="loadingModal" role="dialog" data-backdrop="static">
              <div class="modal-dialog">
                <div class="modal-content">
                  <div class="modal-header">
                    <h4 id = "modalHeading" class="modal-title">Sending...</h4>
                  </div>
                  <div class="modal-body">              
                  <div id = "PreviewModalAlert"  style = "display: none;"  class="alert alert-danger alert-dismissable">
                    <h4><i class="icon fa fa-exclamation-circle"></i>Fix needed</h4>
                    <p id = "previewModalAlertText"></p>
                  </div> 
					<div style = "width: 100%; margin-top: 15px; text-align: center;" >
						<i style = "font-size: 55px; color: #605ca8;" class="fa fa-spinner fa-pulse"></i>
					</div>				
 				<p style = " margin-top: 20px; width: 100%; font-size: 16px; text-align: center; ">
 				 Our pigeons are delievering your messages! please hold tight...
 				</p>
                  </div>
                  <div style = "text-align: left;" class="modal-footer">
                  Messages proccessed by TxtWolf.
                  </div>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->       
            
            
                 <!-- DRAFT MODAL --> 
        <div class="modal" id="addContactModal" role="dialog">
              <div class="modal-dialog">
                <div class="modal-content">
 
 				<div class="box-body">
			
 				 <div class="box-header with-border" style = "padding-left: 0px;" >
                  <h3 class="box-title">Add Contact -</h3>
                </div><!-- /.box-header -->
                 
                <div class="input-group margin" style = "width: 100%; margin: 0px 10px 10px 0px;">
                                 
                    <input id = "searchInput"  placeholder="Name, address..." type="text" class="form-control">
                    <span class="input-group-btn">
                      <button id = "searchContactBtn" onClick = "search('${createLink(controller: 'Dashboard', action: 'searchContactAjax')}')" class="btn btn-info btn-flat" type="button">Search</button>                      
                    </span>                    
                  </div><!-- /input-group -->   
 				
                  <table id="example1" class="table table-bordered table-hover">
                    <thead>
                      <tr>
                        <th>Name</th>
                        <th>Number</th>
                        <th>Location</th>
                      </tr>
                    </thead>
                    <tbody id = "contactTable">
                       
                      <tr  class = "pointer" >
                        <td>Please enter a search.</td>
                        <td>-</td>
						<td>-</td>
                      </tr>
                   
                    </tbody>

                    <tfoot>

                    </tfoot>
                  </table>
                  
                  <div id = "resultOver"  style = "display: none; margin-top: 10px;"  class="alert alert-info alert-dismissable">
                    <h4><i class="icon fa fa-exclamation-circle"></i>Top 15 results displayed.</h4>
                    <p id = "previewModalAlertText">Too many results, please narrow down your search.</p>
                  </div> 
                  
                  
                </div><!-- /.box-body -->


                  <div class="modal-footer">
                    <button onClick = "clearWarnings()"  type="button" class="btn btn-default pull-left" data-dismiss="modal" >Close</button>
                  </div>
                </div><!-- /.modal-content -->
              </div><!-- /.modal-dialog -->
            </div><!-- /.modal -->     
      
     
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
    
    <g:javascript src="tagsinput/dist/bootstrap-tagsinput.min.js"/>
    
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
    
    <!-- SlimScroll 1.3.0 -->
    <g:javascript src="dashboard/plugins/slimScroll/jquery.slimscroll.min.js" /> 
    
    <!-- iCheck 1.0.1 -->
    <g:javascript src="dashboard/plugins/iCheck/icheck.min.js" /> 
    
    <!-- FastClick -->
    <g:javascript src="dashboard/plugins/fastclick/fastclick.min.js" /> 
   
     <!-- JQUERY UI -->
	<link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/smoothness/jquery-ui.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/jquery-ui.min.js"></script>

  
  <script>


$( document ).ready(function() {
	addCustomNumberPrePick();
});

  // initialize datamask for inputs
  $("[data-mask]").inputmask();

	$('#tags').tagsinput({
		 tagClass: function(item) {
			    switch (item.optionType) {
			      case 'Pick'   : return 'label label-info';
			      case 'America'  : return 'label label-important';
			      case 'custom': return 'label label-success';
			      case 'Africa'   : return 'badge badge-inverse';
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

	function submitForm(){
		if (!errors.length) {
			$('#submitBtn').click()			
		} else {
			$("#PreviewModalAlert").css("display","block");
		    $("#PreviewModalAlert").effect("bounce", { times:3 }, 400);
		}
	}
	
	function validateForm(){
		return true;
	}

	function openPreview() {
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

	  // ******* CUSTOM NUMBER MODAL ******* 
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

  	// Set focus to number input
	$('#addNumberModal').on('shown.bs.modal', function () {
	    $('#customNumber').focus();
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
      $( "#txtForm" ).submit();
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
		
	  	if ($("#compose-textarea").val() < 10) {
			error = true;
			errors.push("Please enter a valid or longer message.");			
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
