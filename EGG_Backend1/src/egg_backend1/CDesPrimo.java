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
public class CDesPrimo {
    public static void main(String[] args) {
        int num1;
        boolean respuesta;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un número para ver si es primo: ");
        num1=sc.nextInt();
        num1=validarNum(num1);
        respuesta=esPrimo(num1);
        if (respuesta==true) {
            System.out.println(num1+" es un número primo.");
        } else {
            System.out.println(num1+" no es un número primo.");
        }
        sc.close();
    }
    public static boolean esPrimo(int x){
        boolean retorno;
        int contador=0;
        if (x==1) return retorno=false;
        for (int i = 1; i <=x; i++) {
            if (x%i==0) {
                contador=contador+1;
            }
        }
        if (contador<=2) {
           retorno=true; 
        } else {
           retorno=false; 
        }
        return retorno;
    }
    public static int validarNum(int num)  {
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>=0) {
                retorno=num;
            } else {
                if (num<=0) {
                    ClearScreen();
                    System.out.println("No puede ser negativo.");
                    System.out.print("Ingrese nuevamente el monto a convertir: ");
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
