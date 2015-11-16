import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_dashboardMainDash_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/dashboard/MainDash.gsp" }
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
expressionOut.print(phoneNumber)
printHtmlPart(12)
if(true && (messages)) {
printHtmlPart(13)
for( _it2084324667 in (messages) ) {
changeItVariable(_it2084324667)
printHtmlPart(14)
expressionOut.print(it.message)
printHtmlPart(15)
invokeTag('formatDate','g',101,['format':("MM/dd/yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(16)
invokeTag('formatDate','g',102,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(17)
expressionOut.print(it.message)
printHtmlPart(18)
}
printHtmlPart(19)
}
else {
printHtmlPart(20)
}
printHtmlPart(21)
invokeTag('javascript','g',175,['src':("jquery.min.js")],-1)
printHtmlPart(22)
invokeTag('javascript','g',176,['src':("jquery.scrollex.min.js")],-1)
printHtmlPart(23)
invokeTag('javascript','g',177,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(23)
invokeTag('javascript','g',178,['src':("skel.min.js")],-1)
printHtmlPart(23)
invokeTag('javascript','g',179,['src':("util.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',180,['src':("main.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',181,['src':("formValidation/validation.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',182,['src':("remodal/remodal.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',183,['src':("remodal/remodalControls.js")],-1)
printHtmlPart(25)
invokeTag('javascript','g',185,['src':("ie/respond.min.js")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',233,[:],1)
printHtmlPart(27)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1447652082409L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
