/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvectorespacientes;

import Entidad.Paciente;
import Servicios.PacienteService;

/**
 *
 * @author HP
 */
public class AppVectoresPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PacienteService ps=new PacienteService();
        Paciente [] pacientes=new Paciente[2];
        ps.cargarPaciente(pacientes);
        ps.mostrarPaciente(pacientes);
    }
    
}
