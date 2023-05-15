/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculosueldo;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CalculoSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc=new Scanner(System.in);
       int cantEmp=0; 
       System.out.print("Ingrese la cantidad de empleados a actualizar: ");
       cantEmp=sc.nextInt();
       Empleado [] employee = new Empleado[cantEmp];
       cargaDatos(employee);
       System.out.println("Se muestran Empleados cargados: ");
       mostrarDatos(employee);
       calcularAumento(employee);
       System.out.println("Se muestran los Salarios actualizados: ");
       mostrarDatos(employee);
        
    }
    public static void cargaDatos(Empleado[] employee){
        for (int i = 0; i < employee.length; i++) {
            employee[i]=new Empleado();
            System.out.println("Empleado: "+(i+1));
            employee[i].cargarEmpleado();
        }
    }
    public static void mostrarDatos(Empleado[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Empleado: "+(i+1));
            employee[i].mostrarDatos();
        }
    }
    public static void calcularAumento(Empleado[] employee){
        for (int i = 0; i < employee.length; i++) {
            employee[i].calcular_aumento();
        }
    }
    
}
