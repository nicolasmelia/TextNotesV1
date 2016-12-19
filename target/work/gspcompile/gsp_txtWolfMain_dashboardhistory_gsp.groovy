import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_txtWolfMain_dashboardhistory_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/history.gsp" }
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
for( _it488654523 in (keywordsIn) ) {
changeItVariable(_it488654523)
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
if(true && (groupCount == 0)) {
printHtmlPart(57)
}
printHtmlPart(58)
expressionOut.print(searchQueryHidden)
printHtmlPart(59)
expressionOut.print(offset)
printHtmlPart(60)
expressionOut.print(groupCount)
printHtmlPart(61)
createTagBody(2, {->
printHtmlPart(62)
if(true && (activityType == 'all' || activityType == null)) {
printHtmlPart(63)
}
else {
printHtmlPart(64)
}
printHtmlPart(65)
invokeTag('actionSubmit','g',291,['id':("selectTypeForm"),'style':("display:none;"),'action':("history"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("selectTypeForm")],-1)
printHtmlPart(66)
})
invokeTag('form','g',292,['id':("searchForm"),'controller':("Dashboard"),'action':("history"),'enctype':("multipart/form-data")],2)
printHtmlPart(67)
if(true && (groupCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (history != 'NONE')) {
printHtmlPart(14)
for( _it993263609 in (history) ) {
changeItVariable(_it993263609)
printHtmlPart(68)
if(true && (it.type == 'Coupon Code')) {
printHtmlPart(69)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID, showNumber : true]))
printHtmlPart(70)
}
else if(true && (it.type == 'Message')) {
printHtmlPart(69)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: it.type, messageID: it.hashOne]))
printHtmlPart(70)
}
else {
printHtmlPart(69)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID]))
printHtmlPart(70)
}
printHtmlPart(71)
expressionOut.print(it.type)
printHtmlPart(72)
if(true && (it.description)) {
printHtmlPart(73)
expressionOut.print(it.description)
printHtmlPart(72)
}
else {
printHtmlPart(74)
}
printHtmlPart(75)
invokeTag('formatDate','g',323,['format':("MM-dd-yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(76)
}
printHtmlPart(20)
}
else {
printHtmlPart(77)
}
printHtmlPart(78)
}
else {
printHtmlPart(79)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(80)
}
printHtmlPart(81)
if(true && (offset > 0)) {
printHtmlPart(82)
createClosureForHtmlPart(83, 3)
invokeTag('link','g',353,['action':("history"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden, activityType: activityType]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(84)
}
else {
printHtmlPart(85)
}
printHtmlPart(84)
if(true && (offset <= groupCount)) {
printHtmlPart(82)
createClosureForHtmlPart(86, 3)
invokeTag('link','g',359,['action':("history"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden, activityType: activityType]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(84)
}
else {
printHtmlPart(87)
}
printHtmlPart(88)
expressionOut.print(currentPage)
printHtmlPart(89)
if(true && (addToGroup)) {
printHtmlPart(90)
for( _it265845794 in (history) ) {
changeItVariable(_it265845794)
printHtmlPart(91)
expressionOut.print(it.groupID)
printHtmlPart(92)
expressionOut.print(it.groupName)
printHtmlPart(93)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(94)
expressionOut.print(it.groupName)
printHtmlPart(95)
createClosureForHtmlPart(96, 4)
invokeTag('link','g',398,['action':("addToGroup"),'params':([contactID: contactGroupAdd.contactID, groupID: it.groupID]),'type':("button"),'class':("btn btn-primary pull-left")],4)
printHtmlPart(97)
}
printHtmlPart(1)
}
printHtmlPart(98)
invokeTag('javascript','g',411,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(99)
invokeTag('javascript','g',413,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(100)
invokeTag('javascript','g',415,['src':("dashboard/app.min.js")],-1)
printHtmlPart(101)
})
invokeTag('captureBody','sitemesh',420,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(102)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1480394142091L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
