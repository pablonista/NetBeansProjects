/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12_04;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo=new Circulo(5);
        Rectangulo rectangulo=new Rectangulo(2,5);
        System.out.println("Circulo con radio "+circulo.getRadio());
        System.out.println("Su circunferencia es :"+circulo.calculoPerimetro());
        System.out.println("Su area es :"+circulo.calculoArea());
        System.out.println("");
        System.out.println("Rectángulo con base "+rectangulo.getBase()+" y altura "+rectangulo.getAltura());
        System.out.println("Su Perimetro es :"+rectangulo.calculoPerimetro());
        System.out.println("Su area es :"+rectangulo.calculoArea());
    }
    
}
