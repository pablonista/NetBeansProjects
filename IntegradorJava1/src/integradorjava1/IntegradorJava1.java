/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradorjava1;

import Entidad.Estudiante;
import Servicios.EstudianteService;

/**
 *
 * @author HP
 */
public class IntegradorJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstudianteService es=new EstudianteService();
        Estudiante [] est=new Estudiante [8];
        for (int i = 0; i < est.length; i++) {
            est[i]=es.crearEstudiante();
        }
        es.mostrarEstudiantes(est);
        es.mostrarEstudiantes(es.nombreEstudiantesPromedioMayor(est));
    }
}
