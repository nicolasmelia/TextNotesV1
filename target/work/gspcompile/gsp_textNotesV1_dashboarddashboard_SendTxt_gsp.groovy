import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboarddashboard_SendTxt_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/dashboard_SendTxt.gsp" }
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
printHtmlPart(6)
invokeTag('resource','g',34,['dir':("js"),'file':("dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',36,['dir':("js"),'file':("dashboard/plugins/select2/select2.min.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',38,['dir':("js"),'file':("tagsinput/dist/bootstrap-tagsinput.css")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',47,[:],1)
printHtmlPart(10)
createTagBody(1, {->
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
invokeTag('formatDate','g',143,['format':("yyyy"),'date':(session.signUpDate)],-1)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'groups'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Dashboard', action: 'newContact'))
printHtmlPart(25)
expressionOut.print(createLink(controller: 'Dashboard', action: 'sendTxt'))
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'secheduledTxt'))
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Dashboard', action: 'txtHostory'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'Dashboard', action: 'ViewPromos'))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'Dashboard', action: 'validatePromo'))
printHtmlPart(30)
expressionOut.print(createLink(controller: 'Dashboard', action: 'createPromo'))
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
expressionOut.print(preClientName)
printHtmlPart(33)
expressionOut.print(preClientID)
printHtmlPart(34)
})
invokeTag('form','g',328,['id':("txtForm"),'class':("form-signin"),'controller':("SmsGateOut"),'action':("messageOut"),'enctype':("multipart/form-data")],2)
printHtmlPart(35)
expressionOut.print(createLink(action: 'getRecipCount'))
printHtmlPart(36)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(37)
expressionOut.print(UAI.remainingMonthlyTextBalance)
printHtmlPart(38)
expressionOut.print(UAI.remainingMonthlyTextBalance)
printHtmlPart(39)
expressionOut.print(UAI.monthlyTextBalance)
printHtmlPart(40)
if(true && (groups != 'NONE')) {
printHtmlPart(41)
for( _it327264211 in (groups) ) {
changeItVariable(_it327264211)
printHtmlPart(42)
if(true && (addToGroup)) {
printHtmlPart(43)
expressionOut.print(it.groupID)
printHtmlPart(44)
}
else {
printHtmlPart(45)
expressionOut.print(it.groupID)
printHtmlPart(46)
expressionOut.print(it.groupName)
printHtmlPart(47)
}
printHtmlPart(48)
expressionOut.print(it.groupName)
printHtmlPart(49)
expressionOut.print(it.memberCount)
printHtmlPart(50)
if(true && (it.description)) {
printHtmlPart(51)
expressionOut.print(it.description)
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
expressionOut.print(createLink(controller: 'Dashboard', action: 'createGroup'))
printHtmlPart(57)
}
printHtmlPart(58)
expressionOut.print(createLink(controller: 'Dashboard', action: 'searchContactAjax'))
printHtmlPart(59)
})
invokeTag('captureBody','sitemesh',686,['class':("hold-transition skin-purple sidebar-mini")],1)
printHtmlPart(60)
invokeTag('javascript','g',691,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(61)
invokeTag('javascript','g',694,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(62)
invokeTag('javascript','g',697,['src':("dashboard/app.min.js")],-1)
printHtmlPart(63)
invokeTag('javascript','g',699,['src':("dashboard/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js")],-1)
printHtmlPart(64)
invokeTag('javascript','g',701,['src':("dashboard/plugins/select2/select2.full.min.js")],-1)
printHtmlPart(63)
invokeTag('javascript','g',703,['src':("tagsinput/dist/bootstrap-tagsinput.min.js")],-1)
printHtmlPart(65)
invokeTag('javascript','g',705,['src':("dataAccess.js")],-1)
printHtmlPart(66)
invokeTag('javascript','g',709,['src':("dashboard/plugins/input-mask/jquery.inputmask.js")],-1)
printHtmlPart(67)
invokeTag('javascript','g',710,['src':("dashboard/plugins/input-mask/jquery.inputmask.date.extensions.js")],-1)
printHtmlPart(67)
invokeTag('javascript','g',711,['src':("dashboard/plugins/input-mask/jquery.inputmask.extensions.js")],-1)
printHtmlPart(68)
invokeTag('javascript','g',716,['src':("dashboard/plugins/daterangepicker/daterangepicker.js")],-1)
printHtmlPart(69)
invokeTag('javascript','g',719,['src':("dashboard/plugins/colorpicker/bootstrap-colorpicker.min.js")],-1)
printHtmlPart(70)
invokeTag('javascript','g',722,['src':("dashboard/plugins/timepicker/bootstrap-timepicker.min.js")],-1)
printHtmlPart(71)
invokeTag('javascript','g',725,['src':("dashboard/plugins/slimScroll/jquery.slimscroll.min.js")],-1)
printHtmlPart(72)
invokeTag('javascript','g',728,['src':("dashboard/plugins/iCheck/icheck.min.js")],-1)
printHtmlPart(73)
invokeTag('javascript','g',731,['src':("dashboard/plugins/fastclick/fastclick.min.js")],-1)
printHtmlPart(74)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1462065333207L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
