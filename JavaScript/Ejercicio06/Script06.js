var num1 = parseInt(prompt("Ingrese un número: "));

if (num1===0) {
    console.log("El número "+num1+" no es par ni impar.");
} else {
    if (num1%2===0) {
        console.log("El número "+num1+" es par.");
    } else {
        console.log("El número "+num1+" es impar.");
    }
}