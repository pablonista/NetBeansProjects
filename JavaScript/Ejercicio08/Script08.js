var min = Infinity;
var max = -Infinity;
var sum = 0;
var count = 0;

while (true) {
    var num = parseInt(prompt("Ingrese un número. Ingrese 0 para salir: "));
    
    if (num === 0) {
        break;
    }
    
    sum += num;
    count++;
    
    if (num < min) {
        min = num;
    }
    
    if (num > max) {
        max = num;
    }
}

var promedio = sum / count;

console.log("El número mínimo: " + min);
console.log("El número máximo: " + max);
console.log("El promedio es: " + promedio);
