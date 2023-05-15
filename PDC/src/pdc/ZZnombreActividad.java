/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdc;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ZZnombreActividad {
    public static void main(String[] args) {
        String nombre, actividad;
        Scanner Leer=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=Leer.nextLine();
        System.out.print("Ingrese su Actividad: ");
        actividad=Leer.nextLine();
        System.out.println("Nombre: "+nombre.toUpperCase()+" Actividad: "+actividad.toUpperCase());
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("Hola mundo");
    }
   
}
