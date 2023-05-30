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
public class Polideportivo extends Edificio{
    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre=nombre;
        this.tipoInstalacion=tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho*largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho*alto*largo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Informacion del Polideportivo";
        retorno+="\nNombre= "+nombre;
        retorno+="\nTipo de Instalacion= "+tipoInstalacion;
        return retorno;
    }
    
    
}
