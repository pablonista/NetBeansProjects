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
public class Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public double getY1() {
        return y1;
    }

    public double getX2() {
        return x2;
    }

    public double getY2() {
        return y2;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
    
    public void crearPuntos(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Ingresando las coordenadas del P1(x1,y1)");
        System.out.print("Ingrese la coordena x1: ");
        x1=sc.nextDouble();
        System.out.print("Ingrese la coordena y1: ");
        y1=sc.nextDouble();
        System.out.println("");
        System.out.println("Ingresando las coordenadas del P2(x2,y2)");
        System.out.print("Ingrese la coordena x2: ");
        x2=sc.nextDouble();
        System.out.print("Ingrese la coordena y2: ");
        y2=sc.nextDouble();
    }
    
    public double calcularDistancia(){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
}
