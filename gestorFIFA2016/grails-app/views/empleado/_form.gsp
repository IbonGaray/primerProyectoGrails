<%@ page import="gestorfifa2016.Empleado" %>



<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'codigo', 'error')} required">
	<label for="codigo">
		<g:message code="empleado.codigo.label" default="Codigo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="codigo" required="" value="${empleadoInstance?.codigo}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'nombre', 'error')} required">
	<label for="nombre">
		<g:message code="empleado.nombre.label" default="Nombre" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombre" required="" value="${empleadoInstance?.nombre}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'apellidoUno', 'error')} required">
	<label for="apellidoUno">
		<g:message code="empleado.apellidoUno.label" default="Apellido Uno" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="apellidoUno" required="" value="${empleadoInstance?.apellidoUno}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'apellidoDos', 'error')} required">
	<label for="apellidoDos">
		<g:message code="empleado.apellidoDos.label" default="Apellido Dos" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="apellidoDos" required="" value="${empleadoInstance?.apellidoDos}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'fechaNacimiento', 'error')} required">
	<label for="fechaNacimiento">
		<g:message code="empleado.fechaNacimiento.label" default="Fecha Nacimiento" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="fechaNacimiento" precision="day"  value="${empleadoInstance?.fechaNacimiento}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'salario', 'error')} required">
	<label for="salario">
		<g:message code="empleado.salario.label" default="Salario" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="salario" value="${fieldValue(bean: empleadoInstance, field: 'salario')}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: empleadoInstance, field: 'departamento', 'error')} required">
	<label for="departamento">
		<g:message code="empleado.departamento.label" default="Departamento" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="departamento" name="departamento.id" from="${gestorfifa2016.Departamento.list()}" optionKey="id" required="" value="${empleadoInstance?.departamento?.id}" class="many-to-one"/>

</div>

