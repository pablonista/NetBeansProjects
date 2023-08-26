// Función para realizar la suma
function sumar(a, b) {
    return a + b;
  }
  
  // Función para realizar la resta
  function restar(a, b) {
    return a - b;
  }
  
  // Función para realizar la multiplicación
  function multiplicar(a, b) {
    return a * b;
  }
  
  // Función para realizar la división
  function dividir(a, b) {
    if (b === 0) {
      return "No se puede dividir por cero";
    }
    return a / b;
  }
  
  // Función principal del programa
  function main() {
    const operacion = prompt("Seleccione una operación: (S)uma, (R)esta, (M)ultiplicación, (D)ivisión");
    const num1 = parseInt(prompt("Ingrese el primer número:"));
    const num2 = parseInt(prompt("Ingrese el segundo número:"));
  
    let resultado;
  
    switch (operacion.toLowerCase()) {
      case "s":
        resultado = sumar(num1, num2);
        break;
      case "r":
        resultado = restar(num1, num2);
        break;
      case "m":
        resultado = multiplicar(num1, num2);
        break;
      case "d":
        resultado = dividir(num1, num2);
        break;
      default:
        resultado = "Operación no válida";
    }
  
    console.log("El primer número ingresado: "+num1+".\nEl segundo número ingresado: "+num2+".\nEl resultado de la operación es: "+resultado);
  }
  
  // Llamamos a la función principal para iniciar el programa
  main();
  