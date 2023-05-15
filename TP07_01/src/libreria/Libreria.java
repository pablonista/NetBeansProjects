/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import Entidad.Libro;

/**
 *
 * @author HP
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Libro Lb1= new Libro();
      Lb1.cargarLibro();
      Lb1.mostrarDetalles();
   }
    
}
