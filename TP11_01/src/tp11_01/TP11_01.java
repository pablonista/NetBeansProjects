/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11_01;

import Entidad.Persona;
import Servicios.PersonaService;

/**
 *
 * @author HP
 */
public class TP11_01 {

    /**
     *  Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
        atributos: nombre, apellido, edad, documento y Perro.
        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
        la clase Persona, la información del Perro y de la Persona.
     */
    public static void main(String[] args) {
        PersonaService ps=new PersonaService();
        int i=1;
        while (i<=2) {            
            System.out.println(i+"° Persona ");
            Persona persona=ps.crearPersona();
            System.out.println("Se imprime los Datos ingresados: ");
            System.out.println(persona.toString());
            i++;
        }
    }
    
}
