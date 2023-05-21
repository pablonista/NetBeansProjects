/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Voto {
    private Alumno alumnoVotante;
    private List<Alumno> alumnosVotantes;

    public Voto() {
        
    }

    public Voto(Alumno alumnoVotante, List<Alumno> alumnosVotantes) {
        this.alumnoVotante = alumnoVotante;
        this.alumnosVotantes = alumnosVotantes;
    }

    public Alumno getAlumnoVotante() {
        return alumnoVotante;
    }

    public void setAlumnoVotante(Alumno alumnoVotante) {
        this.alumnoVotante = alumnoVotante;
    }

    public List<Alumno> getAlumnosVotantes() {
        return alumnosVotantes;
    }

    public void setAlumnosVotantes(List<Alumno> alumnosVotantes) {
        this.alumnosVotantes = alumnosVotantes;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumnoVotante=" + alumnoVotante + ", alumnosVotantes=" + alumnosVotantes + '}';
    }
    
}

    