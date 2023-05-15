/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.*;
/**
 *
 * @author HP
 */
public class DBbuscarVector {
    public static void main(String[] args) {
        int n,buscado;
        Scanner sc=new Scanner(System.in);
        mostrarHora();
        System.out.print("Ingrese el tamaño del vector: ");
        n=sc.nextInt();
        n=validarN(n);
        int []vector=new int[n];
        cargarVector(vector,n);
        System.out.print("Ingrese un número para buscar en el vector: ");
        buscado=sc.nextInt();
        buscarVector(vector,n,buscado);
        mostrarVector(vector,n);
        
    }
    public static void buscarVector(int [] v,int n, int nbusc){
        int cont=0;
        System.out.println("El valor buscado: "+nbusc);
        for (int i = 0; i < n; i++) {
            if (nbusc==v[i]) {
                System.out.println((cont+1)+" - "+"Se encontró en la posición: "+(i+1));
                cont++;
            }
        }
        if (cont==0) {
            System.out.println("No fue encontrado en el vector.");
        }
    }
    public static void mostrarHora(){
        System.out.println("\t\t\t\t\t\t Hoy = "+new Date());
        System.out.println("\n\n");
    }
    public static void mostrarVector(int [] v,int tam){
        System.out.println("");
        for (int i = 0; i < tam; i++) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("\n");
    }
    public static void cargarVector (int[] v,int n){
        for (int i = 0; i < n; i++) {
            v[i]=(int)(Math.random()*(300-0+1)+0);//entre 0 y 300
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
                    mostrarHora();
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
