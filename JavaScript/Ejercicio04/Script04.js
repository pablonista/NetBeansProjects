var opcion=prompt("Ingrese una opcion 'S' o 'N':");
if (opcion.toUpperCase().charAt(0)==="S" || opcion.toUpperCase().charAt(0)==="N") {
    alert("Ingreso "+opcion.toUpperCase().charAt(0)+". Es correcto.");
} else {
    alert("Ingreso "+opcion.toUpperCase().charAt(0)+". Es incorrecto.");
}