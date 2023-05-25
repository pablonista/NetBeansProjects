/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Asiento {
    private int fila;
    private int columna;
    private boolean ocupado;
    private Espectador espectador;

    public Asiento(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
        this.espectador = null;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void ocupar(Espectador espectador) {
        ocupado = true;
        this.espectador = espectador;
    }

    public void desocupar() {
        ocupado = false;
        espectador = null;
    }

    public String estado() {
        if (ocupado) {
            return "X";
        } else {
            return " ";
        }
    }
}
