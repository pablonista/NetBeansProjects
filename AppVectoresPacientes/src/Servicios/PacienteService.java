/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Paciente;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PacienteService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    private Paciente crearPaciente(){
       String [] enfermedad = new String [3];
        System.out.print("Ingrese el nombre del Paciente: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese la edad del Paciente: ");
        int edad=sc.nextInt();
        for (int i = 0; i < enfermedad.length; i++) {
            System.out.print("Ingrese la "+(i+1)+" enfermedad del paciente: ");
            enfermedad[i]=sc.next().toUpperCase();
        }
        return new Paciente(nombre,edad,enfermedad);
    }
    public void cargarPaciente(Paciente [] pacientes){
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println("Paciente N° "+(i+1));
            pacientes[i]=crearPaciente();
        }
    }
    public void mostrarPaciente(Paciente [] pacientes){
        System.out.println("Listado de pacientes ingresados:");
        for (int i = 0; i < pacientes.length; i++) {
            System.out.println(pacientes[i]);
        }
    }
}
