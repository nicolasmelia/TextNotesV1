import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_balance_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_balance.gsp" }
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
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',41,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(12)
expressionOut.print(session.firstName)
printHtmlPart(13)
expressionOut.print(session.lastName)
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(15)
expressionOut.print(session.firstName)
printHtmlPart(13)
expressionOut.print(session.lastName)
printHtmlPart(16)
invokeTag('formatDate','g',137,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(17)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(18)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(19)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(20)
expressionOut.print(session.firstName)
printHtmlPart(13)
expressionOut.print(session.lastName)
printHtmlPart(21)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(22)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(30)
expressionOut.print(conType)
printHtmlPart(31)
createClosureForHtmlPart(32, 2)
invokeTag('link','g',283,['class':("btn btn-default"),'action':("sendTxt"),'params':([]),'type':("button")],2)
printHtmlPart(33)
createClosureForHtmlPart(34, 2)
invokeTag('link','g',288,['class':("btn btn-default"),'action':("sendTxt"),'params':([]),'type':("button")],2)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('link','g',314,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],2)
printHtmlPart(37)
invokeTag('javascript','g',409,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(38)
invokeTag('javascript','g',412,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(39)
invokeTag('javascript','g',415,['src':("dashboard/app.min.js")],-1)
printHtmlPart(40)
})
invokeTag('captureBody','sitemesh',454,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(41)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1468786414414L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
