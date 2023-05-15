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
public class DDmatrizTraspuesta {
    public static void main(String[] args) {
        int[][] matriz=new int[4][4];
        cargarMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarTraspuestaMatriz(matriz);
        
    }
    public static void cargarMatriz(int[][]mat){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j]=(int)(Math.random()*(20-0+1)+0);//entre 0 y 20    
            }
        }
    }
    public static void mostrarMatriz(int[][] mat){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void mostrarTraspuestaMatriz(int[][] mat){
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                System.out.print("\t"+mat[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }        
}
