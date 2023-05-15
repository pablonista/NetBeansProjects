/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author HP
 */
public class Carta {
    private int numeracion;
    private String palo;
    private boolean sacada;

    public Carta(int numeracion, String palo) {
        this.numeracion = numeracion;
        this.palo = palo;
        this.sacada=false;
    }

    public int getNumeracion() {
        return numeracion;
    }

    public void setNumeracion(int numeracion) {
        this.numeracion = numeracion;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public boolean isSacada() {
        return sacada;
    }

    public void setSacada(boolean sacada) {
        this.sacada = sacada;
    }

    @Override
    public String toString() {
        return "Carta{" + "numeracion=" + numeracion + ", palo=" + palo + ", sacada=" + sacada + '}';
    }
}
