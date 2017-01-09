import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_txtWolfMain_dashboardview_Confirmation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/view_Confirmation.gsp" }
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
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(12)
expressionOut.print(notiCount)
printHtmlPart(13)
if(true && (keywordsIn != 'NONE')) {
printHtmlPart(14)
for( _it541568490 in (keywordsIn) ) {
changeItVariable(_it541568490)
printHtmlPart(15)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(16)
expressionOut.print(it.keyword)
printHtmlPart(17)
expressionOut.print(it.phoneNumber)
printHtmlPart(18)
invokeTag('formatDate','g',79,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
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
invokeTag('formatDate','g',132,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
invokeTag('form','g',173,['controller':("Dashboard"),'action':("contacts"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'newDraft'))
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'drafts'))
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(54)
if(true && (conType == 'addKeyword' || conType == 'reactivateKeyword')) {
printHtmlPart(55)
}
else {
printHtmlPart(56)
}
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(59)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(61)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(62)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(63)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(64)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(65)
if(true && (params.conType == 'Message')) {
printHtmlPart(66)
expressionOut.print(params.totalRecp)
printHtmlPart(67)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(68)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',297,['class':("btn btn-default"),'action':("details"),'params':([conType: 'Message', messageID: params.messageID]),'type':("button")],3)
printHtmlPart(70)
}
else if(true && (conType == 'AddContact')) {
printHtmlPart(71)
expressionOut.print(params.name)
printHtmlPart(72)
createClosureForHtmlPart(73, 3)
invokeTag('link','g',317,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: params.contactID]),'type':("button")],3)
printHtmlPart(74)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',318,['class':("btn btn-default"),'action':("details"),'params':([contactID: params.contactID, conType: 'Contact']),'type':("button")],3)
printHtmlPart(75)
}
else if(true && (conType == 'editContact')) {
printHtmlPart(76)
expressionOut.print(params.name)
printHtmlPart(77)
createClosureForHtmlPart(78, 3)
invokeTag('link','g',338,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: params.contactID]),'type':("button")],3)
printHtmlPart(74)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',339,['class':("btn btn-default"),'action':("details"),'params':([contactID: params.contactID, conType: 'Contact']),'type':("button")],3)
printHtmlPart(75)
}
else if(true && (conType == 'FAILEDAddContact')) {
printHtmlPart(79)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(80)
}
else if(true && (conType == 'FAILEDtext')) {
printHtmlPart(81)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(82)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(83)
}
else if(true && (conType == 'addGroup')) {
printHtmlPart(84)
expressionOut.print(params.name)
printHtmlPart(85)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(86)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',398,['class':("btn btn-default"),'action':("detailedGroup"),'params':([groupID: params.groupID]),'type':("button")],3)
printHtmlPart(75)
}
else if(true && (conType == 'FAILEDaddGroup')) {
printHtmlPart(87)
expressionOut.print(params.name)
printHtmlPart(88)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(68)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',418,['class':("btn btn-default"),'action':("details"),'params':([groupID: params.groupID]),'type':("button")],3)
printHtmlPart(75)
}
else if(true && (conType == 'AddContactToGroupSuccess')) {
printHtmlPart(89)
expressionOut.print(params.name)
printHtmlPart(90)
expressionOut.print(params.groupName)
printHtmlPart(91)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(92)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(93)
}
else if(true && (conType == 'AddContactToGroupFail')) {
printHtmlPart(94)
expressionOut.print(params.name)
printHtmlPart(95)
expressionOut.print(params.groupName)
printHtmlPart(96)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(92)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(97)
}
else if(true && (conType == 'addKeyword')) {
printHtmlPart(98)
expressionOut.print(params.keyword)
printHtmlPart(99)
expressionOut.print(params.keyword)
printHtmlPart(100)
expressionOut.print(number.number)
printHtmlPart(101)
if(true && (params.endless == 'true')) {
printHtmlPart(102)
expressionOut.print(params.dateEff)
printHtmlPart(103)
}
else {
printHtmlPart(102)
expressionOut.print(params.dateEff)
printHtmlPart(104)
expressionOut.print(params.dateExp)
printHtmlPart(105)
}
printHtmlPart(106)
createClosureForHtmlPart(107, 3)
invokeTag('link','g',481,['action':("details"),'params':([conType:'keyword', promotionID: params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(108)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(109)
}
else if(true && (conType == 'suspendKeyword')) {
printHtmlPart(110)
expressionOut.print(params.keyword)
printHtmlPart(111)
createClosureForHtmlPart(107, 3)
invokeTag('link','g',500,['action':("details"),'params':([conType:'keyword', promotionID:params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(108)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(109)
}
else if(true && (conType == 'reactivateKeyword')) {
printHtmlPart(112)
expressionOut.print(params.keyword)
printHtmlPart(113)
expressionOut.print(params.keyword)
printHtmlPart(104)
expressionOut.print(params.phoneNumber)
printHtmlPart(114)
expressionOut.print(params.dateEff)
printHtmlPart(115)
createClosureForHtmlPart(107, 3)
invokeTag('link','g',519,['action':("details"),'params':([conType:'keyword', promotionID: params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(108)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(109)
}
else if(true && (conType == 'suspendKeyword')) {
printHtmlPart(110)
expressionOut.print(params.keyword)
printHtmlPart(111)
createClosureForHtmlPart(107, 3)
invokeTag('link','g',538,['action':("details"),'params':([conType:'keyword', promotionID:params.promotionID]),'class':("btn btn-default")],3)
printHtmlPart(108)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(109)
}
else if(true && (conType == 'passwordChangeSuccess')) {
printHtmlPart(116)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(117)
}
else if(true && (conType == 'passwordChangeFail')) {
printHtmlPart(118)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(119)
expressionOut.print(createLink(controller: 'Dashboard', action: 'changePassword'))
printHtmlPart(120)
}
printHtmlPart(121)
invokeTag('javascript','g',602,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(122)
invokeTag('javascript','g',604,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(123)
invokeTag('javascript','g',606,['src':("dashboard/app.min.js")],-1)
printHtmlPart(124)
})
invokeTag('captureBody','sitemesh',633,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(125)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1483923623161L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
