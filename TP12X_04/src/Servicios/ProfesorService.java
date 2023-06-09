/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import Entidad.Profesor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class ProfesorService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n"); 
    private Profesor crearProfesor(){
        System.out.print("Ingrese el Nombre del Profesor: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Apellido del Profesor: ");
        String apellido=sc.next().toUpperCase();
        System.out.print("Ingrese el DNI del Profesor: ");
        int dni=sc.nextInt();
        System.out.print("Ingrese el Estado Civil del Profesor: ");
        String estadoCivil=sc.next().toUpperCase();
        System.out.print("Ingrese el año de ingreso del Profesor: ");
        int agnoIngreso=sc.nextInt();
        System.out.print("Ingrese el Número de Despacho del Empleado: ");
        int numeroDespacho=sc.nextInt();
        System.out.print("Ingrese el Departamento del Profesor: ");
        String departamento=sc.next().toUpperCase();
        return new Profesor(nombre, apellido, dni, estadoCivil, agnoIngreso, numeroDespacho,departamento);
    }
    public void cargarProfesor(ArrayList<Persona> personas){
        String salir="";
        do {            
            personas.add(crearProfesor());
            System.out.print("Desea continuar cargado Profesores (S/N): ");
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
    public void mostrarProfesor(ArrayList<Persona> personas){
        System.out.println("Listado de Profesores");
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Profesor) {
                Profesor prof = (Profesor)persona;
                System.out.println(prof);
            }
        }
    }
    public void cambiarDepartamento(ArrayList<Persona> personas){
        mostrarProfesor(personas);
        boolean encontrado=false;
        System.out.println("Cambio de Departamento del Profesor");
        System.out.print("Ingrese el DNI del Profesor: ");
        int dni=sc.nextInt();
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Profesor) {
                Profesor prof = (Profesor) persona;
                if (prof.getDni()==dni) {
                    System.out.print("Ingrese el Departamento del Profesor: ");
                    String departamento=sc.next().toUpperCase();
                    prof.setDepartamento(departamento);
                    encontrado=true;
                    break;
                }
            } 
        }
        if (encontrado) {
            System.out.println("Se cambio de manera correcta el Departamento del Profesor."); 
        }else{
            System.out.println("No se encontró al Profesor."); 
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
