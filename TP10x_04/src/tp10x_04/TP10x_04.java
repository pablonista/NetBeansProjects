/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp10x_04;

import Entidad.CodPostal;
import Servicios.CodPostalService;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class TP10x_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CodPostalService cp=new CodPostalService();
        HashMap <Integer,CodPostal> codPostales=new HashMap();
        int i=1;
        while (i<=10) { 
            CodPostal codpostal=cp.crearCodPostal();
            codPostales.put(codpostal.getCodigo(), codpostal);
            i++;
        }
        cp.mostrarCodPostal(codPostales);
        cp.buscarCodPostal(codPostales);
        cp.cargarCodPostal(codPostales);
        cp.mostrarCodPostal(codPostales);
        cp.eliminarCodPostal(codPostales);
        cp.mostrarCodPostal(codPostales);
    }
    
}
