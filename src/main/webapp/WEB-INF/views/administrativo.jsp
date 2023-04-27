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
	rel="stylesheet">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
	<h1>Listado de Usuarios</h1>
	<table>
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
	<table>
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