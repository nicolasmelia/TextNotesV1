import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboardhome_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/home.gsp" }
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
for( _it303354428 in (keywordsIn) ) {
changeItVariable(_it303354428)
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
invokeTag('formatDate','g',123,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(59)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(61)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(62)
expressionOut.print(searchQueryHidden)
printHtmlPart(63)
expressionOut.print(offset)
printHtmlPart(64)
expressionOut.print(clientCount)
printHtmlPart(65)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (contacts != 'NONE')) {
printHtmlPart(14)
for( _it1096296601 in (contacts) ) {
changeItVariable(_it1096296601)
printHtmlPart(66)
expressionOut.print(it.contactID)
printHtmlPart(67)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(68)
expressionOut.print(it.phoneNumber)
printHtmlPart(69)
if(true && (it.city)) {
printHtmlPart(70)
expressionOut.print(it.city,)
printHtmlPart(71)
expressionOut.print(it.state)
printHtmlPart(69)
}
else {
printHtmlPart(72)
}
printHtmlPart(73)
if(true && (it.subbed =! 'false')) {
printHtmlPart(74)
}
else {
printHtmlPart(75)
}
printHtmlPart(76)
}
printHtmlPart(20)
}
else {
printHtmlPart(14)
if(true && (isSearch)) {
printHtmlPart(77)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(78)
}
else {
printHtmlPart(79)
}
printHtmlPart(20)
}
printHtmlPart(80)
}
else {
printHtmlPart(20)
if(true && (isSearch)) {
printHtmlPart(81)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(82)
}
else {
printHtmlPart(81)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(83)
}
printHtmlPart(80)
}
printHtmlPart(84)
if(true && (offset > 0)) {
printHtmlPart(85)
createClosureForHtmlPart(86, 3)
invokeTag('link','g',411,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(87)
}
else {
printHtmlPart(88)
}
printHtmlPart(87)
if(true && (offset <= clientCount)) {
printHtmlPart(85)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',417,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(87)
}
else {
printHtmlPart(90)
}
printHtmlPart(91)
expressionOut.print(currentPage)
printHtmlPart(92)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(93)
for( _it1498944673 in (contacts) ) {
changeItVariable(_it1498944673)
printHtmlPart(94)
expressionOut.print(it.contactID)
printHtmlPart(95)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(96)
createClosureForHtmlPart(97, 4)
invokeTag('link','g',455,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(98)
createClosureForHtmlPart(99, 4)
invokeTag('link','g',457,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(100)
createClosureForHtmlPart(101, 4)
invokeTag('link','g',458,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(100)
createClosureForHtmlPart(102, 4)
invokeTag('link','g',459,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(103)
}
printHtmlPart(1)
}
printHtmlPart(104)
invokeTag('javascript','g',474,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(105)
invokeTag('javascript','g',476,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(106)
invokeTag('javascript','g',478,['src':("dashboard/app.min.js")],-1)
printHtmlPart(107)
})
invokeTag('captureBody','sitemesh',479,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(108)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479771758474L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
