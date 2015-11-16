import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_loginJoinBeta_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/JoinBeta.gsp" }
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
invokeTag('actionSubmit','g',75,['id':("submitBtn"),'onclick':("return validateForm()"),'value':("Join"),'action':("attemptLogin"),'style':("margin-top: 15px; width: 100%")],-1)
printHtmlPart(13)
})
invokeTag('form','g',77,['class':("form-signin"),'controller':("Login"),'action':("attemptLogin"),'enctype':("multipart/form-data")],2)
printHtmlPart(14)
invokeTag('javascript','g',120,['src':("jquery.min.js")],-1)
printHtmlPart(15)
invokeTag('javascript','g',121,['src':("jquery.scrollex.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',122,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',123,['src':("skel.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',124,['src':("util.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',125,['src':("main.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',126,['src':("formValidation/validation.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',127,['src':("remodal/remodal.min.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',128,['src':("remodal/remodalControls.js")],-1)
printHtmlPart(18)
invokeTag('javascript','g',130,['src':("ie/respond.min.js")],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',168,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1447388153336L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
