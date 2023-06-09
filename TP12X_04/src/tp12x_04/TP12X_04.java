/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12x_04;

import Entidad.Persona;
import Servicios.EmpleadoService;
import java.util.ArrayList;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12X_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> personas=new ArrayList();
        EmpleadoService es=new EmpleadoService();
        es.cargarEmpleado(personas);
        es.mostrarEmpleado(personas);
    }
    
}
