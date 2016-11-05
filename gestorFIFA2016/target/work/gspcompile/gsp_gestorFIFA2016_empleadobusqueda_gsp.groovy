import gestorfifa2016.Empleado
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestorFIFA2016_empleadobusqueda_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/empleado/busqueda.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'empleado.label', default: 'Empleado'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("Buscar usuario"),'args':("Buscar usuario")],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('textField','g',25,['name':("inputBusqueda"),'value':(inputBusqueda)],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',32,['property':("codigo"),'title':(message(code: 'empleado.codigo.label', default: 'Codigo'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',34,['property':("nombre"),'title':(message(code: 'empleado.nombre.label', default: 'Nombre'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',36,['property':("apellidoUno"),'title':(message(code: 'empleado.apellidoUno.label', default: 'Apellido Uno'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',38,['property':("apellidoDos"),'title':(message(code: 'empleado.apellidoDos.label', default: 'Apellido Dos'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',40,['property':("fechaNacimiento"),'title':(message(code: 'empleado.fechaNacimiento.label', default: 'Fecha Nacimiento'))],-1)
printHtmlPart(14)
invokeTag('sortableColumn','g',42,['property':("salario"),'title':(message(code: 'empleado.salario.label', default: 'Salario'))],-1)
printHtmlPart(15)
loop:{
int i = 0
for( empleadoInstance in (empleadoInstanceList) ) {
printHtmlPart(16)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(17)
createTagBody(3, {->
expressionOut.print(fieldValue(bean: empleadoInstance, field: "codigo"))
})
invokeTag('link','g',50,['action':("show"),'id':(empleadoInstance.id)],3)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: empleadoInstance, field: "nombre"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: empleadoInstance, field: "apellidoUno"))
printHtmlPart(18)
expressionOut.print(fieldValue(bean: empleadoInstance, field: "apellidoDos"))
printHtmlPart(18)
invokeTag('formatDate','g',58,['date':(empleadoInstance.fechaNacimiento)],-1)
printHtmlPart(18)
expressionOut.print(fieldValue(bean: empleadoInstance, field: "salario"))
printHtmlPart(19)
i++
}
}
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',67,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1477859323082L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
