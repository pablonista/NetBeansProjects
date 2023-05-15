/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
//import static egg_backend1.DCcifraVector.mostrarHora; asi se llama a un metodo de otra clase.
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class DXAsumaElementosVector {
    public static void main(String[] args) {
        int suma=0,n;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el tamaño del Vector: ");
        n=sc.nextInt();
        n=validarN(n);
        int[] vector=new int[n];
        cargarVector(vector,n);
        System.out.println("Elementos en el Vector:");
        mostrarVector(vector,n);
        suma=sumarValores(vector,n);
        System.out.println("La suma de los valores del Vector: "+suma);
    }
    public static int sumarValores(int[]v,int tam){
        int retorno=0;
        for (int i = 0; i < tam; i++) {
            retorno+=v[i];
        }
        return retorno;
    }
    public static void mostrarVector(int[]v,int tam){
        Scanner sc=new Scanner (System.in);
        for (int i = 0; i < tam; i++) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("");
    }
    public static void cargarVector(int[]v,int tam){
        Scanner sc=new Scanner (System.in);
        for (int i = 0; i < tam; i++) {
            System.out.print("Ingrese el elemento de Vector["+(i+1)+"]:");
            v[i]=sc.nextInt();
        }
    }
    public static int validarN(int num)  {
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>0) {
                retorno=num;
            } else {
                if (num<=0) {
                    ClearScreen();
                    //mostrarHora();
                    System.out.println("No puede ser negativo o cero.");
                    System.out.print("Ingrese nuevamente el tamaño del vector: ");
                    num=sc.nextInt();
                    retorno=num;
                }
            }
        } while (retorno<=0);
        return retorno; 
    }
    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla: " + e.getMessage());
        }
    }
}
