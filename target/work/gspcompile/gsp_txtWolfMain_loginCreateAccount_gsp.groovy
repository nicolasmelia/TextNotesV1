import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_txtWolfMain_loginCreateAccount_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/CreateAccount.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(3)
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(4)
invokeTag('resource','g',14,['dir':("css"),'file':("main.boot.css")],-1)
printHtmlPart(5)
invokeTag('javascript','g',16,['src':("ie/html5shiv.js")],-1)
printHtmlPart(6)
invokeTag('resource','g',17,['dir':("css"),'file':("ie8.css")],-1)
printHtmlPart(7)
})
invokeTag('captureHead','sitemesh',18,[:],1)
printHtmlPart(8)
createTagBody(1, {->
printHtmlPart(9)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(10)
expressionOut.print(createLink(controller: 'Home'))
printHtmlPart(11)
expressionOut.print(createLink(controller: 'Home', action: 'pricing'))
printHtmlPart(12)
if(true && (session.userID)) {
printHtmlPart(13)
expressionOut.print(createLink(controller: 'Dashboard'))
printHtmlPart(14)
}
else {
printHtmlPart(13)
expressionOut.print(createLink(controller: 'login'))
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (session.userID)) {
printHtmlPart(13)
expressionOut.print(createLink(controller: 'Login', action: 'logout'))
printHtmlPart(17)
}
else {
printHtmlPart(13)
expressionOut.print(createLink(controller: 'login', action: 'newAccount'))
printHtmlPart(18)
}
printHtmlPart(19)
if(true && (error)) {
printHtmlPart(20)
expressionOut.print(error)
printHtmlPart(21)
}
else {
printHtmlPart(22)
}
printHtmlPart(23)
createTagBody(2, {->
printHtmlPart(24)
expressionOut.print(createLink(controller: 'Home', action: 'affiliateProgram'))
printHtmlPart(25)
invokeTag('actionSubmit','g',148,['class':("special"),'id':("submitBtn"),'onclick':("return validateForm()"),'value':("Create Account"),'action':("createAccount"),'style':("width: 100%")],-1)
printHtmlPart(26)
})
invokeTag('form','g',157,['class':("form-signin"),'controller':("Login"),'action':("createAccount"),'enctype':("multipart/form-data")],2)
printHtmlPart(27)
expressionOut.print(createLink(controller: 'Home', action: 'pricing'))
printHtmlPart(28)
expressionOut.print(createLink(controller: 'blog', params: [blogID: '1']))
printHtmlPart(29)
expressionOut.print(createLink(controller: 'blog', params: [blogID: '2']))
printHtmlPart(30)
invokeTag('javascript','g',217,['src':("jquery.min.js")],-1)
printHtmlPart(31)
invokeTag('javascript','g',218,['src':("jquery.dropotron.min.js")],-1)
printHtmlPart(32)
invokeTag('javascript','g',219,['src':("jquery.scrollgress.min.js")],-1)
printHtmlPart(31)
invokeTag('javascript','g',220,['src':("skel.min.js")],-1)
printHtmlPart(31)
invokeTag('javascript','g',221,['src':("util.js")],-1)
printHtmlPart(33)
invokeTag('javascript','g',222,['src':("main.js")],-1)
printHtmlPart(33)
invokeTag('javascript','g',223,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(34)
invokeTag('javascript','g',224,['src':("ie/respond.min.js")],-1)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',320,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1482112205436L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
