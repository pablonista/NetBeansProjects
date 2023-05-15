/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razasperros;

import Servicios.RazaService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class RazasPerros {

    /**
     * @param raza que es un ArrayList de cadena de raza de perros 
     */
    public static void main(String[] args) {
        //1-
        RazaService rs=new RazaService();
        ArrayList <String> raza=new ArrayList();
        rs.cargarRaza(raza);
        rs.mostrarRaza(raza);
        //2-
        rs.eliminarRaza(raza);
        rs.mostrarOrdenadoRaza(raza);
    }
    
}
