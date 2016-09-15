import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_history_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_history.gsp" }
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
for( _it2087313889 in (keywordsIn) ) {
changeItVariable(_it2087313889)
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
if(true && (groupCount == 0)) {
printHtmlPart(55)
}
printHtmlPart(56)
expressionOut.print(searchQueryHidden)
printHtmlPart(57)
expressionOut.print(offset)
printHtmlPart(58)
expressionOut.print(groupCount)
printHtmlPart(59)
createTagBody(2, {->
printHtmlPart(60)
if(true && (activityType == 'all' || activityType == null)) {
printHtmlPart(61)
}
else {
printHtmlPart(62)
}
printHtmlPart(63)
invokeTag('actionSubmit','g',287,['id':("selectTypeForm"),'style':("display:none;"),'action':("history"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("selectTypeForm")],-1)
printHtmlPart(64)
})
invokeTag('form','g',288,['id':("searchForm"),'controller':("Dashboard"),'action':("history"),'enctype':("multipart/form-data")],2)
printHtmlPart(65)
if(true && (groupCount > 0 || offset > 0)) {
printHtmlPart(20)
if(true && (history != 'NONE')) {
printHtmlPart(14)
for( _it2069016970 in (history) ) {
changeItVariable(_it2069016970)
printHtmlPart(66)
if(true && (it.type == 'Coupon Code')) {
printHtmlPart(67)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID, showNumber : true]))
printHtmlPart(68)
}
else if(true && (it.type == 'Message')) {
printHtmlPart(67)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: it.type, messageID: it.hashOne]))
printHtmlPart(68)
}
else {
printHtmlPart(67)
expressionOut.print(createLink(controller: 'Dashboard', action: 'details', params: [conType: 'History',  historyID: it.historyID]))
printHtmlPart(68)
}
printHtmlPart(69)
expressionOut.print(it.type)
printHtmlPart(70)
if(true && (it.description)) {
printHtmlPart(71)
expressionOut.print(it.description)
printHtmlPart(70)
}
else {
printHtmlPart(72)
}
printHtmlPart(73)
invokeTag('formatDate','g',319,['format':("MM-dd-yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(74)
}
printHtmlPart(20)
}
else {
printHtmlPart(75)
}
printHtmlPart(76)
}
else {
printHtmlPart(77)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(78)
}
printHtmlPart(79)
if(true && (offset > 0)) {
printHtmlPart(80)
createClosureForHtmlPart(81, 3)
invokeTag('link','g',349,['action':("history"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden, activityType: activityType]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(82)
}
else {
printHtmlPart(83)
}
printHtmlPart(82)
if(true && (offset <= groupCount)) {
printHtmlPart(80)
createClosureForHtmlPart(84, 3)
invokeTag('link','g',355,['action':("history"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden, activityType: activityType]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(82)
}
else {
printHtmlPart(85)
}
printHtmlPart(86)
expressionOut.print(currentPage)
printHtmlPart(87)
if(true && (addToGroup)) {
printHtmlPart(88)
for( _it466010637 in (history) ) {
changeItVariable(_it466010637)
printHtmlPart(89)
expressionOut.print(it.groupID)
printHtmlPart(90)
expressionOut.print(it.groupName)
printHtmlPart(91)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(92)
expressionOut.print(it.groupName)
printHtmlPart(93)
createClosureForHtmlPart(94, 4)
invokeTag('link','g',458,['action':("addToGroup"),'params':([contactID: contactGroupAdd.contactID, groupID: it.groupID]),'type':("button"),'class':("btn btn-primary pull-left")],4)
printHtmlPart(95)
}
printHtmlPart(1)
}
printHtmlPart(96)
invokeTag('javascript','g',471,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(97)
invokeTag('javascript','g',473,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(98)
invokeTag('javascript','g',475,['src':("dashboard/app.min.js")],-1)
printHtmlPart(99)
})
invokeTag('captureBody','sitemesh',480,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(100)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1473642310119L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
