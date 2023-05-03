<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de Cliente</title>
<!-- Enlaces a las librerías de Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
<section class="vh-100 bg-image">
		<div class="mask d-flex align-items-center h-100 gradient-custom-3"
			id="backgroundregistro">
			<div class="container h-100">
				<div class="row d-flex justify-content-center align-items-center h-100">
					<div class="col-12 col-md-9 col-lg-7 col-xl-6">
						<div class="card" style="border-radius: 15px;">
							<div class="card-body p-5">
								<div class="container mb-5 pt-4" class="row">
									<h2 class="text-uppercase text-center mb-5" id="TituloRegistro">Crea
										una cuenta</h2>
									<form action="registroCliente" method="POST">
										<div class="form-group">
											<label for="username">Nickname:</label> <input type="text"
												class="form-control" id="username" name="username" required>
										</div>
										<div class="form-group">
											<label for="password">Contraseña:</label> <input
												type="password" class="form-control" id="password"
												name="password" required>
										</div>
										<div class="form-group">
											<label for="nombreCliente">Nombre:</label> <input type="text"
												class="form-control" id="nombreCliente" name="nombreCliente"
												required>
										</div>
										<div class="form-group">
											<label for="apellidoCliente">Apellido:</label> <input
												type="text" class="form-control" id="apellidoCliente"
												name="apellidoCliente" required>
										</div>
										<div class="form-group">
											<label for="genero">Género:</label> <select
												class="form-control" id="genero" name="genero" required>
												<option value="Masculino">Masculino</option>
												<option value="Femenino">Femenino</option>
												<option value="Otro">Otro</option>
											</select>
										</div>
										<div class="form-group">
											<label for="emailCliente">Email:</label> <input type="email"
												class="form-control" id="emailCliente" name="emailCliente"
												required>
										</div>

										<div class="form-check d-flex justify-content-center mb-5">
											<input class="form-check-input me-2" type="checkbox" value=""
												id="cajacheckbox" /> <label class="form-check-label"
												for="cajacheckbox"> Estoy de acuerdo con los <a
												href="#!" class="text-body"><u>Terminos de servicio</u></a>
											</label>
										</div>
										<button type="submit" class="btn btn-primary">Registrarse</button>
										<p class="text-center text-muted mt-5 mb-0">
											Ya tienes una cuenta? <a href="/proyectoPersonal/"
												class="fw-bold text-body"><u>Login aqui</u></a>
										</p>
									</form>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.6.3.min.js"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?libraries=geometry,places&key=AIzaSyAvBQ1Q9FjYfxdWJF6KPmO822RMMbY2w2o"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
	<script src="resources/scripts/main.js"></script>
	<script src="resources/scripts/scriptValidacion.js"></script>
	
</body>
</html>
