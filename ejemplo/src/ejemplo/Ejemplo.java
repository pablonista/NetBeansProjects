/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);    
        //String autor,titulo;
        Cancion art2 = new Cancion();
        //definicion de un objeto como array
        Cancion [] art3 = new Cancion[5];
        int i;
        for (i = 0; i < art3.length; i++) {
            art3[i] = new Cancion();
            System.out.println((i+1)+"Ingrese autor: ");
            art3[i].setAutor(entrada.nextLine());
            System.out.println((i+1)+"Ingrese titulo: ");
            art3[i].setTitulo(entrada.nextLine());
        }
        for (i = 0; i < 5; i++) {
            art3[i].mostrarDatos();
        }
    }
    }
    

