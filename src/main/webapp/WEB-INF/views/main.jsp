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

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" />
<link rel="stylesheet" href="https://unpkg.com/leaflet@1.9.3/dist/leaflet.css" integrity="sha256-kLaT2GOSpHechhsozzB+flnD+zUyjE2LlfWPgU04xyI="crossorigin="" />
<link rel="stylesheet" href="https://unpkg.com/leaflet-control-geocoder@1.13.0/dist/Control.Geocoder.css" />
<link rel="stylesheet" href="https://unpkg.com/leaflet-control-geocoder/dist/Control.Geocoder.css" />
<link rel="stylesheet" href="https://unpkg.com/leaflet-geosearch/dist/leaflet-geosearch.min.css" />
<link rel="stylesheet" href="resources/css/style.css">
</head>

<body>
	<%@include file="components/navbar.jsp"%>


	<!-- Mapa y Feed -->
	<div class="container mb-5 pt-4" class="row">

		<div class="row d-flex justify-content-center ">
			<!-- mapa -->

					<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-xl-8 " id="myMap" style="height: 500px"></div>
					<div id="search-container"></div>

			<!-- Feed -->
			<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4 ">
				<a class="twitter-timeline" data-lang="es" data-width="500"
					data-height="500" data-theme="dark"
					href="https://twitter.com/reddeemergencia?ref_src=twsrc%5Etfw">Tweets
					by reddeemergencia</a>
			</div>
		</div>
	</div>
	<div class="container mb-5 pt-4">

		<div class="row d-flex align-items-center justify-content-center">
			<!-- Feed -->
			<div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-xl-8">
				<form action="mensaje" method="POST">
					<div class="form-floating mb-3">
					  <input type="text" class="form-control" id="direccion-input" name="buscar"
					         placeholder="Buscar dirección">
					  <label for="direccion-input">Direccion</label>
					</div>
					<div class="form-floating mb-3">
						<textarea class="form-control"
							placeholder="Escribe tu mensaje de alerta!" id="mensaje"
							name="mensaje" Required></textarea>
						<label for="mensaje">Escribe tu mensaje de alerta!</label>
					</div>
					<div class="form-floating mb-3">
						<input type="text" class="form-control" id="referencia"
							name="referencia" placeholder="Referencia" Required> <label
							for="referencia">Escribe una Referencia</label>
					</div>
					<button type="submit" class="btn btn-primary">Agregar
						mensaje</button>
				</form>
			</div>
			<!-- Icono -->
			<div class="col-xs-12 col-sm-12 col-md-4 col-lg-4 col-xl-4">
				<div class="row share-buttons">
					<div class="col-md-8 col-md-offset-2">
						<div>
							<button type="button" class="btn btn-danger btn-square-md">
								Envía tu Alerta
							</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Feed de Alertas -->

	<div class="container mb-5 pt-4" class="row">
		<section class="pb-4">
			<div class="bg-white border rounded-5">
				<div class="text-center pt-3 pb-2">
					<h2 class="feed-title">Feed de Alertas</h2>
				</div>
				<section class="w-100 p-4">
					<div class="form-outline mb-4">
						<input type="text" class="form-control"
							id="datatable-search-input" placeholder="Escribe lo que quieres filtrar"> <label class="form-label"
							for="datatable-search-input" style="margin-left: 0px;">Filtro</label>
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
								  <c:forEach var="mensajes" items="${mensajes}">
								    <tr data-tipo="${mensajes.tipo}">
								      <td>${mensajes.username}</td>
								      <td>${mensajes.lugar}</td>
								      <td>${mensajes.mensaje}</td>
								      <td>${mensajes.referencia}</td>
								      <td>${mensajes.fechaCreacion}</td>
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
	<!-- Boostrap -->	
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
	<script src="https://kit.fontawesome.com/44bddf7061.js" crossorigin="anonymous"></script>
    <!-- Leaflet -->		
	<script src="https://unpkg.com/leaflet@1.9.3/dist/leaflet.js" integrity="sha256-WBkoXOwTeyKclOHuWtc+i2uENFpDZ9YPdf5Hf+D7ewM=" crossorigin=""></script>
    <script src="https://unpkg.com/leaflet-control-geocoder/dist/Control.Geocoder.js"></script>
    <script src="https://unpkg.com/leaflet-geosearch/dist/leaflet-geosearch.min.js"></script>
	<!-- Scripts Personalizados -->	
	<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
	<script src="resources/scripts/main.js"></script>
	<script src="resources/scripts/scriptTablaMain.js"></script>
	<script src="resources/scripts/scriptMapa.js"></script>
</body>
<!-- Footer -->
<%@include file="components/footer.jsp"%>
</html>