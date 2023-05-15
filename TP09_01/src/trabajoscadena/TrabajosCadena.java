/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajoscadena;

import Entidad.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TrabajosCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in).useDelimiter("\n");
        CadenaServicio cs=new CadenaServicio();
        Cadena cad1= new Cadena();
        char letra='0';
        int opc=0;
        boolean creado=false;
        do {            
            mostrarMenu();
            opc=sc.nextInt();
            opc=validarOpcion(opc);
            if (opc>1&&opc<9&&(cad1.getLargo()==0)) {
                System.out.println("Debe crear la cadena primero!!!");
                presioneUnaTecla();
            } else {
                switch(opc){
                    case 1:
                            cad1=cs.CrearCadena();
                            break;
                    case 2:
                            cs.mostrarVocales(cad1);
                            break;
                    case 3:
                            cs.invertirFrase(cad1);
                            break;
                    case 4:
                            System.out.print("Ingrese la letra a buscar en la cadena: ");
                            letra=sc.next().charAt(0);
                            cs.vecesRepetido(cad1, letra);
                            break;
                    case 5:
                            cs.compararLongitud(cad1);
                            break;
                    case 6:
                            cs.unirFrases(cad1);
                            break;
                    case 7:
                            cs.reemplazar(cad1);
                            break;
                    case 8:
                            System.out.print("Ingrese la letra a buscar en la cadena: ");
                            letra=sc.next().charAt(0);

                            if (cs.contieneLetra(cad1, letra)==true) {
                                System.out.println("Letra encontrada!!!");
                            } else {
                                System.out.println("No se encontró la letra "+letra+" en "+cad1.getFrase());
                            }
                            break;
                    case 9:
                            System.out.println("Saliendo del Sistema");
                            presioneUnaTecla();
                }
            }
        } while (opc!=9);
    }
    
     public static void mostrarMenu(){
        System.out.println("");
        System.out.println(" _____________ Menú ______________");
        System.out.println("| 1. Crear Cadena                 |");
        System.out.println("| 2. Mostrar Vocales              |");
        System.out.println("| 3. Invertir Frases              |");
        System.out.println("| 4. Buscar letras repetidas      |");
        System.out.println("| 5. Comparar longitud            |");
        System.out.println("| 6. Unir frases                  |");
        System.out.println("| 7. Reemplazar Letras            |");
        System.out.println("| 8. Contiene Letra buscada       |");
        System.out.println("| 9. Salir                        |");
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
}
