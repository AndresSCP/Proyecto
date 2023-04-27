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
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<h1>Listado de Usuarios</h1>
	<div class="container mb-5 pt-4" class="row">
		<div class="table-responsive">
	        <!-- Tabla Usuarios -->
	        
	        <p id="tituloAdmin">Usuarios</p>
	        
			<table class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
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

			<table class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				<tr>
					<th>ID</th>
					<th>Nickname</th>
					<th>Password</th>
					<th>Nombre de Usuario</th>
					<th>Apellido de Usuario</th>
					<th>Genero</th>
					<th>Email</th>

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
					</tr>
				</c:forEach>
			</table>

			<!-- Tabla Administrativos -->
			
			<p id="tituloAdmin">Administrativos</p>
	
			<table class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
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
</body>
</html>