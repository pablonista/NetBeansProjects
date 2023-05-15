/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculopersonaedad;

import Entidades.Persona;
import Servicios.PersonaService;

/**
 *
 * @author HP
 */
public class CalculoPersonaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaService ps=new PersonaService();
       Persona people=ps.crearPersona();
       ps.mostrarPersona(people);
    }
}
