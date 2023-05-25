/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, double precio, String color, char consEnergetico, double peso) {
        super(precio, color, consEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.print("Ingrese la carga de la Lavadora: ");
        Integer carga1=sc.nextInt();
        setCarga(carga1);
    }
    
    @Override
    public double precioFinal(){
        double precioFinal=super.precioFinal();
        if (this.carga>30) {
            precioFinal+=500;
        }
        return precioFinal;
    }

    @Override
    public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Carga: " + getCarga() + " kg");
}
    
}
