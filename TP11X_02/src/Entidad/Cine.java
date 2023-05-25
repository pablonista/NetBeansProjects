/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Random;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Cine {
    private Pelicula peliculaActual;
    private char[][] sala;

    public Cine() {
        peliculaActual = null;
        sala = new char[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = ' ';
            }
        }
    }

    public void reproducirPelicula(Pelicula pelicula) {
        peliculaActual = pelicula;
    }

    public void venderEntrada(Espectador espectador) {
        if (peliculaActual == null) {
            System.out.println("No hay película en reproducción.");
            return;
        }

        if (espectador.getEdad() < peliculaActual.getEdadMinima()) {
            System.out.println(espectador.getNombre() + " no cumple con la edad mínima para ver la película.");
            return;
        }

        if (espectador.getDinero() < 5.0) {
            System.out.println(espectador.getNombre() + " no tiene suficiente dinero para comprar la entrada.");
            return;
        }

        Random random = new Random();
        while (true) {
            int row = random.nextInt(8);
            int col = random.nextInt(6);
            if (sala[row][col] == ' ') {
                sala[row][col] = 'X';
                System.out.println(espectador.getNombre() + " ha ocupado el asiento " + (8 - row) + " " + (char)('A' + col));
                break;
            }
        }
    }

    public void mostrarSala() {
        for (int i = 7; i >= 0; i--) {
            for (int j = 0; j < 6; j++) {
                System.out.print((8 - i) + " " + (char)('A' + j) + " " + sala[i][j] + " | ");
            }
            System.out.println();
        }
    }
}

