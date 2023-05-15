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
public class ABpromPrec {
    public static void main(String[] args) {
        double prcEst1=0, prcEst2=0,prcEst3=0, promedio=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el Precio del Producto en establecimiento 1: ");
        prcEst1=sc.nextDouble();
        System.out.print("Ingrese el Precio del Producto en establecimiento 2: ");
        prcEst2=sc.nextDouble();
        System.out.print("Ingrese el Precio del Producto en establecimiento 3: ");
        prcEst3=sc.nextDouble();
        promedio=calcularPromedio(prcEst1,prcEst2,prcEst3);
        System.out.println("El Precio Promedio del Producto es = "+promedio);
    }
    public static double calcularPromedio(double x,double y,double z){
        return (x+y+z)/3;
    }
            
}
