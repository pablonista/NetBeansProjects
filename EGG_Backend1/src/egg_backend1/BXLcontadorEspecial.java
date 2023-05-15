package egg_backend1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class BXLcontadorEspecial {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            String numero = String.format("%03d", i); // Convierte el número a un String con 3 dígitos

            if (numero.contains("3")) { // Verifica si el número contiene un 3
                numero = numero.replace("3", "E"); // Reemplaza el 3 por una E
            }

            System.out.println(numero.charAt(0) + "-" + numero.charAt(1) + "-" + numero.charAt(2)); // Muestra el número formateado
        }
    }
}

