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
public class BXFpromedioAltura {
    public static void main(String[] args) {
        int cant160=0;
        int alt160=0;
        int cantgral=0;
        int cantPers, altura;
        Scanner Leer=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de personas a cargar: ");
        cantPers=Leer.nextInt();
        cantPers=validarNum(cantPers);
        for (int i = 1; i <= cantPers; i++) {
            System.out.println("Persona N° "+i);
            System.out.print("Ingrese la altura en cm: ");
            altura=Leer.nextInt();
            altura=validarNum(altura);
            if (altura<=160) {
                alt160=alt160+altura;
                cant160++;
            }
            cantgral=cantgral+altura;
        }
        System.out.println("El promedio de Altura de personas de 160cm para abajo: "+(alt160/cant160));
        System.out.println("El promedio de Altura personas en gral (cm) : "+(cantgral/cantPers));
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
                    System.out.println("No puede ser negativo.");
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
