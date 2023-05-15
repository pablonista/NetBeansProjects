/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoRectangulo;

import entidad.Rectangulo;

/**
 *
 * @author HP
 */
public class CalculoRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo Rec=new Rectangulo();
        Rec.crearRectangulo();
        System.out.println("El rectángulo de base: "+Rec.getBase()+" y Altura: "+Rec.getAltura()+" tiene un Perimetro: "+Rec.calcularPerimetro());
        System.out.println("El rectángulo de base: "+Rec.getBase()+" y Altura: "+Rec.getAltura()+" tiene un Área: "+Rec.calcularSuperficie());
        System.out.println("");
        Rec.imprimirRectangulo();
        
    }
    
}
