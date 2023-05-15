/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10x_03;

import Entidad.Libro;
import Servicios.LibroService;
import java.util.HashSet;

/**
 *
 * @author HP
 */
public class TP10X_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService lc=new LibroService();
        HashSet <Libro> libros=new HashSet();
        lc.cargarLibro(libros);
        lc.mostrarLibro(libros);
        if (lc.prestamos(libros)==true){
            System.out.println("Se proceso exitosamente el prestamo del libro");
            lc.mostrarLibro(libros);
        }else {
            System.out.println("No se realizó el prestamo.");
        }
        if (lc.devolucion(libros)==true){
            System.out.println("Se proceso exitosamente la devolución del libro");
            lc.mostrarLibro(libros);
        }else {
            System.out.println("No se realizó la devolución.");
        }
    }
}
