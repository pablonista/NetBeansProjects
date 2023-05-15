/*
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class ArreglosService {
    public void inicializarA(double [] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=Math.random()*201-100; //Genero números aleatorios entre -100 y 100
        }
    }
    public void mostrar(double [] v){
        System.out.println("Los elementos del Arreglo: " + Arrays.toString(v));       
    }
    public void ordenar(double [] v){
        Arrays.sort(v);
        double[] vaux=new double[v.length];
        int j=0;
        for (int i = v.length-1; i >= 0; i--) {
            vaux[j]=v[i];
            j++;
        }
        for (int i = 0; i < v.length; i++) {
            v[i] = vaux[i];
        }
    }
    public void inicializarB(double [] vA, double [] vB){
        System.arraycopy(vA, 0, vB, 0, 10);
        Arrays.fill(vB, 10, 20, 0.5);
    }
}
