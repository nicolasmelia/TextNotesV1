import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_history_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_history.gsp" }
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
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
if(true && (addToGroup)) {
printHtmlPart(34)
}
else {
printHtmlPart(35)
}
printHtmlPart(36)
if(true && (addToGroup)) {
printHtmlPart(37)
}
else {
printHtmlPart(38)
}
printHtmlPart(39)
if(true && (groupCount == 0)) {
printHtmlPart(40)
}
printHtmlPart(41)
expressionOut.print(searchQueryHidden)
printHtmlPart(42)
expressionOut.print(offset)
printHtmlPart(43)
expressionOut.print(groupCount)
printHtmlPart(44)
if(true && (addToGroup)) {
printHtmlPart(45)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(46)
}
printHtmlPart(47)
if(true && (groupCount > 0 || offset > 0)) {
printHtmlPart(48)
if(true && (history != 'NONE')) {
printHtmlPart(49)
for( _it1330981538 in (history) ) {
changeItVariable(_it1330981538)
printHtmlPart(50)
if(true && (it.type != 'Message')) {
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID]))
printHtmlPart(52)
}
else {
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: it.type, messageID: it.hashOne]))
printHtmlPart(52)
}
printHtmlPart(53)
expressionOut.print(it.type)
printHtmlPart(54)
if(true && (it.description)) {
printHtmlPart(55)
expressionOut.print(it.description)
printHtmlPart(56)
}
else {
printHtmlPart(57)
}
printHtmlPart(58)
invokeTag('formatDate','g',329,['format':("MM-dd-yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(59)
}
printHtmlPart(60)
}
else {
printHtmlPart(61)
}
printHtmlPart(62)
}
else {
printHtmlPart(63)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (offset > 0)) {
printHtmlPart(66)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',371,['action':("history"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(68)
}
else {
printHtmlPart(69)
}
printHtmlPart(70)
if(true && (offset <= groupCount)) {
printHtmlPart(71)
createClosureForHtmlPart(72, 3)
invokeTag('link','g',378,['action':("history"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(73)
}
else {
printHtmlPart(74)
}
printHtmlPart(75)
expressionOut.print(currentPage)
printHtmlPart(76)
if(true && (addToGroup)) {
printHtmlPart(77)
for( _it1016064173 in (history) ) {
changeItVariable(_it1016064173)
printHtmlPart(78)
expressionOut.print(it.groupID)
printHtmlPart(79)
expressionOut.print(it.groupName)
printHtmlPart(80)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(81)
expressionOut.print(it.groupName)
printHtmlPart(82)
createClosureForHtmlPart(83, 4)
invokeTag('link','g',491,['action':("addToGroup"),'params':([contactID: contactGroupAdd.contactID, groupID: it.groupID]),'type':("button"),'class':("btn btn-primary pull-left")],4)
printHtmlPart(84)
}
printHtmlPart(85)
}
printHtmlPart(86)
invokeTag('javascript','g',504,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(87)
invokeTag('javascript','g',507,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(88)
invokeTag('javascript','g',510,['src':("dashboard/app.min.js")],-1)
printHtmlPart(89)
})
invokeTag('captureBody','sitemesh',518,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(90)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1469931135766L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
