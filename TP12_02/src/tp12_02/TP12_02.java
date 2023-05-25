/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12_02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ////// TP12 Ejercicio 2
       Scanner sc=new Scanner(System.in).useDelimiter("\n");
        Lavadora lavadora=new Lavadora();
        lavadora.crearLavadora();
        lavadora.mostrarInformacion();
        System.out.println("El precio Final del Lavadora es $ "+lavadora.precioFinal());
        System.out.println("");
        Televisor televisor=new Televisor();
        televisor.crearTelevisor();
        televisor.mostrarInformacion();
        System.out.println("El precio Final del Televisor es $ "+televisor.precioFinal()); 
  
    }
    
}
