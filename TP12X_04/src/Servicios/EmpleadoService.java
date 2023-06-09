/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Empleado;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class EmpleadoService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Empleado crearEmpleado(){
        System.out.print("Ingrese el Nombre del Empleado: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Apellido del Empleado: ");
        String apellido=sc.next().toUpperCase();
        System.out.print("Ingrese el DNI del Empleado: ");
        int dni=sc.nextInt();
        System.out.print("Ingrese el Estado Civil del Empleado: ");
        String estadoCivil=sc.next().toUpperCase();
        System.out.print("Ingrese el Año de Ingreso del Empleado: ");
        int agnoIngreso=sc.nextInt();
        System.out.print("Ingrese el Número de Despacho del Empleado: ");
        int numeroDespacho=sc.nextInt();
        return new Empleado(nombre,apellido,dni,estadoCivil,agnoIngreso,numeroDespacho);
    }
    public void cargarEmpleado(ArrayList<Persona> personas){
        String salir="";
        do {            
            personas.add(crearEmpleado());
            System.out.print("Desea continuar cargado Empleados (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
    }
    public Comparator <Persona> compararApellido =new Comparator <Persona>(){
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.getApellido().compareTo(p2.getApellido());
        }
    };
    public void mostrarEmpleado(ArrayList<Persona> personas){
        System.out.println("Listado de Empleados");
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                Empleado empl = (Empleado)persona;
                System.out.println(empl);
            }
        }
    }
    public void reasignarEmpleado(ArrayList<Persona> personas){
        mostrarEmpleado(personas);
        boolean encontrado=false;
        System.out.println("Reasignacion de Empleado");
        System.out.print("Ingrese el DNI del Empleado: ");
        int dni=sc.nextInt();
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                Empleado empl = (Empleado) persona;
                if (empl.getDni()==dni) {
                    System.out.print("Ingrese el Número de Despacho a reasignar al Empleado: ");
                    int despacho=sc.nextInt();
                    empl.setNumeroDespacho(despacho);
                    encontrado=true;
                    break;
                }
            } 
        }
        if (encontrado) {
            System.out.println("Se reasigno de manera correcta el despacho al Empleado."); 
        }else{
            System.out.println("No se encontró al Empleado."); 
        }
    }
    private String validarOpcion (String op){
        String retorno="";
        do {            
            if (op.equalsIgnoreCase("S")||op.equalsIgnoreCase("N")) {
                retorno=op;
        } else {
                System.out.print("Ingrese nuevamente la opción (S/N): ");
                op=String.valueOf(sc.next().toUpperCase().charAt(0));
        }
        } while (retorno.equalsIgnoreCase(""));
        return retorno;
    }
    
}
