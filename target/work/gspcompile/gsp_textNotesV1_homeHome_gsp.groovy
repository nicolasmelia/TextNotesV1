import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_homeHome_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/Home.gsp" }
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
invokeTag('resource','g',12,['dir':("css"),'file':("main.boot.css")],-1)
printHtmlPart(4)
invokeTag('javascript','g',15,['src':("ie/html5shiv.js")],-1)
printHtmlPart(5)
invokeTag('resource','g',16,['dir':("css"),'file':("ie8.css")],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',17,[:],1)
printHtmlPart(7)
createTagBody(1, {->
printHtmlPart(8)
expressionOut.print(createLink(controller: 'blog'))
printHtmlPart(9)
expressionOut.print(createLink(controller: 'login'))
printHtmlPart(10)
if(true && (session.userID)) {
printHtmlPart(11)
expressionOut.print(createLink(controller: 'login'))
printHtmlPart(12)
}
else {
printHtmlPart(11)
expressionOut.print(createLink(controller: 'login', action: 'logout'))
printHtmlPart(12)
}
printHtmlPart(13)
expressionOut.print(createLink(controller: 'login', action: 'newAccount'))
printHtmlPart(14)
invokeTag('javascript','g',247,['src':("jquery.min.js")],-1)
printHtmlPart(15)
invokeTag('javascript','g',248,['src':("jquery.dropotron.min.js")],-1)
printHtmlPart(16)
invokeTag('javascript','g',249,['src':("jquery.scrollgress.min.js")],-1)
printHtmlPart(15)
invokeTag('javascript','g',250,['src':("skel.min.js")],-1)
printHtmlPart(15)
invokeTag('javascript','g',251,['src':("util.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',252,['src':("main.js")],-1)
printHtmlPart(17)
invokeTag('javascript','g',253,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(18)
invokeTag('javascript','g',254,['src':("ie/respond.min.js")],-1)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',256,['class':("landing")],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1451617366531L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
