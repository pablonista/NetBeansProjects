function palabraMasLarga(cadena) {
    // Dividir la cadena en palabras
    const palabras = cadena.split(' ');
  
    // Inicializar una variable para almacenar la palabra más larga
    let palabraMasLarga = '';
  
    // Recorrer todas las palabras y encontrar la más larga
    for (const palabra of palabras) {
      if (palabra.length > palabraMasLarga.length) {
        palabraMasLarga = palabra;
      }
    }
    return palabraMasLarga;
}

var frase=prompt("Ingrese una frase: ");
resultado=palabraMasLarga(frase.toUpperCase());
console.log("La frase ingresada es: "+frase.toUpperCase());
console.log("La palabra más larga es: "+resultado+" con "+resultado.length+" letras.");
