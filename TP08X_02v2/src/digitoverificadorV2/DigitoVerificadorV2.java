/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoverificadorV2;

import Entidad.NIF;
import NIFServicios.NIFService;

/**
 *
 * @author HP
 */
public class DigitoVerificadorV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService nifServ = new NIFService();
        NIF nif = nifServ.crearDNI();
        nifServ.mostrar(nif);
    }
    
}
