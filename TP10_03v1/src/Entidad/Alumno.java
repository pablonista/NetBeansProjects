/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas. 
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Alumno {
    private String nombre;
    private ArrayList <Integer> nota=new ArrayList (3);

    public Alumno() {
    }

    public Alumno(String nombre, ArrayList <Integer> nota) {
        this.nombre = nombre;
        this.nota=nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(ArrayList<Integer> nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
}
