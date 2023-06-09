/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class PersonaService {
   private Scanner sc=new Scanner(System.in).useDelimiter("\n"); 
   private Persona crearPersona(){
       System.out.print("Ingrese el Nombre de la Persona: ");
       String nombre=sc.next().toUpperCase();
       System.out.print("Ingrese el Apellido de la Persona: ");
       String apellido=sc.next().toUpperCase();
       System.out.print("Ingrese el DNI de la Persona: ");
       int dni=sc.nextInt();
       System.out.print("Ingrese el Estado Civil de la Persona: ");
       String estadoCivil=sc.next().toUpperCase();
       return new Persona(nombre,apellido,dni,estadoCivil);
   }
   public void cargarPersona(ArrayList<Persona> personas){
        String salir="";
        do {            
            personas.add(crearPersona());
            System.out.print("Desea continuar cargado Personas (S/N): ");
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
    public void mostrarPersona(ArrayList<Persona> personas){
        System.out.println("Listado de Personas");
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Persona) {
                Persona pers = (Persona)persona;
                System.out.println(pers);
            }
        }
    }
    public void cambiarEstadoCivil(ArrayList<Persona> personas){
        mostrarPersona(personas);
        boolean encontrado=false;
        System.out.println("Cambio de Estado Civil de Persona");
        System.out.print("Ingrese el DNI de la Persona: ");
        int dni=sc.nextInt();
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Persona) {
                Persona pers = (Persona) persona;
                if (pers.getDni()==dni) {
                    System.out.print("Ingrese el Estado Civil de la Persona: ");
                    String estadoCivil=sc.next().toUpperCase();
                    pers.setEstadoCivil(estadoCivil);
                    encontrado=true;
                    break;
                }
            } 
        }
        if (encontrado) {
            System.out.println("Se cambio de manera correcta el Estado Civil de la Persona."); 
        }else{
            System.out.println("No se encontró a la Persona."); 
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
