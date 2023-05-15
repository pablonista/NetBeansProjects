/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10x_03v1;

import Entidad.Libro;
import Servicios.LibroService;
import java.util.HashSet;

/**
 *
 * @author HP
 */
public class TP10X_03v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroService lc=new LibroService();
        HashSet <Libro> libros = new HashSet();
        lc.cargarLibro(libros);
        lc.mostrarLibro(libros);
        lc.prestamos(libros);
        lc.mostrarLibro(libros);
        lc.devolucion(libros);
        lc.mostrarLibro(libros);
    }    
}
    

