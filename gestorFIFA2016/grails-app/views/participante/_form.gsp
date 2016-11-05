<%@ page import="gestorfifa2016.Participante" %>



<div class="fieldcontain ${hasErrors(bean: participanteInstance, field: 'edadParticipante', 'error')} required">
	<label for="edadParticipante">
		<g:message code="participante.edadParticipante.label" default="Edad Participante" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="edadParticipante" type="number" value="${participanteInstance.edadParticipante}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: participanteInstance, field: 'nombreParticipante', 'error')} required">
	<label for="nombreParticipante">
		<g:message code="participante.nombreParticipante.label" default="Nombre Participante" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombreParticipante" required="" value="${participanteInstance?.nombreParticipante}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: participanteInstance, field: 'primerApellidoParticipante', 'error')} required">
	<label for="primerApellidoParticipante">
		<g:message code="participante.primerApellidoParticipante.label" default="Primer Apellido Participante" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="primerApellidoParticipante" required="" value="${participanteInstance?.primerApellidoParticipante}"/>

</div>

