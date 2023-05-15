/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.Arrays;

/**
 *
 * @author HP
 */
public class DAvectorCien {
    public static void main(String[] args) {
        int n=100;
        int [] vector= new int[n];
        cargarVector(vector,n);
        mostrarVector(vector,n);
        //System.out.println("El vector cargado es: " + Arrays.toString(miVector));
    }
    public static void cargarVector(int [] v,int tam){
        for (int i = 0; i < tam; i++) {
            v[i]=i;
        }
    }
    public static void mostrarVector(int [] v,int tam){
        for (int i = tam-1; i >= 0; i--) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("");
    }
    
}
