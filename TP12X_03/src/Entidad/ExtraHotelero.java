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
public class ExtraHotelero extends Alojamiento{
    protected boolean privado;
    protected double area;

    public ExtraHotelero(String nombre, String direccion, String localidad, String gerente,boolean privado,double area) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.area = area;
    }

    public boolean isPrivado() {
        return privado;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        String retorno="Privado= "+(isPrivado()? "Si":"No");
        retorno+="\nÁrea del Predio= "+area;
        return retorno;
    }
    
}
