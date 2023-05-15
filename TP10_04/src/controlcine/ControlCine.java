/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlcine;

import Entidad.Pelicula;
import Servicios.PeliculaService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ControlCine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PeliculaService ps=new PeliculaService();
       ArrayList <Pelicula> pls=new ArrayList();
       ps.cargarPelicula(pls);
       System.out.println("");
       ps.mostrarTodasPeliculas(pls);
       ps.mostrarPeliculasMayorUnaHora(pls);
       ps.mostrarPeliculaOrdenaDuracionMenorMayor(pls);
       ps.mostrarPeliculaOrdenaDuracionMayorMenor(pls);
       //ps.mostrarPeliculaOrdenaDuracionMayorMenorV1(pls);
       ps.mostrarPeliculaOrdenaTitulo(pls);
       ps.mostrarPeliculaOrdenaDirector(pls);
    }
    
}
