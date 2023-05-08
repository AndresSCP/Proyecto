// Crear el objeto del mapa y establecer la vista inicial
const key = 'BGG5O6xVlqhoyQPJ647w';
const myMap = L.map('myMap').setView([49.2125578, 16.62662018], 14); //starting position

// Agregar una capa al mapa
const layer = L.marker([49.2125578, 16.62662018]).addTo(myMap);


// Agregar una capa de mosaico al mapa
L.tileLayer(`https://api.maptiler.com/maps/streets-v2/{z}/{x}/{y}.png?key=${key}`, { //style URL
  tileSize: 512,
  zoomOffset: -1,
  minZoom: 1,
  attribution: "href=\"https://www.openstreetmap.org/copyright\" target=\"_blank\"\u003e\u0026copy; OpenStreetMap contributors\u003c/a\u003e",
  crossOrigin: true
}).addTo(myMap);

// Agregar un controlador de búsqueda al mapa
L.Control.geocoder({ position: 'topright' }).addTo(myMap);

// Configurar la ventana emergente de la capa
layer.bindPopup('Esta es la dirección: Av. Independencia 123');
/*layer.bindPopup(content);*/
layer.on('popupopen', function(e) {
    var popup = e.popup;
    var content = popup.getContent();
    document.getElementById("direccion-input").value = content;
    console.log("debug contenido: ", content)
});
marker.on('click', function(e) {
  direccionInput.value = e.target.getPopup().getContent();
});
