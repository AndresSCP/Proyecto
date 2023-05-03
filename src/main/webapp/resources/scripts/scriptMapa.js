/*Script de mapa */

// Crear el objeto del mapa y establecer la vista inicial
const myMap = L.map('myMap').setView([-33.01317, -71.54131], 13);

// Agregar la capa de mosaicos al mapa
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
  maxZoom: 18,
}).addTo(myMap);

// Crear el marcador y agregarlo al mapa
const iconMarker = L.icon({
  iconUrl: 'marker.png',
  iconSize: [60, 60],
  iconAnchor: [30, 60]
});

L.marker([-33.01317, -71.54131]).addTo(myMap);
L.marker([51.51, -0.09], { icon: iconMarker }).addTo(myMap);

// Deshabilitar el zoom con doble clic
myMap.doubleClickZoom.disable();

// Agregar un marcador cuando el usuario hace doble clic en el mapa
myMap.on('dblclick', e => {
  const latLng = myMap.mouseEventToLatLng(e.originalEvent);
  L.marker([latLng.lat, latLng.lng], { icon: iconMarker }).addTo(myMap);
});

// Obtener la ubicación del usuario y agregar un marcador en esa ubicación
navigator.geolocation.getCurrentPosition(
  pos => {
    const { latitude, longitude } = pos.coords;
    L.marker([latitude, longitude], { icon: iconMarker }).addTo(myMap);

    setTimeout(() => {
      myMap.panTo(new L.LatLng(latitude, longitude));
    }, 5000);
  },
  error => {
    console.log(error);
  },
  {
    enableHighAccuracy: true,
    timeout: 5000,
    maximumAge: 0
  }
);

// Crear el control de búsqueda y agregarlo al mapa
const searchControl = new L.Control.GeoSearch({
  provider: new L.GeoSearch.Provider.OpenStreetMap(),
  searchLabel: 'Buscar dirección...',
  notFoundMessage: 'Dirección no encontrada',
  retainZoomLevel: false,
  animateZoom: true,
  autoClose: true,
  keepResult: true
});

searchControl.addTo(myMap);

// Obtener el campo de entrada de dirección y agregar un listener de cambio
const lugarInput = document.getElementById('lugar');

lugarInput.addEventListener('change', () => {
  // Obtener la dirección ingresada por el usuario
  const direccion = lugarInput.value;

  // Crear un objeto de geocodificación utilizando el proveedor de búsqueda activo
  const geocoder = new L.Control.Geocoder({
    geosearchProvider: searchControl.getProvider(),
    defaultMarkGeocode: false
  });

  // Convertir la dirección a coordenadas y mover el mapa a esas coordenadas
  geocoder.geocode(direccion, resultados => {
    const latlng = resultados[0].center;
    myMap.setView(latlng, 13);
  });
});