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
expressionOut.print(group.groupName)
printHtmlPart(34)
expressionOut.print(searchQueryHidden)
printHtmlPart(35)
expressionOut.print(offset)
printHtmlPart(36)
expressionOut.print(clientCount)
printHtmlPart(37)
expressionOut.print(group.groupName)
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
expressionOut.print(group.groupID)
printHtmlPart(40)
if(true && (addToGroup)) {
printHtmlPart(41)
}
else {
printHtmlPart(42)
invokeTag('actionSubmit','g',281,['action':("detailedGroup"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(43)
}
printHtmlPart(44)
})
invokeTag('form','g',289,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(45)
if(true && (clientCount || contacts != 'NONE' || offset > 0)) {
printHtmlPart(46)
if(true && (contacts != 'NONE')) {
printHtmlPart(47)
for( _it1674824156 in (contacts) ) {
changeItVariable(_it1674824156)
printHtmlPart(48)
expressionOut.print(it.firstName)
printHtmlPart(14)
expressionOut.print(it.lastName)
printHtmlPart(49)
expressionOut.print(it.contactID)
printHtmlPart(50)
expressionOut.print(it.firstName)
printHtmlPart(14)
expressionOut.print(it.lastName)
printHtmlPart(51)
expressionOut.print(it.phoneNumber)
printHtmlPart(52)
if(true && (it.city)) {
printHtmlPart(53)
expressionOut.print(it.city,)
printHtmlPart(54)
expressionOut.print(it.state)
printHtmlPart(55)
}
else {
printHtmlPart(56)
}
printHtmlPart(57)
if(true && (it.subbed =! 'false')) {
printHtmlPart(58)
}
else {
printHtmlPart(59)
}
printHtmlPart(60)
}
printHtmlPart(61)
}
else {
printHtmlPart(62)
if(true && (isSearch)) {
printHtmlPart(63)
expressionOut.print(createLink(action: 'groups'))
printHtmlPart(64)
}
else {
printHtmlPart(65)
}
printHtmlPart(66)
}
printHtmlPart(67)
}
else {
printHtmlPart(68)
if(true && (isSearch)) {
printHtmlPart(63)
expressionOut.print(createLink(controller: 'groups'))
printHtmlPart(69)
}
else {
printHtmlPart(70)
}
printHtmlPart(71)
}
printHtmlPart(72)
if(true && (offset > 0)) {
printHtmlPart(73)
createClosureForHtmlPart(74, 3)
invokeTag('link','g',392,['action':("detailedGroup"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden, groupName: group.groupName, groupID: group.groupID]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(75)
}
else {
printHtmlPart(76)
}
printHtmlPart(77)
if(true && (offset <= clientCount)) {
printHtmlPart(78)
createClosureForHtmlPart(79, 3)
invokeTag('link','g',399,['action':("detailedGroup"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden, groupName: group.groupName, groupID: group.groupID]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(80)
}
else {
printHtmlPart(81)
}
printHtmlPart(82)
expressionOut.print(currentPage)
printHtmlPart(83)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(84)
for( _it60924092 in (contacts) ) {
changeItVariable(_it60924092)
printHtmlPart(85)
expressionOut.print(it.contactID)
printHtmlPart(86)
expressionOut.print(it.firstName)
printHtmlPart(14)
expressionOut.print(it.lastName)
printHtmlPart(87)
createClosureForHtmlPart(88, 4)
invokeTag('link','g',510,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(89)
createClosureForHtmlPart(90, 4)
invokeTag('link','g',517,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(91)
createClosureForHtmlPart(92, 4)
invokeTag('link','g',521,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(93)
}
printHtmlPart(94)
}
printHtmlPart(95)
invokeTag('javascript','g',541,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(96)
invokeTag('javascript','g',544,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(97)
invokeTag('javascript','g',547,['src':("dashboard/app.min.js")],-1)
printHtmlPart(98)
})
invokeTag('captureBody','sitemesh',555,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(99)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1472264499255L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
