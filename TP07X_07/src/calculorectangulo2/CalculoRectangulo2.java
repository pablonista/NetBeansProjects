/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculorectangulo2;

import Entidad.Rectangulo;

/**
 *
 * @author HP
 */
public class CalculoRectangulo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rectangulo1=new Rectangulo(4,6);
        System.out.println("El área del rectángulo con Lado 1: "+rectangulo1.getLado1()+" y Lado 2: "+rectangulo1.getLado2()+" es: "+rectangulo1.calcularArea()+"\n");
        rectangulo1.dibujarRectangulo();
    }   
    
}
