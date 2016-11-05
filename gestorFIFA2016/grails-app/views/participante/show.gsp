
<%@ page import="gestorfifa2016.Participante" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'participante.label', default: 'Participante')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-participante" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-participante" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list participante">
			
				<g:if test="${participanteInstance?.edadParticipante}">
				<li class="fieldcontain">
					<span id="edadParticipante-label" class="property-label"><g:message code="participante.edadParticipante.label" default="Edad Participante" /></span>
					
						<span class="property-value" aria-labelledby="edadParticipante-label"><g:fieldValue bean="${participanteInstance}" field="edadParticipante"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${participanteInstance?.nombreParticipante}">
				<li class="fieldcontain">
					<span id="nombreParticipante-label" class="property-label"><g:message code="participante.nombreParticipante.label" default="Nombre Participante" /></span>
					
						<span class="property-value" aria-labelledby="nombreParticipante-label"><g:fieldValue bean="${participanteInstance}" field="nombreParticipante"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${participanteInstance?.primerApellidoParticipante}">
				<li class="fieldcontain">
					<span id="primerApellidoParticipante-label" class="property-label"><g:message code="participante.primerApellidoParticipante.label" default="Primer Apellido Participante" /></span>
					
						<span class="property-value" aria-labelledby="primerApellidoParticipante-label"><g:fieldValue bean="${participanteInstance}" field="primerApellidoParticipante"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:participanteInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${participanteInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
