/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class DCcifraVector {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        mostrarHora();
        System.out.print("Ingrese el tamaño del vector: ");
        n=sc.nextInt();
        n=validarN(n);
        int []vector=new int[n];
        cargarVector(vector,n);
        mostrarVector(vector,n);
        calcularDigitos(vector,n);
        
    }
    public static void calcularDigitos(int [] v, int n){
        int cUno=0,cDos=0,cTres=0,cCuatro=0,cCinco=0;
        int valor;
        for (int i = 0; i < n; i++) {
            valor=String.valueOf(Math.abs(v[i])).length();
            switch (valor){
                case 1:
                    cUno++;
                    break;
                case 2:
                    cDos++;
                    break;
                case 3:
                    cTres++;
                    break;
                case 4:
                    cCuatro++;
                    break;
                case 5:
                    cCinco++;
                    break;
            }
            
        }
        System.out.println("Cantidad de números de 1 cifra: "+cUno);
        System.out.println("Cantidad de números de 2 cifras: "+cDos);
        System.out.println("Cantidad de números de 3 cifras: "+cTres);
        System.out.println("Cantidad de números de 4 cifra: "+cCuatro);
        System.out.println("Cantidad de números de 5 cifra: "+cCinco);
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
            v[i]=(int)(Math.random()*(99999-0+1)+0);//entre 0 y 99999
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
