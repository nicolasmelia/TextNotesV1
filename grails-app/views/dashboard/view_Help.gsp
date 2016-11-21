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
        <div class="sidebar" id="scrollspy">

          <!-- sidebar menu: : style can be found in sidebar.less -->
          <ul class="nav sidebar-menu">
            <li class="header">TABLE OF CONTENTS</li>
            
            <li class="active"><a href="#introduction"><i class="fa fa-circle-o"></i> Introduction</a></li>
            <li><a href="#download"><i class="fa fa-circle-o"></i> Download</a></li>
            <li><a href="#dependencies"><i class="fa fa-circle-o"></i> Dependencies</a></li>
            <li><a href="#advice"><i class="fa fa-circle-o"></i> Advice</a></li>
            <li><a href="#layout"><i class="fa fa-circle-o"></i> Layout</a></li>
            
			
            <li class="header">Menu</li>
			<li><a href="${createLink(controller: 'Dashboard', action: 'Dashboard')}"> <i class="fa fa-home"></i><span>Home</span> </a> </li>
			<li><a href="${createLink(controller: 'Dashboard', action: 'Dashboard')}"> <i class="fa fa-info-circle"></i><span>More Tips</span> </a> </li>
			
            
          </ul>
        </div>
        <!-- /.sidebar -->
      </aside>

      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <div class="content-header">
          <h1>
            AdminLTE Documentation
            <small>Current version 2.3.0</small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
            <li class="active">Documentation</li>
          </ol>
        </div>

        <!-- Main content -->
        <div class="content body">

<section id="introduction">
  <h2 class="page-header"><a href="#introduction">Introduction</a></h2>
  <p class="lead">
    <b>AdminLTE</b> is a popular open source WebApp template for admin dashboards and control panels.
    It is a responsive HTML template that is based on the CSS framework Bootstrap 3.
    It utilizes all of the Bootstrap components in its design and re-styles many
    commonly used plugins to create a consistent design that can be used as a user
    interface for backend applications. AdminLTE is based on a modular design, which
    allows it to be easily customized and built upon. This documentation will guide you through
    installing the template and exploring the various components that are bundled with the template.
  </p>
</section><!-- /#introduction -->


<!-- ============================================================= -->

<section id="download">
  <h2 class="page-header"><a href="#download">Download</a></h2>
  <p class="lead">
    AdminLTE can be downloaded in two different versions, each appealing to different skill levels and use case.
  </p>
  <div class="row">
    <div class="col-sm-6">
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">Ready</h3>
          <span class="label label-primary pull-right"><i class="fa fa-html5"></i></span>
        </div><!-- /.box-header -->
        <div class="box-body">
          <p>Compiled and ready to use in production. Download this version if you don't want to customize AdminLTE's LESS files.</p>
          <a href="http://almsaeedstudio.com/download/AdminLTE-dist" class="btn btn-primary"><i class="fa fa-download"></i> Download</a>
        </div><!-- /.box-body -->
      </div><!-- /.box -->
    </div><!-- /.col -->
    <div class="col-sm-6">
      <div class="box box-danger">
        <div class="box-header with-border">
          <h3 class="box-title">Source Code</h3>
          <span class="label label-danger pull-right"><i class="fa fa-database"></i></span>
        </div><!-- /.box-header -->
        <div class="box-body">
          <p>All files including the compiled CSS. Download this version if you plan on customizing the template. <b>Requires a LESS compiler.</b></p>
          <a href="http://almsaeedstudio.com/download/AdminLTE" class="btn btn-danger"><i class="fa fa-download"></i> Download</a>
        </div><!-- /.box-body -->
      </div><!-- /.box -->
    </div><!-- /.col -->
  </div><!-- /.row -->
  <pre class="hierarchy bring-up"><code class="language-bash" data-lang="bash">File Hierarchy of the Source Code Package

AdminLTE/
├── dist/
│   ├── CSS/
│   ├── JS
│   ├── img
├── build/
│   ├── less/
│   │   ├── AdminLTE's Less files
│   └── Bootstrap-less/ (Only for reference. No modifications have been made)
│       ├── mixins/
│       ├── variables.less
│       ├── mixins.less
└── plugins/
    ├── All the customized plugins CSS and JS files</code></pre>
</section>


<!-- ============================================================= -->

<section id="dependencies">
  <h2 class="page-header"><a href="#dependencies">Dependencies</a></h2>
  <p class="lead">AdminLTE depends on two main frameworks.
    The downloadable package contains both of these libraries, so you don't have to manually download them.</p>
  <ul class="bring-up">
    <li><a href="http://getbootstrap.com" target="_blank">Bootstrap 3</a></li>
    <li><a href="http://jquery.com/" target="_blank">jQuery 1.11+</a></li>
    <li><a href="#plugins">All other plugins are listed below</a></li>
  </ul>
</section>

<!-- ============================================================= -->

