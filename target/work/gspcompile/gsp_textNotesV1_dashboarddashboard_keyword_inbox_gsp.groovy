import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_keyword_inbox_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_keyword_inbox.gsp" }
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
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'content':("width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"),'name':("viewport")],-1)
printHtmlPart(4)
invokeTag('resource','g',18,['dir':("css"),'file':("dashboard/bootstrap/css/bootstrap.min.css")],-1)
printHtmlPart(5)
invokeTag('resource','g',30,['dir':("css"),'file':("dashboard/AdminLTE.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',33,['dir':("css"),'file':("dashboard/CustomCSS.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',40,['dir':("css"),'file':("dashboard/skins/skin-purple.min.css")],-1)
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',49,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
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
invokeTag('formatDate','g',118,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
createClosureForHtmlPart(22, 2)
invokeTag('form','g',178,['controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(31)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(33)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(34)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(35)
if(true && (clientCount == 0)) {
printHtmlPart(36)
}
printHtmlPart(37)
expressionOut.print(searchQueryHidden)
printHtmlPart(38)
expressionOut.print(offset)
printHtmlPart(39)
expressionOut.print(clientCount)
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
invokeTag('actionSubmit','g',275,['action':("keywordInbox"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(42)
})
invokeTag('form','g',279,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(43)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(44)
if(true && (messages != 'NONE')) {
printHtmlPart(45)
for( _it244090091 in (messages) ) {
changeItVariable(_it244090091)
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID]))
printHtmlPart(47)
expressionOut.print(it.keyword)
printHtmlPart(48)
expressionOut.print(it.phoneNumber)
printHtmlPart(49)
invokeTag('formatDate','g',301,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(50)
}
printHtmlPart(51)
}
else {
printHtmlPart(52)
if(true && (isSearch)) {
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(54)
}
else {
printHtmlPart(55)
}
printHtmlPart(56)
}
printHtmlPart(57)
}
else {
printHtmlPart(58)
if(true && (isSearch)) {
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(59)
}
else {
printHtmlPart(60)
}
printHtmlPart(61)
}
printHtmlPart(62)
if(true && (offset > 0)) {
printHtmlPart(63)
createClosureForHtmlPart(64, 3)
invokeTag('link','g',364,['action':("keywordInbox"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(65)
}
else {
printHtmlPart(66)
}
printHtmlPart(67)
if(true && (offset <= clientCount)) {
printHtmlPart(68)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',371,['action':("keywordInbox"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(70)
}
else {
printHtmlPart(71)
}
printHtmlPart(72)
expressionOut.print(currentPage)
printHtmlPart(73)
invokeTag('javascript','g',472,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(74)
invokeTag('javascript','g',475,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(75)
invokeTag('javascript','g',478,['src':("dashboard/app.min.js")],-1)
printHtmlPart(76)
})
invokeTag('captureBody','sitemesh',486,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(77)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1468725263857L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
