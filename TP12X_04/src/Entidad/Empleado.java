/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Empleado extends Persona{
    private int agnoIngreso;
    private int numeroDespacho;

    public Empleado(String nombre, String apellido, int dni, String estadoCivil, int agnoIngreso, int numeroDespacho) {
        super(nombre, apellido, dni, estadoCivil);
        this.agnoIngreso=agnoIngreso;
        this.numeroDespacho=numeroDespacho;
    }

    public int getAgnoIngreso() {
        return agnoIngreso;
    }

    public void setAgnoIngreso(int agnoIngreso) {
        this.agnoIngreso = agnoIngreso;
    }

    public int getNumeroDespacho() {
        return numeroDespacho;
    }

    public void setNumeroDespacho(int numeroDespacho) {
        this.numeroDespacho = numeroDespacho;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Año de Ingreso: "+agnoIngreso;
        retorno+="\nNúmero de Despacho: "+numeroDespacho;
        return retorno;
    }
    
}