<section id="advice">
  <h2 class="page-header"><a href="#advice">A Word of Advice</a></h2>
  <p class="lead">
    Before you go to see your new awesome theme, here are few tips on how to familiarize yourself with it:
  </p>

  <ul>
    <li><b>AdminLTE is based on <a href="http://getbootstrap.com/" target="_blank">Bootstrap 3</a>.</b> If you are unfamiliar with Bootstrap, visit their website and read through the documentation. All of Bootstrap components have been modified to fit the style of AdminLTE and provide a consistent look throughout the template. This way, we guarantee you will get the best of AdminLTE.</li>
    <li><b>Go through the pages that are bundled with the theme.</b> Most of the template example pages contain quick tips on how to create or use a component which can be really helpful when you need to create something on the fly.</li>
    <li><b>Documentation.</b> We are trying our best to make your experience with AdminLTE be smooth. One way to achieve that is to provide documentation and support. If you think that something is missing from the documentation, please do not hesitate to create an issue to tell us about it. Also, if you would like to contribute, email the support team at <a href="mailto:support@almsaeedstudio.com">support@almsaeedstudio.com</a>.</li>
    <li><b>Built with <a href="http://lesscss.org/" target="_blank">LESS</a>.</b> This theme uses the LESS compiler to make it easier to customize and use. LESS is easy to learn if you know CSS or SASS. It is not necessary to learn LESS but it will benefit you a lot in the future.</li>
    <li><b>Hosted on <a href="https://github.com/almasaeed2010/AdminLTE/" target="_blank">GitHub</a>.</b> Visit our GitHub repository to view issues, make requests, or contribute to the project.</li>
  </ul>
  <p>
    <b>Note:</b> LESS files are better commented than the compiled CSS file.
  </p>
</section>


<!-- ============================================================= -->

<section id="layout">
  <h2 class="page-header"><a href="#layout">Layout</a></h2>
  <p class="lead">The layout consists of four major parts:</p>
  <ul>
    <li>Wrapper <code>.wrapper</code>. A div that wraps the whole site.</li>
    <li>Main Header <code>.main-header</code>. Contains the logo and navbar.</li>
    <li>Sidebar <code>.sidebar-wrapper</code>. Contains the user panel and sidebar menu.</li>
    <li>Content <code>.content-wrapper</code>. Contains the page header and content.</li>
  </ul>
  <div class="callout callout-danger lead">
    <h4>Tip!</h4>
    <p>The <a href="../starter.html">starter page</a> is a good place to start building your app if you'd like to start from scratch.</p>
  </div>

  <h3>Layout Options</h3>
  <p class="lead">AdminLTE 2.0 provides a set of options to apply to your main layout. Each on of these classes can be added
    to the body tag to get the desired goal.</p>
  <ul>
    <li><b>Fixed:</b> use the class <code>.fixed</code> to get a fixed header and sidebar.</li>
    <li><b>Collapsed Sidebar:</b> use the class <code>.sidebar-collapse</code> to have a collapsed sidebar upon loading.</li>
    <li><b>Boxed Layout:</b> use the class <code>.layout-boxed</code> to get a boxed layout that stretches only to 1250px.</li>
    <li><b>Top Navigation</b> use the class <code>.layout-top-nav</code> to remove the sidebar and have your links at the top navbar.</li>
  </ul>
  <p><b>Note:</b> you cannot use both layout-boxed and fixed at the same time. Anything else can be mixed together.</p>

  <h3>Skins</h3>
  <p class="lead">Skins can be found in the dist/css/skins folder.
    Choose and the skin file that you want then add the appropriate
    class to the body tag to change the template's appearance. Here is the list of available skins:</p>
  <div class="box box-solid" style="max-width: 300px;">
    <div class="box-body no-padding">
      <table id="layout-skins-list" class="table table-striped bring-up nth-2-center">
        <thead>
          <tr>
            <th style="width: 210px;">Skin Class</th>
            <th>Preview</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td><code>skin-blue</code></td>
            <td><a href="#" data-skin="skin-blue" class="btn btn-primary btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-blue-light</code></td>
            <td><a href="#" data-skin="skin-blue-light" class="btn btn-primary btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-yellow</code></td>
            <td><a href="#" data-skin="skin-yellow" class="btn btn-warning btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-yellow-light</code></td>
            <td><a href="#" data-skin="skin-yellow-light" class="btn btn-warning btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-green</code></td>
            <td><a href="#" data-skin="skin-green" class="btn btn-success btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-green-light</code></td>
            <td><a href="#" data-skin="skin-green-light" class="btn btn-success btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-purple</code></td>
            <td><a href="#" data-skin="skin-purple" class="btn bg-purple btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-purple-light</code></td>
            <td><a href="#" data-skin="skin-purple-light" class="btn bg-purple btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-red</code></td>
            <td><a href="#" data-skin="skin-red" class="btn btn-danger btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-red-light</code></td>
            <td><a href="#" data-skin="skin-red-light" class="btn btn-danger btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-black</code></td>
            <td><a href="#" data-skin="skin-black" class="btn bg-black btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
          <tr>
            <td><code>skin-black-light</code></td>
            <td><a href="#" data-skin="skin-black-light" class="btn bg-black btn-xs"><i class="fa fa-eye"></i></a></td>
          </tr>
        </tbody>
      </table>
    </div><!-- /.box-body -->
  </div><!-- /.box -->
</section>


        </div><!-- /.content -->
      </div><!-- /.content-wrapper -->

      <footer class="main-footer">
        <div class="pull-right hidden-xs">
          <b>Version</b> 2.3.0
        </div>
        <strong>Copyright &copy; 2014-2015 <a href="http://almsaeedstudio.com">Almsaeed Studio</a>.</strong> All rights reserved.
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
