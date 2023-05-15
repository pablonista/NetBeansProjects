/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Mensaje;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MensajeService {
    private static Scanner sc=new Scanner (System.in).useDelimiter("\n");
    
    public static Mensaje crearMensaje(){
        System.out.print("Ingrese el mensaje a enviar: ");
        String cadena=sc.next().toUpperCase();
        //int[]num={0,1,2,3,4,5};
        return new Mensaje(cadena,cargarVector());
    }
    
    private static int[] cargarVector(){
        int[]vectNum=new int[5];
        for (int i = 0; i < vectNum.length; i++) {
            vectNum[i]=(int)(Math.random()*12-1);
        }
        return vectNum;
    }
    
    public static void mostrarDatos(Mensaje mens){
        System.out.println("Se muestran los Datos del Mensaje: "+mens.toString());
    }
    
}