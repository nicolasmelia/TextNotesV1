import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_loginLogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/Login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',9,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',9,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("viewport"),'content':("width=device-width, initial-scale=1")],-1)
printHtmlPart(3)
invokeTag('javascript','g',12,['src':("ie/html5shiv.js")],-1)
printHtmlPart(4)
invokeTag('resource','g',13,['dir':("css"),'file':("mainBoot.css")],-1)
printHtmlPart(5)
invokeTag('resource','g',16,['dir':("css"),'file':("remodal/remodal.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',17,['dir':("css"),'file':("remodal/remodal-default-theme.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',19,['dir':("css"),'file':("ie8.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',20,['dir':("css"),'file':("ie9.css")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(10)
createTagBody(1, {->
printHtmlPart(11)
createTagBody(2, {->
printHtmlPart(12)
invokeTag('actionSubmit','g',63,['id':("submitBtn"),'onclick':("return validateForm()"),'value':("Next"),'action':("attemptLogin"),'style':("margin-top: 15px; width: 100%")],-1)
printHtmlPart(13)
})
invokeTag('form','g',65,['class':("form-signin"),'controller':("Login"),'action':("attemptLogin"),'enctype':("multipart/form-data")],2)
printHtmlPart(14)
invokeTag('javascript','g',108,['src':("jquery.min.js")],-1)
printHtmlPart(15)
invokeTag('javascript','g',109,['src':("jquery.scrollex.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',110,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',111,['src':("skel.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',112,['src':("util.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',113,['src':("main.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',114,['src':("formValidation/validation.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',115,['src':("remodal/remodal.min.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',116,['src':("remodal/remodalControls.js")],-1)
printHtmlPart(18)
invokeTag('javascript','g',118,['src':("ie/respond.min.js")],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',156,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1446686146969L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
