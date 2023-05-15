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
public class DXBigualdadVectores {
    public static void main(String[] args) {
        int n;
        boolean resp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el tamaño de los vectores: ");
        n=sc.nextInt();
        n=validarN(n);
        int[]vector=new int[n];
        int[]vector1=new int[n];
        cargarVector(vector);
        cargarVector(vector1);
        System.out.print("Elementos del Vector1: ");
        mostrarVector(vector);
        System.out.print("Elementos del Vector2: ");
        mostrarVector(vector1);
        ordenarVector(vector);
        ordenarVector(vector1);
        System.out.print("\nElementos del Vector1 ordenado: ");
        mostrarVector(vector);
        System.out.print("Elementos del Vector2 ordenado: ");
        mostrarVector(vector1);
        resp=esigualVector(vector,vector1);
        if (resp==true) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores no son iguales.");
        }
    }
    public static boolean esigualVector(int[]v,int[]v1){
        boolean retorno=false;
        for (int i = 0; i < v.length; i++) {
            if (v[i]==v1[i]) {
                retorno=true;
            } else {
                retorno=false;
                i=v.length;
            }      
        }
        return retorno;
    }
    
    public static void ordenarVector(int[]v){
        int aux=0;
        boolean cambiado=false;
        do {
            cambiado=false;
            for (int i = 0; i < (v.length)-1; i++) {
                if (v[i]>v[i+1]) {
                    aux=v[i];
                    v[i]=v[i+1];
                    v[i+1]=aux;
                    cambiado=true;
                }
            }
        } while (cambiado==true);
    }
    public static void mostrarVector(int[]v){
        Scanner sc=new Scanner (System.in);
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("");
    }
    public static void cargarVector(int[]v){
        Scanner sc=new Scanner (System.in);
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random()*v.length);
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
