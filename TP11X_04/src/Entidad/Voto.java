/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author HP
 */
public class Voto {
    private Alumno alumno;
    private List<Alumno> alumnos;

    public Voto() {
    }

    public Voto(Alumno alumno, List<Alumno> alumnos) {
        this.alumno = alumno;
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnos=" + alumnos + '}';
    }
    
}
