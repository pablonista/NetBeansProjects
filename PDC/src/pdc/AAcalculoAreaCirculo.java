/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class AAcalculoAreaCirculo {
    public static void main(String[] args) {
        double radio;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        radio=sc.nextDouble();
        System.out.println("El perimetro de la circunferencia: "+calcularPerimetro(radio));
        System.out.println("El perimetro de la circunferencia: "+calcularArea(radio));
    }
    public static double calcularArea(double r){
        return Math.pow(r, 2)*Math.PI;
    }
    public static double calcularPerimetro(double r){
        return 2*r*Math.PI;
    }
}
