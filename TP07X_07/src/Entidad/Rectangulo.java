/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Rectangulo {
    //atributos
    private int Lado1;//altura
    private int Lado2;//ancho
    //Constructores
    public Rectangulo(int Lado1, int Lado2) {
        this.Lado1 = Lado1;
        this.Lado2 = Lado2;
    }

    public Rectangulo() {
    }
    //Métodos
    public int getLado1() {
        return Lado1;
    }

    public void setLado1(int Lado1) {
        this.Lado1 = Lado1;
    }

    public int getLado2() {
        return Lado2;
    }

    public void setLado2(int Lado2) {
        this.Lado2 = Lado2;
    }
    
    public void cargarRectangulo(){
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el Lado 1: ");
        Lado1=(int)sc.nextDouble();
        System.out.print("Ingrese el Lado 2: ");
        Lado2=(int)sc.nextDouble();
    }
    public int calcularArea(){
        return Lado1*Lado2;
    }
    public void dibujarRectangulo(){
        for (int i = 0; i < Lado1; i++) {
            for (int j = 0; j < Lado2; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
