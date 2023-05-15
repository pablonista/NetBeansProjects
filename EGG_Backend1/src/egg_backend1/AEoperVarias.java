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
public class AEoperVarias {
    public static void main(String[] args) {
       int num;
        Scanner Leer = new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        num = Leer.nextInt();
        System.out.print("");
        System.out.println("El número ingresado: "+num);
        System.out.println("El doble es: "+2*num);
        System.out.println("El triple es: "+3*num);
        System.out.println("La raíz cuadrada es: "+Math.sqrt(num));
    }   
}
