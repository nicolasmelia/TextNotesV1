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
invokeTag('formatDate','g',108,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
invokeTag('form','g',168,['controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'Dashboard'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(31)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(33)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(34)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(35)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(36)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(37)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(38)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(39)
if(true && (clientCount == 0)) {
printHtmlPart(40)
}
printHtmlPart(41)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(42)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(44)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(45)
expressionOut.print(searchQueryHidden)
printHtmlPart(46)
expressionOut.print(offset)
printHtmlPart(47)
expressionOut.print(clientCount)
printHtmlPart(48)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(49)
if(true && (contacts != 'NONE')) {
printHtmlPart(50)
for( _it302869695 in (contacts) ) {
changeItVariable(_it302869695)
printHtmlPart(51)
expressionOut.print(it.contactID)
printHtmlPart(52)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(53)
expressionOut.print(it.phoneNumber)
printHtmlPart(54)
if(true && (it.city)) {
printHtmlPart(55)
expressionOut.print(it.city,)
printHtmlPart(56)
expressionOut.print(it.state)
printHtmlPart(57)
}
else {
printHtmlPart(58)
}
printHtmlPart(59)
if(true && (it.subbed =! 'false')) {
printHtmlPart(60)
}
else {
printHtmlPart(61)
}
printHtmlPart(62)
}
printHtmlPart(63)
}
else {
printHtmlPart(64)
if(true && (isSearch)) {
printHtmlPart(65)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(66)
}
else {
printHtmlPart(67)
}
printHtmlPart(68)
}
printHtmlPart(69)
}
else {
printHtmlPart(70)
if(true && (isSearch)) {
printHtmlPart(65)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(66)
}
else {
printHtmlPart(65)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(71)
}
printHtmlPart(72)
}
printHtmlPart(73)
if(true && (offset > 0)) {
printHtmlPart(74)
createClosureForHtmlPart(75, 3)
invokeTag('link','g',446,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(76)
}
else {
printHtmlPart(77)
}
printHtmlPart(78)
if(true && (offset <= clientCount)) {
printHtmlPart(79)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',453,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(81)
}
else {
printHtmlPart(82)
}
printHtmlPart(83)
expressionOut.print(currentPage)
printHtmlPart(84)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(85)
for( _it1880527972 in (contacts) ) {
changeItVariable(_it1880527972)
printHtmlPart(86)
expressionOut.print(it.contactID)
printHtmlPart(87)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(88)
createClosureForHtmlPart(89, 4)
invokeTag('link','g',563,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(90)
createClosureForHtmlPart(91, 4)
invokeTag('link','g',570,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(92)
createClosureForHtmlPart(93, 4)
invokeTag('link','g',574,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(94)
createClosureForHtmlPart(95, 4)
invokeTag('link','g',579,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(96)
}
printHtmlPart(97)
}
printHtmlPart(98)
invokeTag('javascript','g',596,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(99)
invokeTag('javascript','g',599,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(100)
invokeTag('javascript','g',602,['src':("dashboard/app.min.js")],-1)
printHtmlPart(101)
})
invokeTag('captureBody','sitemesh',610,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(102)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1468784645632L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
