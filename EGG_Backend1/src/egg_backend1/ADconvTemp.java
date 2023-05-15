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
public class ADconvTemp {
    public static void main(String[] args) {
        double cent,Far;
        Scanner Leer= new Scanner(System.in);
        System.out.print("Ingrese la temperatura en °C: ");
        cent=Leer.nextDouble();
        Far=32+(9*cent/5);
        System.out.println("");
        System.out.println(cent+"°C es igual a "+Far+"°F.");
    }
}
