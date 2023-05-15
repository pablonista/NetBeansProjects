/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *Clase
 * Atributos
 * Constructores
 * Métodos
 * 
 */


public class Circunferencia {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el radio: ");
        radio=sc.nextDouble();
        sc.close();
    }
    public double Area(){
        //pi*radio^2
        return Math.PI*(Math.pow(radio, 2));
    }
    public double Perimetro(){
        //2*PI*radio
        return 2*Math.PI*radio;
    }
    
}
