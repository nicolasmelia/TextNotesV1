import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_groups_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_groups.gsp" }
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(11)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(12)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(13)
expressionOut.print(session.firstName)
printHtmlPart(14)
expressionOut.print(session.lastName)
printHtmlPart(15)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(16)
expressionOut.print(session.firstName)
printHtmlPart(14)
expressionOut.print(session.lastName)
printHtmlPart(17)
invokeTag('formatDate','g',139,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(18)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(19)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(20)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(21)
expressionOut.print(session.firstName)
printHtmlPart(14)
expressionOut.print(session.lastName)
printHtmlPart(22)
createClosureForHtmlPart(23, 2)
invokeTag('form','g',199,['controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(31)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(33)
if(true && (addToGroup)) {
printHtmlPart(34)
}
else {
printHtmlPart(35)
}
printHtmlPart(36)
if(true && (addToGroup)) {
printHtmlPart(37)
}
else {
printHtmlPart(38)
}
printHtmlPart(39)
if(true && (groupCount == 0)) {
printHtmlPart(40)
}
printHtmlPart(41)
expressionOut.print(searchQueryHidden)
printHtmlPart(42)
expressionOut.print(offset)
printHtmlPart(43)
expressionOut.print(groupCount)
printHtmlPart(44)
if(true && (addToGroup)) {
printHtmlPart(45)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(46)
}
printHtmlPart(47)
if(true && (groupCount > 0 || offset > 0)) {
printHtmlPart(48)
if(true && (groups != 'NONE')) {
printHtmlPart(49)
for( _it541568490 in (groups) ) {
changeItVariable(_it541568490)
printHtmlPart(50)
if(true && (addToGroup)) {
printHtmlPart(51)
expressionOut.print(it.groupID)
printHtmlPart(52)
}
else {
printHtmlPart(53)
expressionOut.print(createLink(controller: 'Dashboard', action: 'detailedGroup', params: [groupID: it.groupID]))
printHtmlPart(54)
}
printHtmlPart(55)
expressionOut.print(it.groupName)
printHtmlPart(56)
expressionOut.print(it.memberCount)
printHtmlPart(57)
if(true && (it.description)) {
printHtmlPart(58)
expressionOut.print(it.description)
printHtmlPart(59)
}
else {
printHtmlPart(60)
}
printHtmlPart(61)
}
printHtmlPart(62)
}
else {
printHtmlPart(63)
}
printHtmlPart(64)
}
else {
printHtmlPart(65)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(66)
}
printHtmlPart(67)
if(true && (offset > 0)) {
printHtmlPart(68)
createClosureForHtmlPart(69, 3)
invokeTag('link','g',373,['action':("groups"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(70)
}
else {
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (offset <= groupCount)) {
printHtmlPart(73)
createClosureForHtmlPart(74, 3)
invokeTag('link','g',380,['action':("groups"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(75)
}
else {
printHtmlPart(76)
}
printHtmlPart(77)
expressionOut.print(currentPage)
printHtmlPart(78)
if(true && (groups != 'NONE')) {
printHtmlPart(79)
if(true && (addToGroup)) {
printHtmlPart(80)
for( _it1525943877 in (groups) ) {
changeItVariable(_it1525943877)
printHtmlPart(81)
expressionOut.print(it.groupID)
printHtmlPart(82)
expressionOut.print(it.groupName)
printHtmlPart(83)
expressionOut.print(contactGroupAdd.fullName)
printHtmlPart(84)
expressionOut.print(it.groupName)
printHtmlPart(85)
createClosureForHtmlPart(86, 5)
invokeTag('link','g',494,['action':("addToGroup"),'params':([contactID: contactGroupAdd.contactID, groupID: it.groupID]),'type':("button"),'class':("btn btn-primary pull-left")],5)
printHtmlPart(87)
}
printHtmlPart(88)
}
printHtmlPart(88)
}
printHtmlPart(89)
invokeTag('javascript','g',509,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(90)
invokeTag('javascript','g',512,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(91)
invokeTag('javascript','g',515,['src':("dashboard/app.min.js")],-1)
printHtmlPart(92)
})
invokeTag('captureBody','sitemesh',523,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(93)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1469925102689L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
