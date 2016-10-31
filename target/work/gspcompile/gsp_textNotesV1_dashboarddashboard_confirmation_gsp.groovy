import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_confirmation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_confirmation.gsp" }
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
for( _it709702834 in (keywordsIn) ) {
changeItVariable(_it709702834)
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
if(true && (conType == 'AddContact' || conType == 'editContact' || conType == 'AddContactToGroupSuccess')) {
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
if(true && (conType == 'Message')) {
printHtmlPart(47)
}
else {
printHtmlPart(48)
}
printHtmlPart(49)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(52)
if(true && (conType == 'addKeyword' || conType == 'reactivateKeyword')) {
printHtmlPart(53)
}
else {
printHtmlPart(54)
}
printHtmlPart(55)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(56)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(59)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(61)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(62)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(63)
if(true && (params.conType == 'Message')) {
printHtmlPart(64)
expressionOut.print(params.totalRecp)
printHtmlPart(65)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(66)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',283,['class':("btn btn-default"),'action':("details"),'params':([conType: 'Message', messageID: params.messageID]),'type':("button")],3)
printHtmlPart(68)
}
else if(true && (conType == 'AddContact')) {
printHtmlPart(69)
expressionOut.print(params.name)
printHtmlPart(70)
createClosureForHtmlPart(71, 3)
invokeTag('link','g',303,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: params.contactID]),'type':("button")],3)
printHtmlPart(72)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',304,['class':("btn btn-default"),'action':("details"),'params':([contactID: params.contactID, conType: 'Contact']),'type':("button")],3)
printHtmlPart(73)
}
else if(true && (conType == 'editContact')) {
printHtmlPart(74)
expressionOut.print(params.name)
printHtmlPart(75)
createClosureForHtmlPart(76, 3)
invokeTag('link','g',324,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: params.contactID]),'type':("button")],3)
printHtmlPart(72)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',325,['class':("btn btn-default"),'action':("details"),'params':([contactID: params.contactID, conType: 'Contact']),'type':("button")],3)
printHtmlPart(73)
}
else if(true && (conType == 'FAILEDAddContact')) {
printHtmlPart(77)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(78)
}
else if(true && (conType == 'FAILEDtext')) {
printHtmlPart(79)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(80)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(81)
}
else if(true && (conType == 'addGroup')) {
printHtmlPart(82)
expressionOut.print(params.name)
printHtmlPart(83)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(84)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',384,['class':("btn btn-default"),'action':("detailedGroup"),'params':([groupID: params.groupID]),'type':("button")],3)
printHtmlPart(73)
}
else if(true && (conType == 'FAILEDaddGroup')) {
printHtmlPart(85)
expressionOut.print(params.name)
printHtmlPart(86)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(66)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',404,['class':("btn btn-default"),'action':("details"),'params':([groupID: params.groupID]),'type':("button")],3)
printHtmlPart(73)
}
else if(true && (conType == 'AddContactToGroupSuccess')) {
printHtmlPart(87)
expressionOut.print(params.name)
printHtmlPart(88)
expressionOut.print(params.groupName)
printHtmlPart(89)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(90)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(91)
}
else if(true && (conType == 'AddContactToGroupFail')) {
printHtmlPart(92)
expressionOut.print(params.name)
printHtmlPart(93)
expressionOut.print(params.groupName)
printHtmlPart(94)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(90)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(95)
}
else if(true && (conType == 'addKeyword')) {
printHtmlPart(96)
expressionOut.print(params.keyword)
printHtmlPart(97)
expressionOut.print(params.keyword)
printHtmlPart(98)
expressionOut.print(number.number)
printHtmlPart(99)
if(true && (params.endless == 'true')) {
printHtmlPart(100)
expressionOut.print(params.dateEff)
printHtmlPart(101)
}
else {
printHtmlPart(100)
expressionOut.print(params.dateEff)
printHtmlPart(102)
expressionOut.print(params.dateExp)
printHtmlPart(103)
}
printHtmlPart(104)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(105)
createClosureForHtmlPart(106, 3)
invokeTag('link','g',468,['action':("details"),'params':([conType:'keyword', promotionID: params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(107)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(108)
}
else if(true && (conType == 'suspendKeyword')) {
printHtmlPart(109)
expressionOut.print(params.keyword)
printHtmlPart(110)
createClosureForHtmlPart(106, 3)
invokeTag('link','g',487,['action':("details"),'params':([conType:'keyword', promotionID:params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(107)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(108)
}
else if(true && (conType == 'reactivateKeyword')) {
printHtmlPart(111)
expressionOut.print(params.keyword)
printHtmlPart(112)
expressionOut.print(params.keyword)
printHtmlPart(102)
expressionOut.print(params.phoneNumber)
printHtmlPart(113)
expressionOut.print(params.dateEff)
printHtmlPart(114)
expressionOut.print(params.promotionID)
printHtmlPart(115)
createClosureForHtmlPart(106, 3)
invokeTag('link','g',508,['action':("details"),'params':([conType:'keyword', promotionID: params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(107)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(108)
}
printHtmlPart(116)
invokeTag('javascript','g',594,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(117)
invokeTag('javascript','g',596,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(118)
invokeTag('javascript','g',598,['src':("dashboard/app.min.js")],-1)
printHtmlPart(119)
})
invokeTag('captureBody','sitemesh',625,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(120)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473645176950L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
