/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.

 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Empleado {
    private String Nombre;
    private int Edad;
    private double Salario;

    public Empleado() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }
    
    public void cargarEmpleado(){
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el Nombre del Empleado: ");
        Nombre=sc.nextLine().toUpperCase();
        System.out.print("Ingrese la Antiguedad del Empleado: ");
        Edad=sc.nextInt();
        System.out.print("Ingrese Salario del Empleado: ");
        Salario=sc.nextDouble();
    }
    
    public void calcular_aumento(){
        if (Edad>=30) {
            Salario=Salario*1.1;
        } else {
            Salario=Salario*1.05;
        }
    }
    
    public void mostrarDatos(){
       System.out.println("Nombre del Empleado: "+Nombre);
       System.out.println("Antiguedad del Empleado: "+Edad);
       System.out.printf("Salario del Empleado: $%.2f \n",Salario);//Salida Formateada  278,7578   278,76  %.2f
    }
}
