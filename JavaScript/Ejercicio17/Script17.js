var vector = [];

function borrarElementos(arreglo) {
    for (let i = 0; i < 2; i++) {
        arreglo.pop(); // Elimina el último elemento del arreglo
    }
}

function generarNumeroAleatorio(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}

function cargarVector() {
    let arreglo = [];
    for (let i = 0; i < 5; i++) {
        arreglo[i] = generarNumeroAleatorio(0, 100);
    }
    return arreglo;
}

function mostrarVector(arreglo) {
    for (let i = 0; i < arreglo.length; i++) {
        console.log("Elemento " + i + ": " + arreglo[i]);
    }
}

vector = cargarVector();
console.log("Vector inicial:");
mostrarVector(vector);

console.log("Se eliminan los 2 últimos valores del vector:");
borrarElementos(vector);
mostrarVector(vector);
