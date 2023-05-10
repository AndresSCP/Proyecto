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
<link rel="stylesheet" href="resources/css/style.css">
</head>

<body>
	<%@include file="components/navbar.jsp"%>

	<!-- Mapa y Feed -->
	<div class="container mb-5 pt-4" class="row">

		<div class="row d-flex justify-content-center ">
			<!-- mapa -->
		    <div class="col-xs-12 col-sm-12 col-md-8 col-lg-8 col-xl-8 " id="map" style="height: 500px"></div>
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
		<form action="mensaje" method="POST">
		<div class="row">
		  <div class="col-md-8">
		      <div class="form-group">
					  <input type="text" class="form-control" id="search-input" name="lugar"
					         placeholder="Buscar lugar o dirección">				         
					  <label for="direccion-input">Direccion</label>
		      </div>
		      <div class="form-group">
						<textarea class="form-control"
							placeholder="Escribe tu mensaje de alerta!" id="mensaje"
							name="mensaje" Required></textarea>
		      </div>
		      <br>
		      <div class="form-group">
						<input type="text" class="form-control" id="referencia"
							name="referencia" placeholder="Referencia" Required>
		      </div>
		  </div>
		  <div class="col-md-4 d-flex flex-column justify-content-between">
		    <button type="submit" class="btn btn-lg btn-block btn-danger h-100">Envía tu alerta</button>
		  </div>
		</div>
		    </form>
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
	<!-- JQuery -->		
    <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
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
    <!-- Mapa -->
    		
	<script
      src="https://maps.googleapis.com/maps/api/js?key=AIzaSyB41DRUbKWJHPxaFjMAwdrzWzbVKartNGg&callback=initMap&libraries=places"
      defer
    ></script>
	<!-- Scripts Personalizados -->
	<script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
	<script src="resources/scripts/scriptTablaMain.js"></script>
	<script src="resources/scripts/scriptMapa.js"></script>
</body>
<!-- Footer -->
<%@include file="components/footer.jsp"%>
</html>