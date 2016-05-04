import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_home_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_home.gsp" }
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
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(41)
if(true && (contacts != 'NONE')) {
printHtmlPart(42)
for( _it1274699449 in (contacts) ) {
changeItVariable(_it1274699449)
printHtmlPart(43)
expressionOut.print(it.contactID)
printHtmlPart(44)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(45)
expressionOut.print(it.phoneNumber)
printHtmlPart(46)
if(true && (it.city)) {
printHtmlPart(47)
expressionOut.print(it.city,)
printHtmlPart(48)
expressionOut.print(it.state)
printHtmlPart(49)
}
else {
printHtmlPart(50)
}
printHtmlPart(51)
if(true && (it.subbed =! 'false')) {
printHtmlPart(52)
}
else {
printHtmlPart(53)
}
printHtmlPart(54)
}
printHtmlPart(55)
}
else {
printHtmlPart(56)
if(true && (isSearch)) {
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard'))
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
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(58)
}
else {
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(63)
}
printHtmlPart(64)
}
printHtmlPart(65)
if(true && (offset > 0)) {
printHtmlPart(66)
createClosureForHtmlPart(67, 3)
invokeTag('link','g',421,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(68)
}
else {
printHtmlPart(69)
}
printHtmlPart(70)
if(true && (offset <= clientCount)) {
printHtmlPart(71)
createClosureForHtmlPart(72, 3)
invokeTag('link','g',428,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(73)
}
else {
printHtmlPart(74)
}
printHtmlPart(75)
expressionOut.print(currentPage)
printHtmlPart(76)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(77)
for( _it707492405 in (contacts) ) {
changeItVariable(_it707492405)
printHtmlPart(78)
expressionOut.print(it.contactID)
printHtmlPart(79)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(80)
createClosureForHtmlPart(81, 4)
invokeTag('link','g',538,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(82)
createClosureForHtmlPart(83, 4)
invokeTag('link','g',545,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(84)
createClosureForHtmlPart(85, 4)
invokeTag('link','g',549,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(86)
createClosureForHtmlPart(87, 4)
invokeTag('link','g',554,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(88)
}
printHtmlPart(89)
}
printHtmlPart(90)
invokeTag('javascript','g',571,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(91)
invokeTag('javascript','g',574,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(92)
invokeTag('javascript','g',577,['src':("dashboard/app.min.js")],-1)
printHtmlPart(93)
})
invokeTag('captureBody','sitemesh',585,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(94)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462248990305L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
