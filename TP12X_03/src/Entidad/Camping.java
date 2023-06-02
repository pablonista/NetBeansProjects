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
public class Camping extends ExtraHotelero{
    private int cantidadMaximaCarpas;
    private int cantidadBagnos;
    private boolean restaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente,boolean privado,double area,int cantidadMaximaCarpas,int cantidadBagnos,boolean restaurante) {
        super(nombre, direccion, localidad, gerente,privado,area);
        this.cantidadMaximaCarpas = cantidadMaximaCarpas;
        this.cantidadBagnos = cantidadBagnos;
        this.restaurante = restaurante;
    }

    public int getCantidadMaximaCarpas() {
        return cantidadMaximaCarpas;
    }

    public int getCantidadBagnos() {
        return cantidadBagnos;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Cantidad Máxima de Carpas= "+cantidadMaximaCarpas;
        retorno+="\nCantidad de Baños= "+cantidadBagnos;
        retorno+="\nPosee Restaurante= "+(isRestaurante()?"Si":"No");
        return retorno;
    }
    
    
    
    
}
