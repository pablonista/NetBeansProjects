/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nespresso;

import Entidad.Cafetera;
import Servicios.CafeteraServicio;

/**
 *
 * @author HP
 */
public class Nespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CafeteraServicio coffeServ=new CafeteraServicio();
        Cafetera coffeMaker = coffeServ.llenarCafetera();
        System.out.println("Se muestra estado despues de llenar la Cafetera");
        coffeServ.mostrarEstado(coffeMaker);
        coffeServ.servirTaza(coffeMaker);
        System.out.println("Se muestra estado despues de servir Café");
        coffeServ.mostrarEstado(coffeMaker);
        coffeServ.agregarCafe(coffeMaker);
        System.out.println("Se muestra estado despues de agregar Café");
        coffeServ.mostrarEstado(coffeMaker);
        coffeServ.vaciarCafetera(coffeMaker);
        System.out.println("Se muestra estado despues de Vaciar la Cafetera");
        coffeServ.mostrarEstado(coffeMaker);
        coffeMaker=null;
        coffeServ=null;
    }
    
}
