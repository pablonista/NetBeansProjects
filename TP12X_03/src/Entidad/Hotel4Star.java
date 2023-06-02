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
public class Hotel4Star extends Hotel{
    protected char gimnasio;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public Hotel4Star(String nombre, String direccion, String localidad, String gerente,int cantidadHabitaciones, int numeroDeCamas, int cantidadDePisos,char gimnasio, String nombreRestaurant, int capacidadRestaurant) {
        super(nombre, direccion, localidad, gerente,cantidadHabitaciones, numeroDeCamas, cantidadDePisos);
        this.gimnasio = gimnasio;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        super.precioDeHabitaciones=calcularPrecioHabitacion();
    }


    public char getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Gimnasio= "+gimnasio;
        retorno+="\nNombre del Restaurante= "+nombreRestaurant;
        retorno+="\nCantidad del Restaurante= "+capacidadRestaurant;
        return retorno;
    }

    private double calcularPrecioHabitacion(){
        double precioBase=super.getPrecioDeHabitaciones();
        double valorAgregadoRestaurante=0;
        if (capacidadRestaurant < 30) {
            valorAgregadoRestaurante = 10;
        } else if (capacidadRestaurant <= 50) {
            valorAgregadoRestaurante = 30;
        } else {
            valorAgregadoRestaurante = 50;
        }
        return precioBase+valorAgregadoRestaurante;
    }
    
}
