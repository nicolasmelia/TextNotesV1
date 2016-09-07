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
invokeTag('resource','g',22,['dir':("css"),'file':("dashboard/AdminLTE.min.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',23,['dir':("css"),'file':("dashboard/CustomCSS.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',28,['dir':("css"),'file':("dashboard/skins/skin-purple.min.css")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',35,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(12)
expressionOut.print(notiCount)
printHtmlPart(13)
if(true && (keywordsIn != 'NONE')) {
printHtmlPart(14)
for( _it166868847 in (keywordsIn) ) {
changeItVariable(_it166868847)
printHtmlPart(15)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(16)
expressionOut.print(it.keyword)
printHtmlPart(17)
expressionOut.print(it.phoneNumber)
printHtmlPart(18)
invokeTag('formatDate','g',69,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
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
invokeTag('formatDate','g',122,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
invokeTag('form','g',163,['controller':("Dashboard"),'action':("contacts"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(49)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(54)
if(true && (groupCount == 0)) {
printHtmlPart(55)
}
printHtmlPart(56)
expressionOut.print(searchQueryHidden)
printHtmlPart(57)
expressionOut.print(offset)
printHtmlPart(58)
expressionOut.print(groupCount)
printHtmlPart(59)
if(true && (addToGroup)) {
printHtmlPart(60)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(61)
}
printHtmlPart(62)
if(true && (groupCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (history != 'NONE')) {
printHtmlPart(14)
for( _it389749489 in (history) ) {
changeItVariable(_it389749489)
printHtmlPart(63)
if(true && (it.type == 'Coupon Code')) {
printHtmlPart(64)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID, showNumber : true]))
printHtmlPart(65)
}
else if(true && (it.type == 'Message')) {
printHtmlPart(64)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: it.type, messageID: it.hashOne]))
printHtmlPart(65)
}
else {
printHtmlPart(64)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID]))
printHtmlPart(65)
}
printHtmlPart(66)
expressionOut.print(it.type)
printHtmlPart(67)
if(true && (it.description)) {
printHtmlPart(68)
expressionOut.print(it.description)
printHtmlPart(67)
}
else {
printHtmlPart(69)
}
printHtmlPart(70)
invokeTag('formatDate','g',302,['format':("MM-dd-yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(71)
}
printHtmlPart(20)
}
else {
printHtmlPart(72)
}
printHtmlPart(73)
}
else {
printHtmlPart(74)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(75)
}
printHtmlPart(76)
if(true && (offset > 0)) {
printHtmlPart(77)
createClosureForHtmlPart(78, 3)
invokeTag('link','g',332,['action':("history"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(79)
}
else {
printHtmlPart(80)
}
printHtmlPart(79)
if(true && (offset <= groupCount)) {
printHtmlPart(77)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',338,['action':("history"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(79)
}
else {
printHtmlPart(82)
}
printHtmlPart(83)
expressionOut.print(currentPage)
printHtmlPart(84)
if(true && (addToGroup)) {
printHtmlPart(85)
for( _it1246891781 in (history) ) {
changeItVariable(_it1246891781)
printHtmlPart(86)
expressionOut.print(it.groupID)
printHtmlPart(87)
expressionOut.print(it.groupName)
printHtmlPart(88)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(89)
expressionOut.print(it.groupName)
printHtmlPart(90)
createClosureForHtmlPart(91, 4)
invokeTag('link','g',440,['action':("addToGroup"),'params':([contactID: contactGroupAdd.contactID, groupID: it.groupID]),'type':("button"),'class':("btn btn-primary pull-left")],4)
printHtmlPart(92)
}
printHtmlPart(1)
}
printHtmlPart(93)
invokeTag('javascript','g',453,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(94)
invokeTag('javascript','g',455,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(95)
invokeTag('javascript','g',457,['src':("dashboard/app.min.js")],-1)
printHtmlPart(96)
})
invokeTag('captureBody','sitemesh',462,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(97)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473211717474L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
