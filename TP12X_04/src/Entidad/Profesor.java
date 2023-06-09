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
public class Profesor extends Empleado{
    private String departamento;
    public Profesor(String nombre, String apellido, int dni, String estadoCivil, int agnoIngreso, int numeroDespacho,String departamento) {
        super(nombre, apellido, dni, estadoCivil, agnoIngreso, numeroDespacho);
        this.departamento=departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Departamento: "+departamento;
        return retorno;
    }
    
}
