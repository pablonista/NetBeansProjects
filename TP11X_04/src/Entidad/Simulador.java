/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Simulador {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    
    private Alumno crearAlumno(List <String> nombres,List <String> apellidos, List <Integer> dnis){
        String nombre="";
        int dni=0;
        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);
        Collections.shuffle(dnis);
        Iterator <String> itnom=nombres.iterator();
        Iterator <String> itape=apellidos.iterator();
        Iterator <Integer> itdni=dnis.iterator();
        
        while (itnom.hasNext()&&itape.hasNext()&&itdni.hasNext()) {
            String auxNombre=itnom.next();
            String auxApellido=itape.next();
            Integer auxDni = itdni.next();
            nombre=auxNombre+" "+auxApellido;
            dni=auxDni;
            break;
        }
        return new Alumno(nombre,dni);
    }
    public void cargarAlumno(ArrayList<Alumno>alumnos, List <String> nombres,List <String> apellidos, List <Integer> dnis){
        int i=0;
        
        while (i<nombres.size()) {            
            alumnos.add(crearAlumno(nombres,apellidos,dnis));
            i++;
        }
    }
    public void mostrarAlumnos(ArrayList<Alumno>alumnos){
        int i=1;
        for (Alumno alumno : alumnos) {
            System.out.println(i+" "+alumno);
            i++;
        }
    }
    
    
    public List <Integer> generarDni(int cant){
        List <Integer> auxdnis = new ArrayList();
        int cantidadDNI = cant;
        int rangoMin = 26000000;
        int rangoMax = 42000000;
        HashSet<Integer> dniSet = new HashSet<>();
        while (dniSet.size() < cantidadDNI) {
            int dni = (int) (Math.random() * (rangoMax - rangoMin + 1)) + rangoMin;
            dniSet.add(dni);
        }
        for (int dni : dniSet) {
            auxdnis.add(dni);
        }
        return auxdnis;
    }
}

