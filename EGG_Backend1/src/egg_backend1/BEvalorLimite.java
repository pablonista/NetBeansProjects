/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author HP
 */
public class BEvalorLimite {
    public static void main(String[] args) {
        int num,suma,limite,i;
        Scanner Leer = new Scanner (System.in);
        suma=0;
        i=1;
        System.out.print("Ingrese el número limite: ");
        limite=Leer.nextInt();
        do {            
            System.out.println("Interacion N° "+i);
            System.out.print("Ingrese un número: ");
            num=Leer.nextInt();
            suma=suma+num;
            i++;
        } while (suma<limite);
         System.out.println("El valor de suma: "+suma);
    }   
}
