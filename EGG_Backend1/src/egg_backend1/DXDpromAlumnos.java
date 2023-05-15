/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.Scanner;

public class DXDpromAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] notas = new double[10][4]; // arreglo para almacenar las notas de los 10 alumnos
        
        // Ciclo para ingresar las notas de cada alumno
        for (int i = 0; i < 10; i++) {
            System.out.println("Notas del alumno " + (i+1) + ":");
            System.out.print("Primer trabajo práctico evaluativo: ");
            notas[i][0] = sc.nextDouble();
            System.out.print("Segundo trabajo práctico evaluativo: ");
            notas[i][1] = sc.nextDouble();
            System.out.print("Primer Integrador: ");
            notas[i][2] = sc.nextDouble();
            System.out.print("Segundo Integrador: ");
            notas[i][3] = sc.nextDouble();
        }
        
        int aprobados = 0; // contador de alumnos aprobados
        int desaprobados = 0; // contador de alumnos desaprobados
        
        // Ciclo para calcular el promedio de cada alumno y contar aprobados y desaprobados
        for (int i = 0; i < 10; i++) {
            double promedio = notas[i][0]*0.1 + notas[i][1]*0.15 + notas[i][2]*0.25 + notas[i][3]*0.5;
            if (promedio >= 7.0) {
                aprobados++;
            } else {
                desaprobados++;
            }
        }
        
        // Mostrar resultados por pantalla
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de desaprobados: " + desaprobados);
        
        sc.close();
    }
}
