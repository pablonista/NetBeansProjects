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
public class BXKcantDigitos {
    public static void main(String[] args) {
    int num=0;
    int i=0;
    int resultado=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Ingrese un número positivo entero para calcular la cantidad de dígitos: ");
    num=sc.nextInt();
    num=validarNum(num);
    resultado=num;
        while (resultado>0) {            
            resultado=(int)(resultado/10);
            i++;
        }
        System.out.println("El número ingresado fue "+num+" y contiene "+i+" dígitos");
    }
    public static int validarNum(int num)  {
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>=0) {
                retorno=num;
            } else {
                if (num<0) {
                    ClearScreen();
                    System.out.println("No puede ser Cero o negativo.");
                    System.out.print("Ingrese nuevamente el numero: ");
                    num=sc.nextInt();
                    retorno=num;
                }
            }
        } while (retorno<0);
    return retorno;    
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
