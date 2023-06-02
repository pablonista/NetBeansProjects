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
public class Hotel extends Alojamiento{
    protected int cantidadHabitaciones;
    protected int numeroDeCamas;
    protected int cantidadDePisos;
    protected double precioDeHabitaciones;

    public Hotel(String nombre, String direccion, String localidad, String gerente,int cantidadHabitaciones, int numeroDeCamas, int cantidadDePisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroDeCamas = numeroDeCamas;
        this.cantidadDePisos = cantidadDePisos;
        this.precioDeHabitaciones = calcularPrecioDeHabitaciones();
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    public double getPrecioDeHabitaciones() {
        return precioDeHabitaciones;
    }
    

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Cantidad de Habitaciones= "+cantidadHabitaciones;
        retorno+="\nNúmero de Camas= "+numeroDeCamas;
        retorno+="\nCantidad de Pisos= "+cantidadDePisos;
        retorno+="\nPrecio de la Habitación= "+precioDeHabitaciones;
        return retorno;
    }
    
    private double calcularPrecioDeHabitaciones(){
        return 50 + numeroDeCamas;
    }
    

}
