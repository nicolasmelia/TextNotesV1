import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_home_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_home.gsp" }
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(22)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(23)
if(true && (clientCount > 0)) {
printHtmlPart(24)
}
printHtmlPart(25)
createTagBody(2, {->
printHtmlPart(26)
invokeTag('actionSubmit','g',278,['action':("dashboard"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(27)
})
invokeTag('form','g',282,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(28)
if(true && (contacts)) {
printHtmlPart(29)
if(true && (contacts != 'NONE')) {
printHtmlPart(30)
for( _it3162216 in (contacts) ) {
changeItVariable(_it3162216)
printHtmlPart(31)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(32)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(33)
expressionOut.print(it.phoneNumber)
printHtmlPart(34)
if(true && (it.city)) {
printHtmlPart(35)
expressionOut.print(it.city,)
printHtmlPart(36)
expressionOut.print(it.state)
printHtmlPart(37)
}
else {
printHtmlPart(38)
}
printHtmlPart(39)
}
printHtmlPart(40)
}
else {
printHtmlPart(41)
}
printHtmlPart(42)
}
else {
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(44)
}
printHtmlPart(45)
createClosureForHtmlPart(46, 2)
invokeTag('link','g',356,['action':("dashboard"),'params':([offset: offset, up: 'false']),'type':("button"),'class':("btn btn-default")],2)
printHtmlPart(47)
createClosureForHtmlPart(48, 2)
invokeTag('link','g',357,['action':("dashboard"),'params':([offset: offset, up: 'true']),'type':("button"),'class':("btn btn-default")],2)
printHtmlPart(49)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(50)
for( _it1423314849 in (contacts) ) {
changeItVariable(_it1423314849)
printHtmlPart(51)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(52)
createClosureForHtmlPart(53, 4)
invokeTag('link','g',463,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(54)
}
printHtmlPart(55)
}
printHtmlPart(56)
invokeTag('javascript','g',487,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(57)
invokeTag('javascript','g',490,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(58)
invokeTag('javascript','g',493,['src':("dashboard/app.min.js")],-1)
printHtmlPart(59)
})
invokeTag('captureBody','sitemesh',501,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(60)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1455849946850L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
