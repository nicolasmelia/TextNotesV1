import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_loginVarifyNumber_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/login/VarifyNumber.gsp" }
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
invokeTag('resource','g',14,['dir':("css"),'file':("mainBoot.css")],-1)
printHtmlPart(5)
invokeTag('resource','g',18,['dir':("css"),'file':("remodal/remodal.css")],-1)
printHtmlPart(6)
invokeTag('resource','g',20,['dir':("css"),'file':("remodal/remodal-default-theme.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',22,['dir':("css"),'file':("ie8.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',23,['dir':("css"),'file':("ie9.css")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',24,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(10)
if(true && (status == 'wrongPassword')) {
printHtmlPart(11)
expressionOut.print(phoneNumber)
printHtmlPart(12)
}
else if(true && (status == 'init')) {
printHtmlPart(13)
expressionOut.print(phoneNumber)
printHtmlPart(14)
}
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('actionSubmit','g',115,['id':("submitBtn"),'onclick':("return validateForm()"),'value':("Create Account"),'action':("createAccount"),'style':("margin-top: 15px; width: 100%")],-1)
printHtmlPart(17)
expressionOut.print(createLink(controller: 'Login', action: 'resendValidationCode'))
printHtmlPart(18)
})
invokeTag('form','g',125,['class':("form-signin"),'controller':("Login"),'action':("createAccount"),'enctype':("multipart/form-data")],2)
printHtmlPart(19)
expressionOut.print(phoneNumber)
printHtmlPart(20)
invokeTag('javascript','g',176,['src':("jquery.min.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',177,['src':("jquery.scrollex.min.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',178,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',179,['src':("skel.min.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',180,['src':("util.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',181,['src':("main.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',182,['src':("formValidation/validation.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',183,['src':("data/validCodeCheck.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',184,['src':("remodal/remodal.min.js")],-1)
printHtmlPart(21)
invokeTag('javascript','g',185,['src':("remodal/remodalControls.js")],-1)
printHtmlPart(22)
invokeTag('javascript','g',187,['src':("ie/respond.min.js")],-1)
printHtmlPart(23)
})
invokeTag('captureBody','sitemesh',261,[:],1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1446696619031L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
