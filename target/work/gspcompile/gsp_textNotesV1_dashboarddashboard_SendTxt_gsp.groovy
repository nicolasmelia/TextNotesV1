import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_SendTxt_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_SendTxt.gsp" }
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
})
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(13)
expressionOut.print(session.firstName)
printHtmlPart(14)
expressionOut.print(session.lastName)
printHtmlPart(15)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(16)
expressionOut.print(session.firstName)
printHtmlPart(14)
expressionOut.print(session.lastName)
printHtmlPart(17)
invokeTag('formatDate','g',143,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(18)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(19)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(20)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(21)
expressionOut.print(session.firstName)
printHtmlPart(14)
expressionOut.print(session.lastName)
printHtmlPart(22)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',440,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(24)
invokeTag('javascript','g',445,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(25)
invokeTag('javascript','g',448,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(26)
invokeTag('javascript','g',451,['src':("dashboard/app.min.js")],-1)
printHtmlPart(27)
invokeTag('javascript','g',453,['src':("dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js")],-1)
printHtmlPart(28)
invokeTag('javascript','g',455,['src':("dashboard/plugins/select2/select2.full.min.js")],-1)
printHtmlPart(27)
invokeTag('javascript','g',457,['src':("tagsinput/dist/bootstrap-tagsinput.min.js")],-1)
printHtmlPart(29)
invokeTag('javascript','g',461,['src':("dashboard/plugins/input-mask/jquery.inputmask.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',462,['src':("dashboard/plugins/input-mask/jquery.inputmask.date.extensions.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',463,['src':("dashboard/plugins/input-mask/jquery.inputmask.extensions.js")],-1)
printHtmlPart(31)
invokeTag('javascript','g',468,['src':("dashboard/plugins/daterangepicker/daterangepicker.js")],-1)
printHtmlPart(32)
invokeTag('javascript','g',471,['src':("dashboard/plugins/colorpicker/bootstrap-colorpicker.min.js")],-1)
printHtmlPart(33)
invokeTag('javascript','g',474,['src':("dashboard/plugins/timepicker/bootstrap-timepicker.min.js")],-1)
printHtmlPart(34)
invokeTag('javascript','g',477,['src':("dashboard/plugins/slimScroll/jquery.slimscroll.min.js")],-1)
printHtmlPart(35)
invokeTag('javascript','g',480,['src':("dashboard/plugins/iCheck/icheck.min.js")],-1)
printHtmlPart(36)
invokeTag('javascript','g',483,['src':("dashboard/plugins/fastclick/fastclick.min.js")],-1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1452397644522L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
