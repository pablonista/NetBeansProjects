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
public class AAsumInt {
    public static void main(String[] args) {
        int num1,num2,suma;
        Scanner Leer = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1=Leer.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2=Leer.nextInt();
        suma=num1+num2;
        System.out.println("El resultado de la suma es "+suma);
    }
}
