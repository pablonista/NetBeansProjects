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
public class DFmatrizMagica {
    public static void main(String[] args) {
        int[]vector=new int [9];
        int[]vector2=new int[8];
        boolean magica;
        int[][]matriz=new int [3][3];
        cargarVector(vector);//prueba1
        //mostrarVector(vector);
        cargarMatriz(matriz,vector);//prueba1
        /* prueba para ver si anda la funcion esMagica()
        matriz[0][0]=8;
        matriz[0][1]=3;
        matriz[0][2]=4;
        matriz[1][0]=1;
        matriz[1][1]=5;
        matriz[1][2]=9;
        matriz[2][0]=6;
        matriz[2][1]=7;
        matriz[2][2]=2;
        */
        mostrarMatriz(matriz);
        calcularValor(matriz,vector2);
        magica=esMagica(vector2);
        if (magica==true) {
            System.out.println("La matriz es Mágica");
        } else {
            System.out.println("La matriz no es Mágica");
        }
    }
    public static boolean esMagica(int[] v){
        boolean retorno=false;
        int val=v[0],cont=1;
        for (int i = 1; i < 8; i++) {
            if (val==v[i]) {
                cont++;
            }
        }
        if (cont==8) {
            retorno=true;
        } else {
            retorno=false;
        }
        return retorno; 
    }
    public static void calcularValor(int[][]m,int[]v){
        int k=0,acum=0;
        for (int i = 0; i < 3; i++) {
            acum=0;
            for (int j = 0; j < 3; j++) {
                acum=acum+m[i][j];
            }
            v[k]=acum;
            k++;
        }
        for (int j = 0; j < 3; j++) {
            acum=0;
            for (int i = 0; i < 3; i++) {
                acum=acum+m[i][j];
            }
            v[k]=acum;
            k++;
        }
        acum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j) {
                    acum=acum+m[i][j];
                }
            }
        }
        v[k]=acum;
        k++;
        acum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i+j==2) {//formula diagonal secundaria i+j=n-1
                    acum=acum+m[i][j];
                }
            }
        }
        v[k]=acum;
    }
    public static void cargarMatriz(int[][]m,int[]v){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                 int idx;
                 do {                    
                     idx = (int) (Math.random() * 9);
                 } while (v[idx] == 0);
                 m[i][j] = v[idx];
                 v[idx] = 0;
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
    public static void cargarVector(int[] v){
        for (int i = 0; i < 9; i++) {
            v[i]=i+1;
        }
    }
    public static void mostrarVector(int[] v){
        for (int i = 0; i < 9; i++) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("");
    }
    
}
