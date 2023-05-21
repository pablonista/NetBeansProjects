/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11x_04;

import Entidad.Alumno;
import Entidad.Simulador;
import Entidad.Voto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP11X_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Simulador as=new Simulador();
        List <String> nombres=new ArrayList(Arrays.asList("Agustina", "Alan", "Alejandro", "Alexis", "Andres", "Antonella", "Antonio", "Brenda", "Camila", "Carla", "Carlos", "Carmen", "Catalina", "Cristian", "Daniel", "Diego", "Eduardo", "Elias", "Emanuel", "Emilia", "Florencia", "Francisco", "Gabriel", "Gonzalo", "Guadalupe", "Hector", "Hernan", "Ignacio", "Javier", "Joaquin", "Jonathan", "Jose", "Juan", "Laura", "Leandro", "Lorena", "Lucas", "Luis", "Mariana", "Marcelo", "Maria", "Martina", "Matias", "Micaela", "Monica", "Natalia", "Nicolas", "Pablo", "Patricia", "Paula"));
        List <String> apellidos=new ArrayList(Arrays.asList("Acosta", "Aguilar", "Alvarez", "Andrade", "Arce", "Barrera", "Blanco", "Cabrera", "Cardozo", "Carrasco", "Castillo", "Chavez", "Cortez", "Dominguez", "Fernandez", "Fuentes", "Garcia", "Gomez", "Gonzalez", "Guerrero", "Hernandez", "Lopez", "Mendez", "Molina", "Montes", "Moreno", "Morales","Nista" ,"Nunez", "Ortega", "Ortiz", "Paredes", "Perez", "Ramirez", "Reyes", "Rios", "Rojas", "Romero", "Rubio", "Salazar", "Sanchez", "Santana", "Sosa", "Torres", "Vargas", "Vega", "Vera", "Vidal", "Villalba", "Zambrano"));
        List <Integer> dnis=as.generarDni(nombres.size());
        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);
        Collections.shuffle(dnis);
        List<Alumno>alumnos=new ArrayList();
        as.cargarAlumno(alumnos, nombres, apellidos, dnis);
        System.out.println("\tListado de Alumnos generados aleatoriamiente ");
        as.mostrarAlumnos(alumnos);
        List<Voto> votos = new ArrayList<>();
        System.out.println("Generando las Votaciones");
        as.votacion(alumnos);
        //System.out.println(votos.toString());
        System.out.println("Mostrar Resultados");
        as.mostrarResultados(alumnos,votos);
        System.out.println("Conteo de votos:");
        as.contarVotos(alumnos);
    }
    
}
