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
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'fcontent':("IE=edge")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'content':("width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"),'name':("viewport")],-1)
printHtmlPart(4)
invokeTag('resource','g',15,['dir':("css"),'file':("dashboard/bootstrap/css/bootstrap.min.css")],-1)
printHtmlPart(5)
invokeTag('resource','g',24,['dir':("css"),'file':("dashboard/AdminLTE.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',26,['dir':("css"),'file':("dashboard/CustomCSS.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',32,['dir':("css"),'file':("dashboard/skins/skin-purple.min.css")],-1)
printHtmlPart(8)
})
invokeTag('captureHead','sitemesh',41,[:],1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(12)
expressionOut.print(session.firstName)
printHtmlPart(13)
expressionOut.print(session.lastName)
printHtmlPart(14)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(15)
expressionOut.print(session.firstName)
printHtmlPart(13)
expressionOut.print(session.lastName)
printHtmlPart(16)
invokeTag('formatDate','g',137,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(17)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(18)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(19)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(20)
expressionOut.print(session.firstName)
printHtmlPart(13)
expressionOut.print(session.lastName)
printHtmlPart(21)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(22)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(30)
expressionOut.print(conType)
printHtmlPart(31)
if(true && (conType == 'Contact')) {
printHtmlPart(32)
expressionOut.print(contact.fullName)
printHtmlPart(33)
expressionOut.print(contact.phoneNumber)
printHtmlPart(34)
if(true && (State =! 'None')) {
printHtmlPart(35)
expressionOut.print(contact.address)
printHtmlPart(36)
expressionOut.print(contact.city)
printHtmlPart(37)
expressionOut.print(contact.state)
printHtmlPart(38)
expressionOut.print(contact.zip)
printHtmlPart(39)
expressionOut.print(contact.subbed)
printHtmlPart(40)
}
else {
printHtmlPart(41)
}
printHtmlPart(42)
if(true && (contact.subbed =! 'false')) {
printHtmlPart(43)
}
else {
printHtmlPart(44)
}
printHtmlPart(45)
createClosureForHtmlPart(46, 3)
invokeTag('link','g',347,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(47)
createClosureForHtmlPart(48, 3)
invokeTag('link','g',351,['class':("btn btn-default"),'action':("editContact"),'params':([contactID: contact.contactID]),'type':("button")],3)
printHtmlPart(49)
}
printHtmlPart(50)
if(true && (conType == 'Message')) {
printHtmlPart(51)
invokeTag('formatDate','g',360,['format':("MM-dd-yyyy"),'date':(message.lastSentDate)],-1)
printHtmlPart(52)
expressionOut.print(message.title)
printHtmlPart(53)
expressionOut.print(message.message)
printHtmlPart(54)
expressionOut.print(message.recipientsParsed)
printHtmlPart(55)
invokeTag('formatDate','g',382,['format':("MM-dd-yyyy, hh:mm a"),'date':(message.lastSentDate)],-1)
printHtmlPart(56)
expressionOut.print(contactCount)
printHtmlPart(57)
createClosureForHtmlPart(58, 3)
invokeTag('link','g',397,['class':("btn btn-default"),'action':("sendTxt"),'params':([]),'type':("button")],3)
printHtmlPart(59)
createClosureForHtmlPart(60, 3)
invokeTag('link','g',401,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(61)
}
printHtmlPart(62)
if(true && (conType == 'History')) {
printHtmlPart(63)
expressionOut.print(history.type)
printHtmlPart(64)
if(true && (showNumber == true)) {
printHtmlPart(65)
expressionOut.print(hist.phoneNumber)
printHtmlPart(66)
}
printHtmlPart(67)
expressionOut.print(history.description)
printHtmlPart(68)
invokeTag('formatDate','g',435,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(69)
createClosureForHtmlPart(60, 3)
invokeTag('link','g',444,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (conType == 'Coupon Code')) {
printHtmlPart(72)
expressionOut.print(hist.type)
printHtmlPart(73)
expressionOut.print(hist.description)
printHtmlPart(74)
expressionOut.print(hist.phoneNumber)
printHtmlPart(75)
invokeTag('formatDate','g',479,['format':("MM-dd-yyyy hh:mm a"),'date':(hist.date)],-1)
printHtmlPart(76)
createClosureForHtmlPart(60, 3)
invokeTag('link','g',487,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(77)
createClosureForHtmlPart(78, 3)
invokeTag('link','g',490,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (conType == 'Coupon Code Used')) {
printHtmlPart(81)
invokeTag('formatDate','g',501,['format':("MM-dd-yyyy"),'date':(coupon.dateRedeemed)],-1)
printHtmlPart(82)
expressionOut.print(coupon.phoneNumber)
printHtmlPart(83)
createClosureForHtmlPart(84, 3)
invokeTag('link','g',508,['class':("btn btn-default"),'action':("validateCoup"),'params':([]),'type':("button")],3)
printHtmlPart(85)
createClosureForHtmlPart(60, 3)
invokeTag('link','g',512,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(70)
}
printHtmlPart(86)
if(true && (conType == 'keyword')) {
printHtmlPart(87)
expressionOut.print(keyword.keyword)
printHtmlPart(88)
if(true && (keyword.suspened)) {
printHtmlPart(89)
}
printHtmlPart(90)
expressionOut.print(keyword.keyword)
printHtmlPart(91)
expressionOut.print(keyword.description)
printHtmlPart(92)
invokeTag('formatDate','g',551,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
printHtmlPart(93)
if(true && (keyword.endless)) {
printHtmlPart(94)
}
else {
printHtmlPart(95)
invokeTag('formatDate','g',557,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
printHtmlPart(96)
}
printHtmlPart(97)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(98)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(99)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(100)
}
else {
printHtmlPart(101)
}
printHtmlPart(102)
expressionOut.print(keyword.responceText)
printHtmlPart(103)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(104)
}
else {
printHtmlPart(105)
}
printHtmlPart(106)
invokeTag('formatDate','g',605,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(107)
expressionOut.print(keyword.replys)
printHtmlPart(108)
if(true && (keyword.suspened)) {
printHtmlPart(109)
}
else {
printHtmlPart(110)
}
printHtmlPart(111)
createClosureForHtmlPart(112, 3)
invokeTag('link','g',632,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(113)
createClosureForHtmlPart(114, 3)
invokeTag('link','g',656,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(115)
createClosureForHtmlPart(116, 3)
invokeTag('link','g',679,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(117)
}
printHtmlPart(118)
invokeTag('javascript','g',773,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(119)
invokeTag('javascript','g',776,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(120)
invokeTag('javascript','g',779,['src':("dashboard/app.min.js")],-1)
printHtmlPart(121)
})
invokeTag('captureBody','sitemesh',818,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(122)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1470520052644L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
