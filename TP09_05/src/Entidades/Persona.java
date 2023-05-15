/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. 
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author HP
 */
public class Persona {
    private String nombre;
    private Date fnac;

    public Persona() {
    }

    public Persona(String nombre, Date fnac) {
        this.nombre = nombre;
        this.fnac = fnac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + nombre + ", Fecha de Nacimiento=" + fnac + '}';
    }
    
}
