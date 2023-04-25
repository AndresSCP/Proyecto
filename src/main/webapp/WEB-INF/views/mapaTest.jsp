<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<head>
  <title>Mapa de Google Maps</title>
  <script src="https://maps.googleapis.com/maps/api/js?key=TU_API_KEY&callback=initMap" async defer></script>
  <script>
    var map;
    function initMap() {
      map = new google.maps.Map(document.getElementById('map'), {
        center: {lat: -34.397, lng: 150.644},
        zoom: 8
      });
    }
    function buscarDireccion() {
      var direccion = document.getElementById('direccion').value;
      var geocoder = new google.maps.Geocoder();
      geocoder.geocode({address: direccion}, function(results, status) {
        if (status === 'OK') {
          map.setCenter(results[0].geometry.location);
          var marker = new google.maps.Marker({
            map: map,
            position: results[0].geometry.location
          });
        } else {
          alert('No se pudo encontrar la dirección: ' + status);
        }
      });
    }
  </script>
</head>
<body>
  <input type="text" id="direccion" placeholder="Ingresa una dirección">
  <button onclick="buscarDireccion()">Buscar</button>
  <div id="map" style="height: 400px; width: 100%;"></div>
</body>
</html>