let tipoDato = argumento => {
    if (!isNaN(argumento)) {
      if (argumento.includes(".") || argumento.includes("e") || argumento.includes("E")) {
        return "number (decimal)";
      } else {
        return "number (entero)";
      }
    } else if (argumento === "true" || argumento === "false") {
      return "boolean";
    } else if (argumento.startsWith("[") && argumento.endsWith("]")) {
      return "array";
    } else if (argumento.startsWith("{") && argumento.endsWith("}")) {
      return "object";
    } else {
      return "string";
    }
  };
  
  var dato = prompt("Ingrese un tipo de dato cualquiera: ");
  console.log("El tipo de dato es: " + tipoDato(dato));
  