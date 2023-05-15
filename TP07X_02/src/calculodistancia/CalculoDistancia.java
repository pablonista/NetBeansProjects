/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodistancia;

import entidad.Puntos;

/**
 *
 * @author HP
 */
public class CalculoDistancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Puntos pt=new Puntos();
        pt.crearPuntos();
        System.out.println("Datos del Punto1 (x1,y1): ("+pt.getX1()+","+pt.getY1()+")");
        System.out.println("Datos del Punto2 (x2,y2): ("+pt.getX2()+","+pt.getY2()+")");
        System.out.println("La distancia de Punto1 a Punto2: "+pt.calcularDistancia());
    }
    
}
