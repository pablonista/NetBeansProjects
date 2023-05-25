/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11x_02;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP11X_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cine cine = new Cine();

        // Crear películas
        Pelicula pelicula1 = new Pelicula("Pelicula 1", 120, 16, "Director 1");
        Pelicula pelicula2 = new Pelicula("Pelicula 2", 90, 12, "Director 2");

        // Reproducir una película
        cine.reproducirPelicula(pelicula1);

        // Crear espectadores
        List<Espectador> espectadores = new ArrayList<>();
        espectadores.add(new Espectador("Espectador 1", 20, 10.0));
        espectadores.add(new Espectador("Espectador 2", 15, 5.0));
        espectadores.add(new Espectador("Espectador 3", 18, 7.0));

        // Vender entradas
        for (Espectador espectador : espectadores) {
            cine.venderEntrada(espectador);
        }

        // Mostrar la sala
        cine.mostrarSala();
    }
}
    

