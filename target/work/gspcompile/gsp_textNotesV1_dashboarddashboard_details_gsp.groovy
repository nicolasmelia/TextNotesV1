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
for( _it1853751897 in (keywordsIn) ) {
changeItVariable(_it1853751897)
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
if(true && (State =! 'None')) {
printHtmlPart(58)
expressionOut.print(contact.address)
printHtmlPart(59)
expressionOut.print(contact.city)
printHtmlPart(60)
expressionOut.print(contact.state)
printHtmlPart(61)
expressionOut.print(contact.zip)
printHtmlPart(62)
expressionOut.print(contact.subbed)
printHtmlPart(63)
}
else {
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (contact.subbed =! 'false')) {
printHtmlPart(66)
}
else {
printHtmlPart(67)
}
printHtmlPart(68)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',325,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(65)
createClosureForHtmlPart(70, 3)
invokeTag('link','g',326,['class':("btn btn-default"),'action':("editContact"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (conType == 'Message')) {
printHtmlPart(73)
invokeTag('formatDate','g',333,['format':("MM-dd-yyyy"),'date':(message.lastSentDate)],-1)
printHtmlPart(74)
expressionOut.print(message.title)
printHtmlPart(75)
expressionOut.print(message.message)
printHtmlPart(76)
expressionOut.print(message.recipientsParsed)
printHtmlPart(77)
invokeTag('formatDate','g',350,['format':("MM-dd-yyyy, hh:mm a"),'date':(message.lastSentDate)],-1)
printHtmlPart(78)
expressionOut.print(contactCount)
printHtmlPart(79)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',358,['class':("btn btn-default"),'action':("sendTxt"),'params':([]),'type':("button")],3)
printHtmlPart(65)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',359,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (conType == 'History')) {
printHtmlPart(82)
expressionOut.print(history.type)
printHtmlPart(57)
if(true && (showNumber == true)) {
printHtmlPart(83)
expressionOut.print(hist.phoneNumber)
printHtmlPart(63)
}
printHtmlPart(84)
expressionOut.print(history.description)
printHtmlPart(85)
invokeTag('formatDate','g',385,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(86)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',390,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (conType == 'Coupon Code')) {
printHtmlPart(87)
expressionOut.print(hist.type)
printHtmlPart(88)
expressionOut.print(hist.description)
printHtmlPart(89)
expressionOut.print(hist.phoneNumber)
printHtmlPart(85)
invokeTag('formatDate','g',417,['format':("MM-dd-yyyy hh:mm a"),'date':(hist.date)],-1)
printHtmlPart(86)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',422,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(65)
createClosureForHtmlPart(90, 3)
invokeTag('link','g',423,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (conType == 'Coupon Code Used')) {
printHtmlPart(91)
invokeTag('formatDate','g',433,['format':("MM-dd-yyyy"),'date':(coupon.dateRedeemed)],-1)
printHtmlPart(92)
expressionOut.print(coupon.phoneNumber)
printHtmlPart(93)
createClosureForHtmlPart(94, 3)
invokeTag('link','g',435,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(65)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',436,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (conType == 'keyword')) {
printHtmlPart(95)
expressionOut.print(keyword.keyword)
printHtmlPart(96)
if(true && (keyword.winners != null)) {
printHtmlPart(97)
}
else if(true && (keyword.suspened)) {
printHtmlPart(98)
}
printHtmlPart(99)
expressionOut.print(keyword.keyword)
printHtmlPart(100)
expressionOut.print(number.number)
printHtmlPart(101)
if(true && (!keyword.description)) {
printHtmlPart(102)
}
else {
printHtmlPart(103)
expressionOut.print(keyword.description)
printHtmlPart(104)
}
printHtmlPart(105)
invokeTag('formatDate','g',475,['format':("MM-dd-yyyy"),'date':(keyword.dateEff)],-1)
printHtmlPart(106)
if(true && (keyword.endless)) {
printHtmlPart(107)
}
else {
printHtmlPart(20)
invokeTag('formatDate','g',478,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
}
printHtmlPart(108)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(109)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(110)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(111)
}
else {
printHtmlPart(112)
}
printHtmlPart(113)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(114)
if(true && (keyword.winners == null)) {
printHtmlPart(115)
}
else {
printHtmlPart(116)
expressionOut.print(keyword.winners)
printHtmlPart(117)
}
printHtmlPart(118)
}
printHtmlPart(119)
expressionOut.print(keyword.responceText)
printHtmlPart(120)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(121)
}
else {
printHtmlPart(122)
}
printHtmlPart(123)
invokeTag('formatDate','g',516,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(124)
expressionOut.print(keyword.replys)
printHtmlPart(79)
if(true && (keyword.winners == null)) {
printHtmlPart(125)
if(true && (keyword.suspened)) {
printHtmlPart(126)
}
else {
printHtmlPart(127)
}
printHtmlPart(65)
}
printHtmlPart(65)
createClosureForHtmlPart(128, 3)
invokeTag('link','g',535,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(129)
createClosureForHtmlPart(130, 3)
invokeTag('link','g',553,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(131)
createClosureForHtmlPart(132, 3)
invokeTag('link','g',576,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(133)
}
printHtmlPart(134)
invokeTag('javascript','g',667,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(135)
invokeTag('javascript','g',669,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(136)
invokeTag('javascript','g',671,['src':("dashboard/app.min.js")],-1)
printHtmlPart(137)
})
invokeTag('captureBody','sitemesh',698,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(138)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473114903655L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
