/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Simulador {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    
    private Alumno crearAlumno(List <String> nombres,List <String> apellidos, List <Integer> dnis){
        String nombre="";
        int dni=0;
        
        Iterator <String> itnom=nombres.iterator();
        Iterator <String> itape=apellidos.iterator();
        Iterator <Integer> itdni=dnis.iterator();
        
        while (itnom.hasNext()&&itape.hasNext()&&itdni.hasNext()) {
            String auxNombre=itnom.next();
            String auxApellido=itape.next();
            Integer auxDni = itdni.next();
            nombre=auxNombre+" "+auxApellido;
            dni=auxDni;
            itnom.remove();
            itape.remove();
            itdni.remove();
            break;
        }
        return new Alumno(nombre,dni);
    }
    
    public void cargarAlumno(List<Alumno>alumnos, List <String> nombres,List <String> apellidos, List <Integer> dnis){
        while (nombres.size()>0) {            
            alumnos.add(crearAlumno(nombres,apellidos,dnis));
        }
    }
    
    public void mostrarAlumnos(List<Alumno>alumnos){
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
    public void votacion(List<Alumno> alumnos) {
        for (Alumno alumno : alumnos) {
            Set<Integer> votados = new HashSet<>();
            Set<Integer> votosRealizados = new HashSet<>();
            while (votados.size() < 3) {
                int indiceVoto = new Random().nextInt(alumnos.size());
                Alumno alumnoVotado = alumnos.get(indiceVoto);

                if (alumno != alumnoVotado && !votados.contains(indiceVoto) && !votosRealizados.contains(indiceVoto)) {
                    alumnoVotado.incrementarVotos();
                    votados.add(indiceVoto);
                    votosRealizados.add(indiceVoto);
                    alumno.incrementarVotos();
                }
            }
            Voto voto = new Voto(alumno, obtenerAlumnosVotados(alumnos, votosRealizados));
            alumno.incrementarVotos();
            System.out.println("Voto realizado por " + alumno.getNombre() + ":");
            for (Alumno votado : voto.getAlumnosVotados()) {
                System.out.println("- Votó a: " + votado.getNombre());
            }
            System.out.println();
        }
    }

    private List<Alumno> obtenerAlumnosVotados(List<Alumno> alumnos, Set<Integer> votosRealizados) {
        List<Alumno> alumnosVotados = new ArrayList<>();
        for (int indice : votosRealizados) {
            alumnosVotados.add(alumnos.get(indice));
        }
        return alumnosVotados;
    }

    public void mostrarResultados(List<Alumno> alumnos, List<Voto> votos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " - Votos: " + alumno.getCantVotos());
            System.out.println();
        }
    }

    public void contarVotos(List<Alumno> alumnos) {
        List<Alumno> facilitadores = new ArrayList<>();
        List<Alumno> facilitadoresSuplentes = new ArrayList<>();

        Collections.sort(alumnos, Comparator.comparingInt(Alumno::getCantVotos).reversed());

        for (int i = 0; i < 5; i++) {
            facilitadores.add(alumnos.get(i));
        }

        for (int i = 5; i < 10; i++) {
            facilitadoresSuplentes.add(alumnos.get(i));
        }

        System.out.println("Facilitadores elegidos:");
        for (int i = 0; i < facilitadores.size(); i++) {
            Alumno facilitador = facilitadores.get(i);
            System.out.println((i + 1) + ". " + facilitador.getNombre() + " - Votos: " + facilitador.getCantVotos());
        }

        System.out.println();

        System.out.println("Facilitadores suplentes:");
        for (int i = 0; i < facilitadoresSuplentes.size(); i++) {
            Alumno facilitadorSuplente = facilitadoresSuplentes.get(i);
            System.out.println((i + 1) + ". " + facilitadorSuplente.getNombre() + " - Votos: " + facilitadorSuplente.getCantVotos());
        }
    }
}



