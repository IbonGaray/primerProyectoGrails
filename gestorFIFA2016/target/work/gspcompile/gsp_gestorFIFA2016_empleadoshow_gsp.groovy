import gestorfifa2016.Empleado
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_gestorFIFA2016_empleadoshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/empleado/show.gsp" }
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
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (empleadoInstance?.codigo)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("empleado.codigo.label"),'default':("Codigo")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(empleadoInstance),'field':("codigo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (empleadoInstance?.nombre)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("empleado.nombre.label"),'default':("Nombre")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(empleadoInstance),'field':("nombre")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (empleadoInstance?.apellidoUno)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("empleado.apellidoUno.label"),'default':("Apellido Uno")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(empleadoInstance),'field':("apellidoUno")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (empleadoInstance?.apellidoDos)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("empleado.apellidoDos.label"),'default':("Apellido Dos")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(empleadoInstance),'field':("apellidoDos")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (empleadoInstance?.fechaNacimiento)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("empleado.fechaNacimiento.label"),'default':("Fecha Nacimiento")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',66,['date':(empleadoInstance?.fechaNacimiento)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (empleadoInstance?.salario)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("empleado.salario.label"),'default':("Salario")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(empleadoInstance),'field':("salario")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (empleadoInstance?.departamento)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("empleado.departamento.label"),'default':("Departamento")],-1)
printHtmlPart(29)
createTagBody(3, {->
expressionOut.print(empleadoInstance?.departamento?.encodeAsHTML())
})
invokeTag('link','g',84,['controller':("departamento"),'action':("show"),'id':(empleadoInstance?.departamento?.id)],3)
printHtmlPart(16)
}
printHtmlPart(30)
createTagBody(2, {->
printHtmlPart(31)
createTagBody(3, {->
invokeTag('message','g',92,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',92,['class':("edit"),'action':("edit"),'resource':(empleadoInstance)],3)
printHtmlPart(32)
invokeTag('actionSubmit','g',93,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(33)
})
invokeTag('form','g',95,['url':([resource:empleadoInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1477856589396L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
