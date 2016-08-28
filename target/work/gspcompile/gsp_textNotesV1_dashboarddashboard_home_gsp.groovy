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
expressionOut.print(notiCount)
printHtmlPart(12)
if(true && (keywordsIn != 'NONE')) {
printHtmlPart(13)
for( _it1317731757 in (keywordsIn) ) {
changeItVariable(_it1317731757)
printHtmlPart(14)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(15)
expressionOut.print(it.keyword)
printHtmlPart(16)
expressionOut.print(it.phoneNumber)
printHtmlPart(17)
invokeTag('formatDate','g',87,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(18)
}
printHtmlPart(19)
}
else {
printHtmlPart(20)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(21)
}
printHtmlPart(22)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(23)
expressionOut.print(createLink(controller: 'dashboard'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'tips'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'help'))
printHtmlPart(26)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(27)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(28)
expressionOut.print(session.firstName)
printHtmlPart(29)
expressionOut.print(session.lastName)
printHtmlPart(30)
invokeTag('formatDate','g',163,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(31)
expressionOut.print(createLink(controller: 'login', action: 'userSettings'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(33)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(34)
expressionOut.print(session.firstName)
printHtmlPart(29)
expressionOut.print(session.lastName)
printHtmlPart(35)
createClosureForHtmlPart(36, 2)
invokeTag('form','g',212,['controller':("Dashboard"),'action':("contacts"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(37)
expressionOut.print(createLink(controller: 'Dashboard', action: 'Dashboard'))
printHtmlPart(38)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(39)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(40)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(41)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(42)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(44)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'tips'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(49)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'account'))
printHtmlPart(55)
if(true && (clientCount == 0)) {
printHtmlPart(56)
}
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(59)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(61)
expressionOut.print(searchQueryHidden)
printHtmlPart(62)
expressionOut.print(offset)
printHtmlPart(63)
expressionOut.print(clientCount)
printHtmlPart(64)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(65)
if(true && (contacts != 'NONE')) {
printHtmlPart(66)
for( _it127635147 in (contacts) ) {
changeItVariable(_it127635147)
printHtmlPart(67)
expressionOut.print(it.contactID)
printHtmlPart(68)
expressionOut.print(it.firstName)
printHtmlPart(29)
expressionOut.print(it.lastName)
printHtmlPart(69)
expressionOut.print(it.phoneNumber)
printHtmlPart(70)
if(true && (it.city)) {
printHtmlPart(71)
expressionOut.print(it.city,)
printHtmlPart(72)
expressionOut.print(it.state)
printHtmlPart(73)
}
else {
printHtmlPart(74)
}
printHtmlPart(75)
if(true && (it.subbed =! 'false')) {
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
printHtmlPart(81)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(82)
}
else {
printHtmlPart(83)
}
printHtmlPart(84)
}
printHtmlPart(85)
}
else {
printHtmlPart(86)
if(true && (isSearch)) {
printHtmlPart(81)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(82)
}
else {
printHtmlPart(81)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(87)
}
printHtmlPart(88)
}
printHtmlPart(89)
if(true && (offset > 0)) {
printHtmlPart(90)
createClosureForHtmlPart(91, 3)
invokeTag('link','g',507,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(92)
}
else {
printHtmlPart(93)
}
printHtmlPart(94)
if(true && (offset <= clientCount)) {
printHtmlPart(95)
createClosureForHtmlPart(96, 3)
invokeTag('link','g',514,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(97)
}
else {
printHtmlPart(98)
}
printHtmlPart(99)
expressionOut.print(currentPage)
printHtmlPart(100)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(101)
for( _it925037469 in (contacts) ) {
changeItVariable(_it925037469)
printHtmlPart(102)
expressionOut.print(it.contactID)
printHtmlPart(103)
expressionOut.print(it.firstName)
printHtmlPart(29)
expressionOut.print(it.lastName)
printHtmlPart(104)
createClosureForHtmlPart(105, 4)
invokeTag('link','g',564,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(106)
createClosureForHtmlPart(107, 4)
invokeTag('link','g',571,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(108)
createClosureForHtmlPart(109, 4)
invokeTag('link','g',575,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(110)
createClosureForHtmlPart(111, 4)
invokeTag('link','g',580,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(112)
}
printHtmlPart(113)
}
printHtmlPart(114)
invokeTag('javascript','g',597,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(115)
invokeTag('javascript','g',600,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(116)
invokeTag('javascript','g',603,['src':("dashboard/app.min.js")],-1)
printHtmlPart(117)
})
invokeTag('captureBody','sitemesh',611,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(118)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1472346453259L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
