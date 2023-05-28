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
public class Circulo implements calculoFormas{
   private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    @Override
    public double calculoPerimetro() {
        return 2*PI*radio;
    }

    @Override
    public double calculoArea() {
        return PI*Math.pow(radio, 2);
    }
   
}
