const checkboxes = document.querySelectorAll('input[name="showTable"]');
checkboxes.forEach((checkbox) => {
  checkbox.checked = true;
  checkbox.addEventListener('change', () => {
    const tableId = `tabla${checkbox.value.charAt(0).toUpperCase() + checkbox.value.slice(1)}`;
    const table = document.getElementById(tableId);
    table.style.display = checkbox.checked ? 'table' : 'none';
  });
});