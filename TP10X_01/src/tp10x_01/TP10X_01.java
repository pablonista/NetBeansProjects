/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10x_01;

import Servicios.ArrayService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TP10X_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayService as=new ArrayService ();
        ArrayList ArrayEnteros = new ArrayList();
        as.cargarArray(ArrayEnteros);
        as.mostrarArray(ArrayEnteros);
        System.out.println("La suma de los elementos del Array: "+as.sumarArray(ArrayEnteros));
        System.out.println("El promedio de los elementos del Array: "+(as.sumarArray(ArrayEnteros)*1.0/ArrayEnteros.size()*1.0));
    }
}
