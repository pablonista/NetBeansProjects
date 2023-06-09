/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import Entidad.Personal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class PersonalService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    private Personal crearPersonal(){
        System.out.print("Ingrese el Nombre del Personal: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Apellido del Personal: ");
        String apellido=sc.next().toUpperCase();
        System.out.print("Ingrese el DNI del Personal: ");
        int dni=sc.nextInt();
        System.out.print("Ingrese el Estado Civil del Personal: ");
        String estadoCivil=sc.next().toUpperCase();
        System.out.print("Ingrese el Año de Ingreso del Personal: ");
        int agnoIngreso=sc.nextInt();
        System.out.print("Ingrese el Número de Despacho del Personal: ");
        int numeroDespacho=sc.nextInt();
        System.out.print("Ingrese la Sección del Personal: ");
        String seccion=sc.next().toUpperCase();
        return new Personal (nombre, apellido, dni, estadoCivil, agnoIngreso, numeroDespacho, seccion);
    }
    public void cargarPersonal(ArrayList <Persona> personas){
        String salir="";
        do {            
            personas.add(crearPersonal());
            System.out.print("Desea continuar cargado Personal (S/N): ");
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
    public void mostrarPersonal(ArrayList<Persona> personas){
        System.out.println("Listado de Personal");
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Personal) {
                Personal pers = (Personal)persona;
                System.out.println(pers);
            }
        }
    }
    public void cambiarSeccion(ArrayList<Persona> personas){
        mostrarPersonal(personas);
        boolean encontrado=false;
        System.out.println("Cambio de Sección del Personal");
        System.out.print("Ingrese el DNI del Personal: ");
        int dni=sc.nextInt();
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Personal) {
                Personal pers = (Personal) persona;
                if (pers.getDni()==dni) {
                    System.out.print("Ingrese la Sección nueva del Personal: ");
                    String seccion=sc.next().toUpperCase();
                    pers.setSeccion(seccion);
                    encontrado=true;
                    break;
                }
            } 
        }
        if (encontrado) {
            System.out.println("Se cambio de manera correcta la Sección del Personal."); 
        }else{
            System.out.println("No se encontró al Personal."); 
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
