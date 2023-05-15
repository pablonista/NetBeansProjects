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
public class CBnombreEdad {
    public static void main(String[] args) {
        String nombre,respuesta,salir;
        int edad,i=1;
        Scanner sc=new Scanner (System.in);
        do {            
            ClearScreen();
            System.out.println("Registro No"+i);
            System.out.print("Ingrese el nombre de la persona: ");
            nombre=sc.next().toUpperCase();
            System.out.print("Ingrese la edad de la persona: ");
            edad=sc.nextInt();
            edad=validarNum(edad);
            respuesta=evaluarEdad(nombre,edad);
            System.out.println(respuesta);
            i++;
            System.out.print("Desea continuar con la carga (Si/No): ");
            salir=sc.next();
        } while (!salir.equalsIgnoreCase("No"));
        sc.close();
    }
    private static String evaluarEdad(String name, int age){
        String evaluacion="";
        if (age>=18) {
            evaluacion=name+" es mayor de edad.";
        } else {
            evaluacion=name+" es menor de edad.";
        }
    return evaluacion;    
    }
    public static int validarNum(int num)  {
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>0) {
                retorno=num;
            } else {
                if (num<=0) {
                    ClearScreen();
                    System.out.println("La edad no puede ser Cero o negativo.");
                    System.out.print("Ingrese nuevamente la edad: ");
                    num=sc.nextInt();
                    retorno=num;
                }
            }
        } while (retorno<=0);
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
