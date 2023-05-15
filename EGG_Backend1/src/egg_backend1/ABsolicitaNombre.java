/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ABsolicitaNombre {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese un nombre: ");
        nombre=Leer.nextLine();
        System.out.println("El nombre ingresado: "+nombre);
    }
}
