import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_textNotesV1_blogblog_engagement101_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/blog/blog_engagement101.gsp" }
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
expressionOut.print(resource(dir: 'images', file: 'dashboard/default_avatar.png'))
printHtmlPart(4)
invokeTag('resource','g',13,['dir':("css"),'file':("main.boot.css")],-1)
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
expressionOut.print(createLink(controller: 'blog', params: [blogID: '1']))
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
expressionOut.print(createLink(controller: 'blog', params: [blogID: '3']))
printHtmlPart(20)
expressionOut.print(resource(dir: 'images', file: 'blog/keywords/blog3Thumbnail.jpg'))
printHtmlPart(21)
expressionOut.print(createLink(controller: 'blog', params: [blogID: '2']))
printHtmlPart(22)
expressionOut.print(resource(dir: 'images', file: 'blog/keywords/keyword1.jpg'))
printHtmlPart(23)
invokeTag('javascript','g',204,['src':("jquery.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',205,['src':("jquery.dropotron.min.js")],-1)
printHtmlPart(25)
invokeTag('javascript','g',206,['src':("jquery.scrollgress.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',207,['src':("skel.min.js")],-1)
printHtmlPart(24)
invokeTag('javascript','g',208,['src':("util.js")],-1)
printHtmlPart(26)
invokeTag('javascript','g',209,['src':("main.js")],-1)
printHtmlPart(26)
invokeTag('javascript','g',210,['src':("jquery.scrolly.min.js")],-1)
printHtmlPart(27)
invokeTag('javascript','g',211,['src':("ie/respond.min.js")],-1)
printHtmlPart(28)
})
invokeTag('captureBody','sitemesh',213,[:],1)
printHtmlPart(29)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1480118982556L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
