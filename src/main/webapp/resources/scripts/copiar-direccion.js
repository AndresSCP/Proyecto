function copiarDireccion() {
  const direccionSeleccionada = document.querySelector('.leaflet-control-geocoder-alternatives li:first-child a');
  if (direccionSeleccionada !== null) {
    const direccion = direccionSeleccionada.querySelector('.leaflet-control-geocoder-address').innerText;
    const inputDireccion = document.getElementById('direccion');
    inputDireccion.value = direccion;
    const labelDireccion = inputDireccion.nextElementSibling;
    labelDireccion.classList.add('active');
  }
}