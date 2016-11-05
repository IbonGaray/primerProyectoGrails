<%@ page import="gestorfifa2016.Departamento" %>



<div class="fieldcontain ${hasErrors(bean: departamentoInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="departamento.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${departamentoInstance?.nombre}"/>

</div>

