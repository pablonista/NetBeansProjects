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
public class EdificioDeOficinas extends Edificio{
    private int numeroOficinas;
    private int cantidadPersonas;
    private int numerosPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo,int numeroOficinas, int cantidadPersonas,int numerosPisos) {
        super(ancho, alto, largo);
        this.numeroOficinas=numeroOficinas;
        this.cantidadPersonas=cantidadPersonas;
        this.numerosPisos=numerosPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho*largo*numerosPisos;
    }

    @Override
    public double calcularVolumen() {
        return ancho*alto*largo*numerosPisos;
    }
    public void cantPersonas(){
        System.out.println("Por piso pueden haber "+(numeroOficinas*cantidadPersonas)+" personas.");
        System.out.println("En el edificio pueden haber "+(numeroOficinas*cantidadPersonas*numerosPisos)+" personas.");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Informacion del Edificio de Oficinas";
        retorno+="\nNúmero de Oficinas= "+numeroOficinas;
        retorno+="\nCantidad de Personas/Piso= "+cantidadPersonas;
        retorno+="\nNúmero de Pisos= "+numerosPisos;
        return retorno;
    }
    
}
