/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interface.calculoFormas;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Rectangulo implements calculoFormas{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }
    
    @Override
    public double calculoPerimetro() {
        return 2*(altura+base);
    }

    @Override
    public double calculoArea() {
        return (altura*base)/2;
    }
}
