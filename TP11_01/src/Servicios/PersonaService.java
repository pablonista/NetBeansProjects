/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Perro;
import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * Persona con atributos: nombre, apellido, edad, documento y Perro
 */
public class PersonaService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        System.out.print("Ingrese el Nombre de la Persona:");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Apellido de la Persona:");
        String apellido=sc.next().toUpperCase();
        System.out.print("Ingrese la Edad de la Persona:");
        int edad=sc.nextInt();
        System.out.print("Ingrese el Documento de la Persona:");
        int documento=sc.nextInt();
        PerroService ps=new PerroService();
        Perro perro=ps.crearPerro();
        return new Persona(nombre,apellido,edad,documento,perro);
    }
}
