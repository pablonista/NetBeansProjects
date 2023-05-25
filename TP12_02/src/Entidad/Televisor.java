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
public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizadorTDT, double precio, String color, char consEnergetico, double peso) {
        super(precio, color, consEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    public void crearTelevisor(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        crearElectrodomestico();
        System.out.print("Ingrese la Resolución de la Tv: ");
        Integer resolucion1=sc.nextInt();
        setResolucion(resolucion1);
        System.out.print("Tiene Sintonizador TDT (S/N)?: ");
        char respuesta=sc.next().toUpperCase().charAt(0);
        boolean sintonizadorTDT1;
        sintonizadorTDT1 = respuesta=='S';
        setSintonizadorTDT(sintonizadorTDT1);
    }
   
    @Override
    public double precioFinal(){
        double precioFinal=super.precioFinal();
        if (resolucion>40) {
            precioFinal*=1.3;
        }
        if (isSintonizadorTDT()) {
            precioFinal+=500;
        }
        return precioFinal;
    }
    
    @Override
    public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Resolución: " + getResolucion() + " pulgadas");
    System.out.println("Sintonizador TDT: " + (isSintonizadorTDT() ? "Sí" : "No"));
}
}
