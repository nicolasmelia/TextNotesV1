import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_DetailedGroup_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_DetailedGroup.gsp" }
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
for( _it1933073727 in (keywordsIn) ) {
changeItVariable(_it1933073727)
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
expressionOut.print(group.groupName)
printHtmlPart(57)
if(true && (groupMemberCount == 0)) {
printHtmlPart(58)
}
printHtmlPart(59)
expressionOut.print(searchQueryHidden)
printHtmlPart(60)
expressionOut.print(offset)
printHtmlPart(61)
expressionOut.print(clientCount)
printHtmlPart(62)
expressionOut.print(createLink(controller: 'Dashboard', action: 'contacts'))
printHtmlPart(63)
expressionOut.print(group.groupName)
printHtmlPart(64)
createTagBody(2, {->
printHtmlPart(65)
expressionOut.print(group.groupID)
printHtmlPart(66)
if(true && (addToGroup)) {
printHtmlPart(67)
}
else {
printHtmlPart(68)
invokeTag('actionSubmit','g',281,['action':("detailedGroup"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(69)
}
printHtmlPart(70)
})
invokeTag('form','g',286,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(71)
if(true && (clientCount || contacts != 'NONE' || offset > 0)) {
printHtmlPart(20)
if(true && (contacts != 'NONE')) {
printHtmlPart(14)
for( _it1746150957 in (contacts) ) {
changeItVariable(_it1746150957)
printHtmlPart(72)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(73)
expressionOut.print(it.contactID)
printHtmlPart(74)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(75)
expressionOut.print(it.phoneNumber)
printHtmlPart(76)
if(true && (it.city)) {
printHtmlPart(77)
expressionOut.print(it.city,)
printHtmlPart(78)
expressionOut.print(it.state)
printHtmlPart(76)
}
else {
printHtmlPart(79)
}
printHtmlPart(80)
if(true && (it.subbed =! 'false')) {
printHtmlPart(81)
}
else {
printHtmlPart(82)
}
printHtmlPart(83)
}
printHtmlPart(20)
}
else {
printHtmlPart(14)
if(true && (isSearch)) {
printHtmlPart(84)
expressionOut.print(createLink(action: 'groups'))
printHtmlPart(85)
}
else {
printHtmlPart(86)
}
printHtmlPart(20)
}
printHtmlPart(87)
}
else {
printHtmlPart(20)
if(true && (isSearch)) {
printHtmlPart(88)
expressionOut.print(createLink(controller: 'groups'))
printHtmlPart(89)
}
else {
printHtmlPart(90)
}
printHtmlPart(87)
}
printHtmlPart(91)
if(true && (offset > 0)) {
printHtmlPart(92)
createClosureForHtmlPart(93, 3)
invokeTag('link','g',373,['action':("detailedGroup"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden, groupName: group.groupName, groupID: group.groupID]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(94)
}
else {
printHtmlPart(95)
}
printHtmlPart(94)
if(true && (offset <= clientCount)) {
printHtmlPart(92)
createClosureForHtmlPart(96, 3)
invokeTag('link','g',379,['action':("detailedGroup"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden, groupName: group.groupName, groupID: group.groupID]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(94)
}
else {
printHtmlPart(97)
}
printHtmlPart(98)
expressionOut.print(currentPage)
printHtmlPart(99)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(100)
for( _it2143419697 in (contacts) ) {
changeItVariable(_it2143419697)
printHtmlPart(101)
expressionOut.print(it.contactID)
printHtmlPart(102)
expressionOut.print(it.firstName)
printHtmlPart(30)
expressionOut.print(it.lastName)
printHtmlPart(103)
createClosureForHtmlPart(104, 4)
invokeTag('link','g',480,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(105)
createClosureForHtmlPart(106, 4)
invokeTag('link','g',482,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(107)
createClosureForHtmlPart(108, 4)
invokeTag('link','g',483,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(107)
createClosureForHtmlPart(109, 4)
invokeTag('link','g',484,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(110)
}
printHtmlPart(1)
}
printHtmlPart(111)
invokeTag('javascript','g',499,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(112)
invokeTag('javascript','g',501,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(113)
invokeTag('javascript','g',503,['src':("dashboard/app.min.js")],-1)
printHtmlPart(114)
})
invokeTag('captureBody','sitemesh',508,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(115)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1478478068994L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
