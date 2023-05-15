/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paresnumericos;

import Entidad.ParDeNumeros;
import Servicios.ParDeNumerosService;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ParesNumericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int opc=0;
        boolean creado=false;
        ParDeNumerosService pns=new ParDeNumerosService();
        ParDeNumeros pn=new ParDeNumeros();
        do {
            ClearScreen();
            mostrarMenu();
            opc=sc.nextInt();
            opc=validarOpcion(opc);
            if (opc>1&&opc<5&&creado==false) {
                System.out.println("Debe crear el Par Númerico primero!!!");
                presioneUnaTecla();
            } else {
                switch (opc){
                    case 1:
                        pn=pns.crearParesNumericos();
                        creado=true;
                        break;
                    case 2:
                        pns.mostrarValores(pn);
                        break;
                    case 3:
                        pns.calcularPotencia(pn);
                        break;
                    case 4:
                        pns.calculaRaiz(pn);
                        break;
                    case 5:
                        System.out.println("Saliendo del Sistema...");
                        break;
                }    
            }
            presioneUnaTecla();
        } while (opc!=5);
    }
    
    public static void mostrarMenu(){
        System.out.println("");
        System.out.println(" _____________ Menú ______________");
        System.out.println("| 1. Crear Pares Númericos        |");
        System.out.println("| 2. Mostrar Pares Númericos      |");
        System.out.println("| 3. Calcular Potencia            |");
        System.out.println("| 4. Calcular Raíz Cuadrada       |");
        System.out.println("| 5. Salir                        |");
        System.out.println("| Elija opcion:                   |");
        System.out.println("|_________________________________|");
    }
    public static int validarOpcion(int opc){
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if ((opc>0)||(opc<10)) {
                retorno=opc;
            } else {
                    System.out.println("Eligio un número fuera de las opciones disponibles.");
                    System.out.print("Ingrese nuevamente el número de Opción: ");
                    opc=sc.nextInt();
                    retorno=0;
            }
        } while (retorno==0);
        return retorno; 
    } 
    static public void presioneUnaTecla()
      { 
          String seguir;
          Scanner teclado = new Scanner(System.in);
          System.out.println("Presione una tecla para continuar...");
          try
            {
             seguir = teclado.nextLine();
            }   
         catch(Exception e)
          {}  
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
