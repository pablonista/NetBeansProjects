/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Estudiante;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class EstudianteService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    private Estudiante crearEstudiante(){
       System.out.print("Ingrese el Nombre del Estudiante: ");
       String nombre=sc.next().toUpperCase();
       System.out.print("Ingrese el Apellido del Estudiante: ");
       String apellido=sc.next().toUpperCase();
       System.out.print("Ingrese el DNI del Estudiante: ");
       int dni=sc.nextInt();
       System.out.print("Ingrese el Estado Civil del Estudiante: ");
       String estadoCivil=sc.next().toUpperCase();
       System.out.print("Ingrese el Curso del Estudiante: ");
       String curso=sc.next().toUpperCase();
       return new Estudiante(nombre, apellido, dni, estadoCivil, curso); 
    }
    public void cargarProfesor(ArrayList<Persona> personas){
        String salir="";
        do {            
            personas.add(crearEstudiante());
            System.out.print("Desea continuar cargado Estudiantes (S/N): ");
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
    public void mostrarEstudiante(ArrayList<Persona> personas){
        System.out.println("Listado de Estudiantes");
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                Estudiante est = (Estudiante)persona;
                System.out.println(est);
            }
        }
    }
    public void cambiarCurso(ArrayList<Persona> personas){
        mostrarEstudiante(personas);
        boolean encontrado=false;
        System.out.println("Cambio de Curso del Estudiante");
        System.out.print("Ingrese el DNI del Estudiante: ");
        int dni=sc.nextInt();
        Collections.sort(personas, compararApellido);
        for (Persona persona : personas) {
            if (persona instanceof Estudiante) {
                Estudiante est = (Estudiante) persona;
                if (est.getDni()==dni) {
                    System.out.print("Ingrese el Curso nuevo del Estudiante: ");
                    String curso=sc.next().toUpperCase();
                    est.setCurso(curso);
                    encontrado=true;
                    break;
                }
            } 
        }
        if (encontrado) {
            System.out.println("Se cambio de manera correcta el Curso del Estudiante."); 
        }else{
            System.out.println("No se encontró al Estudiante."); 
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
