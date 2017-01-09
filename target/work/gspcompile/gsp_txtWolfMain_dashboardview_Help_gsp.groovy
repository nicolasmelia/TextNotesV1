import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_txtWolfMain_dashboardview_Help_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/view_Help.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'fcontent':("IE=edge")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'content':("width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"),'name':("viewport")],-1)
printHtmlPart(5)
invokeTag('resource','g',12,['dir':("css"),'file':("dashboard/bootstrap/css/bootstrap.min.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',19,['dir':("css"),'file':("dashboard/AdminLTE.min.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',20,['dir':("css"),'file':("dashboard/CustomCSS.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',21,['dir':("css"),'file':("help/style.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',27,['dir':("css"),'file':("dashboard/skins/skin-purple.min.css")],-1)
printHtmlPart(9)
invokeTag('resource','g',28,['dir':("css"),'file':("dashboard/skins/_all-skins.min.css")],-1)
printHtmlPart(10)
})
invokeTag('captureHead','sitemesh',45,[:],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
expressionOut.print(createLink(controller: 'Dashboard', action: 'dashboard'))
printHtmlPart(13)
expressionOut.print(createLink(controller: 'dashboard'))
printHtmlPart(14)
expressionOut.print(createLink(controller: 'Blog'))
printHtmlPart(15)
expressionOut.print(createLink(controller: 'dashboard', action: 'help'))
printHtmlPart(16)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(17)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(18)
expressionOut.print(session.firstName)
printHtmlPart(19)
expressionOut.print(session.lastName)
printHtmlPart(20)
invokeTag('formatDate','g',102,['format':("yyyy"),'date':(session.signUpDate)],-1)
printHtmlPart(21)
expressionOut.print(createLink(controller: 'dashboard', action: 'accountSettings'))
printHtmlPart(22)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(23)
expressionOut.print(createLink(controller: 'Dashboard', action: 'Dashboard'))
printHtmlPart(24)
expressionOut.print(createLink(controller: 'blog'))
printHtmlPart(25)
invokeTag('javascript','g',310,['src':("dashboard/plugins/jQuery/jQuery-2.1.4.min.js")],-1)
printHtmlPart(26)
invokeTag('javascript','g',312,['src':("dashboard/bootstrap/js/bootstrap.min.js")],-1)
printHtmlPart(27)
invokeTag('javascript','g',314,['src':("dashboard/app.min.js")],-1)
printHtmlPart(28)
invokeTag('javascript','g',317,['src':("help/docs.js")],-1)
printHtmlPart(29)
})
invokeTag('captureBody','sitemesh',319,['class':("skin-purple fixed"),'data-spy':("scroll"),'data-target':("#scrollspy")],1)
printHtmlPart(30)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1483923622615L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
