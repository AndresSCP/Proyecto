<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<section class="vh-100 bg-image">
		<div class="mask d-flex align-items-center h-100 gradient-custom-3"
			id="backgroundregistro">
			<div class="container h-100">
				<div
					class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-9 col-lg-7 col-xl-6">
						<div class="card" style="border-radius: 15px;">
							<div class="card-body p-5">
								<h2 class="text-uppercase text-center mb-5" id="TituloRegistro">Mi
									Perfil</h2>

								<form name="Formulario" onsubmit="return validate_form()">

									<div class="form-outline mb-4">
										<input type="text" id="Usuario"
											class="form-control form-control-lg" /> <label
											class="form-label" for="Usuario" id="labelusuario">Nombre
											de usuario</label>
									</div>

									<div class="form-outline mb-4">
										<input type="text" id="Usuario"
											class="form-control form-control-lg" /> <label
											class="form-label" for="Usuario" id="labelusuario">Nombre</label>
									</div>

									<div class="form-outline mb-4">
										<input type="text" id="Usuario"
											class="form-control form-control-lg" /> <label
											class="form-label" for="Usuario" id="labelusuario">Apellido</label>
									</div>

									<div class="form-outline mb-4">
										<input type="text" id="Usuario"
											class="form-control form-control-lg" /> <label
											class="form-label" for="Usuario" id="labelusuario">Genero</label>
									</div>

									<div class="form-outline mb-4">
										<input type="email" id="Email"
											class="form-control form-control-lg" /> <label
											class="form-label" for="Email" id="labelemail">Email</label>
									</div>

									<div class="form-outline mb-4">
										<input type="password" id="Password"
											class="form-control form-control-lg" /> <label
											class="form-label" for="Password" id="labelpassword">Contraseña</label>
									</div>

								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
		<!-- Footer -->
	<%@include file="components/footer.jsp"%>
	
	<script src="https://code.jquery.com/jquery-3.6.3.min.js"
		integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
		crossorigin="anonymous"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?libraries=geometry,places&key=AIzaSyAvBQ1Q9FjYfxdWJF6KPmO822RMMbY2w2o"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
	<script src="scripts/main.js"></script>
</body>
</html>