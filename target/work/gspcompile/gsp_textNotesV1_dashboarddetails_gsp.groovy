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
for( _it1684958471 in (keywordsIn) ) {
changeItVariable(_it1684958471)
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
if(true && (contact.firstName == 'Unknown')) {
printHtmlPart(67)
expressionOut.print(contact.firstName)
printHtmlPart(68)
}
else {
printHtmlPart(67)
expressionOut.print(contact.fullName)
printHtmlPart(68)
}
printHtmlPart(69)
expressionOut.print(contact.phoneNumber)
printHtmlPart(70)
if(true && (State != 'None')) {
printHtmlPart(71)
expressionOut.print(contact.address)
printHtmlPart(72)
expressionOut.print(contact.city)
printHtmlPart(73)
expressionOut.print(contact.state)
printHtmlPart(74)
expressionOut.print(contact.zip)
printHtmlPart(75)
}
else {
printHtmlPart(76)
}
printHtmlPart(67)
if(true && (contact.subbed =! 'false')) {
printHtmlPart(77)
}
else {
printHtmlPart(78)
}
printHtmlPart(79)
createClosureForHtmlPart(80, 3)
invokeTag('link','g',347,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(67)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',348,['class':("btn btn-default"),'action':("editContact"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(82)
}
printHtmlPart(83)
if(true && (conType == 'Message')) {
printHtmlPart(84)
invokeTag('formatDate','g',355,['format':("MM-dd-yyyy"),'date':(message.lastSentDate)],-1)
printHtmlPart(85)
expressionOut.print(message.title)
printHtmlPart(86)
expressionOut.print(message.message)
printHtmlPart(87)
expressionOut.print(message.recipientsParsed)
printHtmlPart(88)
invokeTag('formatDate','g',372,['format':("MM-dd-yyyy, hh:mm a"),'date':(message.lastSentDate)],-1)
printHtmlPart(89)
expressionOut.print(contactCount)
printHtmlPart(90)
createClosureForHtmlPart(91, 3)
invokeTag('link','g',380,['class':("btn btn-default"),'action':("history"),'params':([activityType: 'messages']),'type':("button")],3)
printHtmlPart(67)
createClosureForHtmlPart(92, 3)
invokeTag('link','g',381,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(82)
}
printHtmlPart(83)
if(true && (conType == 'History')) {
printHtmlPart(93)
expressionOut.print(history.type)
printHtmlPart(70)
if(true && (showNumber == true)) {
printHtmlPart(94)
expressionOut.print(hist.phoneNumber)
printHtmlPart(75)
}
printHtmlPart(95)
expressionOut.print(history.description)
printHtmlPart(96)
invokeTag('formatDate','g',407,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(97)
createClosureForHtmlPart(92, 3)
invokeTag('link','g',412,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(82)
}
printHtmlPart(83)
if(true && (conType == 'Coupon Code')) {
printHtmlPart(98)
expressionOut.print(hist.type)
printHtmlPart(99)
expressionOut.print(hist.description)
printHtmlPart(100)
expressionOut.print(hist.phoneNumber)
printHtmlPart(96)
invokeTag('formatDate','g',439,['format':("MM-dd-yyyy hh:mm a"),'date':(hist.date)],-1)
printHtmlPart(97)
createClosureForHtmlPart(92, 3)
invokeTag('link','g',444,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(67)
createClosureForHtmlPart(101, 3)
invokeTag('link','g',445,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(82)
}
printHtmlPart(83)
if(true && (conType == 'Coupon Code Used')) {
printHtmlPart(102)
invokeTag('formatDate','g',455,['format':("MM-dd-yyyy"),'date':(coupon.dateRedeemed)],-1)
printHtmlPart(103)
expressionOut.print(coupon.phoneNumber)
printHtmlPart(104)
createClosureForHtmlPart(105, 3)
invokeTag('link','g',457,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(67)
createClosureForHtmlPart(92, 3)
invokeTag('link','g',458,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(82)
}
printHtmlPart(83)
if(true && (conType == 'keyword')) {
printHtmlPart(106)
expressionOut.print(keyword.keyword)
printHtmlPart(107)
if(true && (keyword.winners != null)) {
printHtmlPart(108)
}
else if(true && (keyword.suspened)) {
printHtmlPart(109)
}
printHtmlPart(110)
expressionOut.print(keyword.keyword)
printHtmlPart(111)
expressionOut.print(number.number)
printHtmlPart(112)
if(true && (!keyword.description)) {
printHtmlPart(113)
}
else {
printHtmlPart(114)
expressionOut.print(keyword.description)
printHtmlPart(115)
}
printHtmlPart(116)
invokeTag('formatDate','g',497,['format':("MM-dd-yyyy"),'date':(keyword.dateEff)],-1)
printHtmlPart(117)
if(true && (keyword.endless)) {
printHtmlPart(118)
}
else {
printHtmlPart(20)
invokeTag('formatDate','g',500,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
}
printHtmlPart(119)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(120)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(121)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(122)
}
else {
printHtmlPart(123)
}
printHtmlPart(124)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(125)
if(true && (keyword.winners == null)) {
printHtmlPart(126)
}
else {
printHtmlPart(127)
expressionOut.print(keyword.winners)
printHtmlPart(128)
}
printHtmlPart(129)
}
printHtmlPart(130)
expressionOut.print(keyword.responceText)
printHtmlPart(131)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(132)
}
else {
printHtmlPart(133)
}
printHtmlPart(134)
invokeTag('formatDate','g',538,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(135)
expressionOut.print(keyword.replys)
printHtmlPart(90)
if(true && (keyword.winners == null)) {
printHtmlPart(136)
if(true && (keyword.suspened)) {
printHtmlPart(137)
}
else {
printHtmlPart(138)
}
printHtmlPart(67)
}
printHtmlPart(67)
createClosureForHtmlPart(139, 3)
invokeTag('link','g',557,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(140)
createClosureForHtmlPart(141, 3)
invokeTag('link','g',575,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(142)
createClosureForHtmlPart(143, 3)
invokeTag('link','g',598,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(144)
}
printHtmlPart(145)
invokeTag('javascript','g',626,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(146)
invokeTag('javascript','g',628,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(147)
invokeTag('javascript','g',630,['src':("dashboard/app.min.js")],-1)
printHtmlPart(148)
})
invokeTag('captureBody','sitemesh',657,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(149)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1480888730037L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
