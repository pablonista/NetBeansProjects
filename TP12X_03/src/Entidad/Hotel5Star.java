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
public class Hotel5Star extends Hotel4Star{
    private int cantidadSalonesConferencias;
    private int cantidadSuite;
    private int cantidadLimosinas;

    public Hotel5Star(String nombre, String direccion, String localidad, String gerente,int cantidadHabitaciones, int numeroDeCamas, int cantidadDePisos,char gimnasio, String nombreRestaurant, int capacidadRestaurant,int cantidadSalonesConferencias,int cantidadSuite,int cantidadLimosinas) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, numeroDeCamas, cantidadDePisos,gimnasio, nombreRestaurant, capacidadRestaurant);
        this.cantidadSalonesConferencias = cantidadSalonesConferencias;
        this.cantidadSuite = cantidadSuite;
        this.cantidadLimosinas = cantidadLimosinas; 
        super.precioDeHabitaciones=calcularPrecioHabitacion();
    }

    

    public int getCantidadSalonesConferencias() {
        return cantidadSalonesConferencias;
    }

    public int getCantidadSuite() {
        return cantidadSuite;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Cantidad de Salones de Conferencias= "+cantidadSalonesConferencias;
        retorno+="\nCantidad de Suite= "+cantidadSuite;
        retorno+="\nCantidad de Limosinas= "+cantidadLimosinas;
        return retorno;
    }
    private double calcularPrecioHabitacion(){
        double precioBase=super.precioDeHabitaciones;
        double valorLimosinas = 15 * cantidadLimosinas;
        return precioBase + valorLimosinas;
    }
    
}
