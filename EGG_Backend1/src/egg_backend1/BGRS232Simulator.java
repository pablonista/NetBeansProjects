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
public class BGRS232Simulator {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("Ingrese una cadena (maximo 5 caracteres, X al principio, O al final): ");
            input = scanner.nextLine();
            input=input.toUpperCase();
            if (input.length() > 5) {
                System.out.println("La cadena es demasiado larga. Intente de nuevo.");
            } else if ((input.charAt(0) != 'X' || input.charAt(input.length() - 1) != 'O')&&!input.equals("&&&&&")) {
                System.out.println("El formato de la cadena es incorrecto. Intente de nuevo.");
            } else {
                System.out.println("Cadena valida recibida: " + input);
                System.out.println("Presione una tecla para salir...");
                scanner.nextLine();
                if (input.equalsIgnoreCase("&&&&&")) {
                  break;  
                }
                
            }
        }
    }   
}
