<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</head>
<body>
	<h1>Mis mensajes</h1>
	<div id="mensaje-lista">
		<!-- Aquí se insertarán los mensajes -->
	</div>
	<script>
		// Realizar una llamada AJAX al controlador para obtener los mensajes
		$.ajax({
			url : "/api/mensajes/1", // Cambia el ID de usuario por el tuyo
			method : "GET",
			success : function(response) {
				// Procesar la respuesta JSON y agregar los mensajes a la página
				var mensajes = response.mensajes;
				var lista = $("#mensaje-lista");
				for (var i = 0; i < mensajes.length; i++) {
					var mensaje = mensajes[i];
					var elemento = $("<div></div>").text(mensaje.mensaje);
					lista.append(elemento);
				}
			}
		});
	</script>

</body>
</html>