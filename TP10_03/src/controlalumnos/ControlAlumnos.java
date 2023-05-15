/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlalumnos;

import Entidad.Alumno;
import Servicios.AlumnoService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ControlAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoService as=new AlumnoService();
        ArrayList <Alumno> als= new ArrayList();
        as.cargarAlumno(als);
        as.mostrarAlumno(als);
        as.notaFinal(als);
    }
    
}
