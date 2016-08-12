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
if(true && (keywordsIn != 'NONE')) {
printHtmlPart(12)
for( _it1274699449 in (keywordsIn) ) {
changeItVariable(_it1274699449)
printHtmlPart(13)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(14)
expressionOut.print(it.keyword)
printHtmlPart(15)
expressionOut.print(it.phoneNumber)
printHtmlPart(16)
invokeTag('formatDate','g',86,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(17)
}
printHtmlPart(18)
}
else {
printHtmlPart(19)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(20)
}
printHtmlPart(21)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(22)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(23)
expressionOut.print(session.firstName)
printHtmlPart(24)
expressionOut.print(session.lastName)
printHtmlPart(25)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(26)
expressionOut.print(session.firstName)
printHtmlPart(24)
expressionOut.print(session.lastName)
printHtmlPart(27)
invokeTag('formatDate','g',122,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(30)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(31)
expressionOut.print(session.firstName)
printHtmlPart(24)
expressionOut.print(session.lastName)
printHtmlPart(32)
createClosureForHtmlPart(33, 2)
invokeTag('form','g',182,['controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(34)
expressionOut.print(createLink(controller: 'Dashboard', action: 'Dashboard'))
printHtmlPart(35)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(36)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(37)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(38)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(39)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(40)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(41)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(42)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(44)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(49)
if(true && (clientCount == 0)) {
printHtmlPart(50)
}
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(55)
expressionOut.print(searchQueryHidden)
printHtmlPart(56)
expressionOut.print(offset)
printHtmlPart(57)
expressionOut.print(clientCount)
printHtmlPart(58)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(59)
if(true && (contacts != 'NONE')) {
printHtmlPart(60)
for( _it707492405 in (contacts) ) {
changeItVariable(_it707492405)
printHtmlPart(61)
expressionOut.print(it.contactID)
printHtmlPart(62)
expressionOut.print(it.firstName)
printHtmlPart(24)
expressionOut.print(it.lastName)
printHtmlPart(63)
expressionOut.print(it.phoneNumber)
printHtmlPart(64)
if(true && (it.city)) {
printHtmlPart(65)
expressionOut.print(it.city,)
printHtmlPart(66)
expressionOut.print(it.state)
printHtmlPart(67)
}
else {
printHtmlPart(68)
}
printHtmlPart(69)
if(true && (it.subbed =! 'false')) {
printHtmlPart(70)
}
else {
printHtmlPart(71)
}
printHtmlPart(72)
}
printHtmlPart(73)
}
else {
printHtmlPart(74)
if(true && (isSearch)) {
printHtmlPart(75)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(76)
}
else {
printHtmlPart(77)
}
printHtmlPart(78)
}
printHtmlPart(79)
}
else {
printHtmlPart(80)
if(true && (isSearch)) {
printHtmlPart(75)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(76)
}
else {
printHtmlPart(75)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(81)
}
printHtmlPart(82)
}
printHtmlPart(83)
if(true && (offset > 0)) {
printHtmlPart(84)
createClosureForHtmlPart(85, 3)
invokeTag('link','g',459,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(86)
}
else {
printHtmlPart(87)
}
printHtmlPart(88)
if(true && (offset <= clientCount)) {
printHtmlPart(89)
createClosureForHtmlPart(90, 3)
invokeTag('link','g',466,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(91)
}
else {
printHtmlPart(92)
}
printHtmlPart(93)
expressionOut.print(currentPage)
printHtmlPart(94)
if(true && (history != 'NONE')) {
printHtmlPart(95)
for( _it1477996447 in (history) ) {
changeItVariable(_it1477996447)
printHtmlPart(96)
if(true && (it.type != 'Message')) {
printHtmlPart(97)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID]))
printHtmlPart(98)
}
else {
printHtmlPart(99)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: it.type, messageID: it.hashOne]))
printHtmlPart(98)
}
printHtmlPart(100)
invokeTag('formatDate','g',525,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(101)
expressionOut.print(it.description)
printHtmlPart(102)
}
printHtmlPart(103)
}
else {
printHtmlPart(104)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(105)
}
printHtmlPart(106)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(107)
for( _it103788407 in (contacts) ) {
changeItVariable(_it103788407)
printHtmlPart(108)
expressionOut.print(it.contactID)
printHtmlPart(109)
expressionOut.print(it.firstName)
printHtmlPart(24)
expressionOut.print(it.lastName)
printHtmlPart(110)
createClosureForHtmlPart(111, 4)
invokeTag('link','g',589,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(112)
createClosureForHtmlPart(113, 4)
invokeTag('link','g',596,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(114)
createClosureForHtmlPart(115, 4)
invokeTag('link','g',600,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(116)
createClosureForHtmlPart(117, 4)
invokeTag('link','g',605,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(118)
}
printHtmlPart(119)
}
printHtmlPart(120)
invokeTag('javascript','g',622,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(121)
invokeTag('javascript','g',625,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(122)
invokeTag('javascript','g',628,['src':("dashboard/app.min.js")],-1)
printHtmlPart(123)
})
invokeTag('captureBody','sitemesh',636,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(124)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1470961937311L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
