import gestorfifa2016.Empleado
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestorFIFA2016_empleado_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/empleado/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'codigo', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("empleado.codigo.label"),'default':("Codigo")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("codigo"),'required':(""),'value':(empleadoInstance?.codigo)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'nombre', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("empleado.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("nombre"),'required':(""),'value':(empleadoInstance?.nombre)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'apellidoUno', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("empleado.apellidoUno.label"),'default':("Apellido Uno")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("apellidoUno"),'required':(""),'value':(empleadoInstance?.apellidoUno)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'apellidoDos', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("empleado.apellidoDos.label"),'default':("Apellido Dos")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("apellidoDos"),'required':(""),'value':(empleadoInstance?.apellidoDos)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'fechaNacimiento', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("empleado.fechaNacimiento.label"),'default':("Fecha Nacimiento")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',46,['name':("fechaNacimiento"),'precision':("day"),'value':(empleadoInstance?.fechaNacimiento)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'salario', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("empleado.salario.label"),'default':("Salario")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("salario"),'value':(fieldValue(bean: empleadoInstance, field: 'salario')),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: empleadoInstance, field: 'departamento', 'error'))
printHtmlPart(9)
invokeTag('message','g',61,['code':("empleado.departamento.label"),'default':("Departamento")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['id':("departamento"),'name':("departamento.id"),'from':(gestorfifa2016.Departamento.list()),'optionKey':("id"),'required':(""),'value':(empleadoInstance?.departamento?.id),'class':("many-to-one")],-1)
printHtmlPart(10)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1477856590046L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
