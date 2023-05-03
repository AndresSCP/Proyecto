function filtrarTabla() {
  // Obtener el valor de búsqueda del campo de entrada de texto
  var input = document.getElementById("datatable-search-input");
  var filtro = input.value.toUpperCase();

  // Obtener la tabla y todas las filas
  var tabla = document.getElementById("tablaMensajes");
  var filas = tabla.getElementsByTagName("tr");

  // Iterar sobre todas las filas y ocultar las que no coincidan con el filtro de búsqueda
  for (var i = 0; i < filas.length; i++) {
    var celdas = filas[i].getElementsByTagName("td");
    var coincide = false;
    for (var j = 0; j < celdas.length; j++) {
      if (celdas[j].innerHTML.toUpperCase().indexOf(filtro) > -1) {
        coincide = true;
        break;
      }
    }
    if (coincide) {
      filas[i].style.display = "";
    } else {
      filas[i].style.display = "none";
    }
  }
}

// Escuchar el evento de entrada de teclado en el campo de entrada de texto
document.getElementById("datatable-search-input").addEventListener("keyup", filtrarTabla);/**
 * 
 */