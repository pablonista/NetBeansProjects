/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoverificadorv1;

import Entidad.NIF;
import Servicios.NIFService;

/**
 *
 * @author HP
 */
public class DigitoVerificadorV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NIFService nifServ = new NIFService();
        NIF nif = nifServ.crearDNI();//NIF nif = new NIF(dni);   (izq reserva de memoria para nif  =   derecha creación de un objeto NIF) Instanciación
        nifServ.mostrar(nif);
        nif=null;
        nifServ=null;
    }
    
}
