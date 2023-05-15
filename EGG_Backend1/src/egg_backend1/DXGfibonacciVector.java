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
public class DXGfibonacciVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Ingrese el número limite de la serie de Fibonacci: ");
        n=sc.nextInt();
        n=validarN(n);
        int[]vector=new int[n];
        cargarVector(vector);
        System.out.println("\nEl vector con elementos de Fibonacci:\n");
        mostrarVector(vector);
    }
    public static void mostrarVector(int[]v){
        for (int i = 0; i < v.length; i++) {
            if (v[i]!=0) {
                System.out.print(v[i]+"\t");
            } else {
                System.out.println("\n");
                break;
            }
        }
    }
    public static void cargarVector(int[]v){
        int ant=0,sig=1;
        for (int i = 0; i < v.length; i++) {
            if (i==0) {
                v[i]=sig;
            } else {
                v[i]=ant+sig;
                ant=sig;
                sig=v[i];   
            }
            if (ant+sig>v.length) {
                break;
            }
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
