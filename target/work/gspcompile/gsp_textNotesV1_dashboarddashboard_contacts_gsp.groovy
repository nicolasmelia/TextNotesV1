import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_contacts_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_contacts.gsp" }
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
invokeTag('formatDate','g',108,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
createClosureForHtmlPart(22, 2)
invokeTag('form','g',168,['controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data"),'class':("sidebar-form")],2)
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(31)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(33)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(34)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(35)
if(true && (clientCount == 0)) {
printHtmlPart(36)
}
printHtmlPart(37)
expressionOut.print(searchQueryHidden)
printHtmlPart(38)
expressionOut.print(offset)
printHtmlPart(39)
expressionOut.print(clientCount)
printHtmlPart(40)
createTagBody(2, {->
printHtmlPart(41)
invokeTag('actionSubmit','g',265,['action':("dashboard"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(42)
})
invokeTag('form','g',269,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(43)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(44)
if(true && (contacts != 'NONE')) {
printHtmlPart(45)
for( _it1645241964 in (contacts) ) {
changeItVariable(_it1645241964)
printHtmlPart(46)
expressionOut.print(it.contactID)
printHtmlPart(47)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(48)
expressionOut.print(it.phoneNumber)
printHtmlPart(49)
if(true && (it.city)) {
printHtmlPart(50)
expressionOut.print(it.city,)
printHtmlPart(51)
expressionOut.print(it.state)
printHtmlPart(52)
}
else {
printHtmlPart(53)
}
printHtmlPart(54)
if(true && (it.subbed =! 'false')) {
printHtmlPart(55)
}
else {
printHtmlPart(56)
}
printHtmlPart(57)
}
printHtmlPart(58)
}
else {
printHtmlPart(59)
if(true && (isSearch)) {
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(61)
}
else {
printHtmlPart(62)
}
printHtmlPart(63)
}
printHtmlPart(64)
}
else {
printHtmlPart(65)
if(true && (isSearch)) {
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(61)
}
else {
printHtmlPart(60)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(66)
}
printHtmlPart(67)
}
printHtmlPart(68)
if(true && (offset > 0)) {
printHtmlPart(69)
createClosureForHtmlPart(70, 3)
invokeTag('link','g',368,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(71)
}
else {
printHtmlPart(72)
}
printHtmlPart(73)
if(true && (offset <= clientCount)) {
printHtmlPart(74)
createClosureForHtmlPart(75, 3)
invokeTag('link','g',375,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(76)
}
else {
printHtmlPart(77)
}
printHtmlPart(78)
expressionOut.print(currentPage)
printHtmlPart(79)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(80)
for( _it499802818 in (contacts) ) {
changeItVariable(_it499802818)
printHtmlPart(81)
expressionOut.print(it.contactID)
printHtmlPart(82)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(83)
createClosureForHtmlPart(84, 4)
invokeTag('link','g',485,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(85)
createClosureForHtmlPart(86, 4)
invokeTag('link','g',492,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(87)
createClosureForHtmlPart(88, 4)
invokeTag('link','g',496,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(89)
createClosureForHtmlPart(90, 4)
invokeTag('link','g',501,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(91)
}
printHtmlPart(92)
}
printHtmlPart(93)
invokeTag('javascript','g',518,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(94)
invokeTag('javascript','g',521,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(95)
invokeTag('javascript','g',524,['src':("dashboard/app.min.js")],-1)
printHtmlPart(96)
})
invokeTag('captureBody','sitemesh',532,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(97)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462724106348L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
