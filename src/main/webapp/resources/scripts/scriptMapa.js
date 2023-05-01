/*Script de mapa */

const tilesProvider = 'https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png'

let myMap = L.map('myMap').setView([51.505,-0.09], 13)

L.tileLayer (tilesProvider,{
	    maxZoom: 19,
	    attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
}).addTo(myMap);

/*let marker = L.marker([51.505,-0.09]).addTo(myMap)*/