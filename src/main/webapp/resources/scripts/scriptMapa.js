function initMap() {
  const map = new google.maps.Map(document.getElementById("map"), {
    zoom: 14,
  });
  const geocoder = new google.maps.Geocoder();
  let marker = null; // variable para guardar la referencia del marcador

  // Crear el buscador
  const input = document.getElementById("search-input");
  const autocomplete = new google.maps.places.Autocomplete(input);
  autocomplete.bindTo("bounds", map);

  // Obtener ubicación actual
  navigator.geolocation.getCurrentPosition(
    (position) => {
      const userLocation = {
        lat: position.coords.latitude,
        lng: position.coords.longitude
      };
      map.setCenter(userLocation);
      marker = new google.maps.Marker({ // guardar referencia al marcador creado
        map,
        position: userLocation,
      });
    },
    () => {
      // Si no se puede obtener la ubicación del usuario, centrar el mapa en una ubicación predeterminada
      geocoder.geocode({ address: "Toledo" }).then((response) => {
        const position = response.results[0].geometry.location;
        map.setCenter(position);
        marker = new google.maps.Marker({ // guardar referencia al marcador creado
          map,
          position,
        });
      });
    }
  );

  // Escuchar el evento de selección de un lugar en el buscador
  autocomplete.addListener("place_changed", () => {
    const place = autocomplete.getPlace();
    if (!place.geometry || !place.geometry.location) {
      // Si no se encontró la ubicación, no hacer nada
      return;
    }
    // Mover el mapa hacia la ubicación buscada
    map.panTo(place.geometry.location);
    map.setZoom(15);

    // Actualizar la posición del marcador y crear un nuevo marcador en la ubicación buscada
    const newPosition = place.geometry.location;
    marker.setPosition(newPosition);
    new google.maps.Marker({
      map,
      position: newPosition,
    });
  });
}

window.initMap = initMap;
