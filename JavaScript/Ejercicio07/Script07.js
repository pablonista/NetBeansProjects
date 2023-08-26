function validarLimite(num){
    if (num>=0) {
        return num;
    } else {
        num=parseInt(prompt("El limite debe ser positivo.\Ingrese nuevamente el limite:"))
        return validarLimite(num);
    }
}

var limite=parseInt(prompt("Ingrese un limite:"));
limite=validarLimite(limite);
console.log("El limite ingresado: "+limite)
var suma=0;
do {
    var num=parseInt(prompt("Ingrese un número:"));
    suma=suma+num;
    console.log("El número ingresado: "+num+". \nLa suma de los números ingresados es:"+suma);
} while (suma<=limite);
console.log("Se terminó su ejecución.");

