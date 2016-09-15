import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_keywords_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_keywords.gsp" }
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
for( _it400037555 in (keywordsIn) ) {
changeItVariable(_it400037555)
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
if(true && (type != 'contestSelect')) {
printHtmlPart(55)
}
else {
printHtmlPart(56)
}
printHtmlPart(57)
if(true && (keywordCount == 0)) {
printHtmlPart(58)
}
printHtmlPart(59)
expressionOut.print(searchQueryHidden)
printHtmlPart(60)
expressionOut.print(offset)
printHtmlPart(61)
expressionOut.print(keywordCount)
printHtmlPart(62)
if(true && (type == 'contestSelect')) {
printHtmlPart(63)
}
printHtmlPart(64)
if(true && (keywordCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (keywords != 'NONE')) {
printHtmlPart(14)
for( _it308704765 in (keywords) ) {
changeItVariable(_it308704765)
printHtmlPart(65)
if(true && (type == 'All')) {
printHtmlPart(66)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID]))
printHtmlPart(67)
}
printHtmlPart(65)
if(true && (type == 'contestSelect')) {
printHtmlPart(68)
if(true && (it.winners == null)) {
printHtmlPart(69)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contestSelect', params: [promotionID:it.promotionID]))
printHtmlPart(70)
}
else {
printHtmlPart(69)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID]))
printHtmlPart(70)
}
printHtmlPart(65)
}
printHtmlPart(71)
expressionOut.print(it.keyword)
printHtmlPart(72)
expressionOut.print(number.number)
printHtmlPart(73)
if(true && (it.campaignType == 'con')) {
printHtmlPart(74)
}
else if(true && (it.campaignType == 'cust')) {
printHtmlPart(75)
}
else if(true && (it.campaignType == 'coup')) {
printHtmlPart(76)
}
else {
printHtmlPart(77)
}
printHtmlPart(78)
invokeTag('formatDate','g',326,['format':("MM-dd-yyyy"),'date':(it.dateEff)],-1)
printHtmlPart(68)
if(true && (it.endless)) {
printHtmlPart(79)
}
else {
printHtmlPart(80)
invokeTag('formatDate','g',329,['format':("MM-dd-yyyy"),'date':(it.dateExp)],-1)
}
printHtmlPart(81)
if(true && (it.description)) {
printHtmlPart(82)
expressionOut.print(it.description)
printHtmlPart(73)
}
else {
printHtmlPart(83)
}
printHtmlPart(84)
expressionOut.print(it.replys)
printHtmlPart(73)
if(true && (it.suspened == true)) {
printHtmlPart(85)
}
else {
printHtmlPart(86)
}
printHtmlPart(87)
if(true && (type == 'contestSelect')) {
printHtmlPart(68)
if(true && (it.winners == null)) {
printHtmlPart(88)
}
else {
printHtmlPart(89)
}
printHtmlPart(65)
}
printHtmlPart(90)
}
printHtmlPart(20)
}
else {
printHtmlPart(91)
}
printHtmlPart(92)
}
else {
printHtmlPart(93)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(94)
}
printHtmlPart(95)
if(true && (offset > 0)) {
printHtmlPart(96)
if(true && (type == 'contestSelect')) {
printHtmlPart(92)
createClosureForHtmlPart(97, 4)
invokeTag('link','g',383,['action':("keywords"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden, type:'contestSelect']),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(96)
}
else {
printHtmlPart(92)
createClosureForHtmlPart(97, 4)
invokeTag('link','g',386,['action':("keywords"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(96)
}
printHtmlPart(98)
}
else {
printHtmlPart(99)
}
printHtmlPart(98)
if(true && (offset <= keywordCount)) {
printHtmlPart(96)
if(true && (type == 'contestSelect')) {
printHtmlPart(92)
createClosureForHtmlPart(100, 4)
invokeTag('link','g',394,['action':("keywords"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden, type:'contestSelect']),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(96)
}
else {
printHtmlPart(92)
createClosureForHtmlPart(100, 4)
invokeTag('link','g',397,['action':("keywords"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(96)
}
printHtmlPart(98)
}
else {
printHtmlPart(101)
}
printHtmlPart(102)
expressionOut.print(currentPage)
printHtmlPart(103)
invokeTag('javascript','g',490,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(104)
invokeTag('javascript','g',492,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(105)
invokeTag('javascript','g',494,['src':("dashboard/app.min.js")],-1)
printHtmlPart(106)
})
invokeTag('captureBody','sitemesh',499,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(107)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473705162625L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
