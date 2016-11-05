
<%@ page import="gestorfifa2016.Empleado" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'empleado.label', default: 'Empleado')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-empleado" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-empleado" class="content scaffold-list" role="main">
			<h1><g:message code="Buscar usuario" args="Buscar usuario" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<form name="busqueda" method="post">
				<span class="menuButton">
					<g:textField name="inputBusqueda" value="${inputBusqueda}"/>
				</span>
			</form>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="codigo" title="${message(code: 'empleado.codigo.label', default: 'Codigo')}" />
					
						<g:sortableColumn property="nombre" title="${message(code: 'empleado.nombre.label', default: 'Nombre')}" />
					
						<g:sortableColumn property="apellidoUno" title="${message(code: 'empleado.apellidoUno.label', default: 'Apellido Uno')}" />
					
						<g:sortableColumn property="apellidoDos" title="${message(code: 'empleado.apellidoDos.label', default: 'Apellido Dos')}" />
					
						<g:sortableColumn property="fechaNacimiento" title="${message(code: 'empleado.fechaNacimiento.label', default: 'Fecha Nacimiento')}" />
					
						<g:sortableColumn property="salario" title="${message(code: 'empleado.salario.label', default: 'Salario')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${empleadoInstanceList}" status="i" var="empleadoInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${empleadoInstance.id}">${fieldValue(bean: empleadoInstance, field: "codigo")}</g:link></td>
					
						<td>${fieldValue(bean: empleadoInstance, field: "nombre")}</td>
					
						<td>${fieldValue(bean: empleadoInstance, field: "apellidoUno")}</td>
					
						<td>${fieldValue(bean: empleadoInstance, field: "apellidoDos")}</td>
					
						<td><g:formatDate date="${empleadoInstance.fechaNacimiento}" /></td>
					
						<td>${fieldValue(bean: empleadoInstance, field: "salario")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
		</div>
	</body>
</html>
