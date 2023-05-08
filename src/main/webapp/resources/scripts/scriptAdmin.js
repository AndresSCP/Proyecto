const checkboxes = document.querySelectorAll('input[name="showTable"]');
const filterInput = document.getElementById('filtroMensaje');
const filterButton = document.getElementById('botonFiltrar');

checkboxes.forEach((checkbox) => {
  checkbox.checked = true;
  checkbox.addEventListener('change', () => {
    const tableId = `tabla${checkbox.value.charAt(0).toUpperCase() + checkbox.value.slice(1)}`;
    const table = document.getElementById(tableId);
    table.style.display = checkbox.checked ? 'table' : 'none';

    // Ocultar el filtro de mensajes si no se muestra la tabla
    if (!checkbox.checked) {
      filterInput.style.display = 'none';
      filterButton.style.display = 'none';
    } else {
      filterInput.style.display = 'inline-block';
      filterButton.style.display = 'inline-block';
    }
  });
});

// Ocultar el filtro de mensajes al cargar la página
filterInput.style.display = 'none';
filterButton.style.display = 'none';