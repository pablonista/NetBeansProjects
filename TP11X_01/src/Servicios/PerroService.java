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
public class PerroService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    private Perro crearPerro(){
        System.out.print("Ingrese el nombre del Perro: ");
        String nombre = sc.next().toUpperCase();
        System.out.print("Ingrese la raza del Perro: ");
        String raza = sc.next().toUpperCase();
        return new Perro(nombre, raza);
    }
    public void cargarPerro(ArrayList <Perro> perros){
        String salir="N";
        int i=0;
        do {
            i++;
            System.out.println(i+"° Perro ingresado ");
            perros.add(crearPerro());
            System.out.print("Desea continuar cargando perros? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));           
    }
    
    public void mostrarPerrosCargados(ArrayList <Perro> perros){
        Collections.sort(perros,new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    });
        System.out.println("Listado de Perros cargados en Sistema: ");
        int i=0;
        for (Perro perro : perros) {
            i++;
            System.out.println(i+" "+perro.toString());
        }
    }
    public void mostrarPerrosDisponibles(ArrayList <Perro> perros){
        Collections.sort(perros,new Comparator<Perro>() {
        @Override
        public int compare(Perro p1, Perro p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    });
        System.out.println("Listado de Perros Disponibles para adoptar: ");
        Iterator<Perro> it=perros.iterator();
        int i=0;
        while (it.hasNext()) {
            Perro next = it.next();
            if(!next.isAdoptado()){
                i++;
                System.out.println(i+" "+next.toString());
            }
        }
    }
    
    

    
    private static String validarOpcion(String opc){
        String retorno = "";
        Scanner sc=new Scanner (System.in);
        do {            
            if ((opc.equalsIgnoreCase("S"))||(opc.equalsIgnoreCase("N"))) {
                retorno=opc;
            } else {
                    System.out.println("Ingreso una opción invalidad.");
                    System.out.print("Desea continuar cargando Perros (S/N): ");
                    opc=String.valueOf(sc.next().charAt(0));
                    retorno="";
            }
        } while (retorno.equalsIgnoreCase(""));
        return retorno;
    }
}
