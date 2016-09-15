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
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'fcontent':("IE=edge")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',14,['gsp_sm_xmlClosingForEmptyTag':(""),'content':("width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"),'name':("viewport")],-1)
printHtmlPart(5)
invokeTag('resource','g',16,['dir':("css"),'file':("dashboard/bootstrap/css/bootstrap.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',23,['dir':("css"),'file':("dashboard/AdminLTE.min.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',24,['dir':("css"),'file':("dashboard/CustomCSS.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',29,['dir':("css"),'file':("dashboard/skins/skin-purple.min.css")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',36,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(12)
expressionOut.print(notiCount)
printHtmlPart(13)
if(true && (keywordsIn != 'NONE')) {
printHtmlPart(14)
for( _it243821743 in (keywordsIn) ) {
changeItVariable(_it243821743)
printHtmlPart(15)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(16)
expressionOut.print(it.keyword)
printHtmlPart(17)
expressionOut.print(it.phoneNumber)
printHtmlPart(18)
invokeTag('formatDate','g',70,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(19)
}
printHtmlPart(20)
}
else {
printHtmlPart(21)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(22)
}
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'dashboard'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'tips'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'help'))
printHtmlPart(27)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(28)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(29)
expressionOut.print(session.firstName)
printHtmlPart(30)
expressionOut.print(session.lastName)
printHtmlPart(31)
invokeTag('formatDate','g',123,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(32)
expressionOut.print(createLink(controller: 'login', action: 'accountSettings'))
printHtmlPart(33)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(34)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(35)
expressionOut.print(session.firstName)
printHtmlPart(30)
expressionOut.print(session.lastName)
printHtmlPart(36)
createClosureForHtmlPart(37, 2)
invokeTag('form','g',164,['controller':("Dashboard"),'action':("contacts"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(38)
expressionOut.print(createLink(controller: 'Dashboard', action: 'Dashboard'))
printHtmlPart(39)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(40)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(41)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(42)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(44)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newDraft'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
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
printHtmlPart(20)
if(true && (contacts != 'NONE')) {
printHtmlPart(14)
for( _it30770683 in (contacts) ) {
changeItVariable(_it30770683)
printHtmlPart(65)
expressionOut.print(it.contactID)
printHtmlPart(66)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(67)
expressionOut.print(it.phoneNumber)
printHtmlPart(68)
if(true && (it.city)) {
printHtmlPart(69)
expressionOut.print(it.city,)
printHtmlPart(70)
expressionOut.print(it.state)
printHtmlPart(68)
}
else {
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (it.subbed =! 'false')) {
printHtmlPart(73)
}
else {
printHtmlPart(74)
}
printHtmlPart(75)
}
printHtmlPart(20)
}
else {
printHtmlPart(14)
if(true && (isSearch)) {
printHtmlPart(76)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(77)
}
else {
printHtmlPart(78)
}
printHtmlPart(20)
}
printHtmlPart(79)
}
else {
printHtmlPart(20)
if(true && (isSearch)) {
printHtmlPart(80)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(81)
}
else {
printHtmlPart(80)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(82)
}
printHtmlPart(79)
}
printHtmlPart(83)
if(true && (offset > 0)) {
printHtmlPart(84)
createClosureForHtmlPart(85, 3)
invokeTag('link','g',409,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(86)
}
else {
printHtmlPart(87)
}
printHtmlPart(86)
if(true && (offset <= clientCount)) {
printHtmlPart(84)
createClosureForHtmlPart(88, 3)
invokeTag('link','g',415,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(86)
}
else {
printHtmlPart(89)
}
printHtmlPart(90)
expressionOut.print(currentPage)
printHtmlPart(91)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(92)
for( _it411362929 in (contacts) ) {
changeItVariable(_it411362929)
printHtmlPart(93)
expressionOut.print(it.contactID)
printHtmlPart(94)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(95)
createClosureForHtmlPart(96, 4)
invokeTag('link','g',453,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(97)
createClosureForHtmlPart(98, 4)
invokeTag('link','g',455,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(99)
createClosureForHtmlPart(100, 4)
invokeTag('link','g',456,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(99)
createClosureForHtmlPart(101, 4)
invokeTag('link','g',457,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(102)
}
printHtmlPart(1)
}
printHtmlPart(103)
invokeTag('javascript','g',472,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(104)
invokeTag('javascript','g',474,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(105)
invokeTag('javascript','g',476,['src':("dashboard/app.min.js")],-1)
printHtmlPart(106)
})
invokeTag('captureBody','sitemesh',477,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(107)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473734033687L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
