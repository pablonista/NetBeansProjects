/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Estudiante extends Persona{
    private String curso;
    public Estudiante(String nombre, String apellido, int dni, String estadoCivil, String curso) {
        super(nombre, apellido, dni, estadoCivil);
        this.curso=curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Curso= "+curso;
        return retorno;
    }
    
}
