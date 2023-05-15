/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionescircunferencia;

import entidad.Circunferencia;

/**
 *
 * @author HP
 */
public class OperacionesCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Circunferencia circ=new Circunferencia();
        Circunferencia circ=new Circunferencia(0);
        circ.crearCircunferencia();
        System.out.printf("El perimetro de la circunferencia de radio %.2f: %.2f\n",circ.getRadio(),circ.Perimetro());
        System.out.printf("El área del círculo de radio %.2f: %.2f\n",circ.getRadio(),circ.Area());
    }
    
}
