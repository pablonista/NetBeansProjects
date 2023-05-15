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
public class Operacion {
    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el número 1: ");
        numero1=sc.nextDouble();
        System.out.print("Ingrese el número 2: ");
        numero2=sc.nextDouble();
        //sc.close();
    }
    public double sumar(){
        return numero1+numero2;
    }
    public double restar(){
        return numero1-numero2;
    }
    public double multiplicar(){
        if (numero1!=0&&numero2!=0) {
            return numero1*numero2;
        } else {
            System.out.println("No se puede realizar la multiplicación en 0.");
            return 0;
        }
    }
    public double dividir(){
        if (numero2!=0) {
            return numero1/numero2;
        } else {
            System.out.println("No se puede realizar la división en 0.");
            return 0;
        }
    }
}
