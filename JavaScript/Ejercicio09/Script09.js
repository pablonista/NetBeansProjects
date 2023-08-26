var oracion = prompt("Ingrese una oración:");
var oracionFinal = "";

for (var i = 0; i < oracion.length; i++) {
    if (i!== 0) {
        oracionFinal += " ";
    }
    oracionFinal += oracion.charAt(i).toUpperCase();
}

console.log(oracionFinal);