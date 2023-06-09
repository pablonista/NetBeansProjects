/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class PersonaService {
    private Scanner sc=new Scanner(System.in);
    private Persona crearPersona(){
        String[]materias=new String[5];
        System.out.print("Ingrese el nombre de la Persona: ");
        String nombre=sc.next().toUpperCase();
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            System.out.print("Ingrese la materia "+(i+1)+" :");
            String materia=sc.next().toUpperCase();
            materias[i]=materia;
        }
        return new Persona(nombre,materias);
    }
    public void cargarPersonas(ArrayList<Persona>personas){
        String salir="";
        do {            
            personas.add(crearPersona());
            System.out.print("Desea continuar cargando Personas?");
            salir=sc.next().toUpperCase();
        } while (salir.equalsIgnoreCase("S"));
    }
    public void mostrarPersonas(ArrayList<Persona>personas) throws Exception{
        for (Persona persona : personas) {
            System.out.println("Nombre: "+persona.getNombre());
            for (int i = 0; i <= persona.getMaterias().length; i++) {
                try{
                    //if (i<=persona.getMaterias().length){
                        System.out.println("Materia "+(i+1)+": "+persona.getMaterias()[i]);
                    //}    
                }catch (Exception e){
                    System.out.println("Error: "+e.getMessage());
                    System.out.println("Error: "+e);
                    System.out.println(e.fillInStackTrace());
                }
                
            }
        }
    }
}
