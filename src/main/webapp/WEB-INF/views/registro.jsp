<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registro de Cliente</title>
    <!-- Enlaces a las librerías de Bootstrap -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container mt-5">
    <h2>Crea una cuenta</h2>
    <form action="/registro" method="POST">
<!--         <div class="form-group">
            <label for="idUsuario">ID de Usuario:</label>
            <input type="number" class="form-control" id="idUsuario" name="idUsuario" required>
        </div> -->
        <div class="form-group">
            <label for="nombreUsuario">Nickname:</label>
            <input type="text" class="form-control" id="nombreUsuario" name="nombreUsuario" required>
        </div>
        <div class="form-group">
            <label for="password">Contraseña:</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="tipoUsuario">Tipo de Usuario:</label>
            <input type="number" class="form-control" id="tipoUsuario" name="tipoUsuario" required>
        </div>
        <div class="form-group">
            <label for="nombreCliente">Nombre:</label>
            <input type="text" class="form-control" id="nombreCliente" name="nombreCliente" required>
        </div>
        <div class="form-group">
            <label for="apellidoCliente">Apellido:</label>
            <input type="text" class="form-control" id="apellidoCliente" name="apellidoCliente" required>
        </div>
        <div class="form-group">
            <label for="genero">Género:</label>
            <select class="form-control" id="genero" name="genero" required>
                <option value="Masculino">Masculino</option>
                <option value="Femenino">Femenino</option>
                <option value="Otro">Otro</option>
            </select>
        </div>
        <div class="form-group">
            <label for="emailCliente">Email:</label>
            <input type="email" class="form-control" id="emailCliente" name="emailCliente" required>
        </div>
        <button type="submit" class="btn btn-primary">Registrarse</button>
    </form>
</div>

</body>
</html>
