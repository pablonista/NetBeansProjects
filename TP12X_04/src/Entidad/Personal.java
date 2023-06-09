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
public class Personal extends Empleado{
    private String seccion;
    public Personal(String nombre, String apellido, int dni, String estadoCivil, int agnoIngreso, int numeroDespacho, String seccion) {
        super(nombre, apellido, dni, estadoCivil, agnoIngreso, numeroDespacho);
        this.seccion=seccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Sección: "+seccion;
        return retorno;
    }
    
}
