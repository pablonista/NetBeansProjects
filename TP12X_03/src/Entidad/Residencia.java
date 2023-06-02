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
public class Residencia extends ExtraHotelero{
    private int cantidadHabitaciones;
    private boolean descuentoGremio;
    private boolean campoDeportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente,boolean privado,double area,int cantidadMaximaCarpas,int cantidadBagnos,boolean restaurante,int cantidadHabitaciones,boolean descuentoGremio,boolean campoDeportivo) {
        super(nombre, direccion, localidad, gerente,privado,area);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremio = descuentoGremio;
        this.campoDeportivo = campoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public boolean isDescuentoGremio() {
        return descuentoGremio;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Cantidad de Habitaciones= "+cantidadHabitaciones;
        retorno+="\nDescuento a Gremios= "+ (isDescuentoGremio()?"Si":"No");
        retorno+="\nPosee Campo Deportivo= "+(isCampoDeportivo()?"Si":"No");
        return retorno;
    }
    
}
