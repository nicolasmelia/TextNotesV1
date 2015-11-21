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
printHtmlPart(6)
invokeTag('resource','g',18,['dir':("css"),'file':("jquery.dropdown.min.css")],-1)
printHtmlPart(7)
invokeTag('resource','g',20,['dir':("css"),'file':("ie8.css")],-1)
printHtmlPart(8)
invokeTag('resource','g',21,['dir':("css"),'file':("ie9.css")],-1)
printHtmlPart(9)
invokeTag('javascript','g',24,['src':("data/dashboard.js")],-1)
printHtmlPart(10)
})
invokeTag('captureHead','sitemesh',27,[:],1)
printHtmlPart(11)
createTagBody(1, {->
printHtmlPart(12)
expressionOut.print(phoneNumber)
printHtmlPart(13)
if(true && (messages)) {
printHtmlPart(14)
for( _it1347456723 in (messages) ) {
changeItVariable(_it1347456723)
printHtmlPart(15)
expressionOut.print(it.messageID)
printHtmlPart(16)
expressionOut.print(it.messageID)
printHtmlPart(17)
expressionOut.print(it.message)
printHtmlPart(17)
invokeTag('formatDate','g',113,['format':("MM/dd/yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(18)
expressionOut.print(it.messageID)
printHtmlPart(19)
invokeTag('formatDate','g',113,['format':("MM-dd-yyyy"),'date':(it.date)],-1)
printHtmlPart(20)
expressionOut.print(it.messageID)
printHtmlPart(17)
expressionOut.print(it.message)
printHtmlPart(17)
invokeTag('formatDate','g',114,['format':("MM/dd/yyyy hh:mm a"),'date':(it.date)],-1)
printHtmlPart(21)
expressionOut.print(it.messageID)
printHtmlPart(19)
expressionOut.print(it.message)
printHtmlPart(22)
expressionOut.print(it.messageID)
printHtmlPart(23)
}
printHtmlPart(24)
}
else {
printHtmlPart(25)
}
printHtmlPart(26)
expressionOut.print(createLink(controller: 'Dashboard', action: 'deleteNote'))
printHtmlPart(27)
invokeTag('javascript','g',205,['src':("jquery.min.js")],-1)
printHtmlPart(28)
invokeTag('javascript','g',206,['src':("jquery.scrollex.min.js")],-1)
printHtmlPart(29)
invokeTag('javascript','g',207,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(29)
invokeTag('javascript','g',208,['src':("skel.min.js")],-1)
printHtmlPart(29)
invokeTag('javascript','g',209,['src':("util.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',210,['src':("main.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',211,['src':("formValidation/validation.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',212,['src':("remodal/remodal.min.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',213,['src':("remodal/remodalControls.js")],-1)
printHtmlPart(30)
invokeTag('javascript','g',214,['src':("jquery.dropdown.min.js")],-1)
printHtmlPart(31)
invokeTag('javascript','g',217,['src':("ie/respond.min.js")],-1)
printHtmlPart(32)
})
invokeTag('captureBody','sitemesh',236,[:],1)
printHtmlPart(33)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1447993119157L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
