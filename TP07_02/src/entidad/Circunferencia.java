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
public class Circunferencia {
    private double radio;
    
    public Circunferencia(double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        this.radio=sc.nextDouble();
    }
    public double area(){
        return Math.PI*Math.pow(radio, 2);
    }
    public double perimetro(){
        return 2*Math.PI*radio;
    }
}

