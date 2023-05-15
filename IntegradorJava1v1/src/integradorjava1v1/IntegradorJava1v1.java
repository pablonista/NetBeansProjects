/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjava1v1;

import Entidad.Estudiante;
import Servicios.EstudianteService;

/**
 *
 * @author HP
 */
public class IntegradorJava1v1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EstudianteService es=new EstudianteService();
        Estudiante [] est=new Estudiante [8];
        for (int i = 0; i < est.length; i++) {
            est[i]=es.crearEstudiante();
        }
        es.mostrarEstudiantes(est);
        es.mostrarVectorEstudiantes(est, es.nombreEstudiantesPromedioMayor(est));
    }
    
}
