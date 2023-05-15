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
public class BBcompCadena {
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        System.out.print("Ingrese una palabra: ");
        String cadena = Leer.nextLine();
        cadena=cadena.toLowerCase();
        if (cadena.equals("eureka")) {
            System.out.println("Correcto, la palabra ingresada es eureka");
        } else {
            System.out.println("Incorrecto, no es la palabra.");
        }
    }
}
