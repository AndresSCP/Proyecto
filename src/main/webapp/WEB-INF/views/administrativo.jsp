<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>administrativo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<h1>Listado de Usuarios</h1>

	<div class="containter" id="checkboxAdmin">
		<div style="display: flex; flex-direction: row;">
			<div style="margin-right: 10px;">
				<input type="checkbox" id="showUsuarios" name="showTable"
					value="usuarios"> <label for="showUsuarios">Mostrar
					tabla de Usuarios</label>
			</div>
			<div style="margin-right: 10px;">
				<input type="checkbox" id="showClientes" name="showTable"
					value="clientes"> <label for="showClientes">Mostrar
					tabla de Clientes</label>
			</div>
			<div>
				<input type="checkbox" id="showAdministrativos" name="showTable"
					value="administrativos"> <label for="showAdministrativos">Mostrar
					tabla de Administrativos</label>
			</div>
			<div style="margin-right: 10px;">
				<input type="checkbox" id="showUsuarios" name="showTable"
					value="usuarios"> <label for="showUsuarios">Mostrar
					mensajes por Usuario</label>
			</div>
		</div>
	</div>
	<div class="container mb-5 pt-4" class="row">
		<div class="table-responsive">
			<!-- Tabla Usuarios -->

			<p id="tituloAdmin">Usuarios</p>

			<table id="tablaUsuarios"
				class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				<tr>
					<th>ID</th>
					<th>Nombre</th>
					<th>Password</th>
					<th>Tipo de Usuario</th>
				</tr>
				<c:forEach items="${usuarios}" var="usuarios">
					<tr>
						<td>${usuarios.idUsuario}</td>
						<td>${usuarios.nombreUsuario}</td>
						<td>${usuarios.password}</td>
						<td>${usuarios.tipoUsuario}</td>
					</tr>
				</c:forEach>
			</table>

			<!-- Tabla Clientes -->

			<p id="tituloAdmin">Clientes</p>

			<table id="tablaClientes"
				class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				<tr>
					<th>ID</th>
					<th>Nickname</th>
					<th>Password</th>
					<th>Nombre de Usuario</th>
					<th>Apellido de Usuario</th>
					<th>Genero</th>
					<th>Email</th>
					<td>Accion</td>

				</tr>
				<c:forEach items="${cliente}" var="cliente">
					<tr>
						<td>${cliente.idUsuario}</td>
						<td>${cliente.nombreUsuario}</td>
						<td>${cliente.password}</td>
						<td>${cliente.nombreCliente}</td>
						<td>${cliente.apellidoCliente}</td>
						<td>${cliente.genero}</td>
						<td>${cliente.emailCliente}</td>
						<td>
							<form method="post" action="SvEliminarCliente">
								<input type="hidden" name="rut" value="${cliente.runUsuario}">
								<button type="submit" class="btn btn-danger">
									<i class="bi bi-trash"></i>
								</button>
							</form>
						</td>
					</tr>
				</c:forEach>
			</table>

			<!-- Tabla Administrativos -->

			<p id="tituloAdmin">Administrativos</p>

			<table id="tablaAdministrativos"
				class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				<tr>
					<th>ID</th>
					<th>Nickname</th>
					<th>Password</th>
					<th>Tipo de Usuario</th>
					<th>Nombre de Usuario</th>
					<th>Email</th>
				</tr>
				<c:forEach items="${administrativo}" var="administrativo">
					<tr>
						<td>${administrativo.idUsuario}</td>
						<td>${administrativo.nombreUsuario}</td>
						<td>${administrativo.password}</td>
						<td>${administrativo.tipoUsuario}</td>
						<td>${administrativo.nombreAdmin}</td>
						<td>${administrativo.emailAdmin}</td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</div>
	<!-- Footer -->
	<%@include file="components/footer.jsp"%>
	<!-- Scripts -->
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
	<script src="resources/scripts/main.js"></script>
	<script src="resources/scripts/scriptAdmin.js"></script>
</body>
</html>