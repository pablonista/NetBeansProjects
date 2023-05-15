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
public class Cuenta {
    private String Numero;
    private String Tipo;
    private String Titular;
    private String DNI;
    private double Monto;

    public Cuenta() {
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }
    
    public void cargarCuenta(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese Número de cuenta: ");
        Numero=sc.nextLine();
        System.out.print("Ingrese Tipo de cuenta: ");
        Tipo=sc.nextLine();
        System.out.print("Ingrese Titular de cuenta: ");
        Titular=sc.nextLine();
        System.out.print("Ingrese DNI del Titular de cuenta: ");
        DNI=sc.nextLine();
        System.out.print("Ingrese el Monto inicial de cuenta: ");
        Monto=sc.nextDouble();
    }
    public void retirarDinero(){
        double retiro=0;
        boolean realizada=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("");
        System.out.println("Nro de Cuenta: "+Numero);
        System.out.println("Tipo de Cuenta: "+Tipo);
        System.out.println("Titular de la Cuenta: "+Titular);
        System.out.println("DNI Titular de la Cuenta: "+DNI);
        //System.out.println("Monto Disponible: "+Monto+"\n");
        System.out.printf("El Monto disponible es: $%.2f \n", Monto);
        do {            
            System.out.print("Ingrese el monto a retirar: ");
            retiro=sc.nextDouble();
            if (retiro<=Monto) {
                Monto-=retiro;
                realizada=true;
            } else {
                System.out.println("El importe ingresado no es posible de entregar.\nFondos insuficientes.\nMonto Disponible: "+Monto);
                realizada=false;
            }
        } while (realizada==false); 
    }
    public void mostrarDatos(){
        System.out.println("Nro de Cuenta: "+Numero);
        System.out.println("Tipo de Cuenta: "+Tipo);
        System.out.println("Titular de la Cuenta: "+Titular);
        System.out.println("DNI Titular de la Cuenta: "+DNI);
        System.out.printf("El Monto disponible es: $%.2f \n", Monto);
    }
}
