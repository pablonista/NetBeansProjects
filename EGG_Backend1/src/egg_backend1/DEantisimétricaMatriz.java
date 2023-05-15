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
public class DEantisimétricaMatriz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] A =  new int[3][3];
        int[][] AT =  new int[3][3];
        String resp="";
        cargarMatriz(A);
        cargarMatriz(AT);
        System.out.println("Matriz A");
        mostrarMatriz(A);
        System.out.println("Matriz AT");
        mostrarMatriz(AT);
        esAntisimetrica(A,AT);//A=-AT
        System.out.print("Desea convertir A en Antisimetrica (Si/No)?");
        resp=sc.nextLine();
        if (resp.equalsIgnoreCase("SI")||resp.equalsIgnoreCase("S")) {
            convertirAntisimetrica(A,AT);
            System.out.println("Matriz A");
            mostrarMatriz(A);
            System.out.println("Matriz AT");
            mostrarMatriz(AT);
            esAntisimetrica(A,AT);
        }
    }
    public static void cargarMatriz(int[][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j]=(int)(Math.random()*(10+10+1)-10);//-10 a 10
            }
        }
    }
    public static void mostrarMatriz(int[][]m){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t"+m[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void esAntisimetrica(int[][]a,int[][]b){
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j]==b[j][i]*(-1)) {
                    cont++;
                }
            }
        }
        if (cont==9) {
            System.out.println("La Matriz AT es antisimetrica de A");
        } else {
            System.out.println("La Matriz AT no es antisimetrica de A");
        }
    }
    public static void convertirAntisimetrica(int[][]a,int [][]b){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[j][i]=a[i][j]*(-1);
            }
        }
    }
    
}
