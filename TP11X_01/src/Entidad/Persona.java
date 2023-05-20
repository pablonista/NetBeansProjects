/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Persona {
    private String nombre;
    private ArrayList <Perro> perros;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.perros = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Perro> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        if (perros==null){
            return "Persona{" + "nombre=" + nombre+"}";
        }else{
            return "Persona{" + "nombre=" + nombre + ", perros=" + perros.toString() + '}';
        }
    }
}
