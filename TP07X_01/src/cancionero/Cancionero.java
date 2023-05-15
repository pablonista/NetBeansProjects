/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancionero;

import entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Cancionero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion canc=new Cancion();
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese Titulo de la canción: ");
        canc.setTitulo(sc.nextLine().toUpperCase());
        System.out.print("Ingrese Autor de la canción: ");
        canc.setAutor(sc.nextLine().toUpperCase());
        System.out.println("");
        System.out.println("Titulo ingresado: "+canc.getTitulo());
        System.out.println("Autor ingresado: "+canc.getAutor());
    }
    
}
