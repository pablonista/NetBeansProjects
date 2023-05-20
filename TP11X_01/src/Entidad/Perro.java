/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author HP
 */
public class Perro {
    private String nombre;
    private String raza;
    private String duegno;
    private boolean adoptado;

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.duegno="Sin Asignar";
        this.adoptado = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuegno() {
        return duegno;
    }

    public void setDuegno(String duegno) {
        this.duegno = duegno;
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", duegno=" + duegno + ", adoptado=" + adoptado + '}';
    }

    
    
}
