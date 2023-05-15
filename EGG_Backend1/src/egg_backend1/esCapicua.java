/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;

/**
 *
 * @author HP
 */
public class esCapicua {
	
    public static void main (String[] args) {
        if (numeroCapicua(-1234321L)){
            System.out.println("Es capicua");
        }else {
            System.out.println("No es capicua");
       	}
    }
    public static boolean numeroCapicua(Long x) {
        if (x == null) { // Si el número es nulo, devolvemos false
            return false;
        }
        // Convertimos el número a String para poder trabajar con sus dígitos
        String numero = String.valueOf(Math.abs(x));
        // Recorremos los dígitos del número desde ambos extremos al mismo tiempo
        for (int i = 0, j = numero.length() - 1; i <= j; i++, j--) {
            // Si encontramos un par de dígitos diferentes, el número no es capicúa
            if (numero.charAt(i) != numero.charAt(j)) {
                return false;
            }
        }
        // Si llegamos hasta aquí, el número es capicúa
        return true;
    }
}
