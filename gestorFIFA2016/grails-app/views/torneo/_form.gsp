<%@ page import="gestorfifa2016.Torneo" %>



<div class="fieldcontain ${hasErrors(bean: torneoInstance, field: 'numJugadores', 'error')} required">
	<label for="numJugadores">
		<g:message code="torneo.numJugadores.label" default="Num Jugadores" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="numJugadores" type="number" min="1" max="32" value="${torneoInstance.numJugadores}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: torneoInstance, field: 'nombreAdministrador', 'error')} required">
	<label for="nombreAdministrador">
		<g:message code="torneo.nombreAdministrador.label" default="Nombre Administrador" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombreAdministrador" required="" value="${torneoInstance?.nombreAdministrador}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: torneoInstance, field: 'nombreTorneo', 'error')} required">
	<label for="nombreTorneo">
		<g:message code="torneo.nombreTorneo.label" default="Nombre Torneo" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nombreTorneo" required="" value="${torneoInstance?.nombreTorneo}"/>

</div>

