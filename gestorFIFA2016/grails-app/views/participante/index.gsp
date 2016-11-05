
<%@ page import="gestorfifa2016.Participante" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'participante.label', default: 'Participante')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-participante" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-participante" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="edadParticipante" title="${message(code: 'participante.edadParticipante.label', default: 'Edad Participante')}" />
					
						<g:sortableColumn property="nombreParticipante" title="${message(code: 'participante.nombreParticipante.label', default: 'Nombre Participante')}" />
					
						<g:sortableColumn property="primerApellidoParticipante" title="${message(code: 'participante.primerApellidoParticipante.label', default: 'Primer Apellido Participante')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${participanteInstanceList}" status="i" var="participanteInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${participanteInstance.id}">${fieldValue(bean: participanteInstance, field: "edadParticipante")}</g:link></td>
					
						<td>${fieldValue(bean: participanteInstance, field: "nombreParticipante")}</td>
					
						<td>${fieldValue(bean: participanteInstance, field: "primerApellidoParticipante")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${participanteInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
