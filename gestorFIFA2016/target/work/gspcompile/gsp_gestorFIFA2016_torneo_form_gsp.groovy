import gestorfifa2016.Torneo
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestorFIFA2016_torneo_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/torneo/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: torneoInstance, field: 'numJugadores', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("torneo.numJugadores.label"),'default':("Num Jugadores")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("numJugadores"),'type':("number"),'min':("1"),'max':("32"),'value':(torneoInstance.numJugadores),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: torneoInstance, field: 'nombreTorneo', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("torneo.nombreTorneo.label"),'default':("Nombre Torneo")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("nombreTorneo"),'required':(""),'value':(torneoInstance?.nombreTorneo)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1478287953728L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
