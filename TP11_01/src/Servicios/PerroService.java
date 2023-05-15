/*
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Perro;
import java.util.Scanner;

/**
 *
 * Perro, que tendrá como atributos: nombre, raza, edad y tamaño
 */
public class PerroService {
    private Scanner sc=new Scanner (System.in).useDelimiter("\n");
    
    public Perro crearPerro(){
        System.out.print("Ingrese el Nombre del Perro: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Raza del Perro: ");
        String raza=sc.next().toUpperCase();
        System.out.print("Ingrese la Edad del Perro: ");
        int edad=sc.nextInt();
        System.out.print("Ingrese el Tamaño del Perro: ");
        String tamagno=sc.next().toUpperCase();
        return new Perro(nombre,raza,edad,tamagno);
    } 
}
