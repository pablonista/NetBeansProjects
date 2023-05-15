/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");

    private Alumno crearAlumno(){
        ArrayList<Integer> notas=new ArrayList();
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre=sc.next().toUpperCase();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nota "+(i+1)+": ");
            notas.add(sc.nextInt());
        }
        return new Alumno(nombre, notas);
    }
    
    public void cargarAlumno(ArrayList<Alumno> als){
        String salir="";
        do {
            als.add(crearAlumno());
            System.out.print("Desea ingresar otro alumno? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validaOpcion(salir);
            if ("N".equals(salir)){
                break;
            }
        } while (true);                
    }
    
    private String validaOpcion(String op){
        String retorno="";
        do {
            if (op.equalsIgnoreCase("S")||(op.equalsIgnoreCase("N"))) {
                retorno=op;
            } else {
                System.out.println("Ingrese una opción válida (S/N)");
                op=String.valueOf(sc.next().toUpperCase().charAt(0));
            }
        } while (retorno.equals(""));
        return retorno;
    }
        
    public void mostrarAlumno(ArrayList <Alumno> als){
        System.out.println("Se imprimen los alumnos con sus notas: ");
        for (Alumno string : als) {
            System.out.println(string);
        }
    }

    public void notaFinal(ArrayList <Alumno> als){
        Iterator<Alumno> it = als.iterator();
        String nombre="";
        System.out.println("Calculo del promedio de notas");
        System.out.print("Ingrese el nombre del alumno a consultar: ");
        nombre=sc.next().toUpperCase();
        while (it.hasNext()) {
            Alumno al= it.next();
            if (al.getNombre().equals(nombre)) {
                System.out.println(al.toString());
                System.out.println("El promedio de notas es: "+promedio(al.getNota()));
            }
        }
    }
    
    private double promedio(ArrayList <Integer> notas){
        double promedio=0;
        for (Integer nota : notas) {
            promedio=promedio+nota;
        }
        return (promedio/3);
    }
}
