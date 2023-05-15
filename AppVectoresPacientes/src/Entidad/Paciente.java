/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Paciente {
    //atributos
    private String nombre;
    private int edad;
    private String [] enfermedad=new String [3];
    //constructores
    public Paciente() {
    }
    public Paciente(String nombre, int edad, String [] enfermedad) {
        this.nombre = nombre;
        this.edad = edad;
        this.enfermedad=enfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String[] getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String[] enfermedad) {
        this.enfermedad = enfermedad;
    }

    @Override
    public String toString() {
        return "Paciente{" + "nombre=" + nombre + ", edad=" + edad + ", enfermedad=" + Arrays.toString(enfermedad) + '}';
    }
    
}
