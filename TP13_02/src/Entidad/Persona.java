package Entidad;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Persona {
    private String nombre;
    private String [] materias=new String[5];

    public Persona(String nombre,String[] materias) {
        this.nombre = nombre;
        this.materias=materias;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }
    
    
}
