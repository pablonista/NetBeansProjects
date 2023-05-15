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
public class BXNMediaEdadHijos {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Ingrese el número de familias: ");
            int numFamilias = input.nextInt();

            int totalHijos = 0;
            double totalEdad = 0;

            for (int i = 1; i <= numFamilias; i++) {
                System.out.print("Ingrese la cantidad de hijos para la familia " + i + ": ");
                int numHijos = input.nextInt();

                for (int j = 1; j <= numHijos; j++) {
                    System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                    int edadHijo = input.nextInt();
                    totalEdad += edadHijo;
                }

                totalHijos += numHijos;
            }

        double mediaEdad = totalEdad / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }
}    
