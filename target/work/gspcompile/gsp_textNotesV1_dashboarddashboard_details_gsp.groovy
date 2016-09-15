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
for( _it1894652259 in (keywordsIn) ) {
changeItVariable(_it1894652259)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(49)
if(true && (conType == 'addKeyword' || conType == 'keyword')) {
printHtmlPart(50)
}
else {
printHtmlPart(51)
}
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(55)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(56)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(57)
if(true && (conType == 'History' || conType == 'Message')) {
printHtmlPart(58)
}
else {
printHtmlPart(59)
}
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(61)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(62)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(63)
if(true && (conType == 'Contact')) {
printHtmlPart(64)
expressionOut.print(contact.fullName)
printHtmlPart(65)
expressionOut.print(contact.phoneNumber)
printHtmlPart(66)
if(true && (State != 'None')) {
printHtmlPart(67)
expressionOut.print(contact.address)
printHtmlPart(68)
expressionOut.print(contact.city)
printHtmlPart(69)
expressionOut.print(contact.state)
printHtmlPart(70)
expressionOut.print(contact.zip)
printHtmlPart(71)
}
else {
printHtmlPart(72)
}
printHtmlPart(73)
if(true && (contact.subbed =! 'false')) {
printHtmlPart(74)
}
else {
printHtmlPart(75)
}
printHtmlPart(76)
createClosureForHtmlPart(77, 3)
invokeTag('link','g',336,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(73)
createClosureForHtmlPart(78, 3)
invokeTag('link','g',337,['class':("btn btn-default"),'action':("editContact"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (conType == 'Message')) {
printHtmlPart(81)
invokeTag('formatDate','g',344,['format':("MM-dd-yyyy"),'date':(message.lastSentDate)],-1)
printHtmlPart(82)
expressionOut.print(message.title)
printHtmlPart(83)
expressionOut.print(message.message)
printHtmlPart(84)
expressionOut.print(message.recipientsParsed)
printHtmlPart(85)
invokeTag('formatDate','g',361,['format':("MM-dd-yyyy, hh:mm a"),'date':(message.lastSentDate)],-1)
printHtmlPart(86)
expressionOut.print(contactCount)
printHtmlPart(87)
createClosureForHtmlPart(88, 3)
invokeTag('link','g',369,['class':("btn btn-default"),'action':("history"),'params':([activityType: 'messages']),'type':("button")],3)
printHtmlPart(73)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',370,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (conType == 'History')) {
printHtmlPart(90)
expressionOut.print(history.type)
printHtmlPart(66)
if(true && (showNumber == true)) {
printHtmlPart(91)
expressionOut.print(hist.phoneNumber)
printHtmlPart(71)
}
printHtmlPart(92)
expressionOut.print(history.description)
printHtmlPart(93)
invokeTag('formatDate','g',396,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(94)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',401,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (conType == 'Coupon Code')) {
printHtmlPart(95)
expressionOut.print(hist.type)
printHtmlPart(96)
expressionOut.print(hist.description)
printHtmlPart(97)
expressionOut.print(hist.phoneNumber)
printHtmlPart(93)
invokeTag('formatDate','g',428,['format':("MM-dd-yyyy hh:mm a"),'date':(hist.date)],-1)
printHtmlPart(94)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',433,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(73)
createClosureForHtmlPart(98, 3)
invokeTag('link','g',434,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (conType == 'Coupon Code Used')) {
printHtmlPart(99)
invokeTag('formatDate','g',444,['format':("MM-dd-yyyy"),'date':(coupon.dateRedeemed)],-1)
printHtmlPart(100)
expressionOut.print(coupon.phoneNumber)
printHtmlPart(101)
createClosureForHtmlPart(102, 3)
invokeTag('link','g',446,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(73)
createClosureForHtmlPart(89, 3)
invokeTag('link','g',447,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (conType == 'keyword')) {
printHtmlPart(103)
expressionOut.print(keyword.keyword)
printHtmlPart(104)
if(true && (keyword.winners != null)) {
printHtmlPart(105)
}
else if(true && (keyword.suspened)) {
printHtmlPart(106)
}
printHtmlPart(107)
expressionOut.print(keyword.keyword)
printHtmlPart(108)
expressionOut.print(number.number)
printHtmlPart(109)
if(true && (!keyword.description)) {
printHtmlPart(110)
}
else {
printHtmlPart(111)
expressionOut.print(keyword.description)
printHtmlPart(112)
}
printHtmlPart(113)
invokeTag('formatDate','g',486,['format':("MM-dd-yyyy"),'date':(keyword.dateEff)],-1)
printHtmlPart(114)
if(true && (keyword.endless)) {
printHtmlPart(115)
}
else {
printHtmlPart(20)
invokeTag('formatDate','g',489,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
}
printHtmlPart(116)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(117)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(118)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(119)
}
else {
printHtmlPart(120)
}
printHtmlPart(121)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(122)
if(true && (keyword.winners == null)) {
printHtmlPart(123)
}
else {
printHtmlPart(124)
expressionOut.print(keyword.winners)
printHtmlPart(125)
}
printHtmlPart(126)
}
printHtmlPart(127)
expressionOut.print(keyword.responceText)
printHtmlPart(128)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(129)
}
else {
printHtmlPart(130)
}
printHtmlPart(131)
invokeTag('formatDate','g',527,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(132)
expressionOut.print(keyword.replys)
printHtmlPart(87)
if(true && (keyword.winners == null)) {
printHtmlPart(133)
if(true && (keyword.suspened)) {
printHtmlPart(134)
}
else {
printHtmlPart(135)
}
printHtmlPart(73)
}
printHtmlPart(73)
createClosureForHtmlPart(136, 3)
invokeTag('link','g',546,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(137)
createClosureForHtmlPart(138, 3)
invokeTag('link','g',564,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(139)
createClosureForHtmlPart(140, 3)
invokeTag('link','g',587,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(141)
}
printHtmlPart(142)
invokeTag('javascript','g',679,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(143)
invokeTag('javascript','g',681,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(144)
invokeTag('javascript','g',683,['src':("dashboard/app.min.js")],-1)
printHtmlPart(145)
})
invokeTag('captureBody','sitemesh',710,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(146)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473642310236L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
