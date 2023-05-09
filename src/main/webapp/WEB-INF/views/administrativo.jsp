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
<link rel="stylesheet" href="resources/css/style.css">
<link rel="stylesheet" href="resources/css/styleAdmin.css">
</head>
<body>
	<%@include file="components/navbar.jsp"%>

<div class="container mx-auto my-4" id="checkboxAdmin">
  <div class="border rounded p-3">
    <div class="form-check form-check-lg form-check-inline">
      <input class="form-check-input ml-3" type="checkbox" id="showUsuarios" name="showTable" value="usuarios">
      <label class="form-check-label text-light ml-4" for="showUsuarios">Mostrar tabla de Usuarios</label>
    </div>
    <div class="form-check form-check-lg form-check-inline">
      <input class="form-check-input ml-3" type="checkbox" id="showClientes" name="showTable" value="clientes">
      <label class="form-check-label text-light ml-4" for="showClientes">Mostrar tabla de Clientes</label>
    </div>
    <div class="form-check form-check-lg form-check-inline">
      <input class="form-check-input ml-3" type="checkbox" id="showAdministrativos" name="showTable" value="administrativos">
      <label class="form-check-label text-light ml-4" for="showAdministrativos">Mostrar tabla de Administrativos</label>
    </div>
    <div class="form-check form-check-lg form-check-inline">
      <input class="form-check-input ml-3" type="checkbox" id="showMensajes" name="showTable" value="mensajes">
      <label class="form-check-label text-light ml-4" for="showMensajes">Mostrar mensajes por Usuario</label>
    </div>
  </div>
</div>
<div>
	<div class="container mb-5 pt-4" class="row">
	<div>
		     <table id="tablaActivos" class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
			  <caption class="bg-primary text-white py-2 text-center h5" id="captionId")>Informacion</caption>
			   <thead>
			        <tr>
			          <th>Estado(Activo/Inactivo)</th>
			          <th>Cantidad</th>
			        </tr>
			      </thead>
			      
			  <tbody>
				 <c:forEach var="activo" items="${activos}">
				    <tr>
				      <td>${activo.enabled == 1 ? 'Activo' : 'Inactivo'}</td>
				      <td>${activo.cantidad}</td>
				    </tr>
				  </c:forEach>
			  </tbody>
			</table>	
	</div>
			<!-- Tabla Usuarios -->
			
			<div class="container mb-5 pt-4 table-responsive">
			<table id="tablaUsuarios" class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
			  <caption class="bg-primary text-white py-2 text-center h5" id="captionId")>Usuarios</caption>
			  <thead>
			    <tr>
			      <th>ID</th>
			      <th>Nombre</th>
			      <th>Estado</th>
			      <th>Rol</th>							
			    </tr>
			  </thead>
			  <tbody>
			    <c:forEach items="${usuarios}" var="usuarios">
			      <tr>
			        <td>${usuarios.idUsuario}</td>
			        <td>${usuarios.username}</td>
			        <td>${usuarios.enabled == 1 ? 'Activo' : 'Inactivo'}</td>
			        <td>${usuarios.role}</td>										
			      </tr>
			    </c:forEach>
			  </tbody>
			</table>
			</div>
		 
			<!-- Tabla Clientes -->
			<div class="container mb-5 pt-4 table-responsive">
			<table id="tablaClientes"
				class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				<caption class="bg-primary text-white py-2 text-center h5"class="bg-primary text-white py-2 text-center h5">Clientes</caption>
				<tr>
					<th>ID</th>
					<th>Nickname</th>
					<th>Nombre de Usuario</th>
					<th>Apellido de Usuario</th>
					<th>Genero</th>
					<th>Email</th>
					<td>Accion</td>

				</tr>
				<c:forEach items="${cliente}" var="cliente">
				  <tr>
				    <td>${cliente.idUsuario}</td>
				    <td>${cliente.username}</td>
				    <td>${cliente.nombreCliente}</td>
				    <td>${cliente.apellidoCliente}</td>
				    <td>${cliente.genero}</td>
				    <td>${cliente.emailCliente}</td>
				    <td>
				      <form method="POST" action="desactivar">
				        <input type="hidden" name="idUsuario" value="${cliente.idUsuario}">
				        <button type="submit" class="btn btn-danger">
				          <i class="bi bi-trash"></i>
				        </button>
				      </form>
				    </td>
				  </tr>
				</c:forEach>
			</table>
			</div>
			<!-- Tabla Administrativos -->
			<div class="container mb-5 pt-4 table-responsive">
			<table id="tablaAdministrativos" class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				<caption class="bg-primary text-white py-2 text-center h5">Administrativos</caption>
				<tr>
					<th>ID</th>
					<th>Nickname</th>
					<th>Nombre de Usuario</th>
					<th>Email</th>
				</tr>
				<c:forEach items="${administrativo}" var="administrativo">
					<tr>
						<td>${administrativo.idUsuario}</td>
						<td>${administrativo.username}</td>
						<td>${administrativo.nombreAdmin}</td>
						<td>${administrativo.emailAdmin}</td>
					</tr>
				</c:forEach>
			</table>
			</div>
			
			<div class="container mb-5 pt-4 table-responsive">
				<table id="tablaMensajes" class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
				    <caption class="bg-primary text-white py-2 text-center h5">Mensajes por Usuario</caption>
				    <thead>    
				        <tr>
				            <th id="id-header">ID</th>
				            <th>Nickname</th>
				            <th>Lugar</th>
				            <th>Mensaje</th>
				            <th>Referencia</th>
				            <th>Fecha y Hora</th>
				        </tr>
				    </thead>
				    
					<c:forEach var="mensaje" items="${mensaje}">
						<tr>
							<td>${mensaje.idUsuario}</td>
							<td>${mensaje.username}</td>
							<td>${mensaje.lugar}</td>
							<td>${mensaje.mensaje}</td>
							<td>${mensaje.referencia}</td>
							<td>${mensaje.fechaCreacion}</td>
						</tr>
					</c:forEach>

				</table>
			</div>
			<div class="container mb-5 pt-4 table-responsive">
				<table id="tablaUsuarios"
					class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
					<caption class="bg-primary text-white py-2 text-center h5"
						id="captionId" )>Mensajes por usuario</caption>
					<thead>
						<tr>
							<th>ID</th>
							<th>Username</th>
							<th>Cantidad de mensajes</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="mensajeUsuario" items="${mensajesUsuarios}">
							<tr>
								<td>${mensajeUsuario.idUsuario}</td>
								<td>${mensajeUsuario.username}</td>
								<td>${mensajeUsuario.cantidad}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
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