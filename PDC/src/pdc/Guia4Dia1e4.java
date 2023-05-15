/*
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc;
import java.util.Scanner;
/**
 
 * @author vs
 */
public class Guia4Dia1e4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner lectura = new Scanner(System.in);

        int numero;

 

        System.out.print("Ingresa un numero: ");

        numero = lectura.nextInt();

        EsPrimo(numero);

        
        }

    
public static void EsPrimo(int numb) {
    int contador,I;    
    contador = 0;


            for(I = 1; I <= numb; I++)

            {

                if((numb % I) == 0) {

                    contador++;

                }

            }



            if(contador >2){
                System.out.println("El numero no es primo");
            }
            else{
                System.out.println("El numero es primo");
            }
    }   
}
