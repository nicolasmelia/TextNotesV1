import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_contacts_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_contacts.gsp" }
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
for( _it676089602 in (keywordsIn) ) {
changeItVariable(_it676089602)
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
if(true && (clientCount == 0)) {
printHtmlPart(55)
}
printHtmlPart(56)
expressionOut.print(searchQueryHidden)
printHtmlPart(57)
expressionOut.print(offset)
printHtmlPart(58)
expressionOut.print(clientCount)
printHtmlPart(59)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(60)
createTagBody(2, {->
printHtmlPart(61)
invokeTag('actionSubmit','g',271,['action':("contacts"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(62)
})
invokeTag('form','g',275,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(63)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (contacts != 'NONE')) {
printHtmlPart(14)
for( _it1889365477 in (contacts) ) {
changeItVariable(_it1889365477)
printHtmlPart(64)
expressionOut.print(it.contactID)
printHtmlPart(65)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(66)
expressionOut.print(it.phoneNumber)
printHtmlPart(67)
if(true && (it.city)) {
printHtmlPart(68)
expressionOut.print(it.city,)
printHtmlPart(69)
expressionOut.print(it.state)
printHtmlPart(67)
}
else {
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (it.subbed =! 'false')) {
printHtmlPart(72)
}
else {
printHtmlPart(73)
}
printHtmlPart(74)
}
printHtmlPart(20)
}
else {
printHtmlPart(14)
if(true && (isSearch)) {
printHtmlPart(75)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(76)
}
else {
printHtmlPart(77)
}
printHtmlPart(20)
}
printHtmlPart(78)
}
else {
printHtmlPart(20)
if(true && (isSearch)) {
printHtmlPart(79)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(80)
}
else {
printHtmlPart(79)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(81)
}
printHtmlPart(78)
}
printHtmlPart(82)
if(true && (offset > 0)) {
printHtmlPart(83)
createClosureForHtmlPart(84, 3)
invokeTag('link','g',361,['action':("contacts"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(85)
}
else {
printHtmlPart(86)
}
printHtmlPart(85)
if(true && (offset <= clientCount)) {
printHtmlPart(83)
createClosureForHtmlPart(87, 3)
invokeTag('link','g',367,['action':("contacts"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(85)
}
else {
printHtmlPart(88)
}
printHtmlPart(89)
expressionOut.print(currentPage)
printHtmlPart(90)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(91)
for( _it1374896517 in (contacts) ) {
changeItVariable(_it1374896517)
printHtmlPart(92)
expressionOut.print(it.contactID)
printHtmlPart(93)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(94)
createClosureForHtmlPart(95, 4)
invokeTag('link','g',467,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('link','g',469,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(98)
createClosureForHtmlPart(99, 4)
invokeTag('link','g',470,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(98)
createClosureForHtmlPart(100, 4)
invokeTag('link','g',471,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(101)
}
printHtmlPart(1)
}
printHtmlPart(102)
invokeTag('javascript','g',486,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(103)
invokeTag('javascript','g',488,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(104)
invokeTag('javascript','g',490,['src':("dashboard/app.min.js")],-1)
printHtmlPart(105)
})
invokeTag('captureBody','sitemesh',495,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(106)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473111313940L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
