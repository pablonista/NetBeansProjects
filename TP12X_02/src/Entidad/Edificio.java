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
public abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    public abstract double calcularSuperficie();
    public abstract double calcularVolumen();

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public double getLargo() {
        return largo;
    }

    @Override
    public String toString() {
        String retorno="\nDimensiones del Edificio";
        retorno+="\nAncho= "+ancho;
        retorno+="\nAlto= "+alto;
        retorno+="\nlargo= "+largo;
        return retorno;
    }
}
