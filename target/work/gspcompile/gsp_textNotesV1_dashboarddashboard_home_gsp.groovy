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
if(true && (clientCount == 0)) {
printHtmlPart(34)
}
printHtmlPart(35)
expressionOut.print(searchQueryHidden)
printHtmlPart(36)
expressionOut.print(offset)
printHtmlPart(37)
expressionOut.print(clientCount)
printHtmlPart(38)
createTagBody(2, {->
printHtmlPart(39)
invokeTag('actionSubmit','g',259,['action':("dashboard"),'class':("btn btn-info btn-flat"),'type':("button"),'value':("Search")],-1)
printHtmlPart(40)
})
invokeTag('form','g',263,['id':("searchForm"),'controller':("Dashboard"),'action':("dashboard"),'enctype':("multipart/form-data")],2)
printHtmlPart(41)
if(true && (clientCount > 0 || offset > 0)) {
printHtmlPart(42)
if(true && (contacts != 'NONE')) {
printHtmlPart(43)
for( _it470217116 in (contacts) ) {
changeItVariable(_it470217116)
printHtmlPart(44)
expressionOut.print(it.contactID)
printHtmlPart(45)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(46)
expressionOut.print(it.phoneNumber)
printHtmlPart(47)
if(true && (it.city)) {
printHtmlPart(48)
expressionOut.print(it.city,)
printHtmlPart(49)
expressionOut.print(it.state)
printHtmlPart(50)
}
else {
printHtmlPart(51)
}
printHtmlPart(52)
if(true && (it.subbed =! 'false')) {
printHtmlPart(53)
}
else {
printHtmlPart(54)
}
printHtmlPart(55)
}
printHtmlPart(56)
}
else {
printHtmlPart(57)
if(true && (isSearch)) {
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard'))
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
if(true && (isSearch)) {
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(59)
}
else {
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(64)
}
printHtmlPart(65)
}
printHtmlPart(66)
if(true && (offset > 0)) {
printHtmlPart(67)
createClosureForHtmlPart(68, 3)
invokeTag('link','g',362,['action':("dashboard"),'params':([offset: offset, up: 'false', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(69)
}
else {
printHtmlPart(70)
}
printHtmlPart(71)
if(true && (offset <= clientCount)) {
printHtmlPart(72)
createClosureForHtmlPart(73, 3)
invokeTag('link','g',369,['action':("dashboard"),'params':([offset: offset, up: 'true', searchQueryHidden: searchQueryHidden]),'type':("button"),'class':("btn btn-default")],3)
printHtmlPart(74)
}
else {
printHtmlPart(75)
}
printHtmlPart(76)
expressionOut.print(currentPage)
printHtmlPart(77)
if(true && (contacts && contacts != 'NONE')) {
printHtmlPart(78)
for( _it811986896 in (contacts) ) {
changeItVariable(_it811986896)
printHtmlPart(79)
expressionOut.print(it.contactID)
printHtmlPart(80)
expressionOut.print(it.firstName)
printHtmlPart(13)
expressionOut.print(it.lastName)
printHtmlPart(81)
createClosureForHtmlPart(82, 4)
invokeTag('link','g',479,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("sendTxt"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(83)
createClosureForHtmlPart(84, 4)
invokeTag('link','g',486,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("editContact"),'params':([contactID: it.contactID]),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(85)
createClosureForHtmlPart(86, 4)
invokeTag('link','g',490,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("details"),'params':([contactID: it.contactID, conType: 'Contact']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(87)
createClosureForHtmlPart(88, 4)
invokeTag('link','g',495,['style':("margin-bottom:0px; margin-top: 15px; "),'action':("groups"),'params':([contactID: it.contactID, addToGroup: 'True']),'type':("button"),'class':("btn btn-app")],4)
printHtmlPart(89)
}
printHtmlPart(90)
}
printHtmlPart(91)
invokeTag('javascript','g',512,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(92)
invokeTag('javascript','g',515,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(93)
invokeTag('javascript','g',518,['src':("dashboard/app.min.js")],-1)
printHtmlPart(94)
})
invokeTag('captureBody','sitemesh',526,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(95)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1461637345000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
