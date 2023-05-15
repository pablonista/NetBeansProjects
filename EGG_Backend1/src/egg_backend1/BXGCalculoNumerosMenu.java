/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;

import java.util.Scanner;

public class BXGCalculoNumerosMenu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de elementos
        System.out.print("Ingrese el número de elementos: ");
        int n = sc.nextInt();

        // Mostrar el menú
        System.out.println("Seleccione el tipo de bucle a utilizar:");
        System.out.println("1. While");
        System.out.println("2. Do-While");
        int opcion = sc.nextInt();

        // Declarar variables
        double num, max, min, sum = 0;
        int count = 0;

        // Leer los números y calcular estadísticas según la opción elegida
        switch (opcion) {
            case 1:
                System.out.println("Ingrese los números:");
                num = sc.nextDouble();
                max = min = sum = num;
                count++;

                while (count < n) {
                    num = sc.nextDouble();
                    sum += num;

                    if (num > max) {
                        max = num;
                    }

                    if (num < min) {
                        min = num;
                    }

                    count++;
                }
                break;
            case 2:
                System.out.println("Ingrese los números:");
                num = sc.nextDouble();
                max = min = sum = num;
                count++;

                do {
                    num = sc.nextDouble();
                    sum += num;

                    if (num > max) {
                        max = num;
                    }

                    if (num < min) {
                        min = num;
                    }

                    count++;
                } while (count < n);
                break;
            default:
                System.out.println("Opción inválida.");
                sc.close();
                return;
        }

        // Calcular promedio y mostrar resultados
        double promedio = sum / n;
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }

}
