/*
1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ArrayService {
   private Scanner sc=new Scanner(System.in).useDelimiter("\n");
   
   public void cargarArray (ArrayList <Integer> arrayEnteros){
       int num=0; 
       do {           
           System.out.print("Ingrese un número positivo (para Salir ingrese -99): ");
           num=sc.nextInt();
           if (num!=-99) {
               arrayEnteros.add(num);
           }
       } while (num!=(-99));          
   }
   public void mostrarArray (ArrayList <Integer> arrayEnteros){
       System.out.println("Lista de Elementos cargados: ");
       for (Integer n: arrayEnteros){
           System.out.println(n);
       }
   }
   public void ordenarArray(ArrayList <Integer> arrayEnteros){
       Collections.sort(arrayEnteros);
   }
   public int sumarArray(ArrayList <Integer> arrayEnteros){
       int suma=0;
       for (Integer num : arrayEnteros){
           suma=suma+num;
       }
       return suma;
   }
}
