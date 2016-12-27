import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_txtWolfMain_dashboardview_Keywords_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/view_Keywords.gsp" }
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
for( _it2135889206 in (keywordsIn) ) {
changeItVariable(_it2135889206)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'newDraft'))
printHtmlPart(45)
expressionOut.print(createLink(controller: 'Dashboard', action: 'drafts'))
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard', action: 'tips'))
printHtmlPart(48)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(49)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords'))
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywordInbox'))
printHtmlPart(51)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validateCoup'))
printHtmlPart(52)
expressionOut.print(createLink(controller: 'Dashboard', action: 'keywords', params: [type: 'contestSelect']))
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'balance'))
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'history'))
printHtmlPart(55)
expressionOut.print(createLink(controller: 'Dashboard', action: 'accountSettings'))
printHtmlPart(56)
if(true && (type != 'contestSelect')) {
printHtmlPart(57)
}
else {
printHtmlPart(58)
}
printHtmlPart(59)
if(true && (keywordCount == 0)) {
printHtmlPart(60)
}
printHtmlPart(61)
expressionOut.print(searchQueryHidden)
printHtmlPart(62)
expressionOut.print(offset)
printHtmlPart(63)
expressionOut.print(keywordCount)
printHtmlPart(64)
if(true && (type == 'contestSelect')) {
printHtmlPart(65)
}
printHtmlPart(66)
if(true && (keywordCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (keywords != 'NONE')) {
printHtmlPart(14)
for( _it875175812 in (keywords) ) {
changeItVariable(_it875175812)
printHtmlPart(67)
if(true && (type == 'All')) {
printHtmlPart(68)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID]))
printHtmlPart(69)
}
printHtmlPart(67)
if(true && (type == 'contestSelect')) {
printHtmlPart(70)
if(true && (it.winners == null)) {
printHtmlPart(71)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contestSelect', params: [promotionID:it.promotionID]))
printHtmlPart(72)
}
else {
printHtmlPart(71)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'keyword',  promotionID:it.promotionID]))
printHtmlPart(72)
}
printHtmlPart(67)
}
printHtmlPart(73)
expressionOut.print(it.keyword)
printHtmlPart(74)
expressionOut.print(number.number)
printHtmlPart(75)
if(true && (it.campaignType == 'con')) {
printHtmlPart(76)
}
else if(true && (it.campaignType == 'cust')) {
printHtmlPart(77)
}
else if(true && (it.campaignType == 'coup')) {
printHtmlPart(78)
}
else {
printHtmlPart(79)
}
printHtmlPart(80)
invokeTag('formatDate','g',330,['format':("MM-dd-yyyy"),'date':(it.dateEff)],-1)
printHtmlPart(70)
if(true && (it.endless)) {
printHtmlPart(81)
}
else {
printHtmlPart(82)
invokeTag('formatDate','g',333,['format':("MM-dd-yyyy"),'date':(it.dateExp)],-1)
}
printHtmlPart(83)
if(true && (it.description)) {
printHtmlPart(84)
expressionOut.print(it.description)
printHtmlPart(75)
}
else {
printHtmlPart(85)
}
printHtmlPart(86)
expressionOut.print(it.replys)
printHtmlPart(75)
if(true && (it.suspened == true)) {
printHtmlPart(87)
}
else {
printHtmlPart(88)
}
printHtmlPart(89)
if(true && (type == 'contestSelect')) {
printHtmlPart(70)
if(true && (it.winners == null)) {
printHtmlPart(90)
}
else {
printHtmlPart(91)
}
printHtmlPart(67)
}
printHtmlPart(92)
}
printHtmlPart(20)
}
else {
printHtmlPart(93)
}
printHtmlPart(94)
}
else {
printHtmlPart(95)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newKeyWord'))
printHtmlPart(96)
}
printHtmlPart(97)
if(true && (offset > 0)) {
printHtmlPart(98)
if(true && (type == 'contestSelect')) {
printHtmlPart(94)
createClosureForHtmlPart(99, 4)
invokeTag('link','g',395,['action':("keywords"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden, type:'contestSelect']),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(98)
}
else {
printHtmlPart(94)
createClosureForHtmlPart(99, 4)
invokeTag('link','g',398,['action':("keywords"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(98)
}
printHtmlPart(100)
}
else {
printHtmlPart(101)
}
printHtmlPart(100)
if(true && (offset <= keywordCount)) {
printHtmlPart(98)
if(true && (type == 'contestSelect')) {
printHtmlPart(94)
createClosureForHtmlPart(102, 4)
invokeTag('link','g',406,['action':("keywords"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden, type:'contestSelect']),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(98)
}
else {
printHtmlPart(94)
createClosureForHtmlPart(102, 4)
invokeTag('link','g',409,['action':("keywords"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],4)
printHtmlPart(98)
}
printHtmlPart(100)
}
else {
printHtmlPart(103)
}
printHtmlPart(104)
expressionOut.print(currentPage)
printHtmlPart(105)
invokeTag('javascript','g',438,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(106)
invokeTag('javascript','g',440,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(107)
invokeTag('javascript','g',442,['src':("dashboard/app.min.js")],-1)
printHtmlPart(108)
})
invokeTag('captureBody','sitemesh',447,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(109)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1482718113416L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
