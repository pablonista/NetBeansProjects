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
public class BHcuadrado {
    public static void main(String[] args) {
        int i,j,n;
        Scanner Leer=new Scanner(System.in);
        System.out.print("Escribe una longitud:");
        n=Leer.nextInt();
        if (n>=1 && n<=50) {
            //parte superior
            for (i = 1; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
            //centro del cuadrado
            for (i = 1; i < (n-2); i++) {
                System.out.print("*");
                for (j = 1; j < (n-2); j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            //parte interior
            for (i = 1; i < n; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
        /*
		///centro del cuadrado
		Para i<-1 Hasta n-2 Con Paso 1 Hacer
			Escribir Sin Saltar"*"
			Para j<-1 Hasta n-2 Con Paso 1 Hacer
				Escribir Sin Saltar" "
			Fin Para
			Escribir "*"
		Fin Para
		///parte inferior
		Para i<-1 Hasta n Con Paso 1 Hacer
			Escribir Sin Saltar"*"
		Fin Para
	FinSi
	Escribir ""
	Escribir "Presione una tecla para continuar..."
	Esperar Tecla */

