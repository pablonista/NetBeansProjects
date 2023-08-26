// Función para generar un número aleatorio entre un rango dado
function generarNumeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}

// Crear dos vectores vacíos
var vector1 = [];
var vector2 = [];

// Rellenar los vectores con valores aleatorios
for (var i = 0; i < 5; i++) {
  var valorAleatorio = generarNumeroAleatorio(1, 100);
  vector1.push(valorAleatorio);
  
  valorAleatorio = generarNumeroAleatorio(1, 100);
  vector2.push(valorAleatorio);
}

// Mostrar los vectores por pantalla
console.log("Vector 1:", vector1);
console.log("Vector 2:", vector2);
