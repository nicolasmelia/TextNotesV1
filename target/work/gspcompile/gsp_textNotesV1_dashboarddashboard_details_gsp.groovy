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
expressionOut.print(res)
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
expressionOut.print(history.description)
printHtmlPart(65)
invokeTag('formatDate','g',425,['format':("MM-dd-yyyy hh:mm a"),'date':(history.date)],-1)
printHtmlPart(66)
createClosureForHtmlPart(60, 3)
invokeTag('link','g',434,['class':("btn btn-default"),'action':("dashboard"),'params':([]),'type':("button")],3)
printHtmlPart(67)
}
printHtmlPart(68)
if(true && (conType == 'keyword')) {
printHtmlPart(69)
expressionOut.print(keyword.keyword)
printHtmlPart(70)
if(true && (keyword.suspened)) {
printHtmlPart(71)
}
printHtmlPart(72)
expressionOut.print(keyword.keyword)
printHtmlPart(73)
expressionOut.print(keyword.description)
printHtmlPart(74)
invokeTag('formatDate','g',474,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
printHtmlPart(75)
if(true && (keyword.endless)) {
printHtmlPart(76)
}
else {
printHtmlPart(77)
invokeTag('formatDate','g',480,['format':("MM-dd-yyyy"),'date':(keyword.dateExp)],-1)
printHtmlPart(78)
}
printHtmlPart(79)
if(true && (keyword.campaignType == 'con')) {
printHtmlPart(80)
}
else if(true && (keyword.campaignType == 'cust')) {
printHtmlPart(81)
}
else if(true && (keyword.campaignType == 'coup')) {
printHtmlPart(82)
}
else {
printHtmlPart(83)
}
printHtmlPart(84)
expressionOut.print(keyword.responceText)
printHtmlPart(85)
if(true && (keyword.multipleEntries == 'true')) {
printHtmlPart(86)
}
else {
printHtmlPart(87)
}
printHtmlPart(88)
invokeTag('formatDate','g',528,['format':("MM-dd-yyyy"),'date':(keyword.dateCreated)],-1)
printHtmlPart(89)
expressionOut.print(keyword.replys)
printHtmlPart(90)
if(true && (keyword.suspened)) {
printHtmlPart(91)
}
else {
printHtmlPart(92)
}
printHtmlPart(93)
createClosureForHtmlPart(94, 3)
invokeTag('link','g',555,['class':("btn btn-default"),'action':("keywords"),'type':("button")],3)
printHtmlPart(95)
createClosureForHtmlPart(96, 3)
invokeTag('link','g',579,['action':("suspendKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-warning pull-left")],3)
printHtmlPart(97)
createClosureForHtmlPart(98, 3)
invokeTag('link','g',602,['action':("reactivateKeyword"),'params':([promotionID:params.promotionID]),'type':("button"),'class':("btn btn-default pull-left")],3)
printHtmlPart(99)
}
printHtmlPart(100)
invokeTag('javascript','g',696,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(101)
invokeTag('javascript','g',699,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(102)
invokeTag('javascript','g',702,['src':("dashboard/app.min.js")],-1)
printHtmlPart(103)
})
invokeTag('captureBody','sitemesh',741,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(104)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1469987144065L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
