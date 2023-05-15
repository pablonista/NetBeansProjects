/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BAimparPar {
    public static void main(String[] args) {
        Scanner Leer=new Scanner (System.in);
        System.out.print("Ingrese un número: ");
        int num=Leer.nextInt();
        if (num % 2==0) {
            System.out.println("El número ingresado "+num+" es par.");
        } else {
            System.out.println("El número ingresado "+num+" es impar.");    
        }
    }
    
}
