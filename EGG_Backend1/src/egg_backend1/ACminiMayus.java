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
public class ACminiMayus {
    public static void main(String[] args) {
        Scanner Leer= new Scanner(System.in);
        String frase;
        System.out.print("Ingrese una frase: ");
        frase=Leer.nextLine();
        System.out.println("");
        System.out.println("La Frase Ingresada: "+frase);
        System.out.println("");
        System.out.println("La Frase en minúsculas: "+frase.toLowerCase());
        System.out.println("");
        System.out.println("La Frase en mayúsculas: "+frase.toUpperCase());
    }
}
