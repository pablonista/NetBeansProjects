/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class BClongCadena {
   public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        System.out.print("Ingrese una palabra: ");
        String cadena = Leer.nextLine();
        cadena=cadena.toLowerCase();
        if (cadena.length()==8) {
            System.out.println("La palabra "+cadena+" es correcta tiene 8 caracteres");
        } else {
            System.out.println("La palabra "+cadena+" no es correcta tiene "+ cadena.length() + " caracteres");
        }
    } 
}
