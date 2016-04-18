import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_confirmation_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_confirmation.gsp" }
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
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
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
invokeTag('formatDate','g',137,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(22)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(30)
if(true && (params.conType == 'Message')) {
printHtmlPart(31)
expressionOut.print(params.totalRecp)
printHtmlPart(32)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(33)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',276,['class':("btn btn-default"),'action':("details"),'params':([conType: 'Message', messageID: params.messageID]),'type':("button")],3)
printHtmlPart(35)
}
else if(true && (conType == 'AddContact')) {
printHtmlPart(36)
expressionOut.print(params.name)
printHtmlPart(37)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(38)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',306,['class':("btn btn-default"),'action':("details"),'params':([contactID: params.contactID, conType: 'Contact']),'type':("button")],3)
printHtmlPart(39)
createClosureForHtmlPart(40, 3)
invokeTag('link','g',310,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: params.contactID]),'type':("button")],3)
printHtmlPart(41)
}
else if(true && (conType == 'editContact')) {
printHtmlPart(42)
expressionOut.print(params.name)
printHtmlPart(43)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(38)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',344,['class':("btn btn-default"),'action':("details"),'params':([contactID: params.contactID, conType: 'Contact']),'type':("button")],3)
printHtmlPart(39)
createClosureForHtmlPart(40, 3)
invokeTag('link','g',348,['class':("btn btn-default"),'action':("sendTxt"),'params':([contactID: params.contactID]),'type':("button")],3)
printHtmlPart(41)
}
else if(true && (conType == 'FAILEDAddContact')) {
printHtmlPart(44)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(45)
}
else if(true && (conType == 'FAILEDtext')) {
printHtmlPart(46)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(47)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(48)
}
else if(true && (conType == 'addGroup')) {
printHtmlPart(49)
expressionOut.print(params.name)
printHtmlPart(50)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(51)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',435,['class':("btn btn-default"),'action':("details"),'params':([groupID: params.groupID]),'type':("button")],3)
printHtmlPart(52)
}
else if(true && (conType == 'FAILEDaddGroup')) {
printHtmlPart(53)
expressionOut.print(params.name)
printHtmlPart(54)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(51)
createClosureForHtmlPart(34, 3)
invokeTag('link','g',466,['class':("btn btn-default"),'action':("details"),'params':([groupID: params.groupID]),'type':("button")],3)
printHtmlPart(52)
}
else if(true && (conType == 'AddContactToGroupSuccess')) {
printHtmlPart(55)
expressionOut.print(params.name)
printHtmlPart(56)
expressionOut.print(params.groupName)
printHtmlPart(57)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(59)
}
else if(true && (conType == 'AddContactToGroupFail')) {
printHtmlPart(60)
expressionOut.print(params.name)
printHtmlPart(61)
expressionOut.print(params.groupName)
printHtmlPart(62)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(63)
}
printHtmlPart(64)
invokeTag('javascript','g',611,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(65)
invokeTag('javascript','g',614,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(66)
invokeTag('javascript','g',617,['src':("dashboard/app.min.js")],-1)
printHtmlPart(67)
})
invokeTag('captureBody','sitemesh',652,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(68)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1460511028283L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
