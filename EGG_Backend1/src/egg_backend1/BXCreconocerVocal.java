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
public class BXCreconocerVocal {
    public static void main(String[] args) {
        char letra;
        Scanner Leer=new Scanner(System.in);
        System.out.print("Ingrese una letra: ");
        letra=Leer.nextLine().toLowerCase().charAt(0);
        if (letra=='a' ||letra=='e' ||letra=='i'||letra=='o'||letra=='u') {
            System.out.println("La letra ingresada "+letra+" es una vocal.");
        } else {
            System.out.println("La letra ingresada "+letra+" es una consonante.");
        }
    }
 
}
