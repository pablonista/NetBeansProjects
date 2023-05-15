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
public class BXJadivinaMultiplicacion {
    public static void main(String[] args) {
        int resultado;
        Scanner sc=new Scanner(System.in);
        int num1=(int) (Math.random()*11);
        int num2=(int) (Math.random()*11);
        do {            
            System.out.print("Cual es el resultado de "+num1+"*"+num2+"= ");
            resultado=sc.nextInt();
            if (resultado==num1*num2) {
                System.out.println("Respuesta correcta!!!");
                System.out.print("El resultado de "+num1+"*"+num2+"= "+resultado);
                System.out.println("");
                System.out.println("Presione una tecla para continuar...");
                sc.nextLine();
                ClearScreen();
            } else {
                System.out.println("Respuesta es incorrecta!!!");
                System.out.print("Prueba de vuelta.");
                System.out.println("");
                System.out.println("Presione una tecla para continuar...");
                sc.nextLine();
                ClearScreen();
            }
        } while (resultado!=num1*num2);
    }
    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla: " + e.getMessage());
        }
    }
    
}
