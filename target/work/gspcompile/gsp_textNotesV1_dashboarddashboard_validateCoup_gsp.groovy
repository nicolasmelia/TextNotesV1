import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_validateCoup_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_validateCoup.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'fcontent':("IE=edge")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'content':("width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"),'name':("viewport")],-1)
printHtmlPart(4)
invokeTag('resource','g',15,['dir':("css"),'file':("dashboard/bootstrap/css/bootstrap.min.css")],-1)
printHtmlPart(5)
invokeTag('resource','g',24,['dir':("css"),'file':("dashboard/AdminLTE.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',26,['dir':("css"),'file':("dashboard/CustomCSS.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',32,['dir':("css"),'file':("dashboard/skins/skin-purple.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',34,['dir':("js"),'file':("dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',36,['dir':("js"),'file':("dashboard/plugins/select2/select2.min.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',38,['dir':("js"),'file':("tagsinput/dist/bootstrap-tagsinput.css")],-1)
printHtmlPart(9)
invokeTag('resource','g',41,['dir':("js"),'file':("dashboard/plugins/timepicker/bootstrap-timepicker.min.css")],-1)
printHtmlPart(10)
invokeTag('resource','g',43,['dir':("js"),'file':("dashboard/plugins/daterangepicker/daterangepicker-bs3.css")],-1)
printHtmlPart(11)
invokeTag('resource','g',46,['dir':("js"),'file':("dashboard/plugins/iCheck/all.css")],-1)
printHtmlPart(12)
})
invokeTag('captureHead','sitemesh',55,[:],1)
printHtmlPart(13)
createTagBody(1, {->
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(15)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(16)
expressionOut.print(session.firstName)
printHtmlPart(17)
expressionOut.print(session.lastName)
printHtmlPart(18)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(19)
expressionOut.print(session.firstName)
printHtmlPart(17)
expressionOut.print(session.lastName)
printHtmlPart(20)
invokeTag('formatDate','g',150,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(21)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(22)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(23)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(24)
expressionOut.print(session.firstName)
printHtmlPart(17)
expressionOut.print(session.lastName)
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(31)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(33)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(34)
createTagBody(2, {->
printHtmlPart(35)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(36)
})
invokeTag('form','g',305,['id':("txtForm"),'class':("form-horizontal"),'controller':("Dashboard"),'action':("validateCoup"),'enctype':("multipart/form-data")],2)
printHtmlPart(37)
invokeTag('javascript','g',392,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(38)
invokeTag('javascript','g',395,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(39)
invokeTag('javascript','g',398,['src':("dashboard/app.min.js")],-1)
printHtmlPart(40)
invokeTag('javascript','g',400,['src':("dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js")],-1)
printHtmlPart(41)
invokeTag('javascript','g',402,['src':("dashboard/plugins/select2/select2.full.min.js")],-1)
printHtmlPart(40)
invokeTag('javascript','g',404,['src':("tagsinput/dist/bootstrap-tagsinput.min.js")],-1)
printHtmlPart(42)
invokeTag('javascript','g',408,['src':("dashboard/plugins/input-mask/jquery.inputmask.js")],-1)
printHtmlPart(43)
invokeTag('javascript','g',409,['src':("dashboard/plugins/input-mask/jquery.inputmask.date.extensions.js")],-1)
printHtmlPart(43)
invokeTag('javascript','g',410,['src':("dashboard/plugins/input-mask/jquery.inputmask.extensions.js")],-1)
printHtmlPart(44)
invokeTag('javascript','g',415,['src':("dashboard/plugins/daterangepicker/daterangepicker.js")],-1)
printHtmlPart(45)
invokeTag('javascript','g',418,['src':("dashboard/plugins/colorpicker/bootstrap-colorpicker.min.js")],-1)
printHtmlPart(46)
invokeTag('javascript','g',421,['src':("dashboard/plugins/timepicker/bootstrap-timepicker.min.js")],-1)
printHtmlPart(47)
invokeTag('javascript','g',424,['src':("dashboard/plugins/slimScroll/jquery.slimscroll.min.js")],-1)
printHtmlPart(48)
invokeTag('javascript','g',427,['src':("dashboard/plugins/iCheck/icheck.min.js")],-1)
printHtmlPart(49)
invokeTag('javascript','g',430,['src':("dashboard/plugins/fastclick/fastclick.min.js")],-1)
printHtmlPart(50)
})
invokeTag('captureBody','sitemesh',471,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(51)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1471833611666L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
