$(document).ready(function() {
	$('form').on('submit', function(event) {
		event.preventDefault();
		$.ajax({
			type: 'POST',
			url: 'registroCliente',
			data: $('form').serialize(),
			success: function(response) {
				// Aquí agregas la alerta que quieres mostrar
				alert('El registro fue exitoso');
				// Rediriges a la página de inicio
				window.location.href = '/proyectoPersonal/';
			},
		});
	});
});