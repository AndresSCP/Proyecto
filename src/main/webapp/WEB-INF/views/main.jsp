<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Principal</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="resources/style.css">
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.9.3/dist/leaflet.css" integrity="sha256-kLaT2GOSpHechhsozzB+flnD+zUyjE2LlfWPgU04xyI=" crossorigin="" />
</head>
<body>
	<%@include file="components/navbar.jsp"%>
<div class="container mb-5 pt-4" class="row">	
     <div class="row d-flex justify-content-center">
	<button id="boton-formulario" class="btn">
	  <img src="resources/assets/img/alerta.jpg" style="width: 60px;" alt="logo">
		  <h3>Crea una nueva alerta</h3>
	</button>

</div>
	<div class="container mb-5 pt-4" id="formulario" class="container mb-5 pt-4" class="row">
		<div>
			<form action="mensaje" method="POST">
			    <div class="form-floating mb-3">
			        <input type="text" class="form-control" id="lugar" name="lugar" placeholder="Direccion" Required>
			        <label for="lugar">Direccion</label>
			    </div>
			    <div class="form-floating mb-3">
			        <textarea class="form-control" placeholder="Escribe tu mensaje de alerta!" id="mensaje" name="mensaje" Required></textarea>
			        <label for="mensaje">Escribe tu mensaje de alerta!</label>
			    </div>
			    <div class="form-floating mb-3">
			        <input type="text" class="form-control" id="referencia" name="referencia" placeholder="Referencia" Required>
			        <label for="referencia">Escribe una Referencia</label>
			    </div>
			    <button type="submit" class="btn btn-primary">Agregar mensaje</button>
			</form>
		</div>
	</div>
</div>	
	<!-- Mapa y Feed -->
	<div class="container mb-5 pt-4" class="row">

		<div class="row d-flex justify-content-center">
			<!-- mapa -->
			<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-xl-8 ">
				<div>
    				<div id="myMap" style="height: 500px"></div>
				</div>
			</div>
			<!-- Feed -->
			<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 ">
				<a class="twitter-timeline" data-lang="es" data-width="500"
					data-height="500" data-theme="dark"
					href="https://twitter.com/reddeemergencia?ref_src=twsrc%5Etfw">Tweets
					by reddeemergencia</a>
			</div>
		</div>
	</div>
	
	<!-- Feed de Alertas -->
	
	<div class="container mb-5 pt-4" class="row">
		<section class="pb-4">
			<div class="bg-white border rounded-5">
				<div class="text-center pt-3 pb-2">
					<h2 class="">Feed de Alertas</h2>
				</div>
				<section class="w-100 p-4">
					<div class="form-outline mb-4">
						<input type="text" class="form-control"
							id="datatable-search-input"> <label class="form-label"
							for="datatable-search-input" style="margin-left: 0px;">Search</label>
						<div class="form-notch">
							<div class="form-notch-leading" style="width: 9px;"></div>
							<div class="form-notch-middle" style="width: 47.2px;"></div>
							<div class="form-notch-trailing"></div>
						</div>
					</div>
					<div id="datatable-search" class="datatable">
						<div class="datatable-inner table-responsive ps ps--active-x"
							style="overflow: auto; position: relative;">
							<div class="container mb-5 pt-4 table-responsive" tab class="row">
								<table id="tablaMensajes"
									class="table table-bordered table-striped table-hover rounded-3 mx-auto table-light">
									<tr>
										<th>Nickname</th>
										<th>Lugar</th>
										<th>Mensaje</th>
										<th>Referencia</th>
										<th>Fecha y Hora</th>
									</tr>

									<c:forEach var="mensaje" items="${mensaje}">
										<tr>
											<td>${mensaje.username}</td>
											<td>${mensaje.lugar}</td>
											<td>${mensaje.mensaje}</td>
											<td>${mensaje.referencia}</td>
											<td>${mensaje.fechaCreacion}</td>
										</tr>
									</c:forEach>
								</table>
							</div>

							<div class="ps__rail-x"
								style="left: 0px; bottom: 0px; width: 646px;">
								<div class="ps__thumb-x" tabindex="0"
									style="left: 0px; width: 519px;"></div>
							</div>
							<div class="ps__rail-y" style="top: 0px; right: 0px;">
								<div class="ps__thumb-y" tabindex="0"
									style="top: 0px; height: 0px;"></div>
							</div>
						</div>
					</div>
				</section>
			</div>
		</section>
	</div>

	<!-- Scripts -->
	<script src="https://unpkg.com/leaflet@1.9.3/dist/leaflet.js" integrity="sha256-WBkoXOwTeyKclOHuWtc+i2uENFpDZ9YPdf5Hf+D7ewM=" crossorigin=""></script><script src="https://unpkg.com/leaflet@1.9.3/dist/leaflet.js" integrity="sha256-WBkoXOwTeyKclOHuWtc+i2uENFpDZ9YPdf5Hf+D7ewM=" crossorigin=""></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
	<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
	<script src="resources/scripts/main.js"></script>
	<script src="resources/scripts/scriptTablaMain.js"></script>
	<script src="resources/scripts/scriptMapa.js"></script>
</body>
	<!-- Footer -->
	
	<%@include file="components/footer.jsp"%>
</html>