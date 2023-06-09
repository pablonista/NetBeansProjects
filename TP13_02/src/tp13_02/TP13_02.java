/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp13_02;

import Entidad.Persona;
import Servicios.PersonaService;
import java.util.ArrayList;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP13_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        ArrayList<Persona> personas=new ArrayList();
        PersonaService ps=new PersonaService();
        ps.cargarPersonas(personas);
        ps.mostrarPersonas(personas);
    }    
}
