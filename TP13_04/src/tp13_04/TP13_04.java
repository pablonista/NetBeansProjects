/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp13_04;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP13_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            
            try {
                System.out.print("Ingrese una cadena: ");
                String cadena = sc.next();
                int entero = Integer.parseInt(cadena);
                
                try {
                    int resultado = numero / entero;
                    System.out.println("El resultado de la división es: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println("Error: División por cero");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: La cadena no puede convertirse a entero");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Debe ingresar un número entero");
        }
    }
    
}
