/*
 Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.

 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CuentaBancariaServicio {
   private Scanner sc=new Scanner(System.in).useDelimiter("\n");
   // Punto A
    public CuentaBancaria crearCuenta(){
        System.out.print("Ingrese Número de Cuenta: ");
        int numeroCuenta=sc.nextInt();
        System.out.print("Ingrese DNI del Cliente: ");
        long dniCliente=sc.nextLong();
        System.out.print("Ingrese el Saldo de la Cuenta: ");
        double saldoActual=sc.nextDouble();
        return new CuentaBancaria(numeroCuenta,dniCliente, saldoActual);
     }
    //Punto B
    public void ingresarMonto(CuentaBancaria cuenta,double monto){
        double saldoAcumulado= cuenta.getSaldoActual()+monto;
        cuenta.setSaldoActual(saldoAcumulado);
        System.out.printf("El Saldo Actual es: $%.2f",cuenta.getSaldoActual());
        System.out.println("");
    }
    //Punto C
    public void retirarMonto(CuentaBancaria cuenta,double monto){
        boolean realizado=false;
        do {            
            if (cuenta.getSaldoActual()>=monto) {
                double saldoDisminuido=cuenta.getSaldoActual()-monto;
                cuenta.setSaldoActual(saldoDisminuido);
                System.out.printf("El saldo Actual es: $%.2f",cuenta.getSaldoActual());
                System.out.println("");
                realizado=true;
            } else {
                System.out.printf("El monto ingresado es superior al disponible.\nMonto Disponible: $%.2f",cuenta.getSaldoActual());
                System.out.println("");
                System.out.println("Ingrese un monto menor.");
                monto=sc.nextDouble();
                realizado=false;
            }            
        } while (realizado==false);
    }
    //Punto D
    public void extraccionRapida(CuentaBancaria cuenta, double monto){
        boolean realizado=false;
        do {            
            if ((cuenta.getSaldoActual()*0.2)>=monto) {
                double saldoDisminuido=cuenta.getSaldoActual()-monto;
                cuenta.setSaldoActual(saldoDisminuido);
                System.out.printf("El saldo Actual es: $%.2f",cuenta.getSaldoActual());
                System.out.println("");
                realizado=true;
            } else {
                System.out.printf("El monto ingresado es superior al disponible.\nMonto Disponible: $%.2f",(cuenta.getSaldoActual()*0.2));
                System.out.println("");
                System.out.println("Ingrese un monto menor.");
                monto=sc.nextDouble();
                realizado=false;
            }            
        } while (realizado==false);
    }
    //Punto E
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.printf("El saldo de cuenta: $%.2f",cuenta.getSaldoActual());
        System.out.println("");
    }
    //Punto F
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Datos de la Cuenta Bancaria");
        System.out.println("Número de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("DNI del Cliente: "+cuenta.getDniCliente());
    }
}
