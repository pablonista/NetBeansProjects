let inversaFrase=frase=> frase.split('').reverse().join('');
var oracion=prompt("Ingrese una oración:");
oracion=oracion.toUpperCase();
var oracionInversa=inversaFrase(oracion);
//oracion=oracion.toUpperCase;
console.log("La oración ingresada: "+oracion.toUpperCase());
console.log("La oración inversa: "+oracionInversa);