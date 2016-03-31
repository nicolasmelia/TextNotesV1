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
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
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
invokeTag('formatDate','g',139,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
createClosureForHtmlPart(23, 2)
invokeTag('form','g',199,['controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(31)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(33)
if(true && (clientCount > 0)) {
printHtmlPart(34)
}
printHtmlPart(35)
expressionOut.print(searchQueryHidden)
printHtmlPart(36)
expressionOut.print(offset)
printHtmlPart(37)
expressionOut.print(clientCount)
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
invokeTag('actionSubmit','g',281,['action':("dashboard"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(40)
})
invokeTag('form','g',285,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(41)
if(true && (contacts || offset > 0)) {
printHtmlPart(42)
if(true && (contacts != 'NONE')) {
printHtmlPart(43)
for( _it1247338729 in (contacts) ) {
changeItVariable(_it1247338729)
printHtmlPart(44)
expressionOut.print(it.firstName)
printHtmlPart(14)
expressionOut.print(it.lastName)
printHtmlPart(45)
expressionOut.print(it.contactID)
printHtmlPart(46)
expressionOut.print(it.firstName)
printHtmlPart(14)
expressionOut.print(it.lastName)
printHtmlPart(47)
expressionOut.print(it.phoneNumber)
printHtmlPart(48)
if(true && (it.city)) {
printHtmlPart(49)
expressionOut.print(it.city,)
printHtmlPart(50)
expressionOut.print(it.state)
printHtmlPart(51)
}
else {
printHtmlPart(52)
}
printHtmlPart(53)
}
printHtmlPart(54)
}
else {
printHtmlPart(55)
}
printHtmlPart(56)
}
else {
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(58)
}
printHtmlPart(59)
createClosureForHtmlPart(60, 2)
invokeTag('link','g',358,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],2)
printHtmlPart(61)
createClosureForHtmlPart(62, 2)
invokeTag('link','g',359,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],2)
printHtmlPart(63)
expressionOut.print(currentPage)
printHtmlPart(64)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(65)
for( _it244090091 in (contacts) ) {
changeItVariable(_it244090091)
printHtmlPart(66)
expressionOut.print(it.contactID)
printHtmlPart(67)
expressionOut.print(it.firstName)
printHtmlPart(14)
expressionOut.print(it.lastName)
printHtmlPart(68)
createClosureForHtmlPart(69, 4)
invokeTag('link','g',465,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(70)
createClosureForHtmlPart(71, 4)
invokeTag('link','g',472,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(72)
createClosureForHtmlPart(73, 4)
invokeTag('link','g',476,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(74)
}
printHtmlPart(75)
}
printHtmlPart(76)
invokeTag('javascript','g',496,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(77)
invokeTag('javascript','g',499,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(78)
invokeTag('javascript','g',502,['src':("dashboard/app.min.js")],-1)
printHtmlPart(79)
})
invokeTag('captureBody','sitemesh',510,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(80)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1457891978988L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
