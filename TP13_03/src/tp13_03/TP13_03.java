/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp13_03;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP13_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=0,num2=0;
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese el primer número: ");
        String numCad1=sc.next();
        System.out.print("Ingrese el segundo número: ");
        String numCad2=sc.next(); 
        try{
            num1=parseInt(numCad1);
            num2=parseInt(numCad2);
            System.out.println(num1+"/"+num2+"="+(num1 / num2));
        }catch(NumberFormatException e){
            System.out.println("Error: Ingreso un formato indebido");
        }catch (ArithmeticException e){
            System.out.println("Error: División en cero.");
        }
    }
    
}
