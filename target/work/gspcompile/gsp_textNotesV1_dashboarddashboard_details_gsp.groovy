import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_details_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_details.gsp" }
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
for( _it1374896517 in (keywordsIn) ) {
changeItVariable(_it1374896517)
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
if(true && (conType == 'Contact')) {
printHtmlPart(55)
expressionOut.print(contact.fullName)
printHtmlPart(56)
expressionOut.print(contact.phoneNumber)
printHtmlPart(57)
if(true && (State != 'None')) {
printHtmlPart(58)
expressionOut.print(contact.address)
printHtmlPart(59)
expressionOut.print(contact.city)
printHtmlPart(60)
expressionOut.print(contact.state)
printHtmlPart(61)
expressionOut.print(contact.zip)
printHtmlPart(62)
}
else {
printHtmlPart(63)
}
printHtmlPart(64)
if(true && (contact.subbed =! 'false')) {
printHtmlPart(65)
}
else {
printHtmlPart(66)
}
printHtmlPart(67)
createClosureForHtmlPart(68, 3)
invokeTag('link','g',321,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(64)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',322,['class':("btn btn-default"),'action':("editContact"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (conType == 'Message')) {
printHtmlPart(72)
invokeTag('formatDate','g',329,['format':("MM-dd-yyyy"),'date':(message.lastSentDate)],-1)
printHtmlPart(73)
expressionOut.print(message.title)
printHtmlPart(74)
expressionOut.print(message.message)
printHtmlPart(75)
expressionOut.print(message.recipientsParsed)
printHtmlPart(76)
invokeTag('formatDate','g',346,['format':("MM-dd-yyyy, hh:mm a"),'date':(message.lastSentDate)],-1)
printHtmlPart(77)
expressionOut.print(contactCount)
printHtmlPart(78)
createClosureForHtmlPart(79, 3)
invokeTag('link','g',354,['class':("btn btn-default"),'action':("sendTxt"),'params':([]),'type':("button")],3)
printHtmlPart(64)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',355,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (conType == 'History')) {
printHtmlPart(81)
expressionOut.print(history.type)
printHtmlPart(57)
if(true && (showNumber == true)) {
printHtmlPart(82)
expressionOut.print(hist.phoneNumber)
printHtmlPart(62)
}
printHtmlPart(83)
expressionOut.print(history.description)
printHtmlPart(84)
invokeTag('formatDate','g',381,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(85)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',386,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (conType == 'Coupon Code')) {
printHtmlPart(86)
expressionOut.print(hist.type)
printHtmlPart(87)
expressionOut.print(hist.description)
printHtmlPart(88)
expressionOut.print(hist.phoneNumber)
printHtmlPart(84)
invokeTag('formatDate','g',413,['format':("MM-dd-yyyy hh:mm a"),'date':(hist.date)],-1)
printHtmlPart(85)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',418,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(64)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',419,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (conType == 'Coupon Code Used')) {
printHtmlPart(90)
invokeTag('formatDate','g',429,['format':("MM-dd-yyyy"),'date':(coupon.dateRedeemed)],-1)
printHtmlPart(91)
expressionOut.print(coupon.phoneNumber)
printHtmlPart(92)
createClosureForHtmlPart(93, 3)
invokeTag('link','g',431,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(64)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',432,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (conType == 'keyword')) {
printHtmlPart(94)
expressionOut.print(keyword.keyword)
printHtmlPart(95)
if(true && (keyword.winners != null)) {
printHtmlPart(96)
}
else if(true && (keyword.suspened)) {
printHtmlPart(97)
}
printHtmlPart(98)
expressionOut.print(keyword.keyword)
printHtmlPart(99)
expressionOut.print(number.number)
printHtmlPart(100)
if(true && (!keyword.description)) {
printHtmlPart(101)
}
else {
printHtmlPart(102)
expressionOut.print(keyword.description)
printHtmlPart(103)
}
printHtmlPart(104)
invokeTag('formatDate','g',471,['format':("MM-dd-yyyy"),'date':(keyword.dateEff)],-1)
printHtmlPart(105)
if(true && (keyword.endless)) {
printHtmlPart(106)
}
else {
printHtmlPart(20)
invokeTag('formatDate','g',474,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
}
printHtmlPart(107)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(108)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(109)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(110)
}
else {
printHtmlPart(111)
}
printHtmlPart(112)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(113)
if(true && (keyword.winners == null)) {
printHtmlPart(114)
}
else {
printHtmlPart(115)
expressionOut.print(keyword.winners)
printHtmlPart(116)
}
printHtmlPart(117)
}
printHtmlPart(118)
expressionOut.print(keyword.responceText)
printHtmlPart(119)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(120)
}
else {
printHtmlPart(121)
}
printHtmlPart(122)
invokeTag('formatDate','g',512,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(123)
expressionOut.print(keyword.replys)
printHtmlPart(78)
if(true && (keyword.winners == null)) {
printHtmlPart(124)
if(true && (keyword.suspened)) {
printHtmlPart(125)
}
else {
printHtmlPart(126)
}
printHtmlPart(64)
}
printHtmlPart(64)
createClosureForHtmlPart(127, 3)
invokeTag('link','g',531,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(128)
createClosureForHtmlPart(129, 3)
invokeTag('link','g',549,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(130)
createClosureForHtmlPart(131, 3)
invokeTag('link','g',572,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(132)
}
printHtmlPart(133)
invokeTag('javascript','g',663,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(134)
invokeTag('javascript','g',665,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(135)
invokeTag('javascript','g',667,['src':("dashboard/app.min.js")],-1)
printHtmlPart(136)
})
invokeTag('captureBody','sitemesh',694,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(137)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473213319265L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
