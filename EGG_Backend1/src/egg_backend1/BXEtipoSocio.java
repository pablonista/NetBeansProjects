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
public class BXEtipoSocio {
    public static void main(String[] args) {
        Scanner Leer=new Scanner (System.in);
        char letra;
        String socio;
        double costo, pago;
        do {            
            System.out.print("Ingrese el tipo de Socio: ");
            letra = Leer.nextLine().charAt(0);
            socio = Character.toString(letra);
        } while ((!socio.equalsIgnoreCase("a")) && (!socio.equalsIgnoreCase("b")) && (!socio.equalsIgnoreCase("c")));
        System.out.print("Ingrese el Costo: ");
        costo=Leer.nextDouble();
        costo=validarNum(costo);
        pago=0;
        switch (socio){
            case "a":
                pago=costo*0.5;
                break;
            case "b":
                pago=costo*0.65;
                break;
            case "c":
                pago=costo;
                break;
        }
        System.out.println("Tipo de Socio: "+socio);
        //System.out.println("costo: "+costo);
        //System.out.println("A pagar: "+pago);
        System.out.printf("El costo $ %.3f.\n", costo);
        System.out.printf("A pagar $ %.3f.\n", pago);
    }
    public static double validarNum(double num)  {
        double retorno = 0;
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
