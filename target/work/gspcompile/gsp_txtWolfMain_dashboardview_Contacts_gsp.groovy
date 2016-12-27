import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_txtWolfMain_dashboardview_Contacts_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/view_Contacts.gsp" }
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
for( _it79044247 in (keywordsIn) ) {
changeItVariable(_it79044247)
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
expressionOut.print(createLink(controller: 'Blog'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'dashboard', action: 'help'))
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
expressionOut.print(createLink(controller: 'dashboard', action: 'accountSettings'))
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'newDraft'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'drafts'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(49)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(55)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(56)
if(true && (clientCount == 0)) {
printHtmlPart(57)
}
printHtmlPart(58)
expressionOut.print(searchQueryHidden)
printHtmlPart(59)
expressionOut.print(offset)
printHtmlPart(60)
expressionOut.print(clientCount)
printHtmlPart(61)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(62)
createTagBody(2, {->
printHtmlPart(63)
invokeTag('actionSubmit','g',275,['action':("contacts"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(64)
})
invokeTag('form','g',279,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(65)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (contacts != 'NONE')) {
printHtmlPart(14)
for( _it298939230 in (contacts) ) {
changeItVariable(_it298939230)
printHtmlPart(66)
expressionOut.print(it.contactID)
printHtmlPart(67)
if(true && (it.firstName == 'Unknown')) {
printHtmlPart(68)
expressionOut.print(it.firstName)
printHtmlPart(69)
}
else {
printHtmlPart(68)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(70)
}
printHtmlPart(71)
expressionOut.print(it.phoneNumber)
printHtmlPart(72)
if(true && (it.city)) {
printHtmlPart(73)
expressionOut.print(it.city,)
printHtmlPart(74)
expressionOut.print(it.state)
printHtmlPart(72)
}
else {
printHtmlPart(75)
}
printHtmlPart(76)
if(true && (it.subbed.toBoolean())) {
printHtmlPart(77)
}
else {
printHtmlPart(78)
}
printHtmlPart(79)
}
printHtmlPart(20)
}
else {
printHtmlPart(14)
if(true && (isSearch)) {
printHtmlPart(80)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(81)
}
else {
printHtmlPart(82)
}
printHtmlPart(20)
}
printHtmlPart(83)
}
else {
printHtmlPart(20)
if(true && (isSearch)) {
printHtmlPart(84)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(85)
}
else {
printHtmlPart(84)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(86)
}
printHtmlPart(83)
}
printHtmlPart(87)
if(true && (offset > 0)) {
printHtmlPart(88)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',368,['action':("contacts"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(90)
}
else {
printHtmlPart(91)
}
printHtmlPart(90)
if(true && (offset <= clientCount)) {
printHtmlPart(88)
createClosureForHtmlPart(92, 3)
invokeTag('link','g',374,['action':("contacts"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(90)
}
else {
printHtmlPart(93)
}
printHtmlPart(94)
expressionOut.print(currentPage)
printHtmlPart(95)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(96)
for( _it822619898 in (contacts) ) {
changeItVariable(_it822619898)
printHtmlPart(97)
expressionOut.print(it.contactID)
printHtmlPart(98)
if(true && (it.firstName == 'Unknown')) {
printHtmlPart(90)
expressionOut.print(it.firstName)
printHtmlPart(99)
}
else {
printHtmlPart(99)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(99)
}
printHtmlPart(100)
createClosureForHtmlPart(101, 4)
invokeTag('link','g',420,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(102)
createClosureForHtmlPart(103, 4)
invokeTag('link','g',422,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(99)
createClosureForHtmlPart(104, 4)
invokeTag('link','g',423,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(99)
createClosureForHtmlPart(105, 4)
invokeTag('link','g',424,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(106)
}
printHtmlPart(1)
}
printHtmlPart(107)
invokeTag('javascript','g',439,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(108)
invokeTag('javascript','g',441,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(109)
invokeTag('javascript','g',443,['src':("dashboard/app.min.js")],-1)
printHtmlPart(110)
})
invokeTag('captureBody','sitemesh',448,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(111)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1482794380011L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
