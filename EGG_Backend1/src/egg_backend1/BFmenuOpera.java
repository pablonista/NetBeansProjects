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
public class BFmenuOpera {
    public static void main(String[] args) {
        int num1,num2, opc;
        Scanner Leer=new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1=Leer.nextInt();
        num1=validarNum(num1);
        System.out.print("Ingrese otro numero: ");
        num2=Leer.nextInt();
        num2=validarNum(num2);
        do {            
            ClearScreen();
            imprimirMenu();
            opc=Leer.nextInt();
            switch(opc){
                case 1:
                    System.out.println("La suma de "+num1+"+"+num2+"="+(num1+num2));
                    System.out.println("Presione una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 2:
                    System.out.println("La resta de "+num1+"-"+num2+"="+(num1-num2));
                    System.out.println("Presione una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 3:
                    System.out.println("La multiplicacion de "+num1+"*"+num2+"="+(num1*num2));
                    System.out.println("Presione una tecla para continuar...");
                    new java.util.Scanner(System.in).nextLine();
                    break;
                case 4:
                    if (num2!=0) {
                        System.out.println("La division de "+num1+"/"+num2+"="+(num1/num2));
                        System.out.println("Presione una tecla para continuar...");
                        new java.util.Scanner(System.in).nextLine();
                    } else {
                        System.out.println("No se puede divir en 0");
                        System.out.println("Presione una tecla para continuar...");
                        new java.util.Scanner(System.in).nextLine();
                    }
                    break;
                case 5:
                    ClearScreen();
                    String respuesta;
                    do {
                        System.out.print("¿Desea salir del programa? (s/n): ");
                        respuesta = Leer.nextLine();
                    } while (!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));

                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("Saliendo del programa...");
                        System.exit(0);
                    } else {
                        System.out.println("Para volver al sistema presione una tecla...");
                        new java.util.Scanner(System.in).nextLine();
                        opc=0;
                    }
                    break;
            }
                
        } while (opc!=5);   
    }
    public static void imprimirMenu(){
        System.out.println("");
        System.out.println(" _______ Menu _______");
        System.out.println("| 1. Sumar           |");
        System.out.println("| 2. Restar          |");
        System.out.println("| 3. Multiplicar     |");
        System.out.println("| 4. Dividir         |");
        System.out.println("| 5. Salir           |");
        System.out.println("| Elija opcion:      |");
        System.out.println("|____________________|");
        
    }
    public static int validarNum(int num)  {
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>=0) {
                retorno=num;
            } else {
                if (num<0) {
                    System.out.println("No puede ser negativo.");
                    System.out.print("Ingrese nuevamente el numero: ");
                    num=sc.nextInt();
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
