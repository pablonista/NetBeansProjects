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
public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consEnergetico, double peso) {
        this.precio = precio;
        this.color = comprobarColor(color.toUpperCase());
        this.consEnergetico = comprobarConsumoEnergetico(consEnergetico);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsEnergetico() {
        return consEnergetico;
    }

    public void setConsEnergetico(char consEnergetico) {
        this.consEnergetico = consEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra){
       char retorno = ' ';           
        if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
                retorno=letra;
        } else {
                System.out.println("Ingreso una opción invalidad.");
                System.out.println("Se asignará el valor F");
                retorno='F';
        }
        return retorno; 
    }
    
    private String comprobarColor(String letra){
       String retorno = "";          
        if (letra.equalsIgnoreCase("BLANCO")||letra.equalsIgnoreCase("NEGRO")||letra.equalsIgnoreCase("ROJO")||letra.equalsIgnoreCase("AZUL")||letra.equalsIgnoreCase("GRIS")) {
            retorno=letra;
        } else {
            System.out.println("Ingreso una opción invalidad.");
            System.out.println("Se asignará el color BLANCO");
            retorno="BLANCO";
        }
        return retorno; 
    }
    public void crearElectrodomestico(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
//        System.out.print("Ingrese el Precio: ");
//        double precio1=sc.nextDouble();
        setPrecio(1000);
        System.out.print("Ingrese el Color: ");
        String color1=sc.next().toUpperCase();
        setColor(comprobarColor(color1));
        System.out.print("Ingrese el Consumo Energético: ");
        char consEnergetico1=sc.next().toUpperCase().charAt(0);
        setConsEnergetico(comprobarConsumoEnergetico(consEnergetico1));
        System.out.print("Ingrese el Peso: ");
        double peso1=sc.nextDouble();
        setPeso(peso1);
    }
    
    public double precioFinal() {
        double precioFinal = this.precio;

        switch (this.consEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (this.peso >= 1 && this.peso <= 19) {
            precioFinal += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioFinal += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioFinal += 800;
        } else if (this.peso >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }

    public void mostrarInformacion() {
    System.out.println("Información del Electrodoméstico:");
    System.out.println("Precio: $" + getPrecio());
    System.out.println("Color: " + getColor());
    System.out.println("Consumo energético: " + getConsEnergetico());
    System.out.println("Peso: " + getPeso() + " kg");
}
    
}
