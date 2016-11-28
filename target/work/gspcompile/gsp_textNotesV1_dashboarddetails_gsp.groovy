import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddetails_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/details.gsp" }
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
for( _it1850116381 in (keywordsIn) ) {
changeItVariable(_it1850116381)
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
if(true && (conType == 'Contact')) {
printHtmlPart(40)
}
else {
printHtmlPart(41)
}
printHtmlPart(42)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(44)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newDraft'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'drafts'))
printHtmlPart(49)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(51)
if(true && (conType == 'addKeyword' || conType == 'keyword')) {
printHtmlPart(52)
}
else {
printHtmlPart(53)
}
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(55)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(56)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(59)
if(true && (conType == 'History' || conType == 'Message')) {
printHtmlPart(60)
}
else {
printHtmlPart(61)
}
printHtmlPart(62)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(63)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(64)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(65)
if(true && (conType == 'Contact')) {
printHtmlPart(66)
expressionOut.print(contact.fullName)
printHtmlPart(67)
expressionOut.print(contact.phoneNumber)
printHtmlPart(68)
if(true && (State != 'None')) {
printHtmlPart(69)
expressionOut.print(contact.address)
printHtmlPart(70)
expressionOut.print(contact.city)
printHtmlPart(71)
expressionOut.print(contact.state)
printHtmlPart(72)
expressionOut.print(contact.zip)
printHtmlPart(73)
}
else {
printHtmlPart(74)
}
printHtmlPart(75)
if(true && (contact.subbed =! 'false')) {
printHtmlPart(76)
}
else {
printHtmlPart(77)
}
printHtmlPart(78)
createClosureForHtmlPart(79, 3)
invokeTag('link','g',340,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(75)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',341,['class':("btn btn-default"),'action':("editContact"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(81)
}
printHtmlPart(82)
if(true && (conType == 'Message')) {
printHtmlPart(83)
invokeTag('formatDate','g',348,['format':("MM-dd-yyyy"),'date':(message.lastSentDate)],-1)
printHtmlPart(84)
expressionOut.print(message.title)
printHtmlPart(85)
expressionOut.print(message.message)
printHtmlPart(86)
expressionOut.print(message.recipientsParsed)
printHtmlPart(87)
invokeTag('formatDate','g',365,['format':("MM-dd-yyyy, hh:mm a"),'date':(message.lastSentDate)],-1)
printHtmlPart(88)
expressionOut.print(contactCount)
printHtmlPart(89)
createClosureForHtmlPart(90, 3)
invokeTag('link','g',373,['class':("btn btn-default"),'action':("history"),'params':([activityType: 'messages']),'type':("button")],3)
printHtmlPart(75)
createClosureForHtmlPart(91, 3)
invokeTag('link','g',374,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(81)
}
printHtmlPart(82)
if(true && (conType == 'History')) {
printHtmlPart(92)
expressionOut.print(history.type)
printHtmlPart(68)
if(true && (showNumber == true)) {
printHtmlPart(93)
expressionOut.print(hist.phoneNumber)
printHtmlPart(73)
}
printHtmlPart(94)
expressionOut.print(history.description)
printHtmlPart(95)
invokeTag('formatDate','g',400,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(96)
createClosureForHtmlPart(91, 3)
invokeTag('link','g',405,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(81)
}
printHtmlPart(82)
if(true && (conType == 'Coupon Code')) {
printHtmlPart(97)
expressionOut.print(hist.type)
printHtmlPart(98)
expressionOut.print(hist.description)
printHtmlPart(99)
expressionOut.print(hist.phoneNumber)
printHtmlPart(95)
invokeTag('formatDate','g',432,['format':("MM-dd-yyyy hh:mm a"),'date':(hist.date)],-1)
printHtmlPart(96)
createClosureForHtmlPart(91, 3)
invokeTag('link','g',437,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(75)
createClosureForHtmlPart(100, 3)
invokeTag('link','g',438,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(81)
}
printHtmlPart(82)
if(true && (conType == 'Coupon Code Used')) {
printHtmlPart(101)
invokeTag('formatDate','g',448,['format':("MM-dd-yyyy"),'date':(coupon.dateRedeemed)],-1)
printHtmlPart(102)
expressionOut.print(coupon.phoneNumber)
printHtmlPart(103)
createClosureForHtmlPart(104, 3)
invokeTag('link','g',450,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(75)
createClosureForHtmlPart(91, 3)
invokeTag('link','g',451,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(81)
}
printHtmlPart(82)
if(true && (conType == 'keyword')) {
printHtmlPart(105)
expressionOut.print(keyword.keyword)
printHtmlPart(106)
if(true && (keyword.winners != null)) {
printHtmlPart(107)
}
else if(true && (keyword.suspened)) {
printHtmlPart(108)
}
printHtmlPart(109)
expressionOut.print(keyword.keyword)
printHtmlPart(110)
expressionOut.print(number.number)
printHtmlPart(111)
if(true && (!keyword.description)) {
printHtmlPart(112)
}
else {
printHtmlPart(113)
expressionOut.print(keyword.description)
printHtmlPart(114)
}
printHtmlPart(115)
invokeTag('formatDate','g',490,['format':("MM-dd-yyyy"),'date':(keyword.dateEff)],-1)
printHtmlPart(116)
if(true && (keyword.endless)) {
printHtmlPart(117)
}
else {
printHtmlPart(20)
invokeTag('formatDate','g',493,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
}
printHtmlPart(118)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(119)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(120)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(121)
}
else {
printHtmlPart(122)
}
printHtmlPart(123)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(124)
if(true && (keyword.winners == null)) {
printHtmlPart(125)
}
else {
printHtmlPart(126)
expressionOut.print(keyword.winners)
printHtmlPart(127)
}
printHtmlPart(128)
}
printHtmlPart(129)
expressionOut.print(keyword.responceText)
printHtmlPart(130)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(131)
}
else {
printHtmlPart(132)
}
printHtmlPart(133)
invokeTag('formatDate','g',531,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(134)
expressionOut.print(keyword.replys)
printHtmlPart(89)
if(true && (keyword.winners == null)) {
printHtmlPart(135)
if(true && (keyword.suspened)) {
printHtmlPart(136)
}
else {
printHtmlPart(137)
}
printHtmlPart(75)
}
printHtmlPart(75)
createClosureForHtmlPart(138, 3)
invokeTag('link','g',550,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(139)
createClosureForHtmlPart(140, 3)
invokeTag('link','g',568,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(141)
createClosureForHtmlPart(142, 3)
invokeTag('link','g',591,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(143)
}
printHtmlPart(144)
invokeTag('javascript','g',683,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(145)
invokeTag('javascript','g',685,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(146)
invokeTag('javascript','g',687,['src':("dashboard/app.min.js")],-1)
printHtmlPart(147)
})
invokeTag('captureBody','sitemesh',714,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(148)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1480296166494L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
