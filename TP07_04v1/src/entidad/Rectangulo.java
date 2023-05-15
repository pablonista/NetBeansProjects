/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Rectangulo {
    private double Base;
    private double Altura;

    public Rectangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    public void crearRectangulo(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese la base del rectangulo: ");
        Base=sc.nextDouble();
        System.out.print("Ingrese la Altura del rectangulo: ");
        Altura=sc.nextDouble();
    }
    public double calcularSuperficie(){
    return Base*Altura;    
    }
    
    public double calcularPerimetro(){
        return (Base+Altura)*2;
    }
    
    public void imprimirRectangulo(){
        for (int i = 0; i < Altura; i++) {
            for (int j = 0; j < Base; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
}
