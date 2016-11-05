import gestorfifa2016.Participante
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestorFIFA2016_participante_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/participante/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: participanteInstance, field: 'edadParticipante', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("participante.edadParticipante.label"),'default':("Edad Participante")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("edadParticipante"),'type':("number"),'value':(participanteInstance.edadParticipante),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: participanteInstance, field: 'nombreParticipante', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("participante.nombreParticipante.label"),'default':("Nombre Participante")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("nombreParticipante"),'required':(""),'value':(participanteInstance?.nombreParticipante)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: participanteInstance, field: 'primerApellidoParticipante', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("participante.primerApellidoParticipante.label"),'default':("Primer Apellido Participante")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("primerApellidoParticipante"),'required':(""),'value':(participanteInstance?.primerApellidoParticipante)],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1478288222968L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
