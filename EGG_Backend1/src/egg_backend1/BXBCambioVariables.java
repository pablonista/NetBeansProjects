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
public class BXBCambioVariables {
    public static void main(String[] args) {
        int A = 1;
        int B = 2;
        int C = 3;
        int D = 4;
        /*Scanner Leer=new Scanner(System.in);
        System.out.print("Ingrese A: ");
        A=Leer.nextInt();
        System.out.print("Ingrese B: ");
        B=Leer.nextInt();
        System.out.print("Ingrese C: ");
        C=Leer.nextInt();
        System.out.print("Ingrese D: ");
        D=Leer.nextInt();*/
        System.out.println("Valores iniciales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
        int aux = B;
        B=C;
        C=A;
        A=D;
        D=aux;
        System.out.println("Valores finales:");
        System.out.println("A: " + A + ", B: " + B + ", C: " + C + ", D: " + D);
    }
}
