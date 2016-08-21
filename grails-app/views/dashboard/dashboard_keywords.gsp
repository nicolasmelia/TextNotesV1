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
        <a  href="${createLink(controller: 'Dashboard', action: 'dashboard')}"  class="logo">
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
           <g:form   controller="Dashboard" action="dashboard" enctype="multipart/form-data" class="sidebar-form">           
            <div class="input-group">
              <input type="text" name = "searchQuery"  class="form-control" placeholder="Search Contacts...">
              <span class="input-group-btn">
              <button action="dashboard" name="search" id="search-btn" class="btn btn-flat" ><i class="fa fa-search"></i></button>
              </span>
            </div>
            </g:form> 
   
          <!-- /.search form -->

          <!-- Sidebar Menu -->
          <ul class="sidebar-menu">
            <li class="header">Tools</li>
            <!-- Optionally, you can add icons to the links -->
             
            <li class="active">
              <a href="#"><i class="fa fa-book"></i> <span>Address Book</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="${createLink(controller: 'Dashboard', action: 'dashboard')}">Contacts</a></li> 
                <li><a href="${createLink(controller: 'Dashboard', action: 'keywords')}">keywords</a></li>                
                <li><a class = "fa fa-plus" href="${createLink(controller: 'Dashboard', action: 'newContact')}"> New Contact</a></li>    
              </ul>
            </li>

             <li class="treeview">
              <a href="#"><i class="fa fa-comment"></i> <span>Send Text</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="${createLink(controller: 'Dashboard', action: 'sendTxt')}">Compose Text</a></li>
                <li><a href="${createLink(controller: 'Dashboard', action: 'secheduledTxt')}">Secheduled Text</a></li>
                <li><a href="${createLink(controller: 'Dashboard', action: 'txtHostory')}">History</a></li>       
              </ul>
            </li>
       
             <li class="treeview">
              <a href="#"><i class="fa fa-ticket"></i> <span>Promotions</span> <i class="fa fa-angle-left pull-right"></i></a>
              <ul class="treeview-menu">
                <li><a href="${createLink(controller: 'Dashboard', action: 'ViewPromos')}">View Promotions</a></li>
                <li><a href="${createLink(controller: 'Dashboard', action: 'validatePromo')}">Validate Promo Code</a></li>       
                <li><a href="${createLink(controller: 'Dashboard', action: 'createPromo')}">Create Promotion</a></li>
              </ul>
            </li>

          </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
        
      
	    <g:if test="${type == 'contestSelect'}">	                    
          <h1>
            Choose a Contest by Keyword
            <small>Keywords</small>
          </h1>
	      </g:if>
	    <g:else>
          <h1>
            Contest
            <small>All</small>
          </h1>
	     </g:else>        
  
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> keywords</a></li>
            <li class="active">All</li>
          </ol>
          
        </section>


        <!-- Main content -->
  <section class="content">
          
      <g:if test="${keywordCount == 0}">	
	         <div class="callout callout-info" style="margin-bottom: 10px!important;">
	            <h4><i class="fa fa-paw"></i> Getting Started!</h4>
	            It looks like you dont have any keywords yet. Get started by adding keywords below! You can use keywords to draw customers
	            to your business by offering coupons or starting contest. You can also build a larger contact list each time
	            a customer sends a text to your keyword! 
	        </div>      
        </g:if>
        
         <input  id = 'searchQueryHiddenField' type="hidden" name="searchQueryHidden" value="${searchQueryHidden}">
         <input  id = 'offset' type="hidden" value="${offset}">
         <input  id = 'keywordCount' type="hidden" value="${keywordCount}">
               
          <div class="row">
            <div class="col-xs-12">       
              <div class="box">
                <div class="box-header">      
   
                </div><!-- /.box-header -->
                <div class="box-body">            
                  <table id="example1" class="table table-bordered table-hover">
                    <thead>
                      <tr>
                        <th>Keyword</th>
                        <th>Campaign Type</th>
                        <th>Date Effective</th>
                        
                        <th>Description</th>
                        <th>Total Replys</th>
                        
                        <th>Active</th>
                        
                      </tr>
                    </thead>
                    <tbody>

				 <g:if test="${keywordCount > 0 || offset > 0}">	
				 
				 	<g:if test="${keywords != 'NONE'}">						 			
	                    <g:each in="${keywords}">
       
       				 	<g:if test="${type == 'All'}">	
       				 		<tr  onclick="document.location = '${createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID])}';"class = "pointer" >					 			
       					</g:if>
       					
       				 	<g:if test="${type == 'contestSelect'}">	
       				
  				 	
	       				 	 <g:if test="${it.winners == null}">			 	
	       				 		<tr  onclick="document.location = '${createLink(controller: 'Dashboard', action: 'contestSelect', params: [promotionID:it.promotionID])}';" class = "pointer" >					 			
							</g:if>
	       				 	 <g:else>		
       				 			<tr  onclick="document.location = '${createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID])}';" class = "pointer" >					 			
	       					</g:else>
       				
       					</g:if>
       					
	                    
	                        <td><a href = "#"><b>${it.keyword}</b></a></td>
	                        
	                        	                         
	                         <g:if test="${it.campaignType == 'con'}">
								<td>Contest</td>
								</g:if>
							<g:elseif test="${it.campaignType == 'cust'}">
								<td>Customer</td>
							</g:elseif>
							<g:elseif test="${it.campaignType == 'coup'}">
								<td>Coupon</td>
							</g:elseif>
							<g:else>
								<td>None: Something went wrong!</td>
							</g:else>								                         
	                        
	                        
	                        <td><g:formatDate format="MM-dd-yyyy" date="${it.dateEff}"/>
	                       
	                         
	                         <g:if test="${it.endless}">
	                           - Endless
	                         </g:if>
	                         <g:else>
	                            - <g:formatDate format="MM-dd-yyyy" date="${it.dateExp}"/>
	                         </g:else>
	                         
	                   		  </td>
	                        
	                        
	                        <g:if test="${it.description}">
								<td>${it.description}</td>
							</g:if>
							<g:else>
								<td>-</td>						
							</g:else>	
							
							<td>${it.replys}</td>	
							
							

	                        <g:if test="${it.suspened}">
								<td style = "color: red;">No</td>
							</g:if>
							<g:else>
								<td style = "color: green;" >Yes</td>						
							</g:else>	
					
	                      </tr>
	                      
	                      
						</g:each>
					</g:if>
					<g:else>
                 
                      <tr class = "pointer" >
                        <td><a href = "#"><b>-</b></a></td>
                        <td>-</td>
						<td>-</td>
                      </tr>
                      
					</g:else>
					
                 </g:if>
                 
                 <g:else>
                 
                      <tr onclick="document.location = '${createLink(controller: 'Dashboard', action: 'newKeyWord')}';"  class = "pointer" >
                        <td><a href = "#"><b>Click here to add your first keyword!</b></a></td>
                        <td>-</td>
						<td>-</td>
                        <td>-</td>
                      </tr>
                 
                 </g:else>
                                    
                    </tbody>
                    
                    
                    
                    <tfoot>

                    </tfoot>
                  </table>
                </div><!-- /.box-body -->
                                        
  
                        <div class="btn-group" style = "margin: 0px 0px 10px 10px; " >
                      <g:if test="${offset > 0}">	  
	                        <g:link  action="dashboard" action = "keywords"  params="[offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]"  type="button" class="btn btn-default">Back</g:link>
                       	</g:if>
                       	<g:else>
                       	   <button disabled  type="button" class="btn btn-default">Back</button>                 	
                       	</g:else>
                        
                        	<g:if test="${offset <= keywordCount}">	
                        		<g:link  action="dashboard" action = "keywords"  params="[offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]"  type="button" class="btn btn-default">Next</g:link>
                        	</g:if>
                        	<g:else>
                        		<button disabled  type="button" class="btn btn-default">Next</button>
                        	</g:else>
                       
                        </div>
                        
                   <p style = "float: right; text-align: right; margin: 15px; display: inline-block;" >
                  
                   <span id = "pageInfo">Showing ${currentPage}/3000</span>
  
                   </p>
                
                
              </div> <!-- /.box -->
            </div><!-- /.col -->
          </div><!-- /.row -->
        </section> 
        
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
    

     <!-- REQUIRED JS SCRIPTS -->

    <!-- jQuery 2.1.4 -->
    <g:javascript src="dashboard/plugins/jQuery/jQuery-2.1.4.min.js" /> 
    
    <!-- Bootstrap 3.3.5 -->
    <g:javascript src="dashboard/bootstrap/js/bootstrap.min.js" /> 
    
    <!-- AdminLTE App -->
    <g:javascript src="dashboard/app.min.js" /> 
    
    <!-- Optionally, you can add Slimscroll and FastClick plugins.
         Both of these plugins are recommended to enhance the
         user experience. Slimscroll is required when using the
         fixed layout. -->
         
         
  </body>
  
  <script>


  

  $( document ).ready(function() {
		// Set pageinfo
		var totalClientCount = $("#keywordCount").val();
		var offset = $("#offset").val();
		var offsetTop = (parseInt(offset) + 10);
		$("#pageInfo").html("Viewing " + offset + "-" + offsetTop + " of " + totalClientCount);
		
	});

  function test(number) {
	  return true;
	}


  </script>
  
  
</html>
