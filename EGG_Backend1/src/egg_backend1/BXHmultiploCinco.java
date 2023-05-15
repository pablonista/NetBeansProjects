/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import com.sun.javafx.font.directwrite.DWGlyph;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BXHmultiploCinco {
    public static void main(String[] args) {
        int cantPares=0;
        int cantImpar=0;
        int n=0;
        int num;
        Scanner sc=new Scanner (System.in);
        do {            
            System.out.print("Ingrese un número: ");
            num=sc.nextInt();
            if (num%2==0 && num>=0) {
                cantPares++;
            } else {
                if (num>=0) {
                   cantImpar++; 
                }
            }
            if (num>=0) {
                n++;
            }
        } while (num%5!=0);
        System.out.println("Cantidad de Números ingresados: "+n);
        System.out.println("Cantidad de Números Pares: "+cantPares);
        System.out.println("Cantidad de Números Impares: "+cantImpar);
    }
}
       
