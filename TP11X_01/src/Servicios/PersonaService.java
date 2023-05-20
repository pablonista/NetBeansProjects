/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PersonaService {
    private Scanner sc=new Scanner (System.in).useDelimiter("\n");
    
    private Persona crearPersona(ArrayList <Perro> perros){
        Persona retorno = null;
        String opcion="N";
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre=sc.next().toUpperCase();
        retorno = new Persona(nombre);
        System.out.print("Desea que la persona adopte un perro? (S/N): ");
        opcion=String.valueOf(sc.next().toUpperCase().charAt(0));
        opcion=validarOpcion(opcion,"Desea que la persona adopte un perro? (S/N): ");
        if (opcion.equalsIgnoreCase("S")) {
            Perro auxPerro=null;
            ArrayList<Perro> auxPerros=new ArrayList();
            PerroService ps=new PerroService();
            auxPerro=adoptarPerro(perros,retorno);
            if(auxPerro!=null){
                auxPerros.add(auxPerro);
                retorno.setPerros(auxPerros);
            }            
        }
        return retorno;
    }
    public void cargarPersona(ArrayList <Persona> personas,ArrayList <Perro> perros){
        int i=0;
        String salir="N";
        do {            
            i++;
            System.out.println(i+"° Persona ingresada ");
            personas.add(crearPersona(perros));
            System.out.print("Desea continuar cargando personas? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir,"Desea continuar cargando personas? (S/N): ");
        } while (salir.equalsIgnoreCase("S"));          
    }
    public void mostrarPersonasCargadas(ArrayList <Persona> personas){
        Collections.sort(personas,new Comparator<Persona>() {
        @Override
        public int compare(Persona p1, Persona p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    });
        System.out.println("Listado de Personas cargadas en Sistema: ");
        int i=0;
        for (Persona persona : personas) {
            i++;
            System.out.println(i+" "+persona.toString());
        }
    }
    public void buscarPersona(ArrayList <Persona> personas, ArrayList <Perro> perros){
        ArrayList <Perro> perrosAdoptados =new ArrayList();    
        boolean encontrado=false;
        System.out.println("Busqueda de Persona que adoptara un perro");
        System.out.print("Ingrese el nombre de la Persona: ");
        String nombre=sc.next().toUpperCase();
        Iterator <Persona> persona=personas.iterator();
        while (persona.hasNext()) {
            Persona next = persona.next();
            if (next.getNombre().equals(nombre)) {
                if (next.getPerros()!=null){
                    perrosAdoptados=next.getPerros();
                }
                perrosAdoptados.add(adoptarPerro(perros,next));
                next.setPerros(perrosAdoptados);
                encontrado=true;
                break;
            }   
        }
        if (encontrado) {
            System.out.println("Se encontró la persona!!!");
        }else{
            System.out.println("No se encontró a la persona.");
        }
    }
    public Perro adoptarPerro (ArrayList <Perro> perros, Persona persona){
        PerroService ps=new PerroService();
        Perro retorno=null;
        boolean encontrado=false;
        ps.mostrarPerrosDisponibles(perros);
        System.out.println("Busqueda de Perro");
        System.out.print("Ingrese el nombre del Perro: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese la raza del Perro: ");
        String raza=sc.next().toUpperCase();
        Iterator <Perro> perro=perros.iterator();
        while (perro.hasNext()) {
            Perro next = perro.next();
            if (next.getNombre().equals(nombre)&&(next.getRaza().equals(raza))&&!next.isAdoptado()) {
                next.setAdoptado(true);
                next.setDuegno(persona.getNombre());
                retorno=next;
                encontrado=true;
                break;
            }
        }
        if(encontrado){
            System.out.println("Se realizo exitosamente la Adopción!");
        }else {
            System.out.println("No se encontró el perro, por lo que no se realizó la Adopción!");
            }
        return retorno;
    }
     private static String validarOpcion(String opc,String message){
        String retorno = "";
        Scanner sc=new Scanner (System.in);
        do {            
            if ((opc.equalsIgnoreCase("S"))||(opc.equalsIgnoreCase("N"))) {
                retorno=opc;
            } else {
                    System.out.println("Ingreso una opción invalidad.");
                    System.out.print(message);
                    opc=String.valueOf(sc.next().charAt(0));
                    retorno="";
            }
        } while (retorno.equalsIgnoreCase(""));
        return retorno;
    }
}
