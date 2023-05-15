/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import Entidad.Mensaje;
import Servicios.MensajeService;

/**
 *
 * @author HP
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensaje mens=MensajeService.crearMensaje();
        MensajeService.mostrarDatos(mens);
    }
    
}
