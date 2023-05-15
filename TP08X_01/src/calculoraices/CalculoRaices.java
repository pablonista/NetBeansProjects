/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoraices;

import Entidad.Raices;
import Servicios.RaicesServicio;

/**
 *
 * @author HP
 */
public class CalculoRaices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RaicesServicio rsServ=new RaicesServicio();
        Raices raices = rsServ.crearRaices();
        rsServ.calcular(raices);
    }
    
}
