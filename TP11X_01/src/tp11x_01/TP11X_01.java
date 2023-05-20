/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11x_01;

import Entidad.Perro;
import Entidad.Persona;
import Servicios.PerroService;
import Servicios.PersonaService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TP11X_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int opcion;
        PersonaService ps=new PersonaService();
        PerroService pps=new PerroService();
        ArrayList <Persona> personas=new ArrayList();
        ArrayList <Perro> perros=new ArrayList();
        do {            
            mostrarMenu();
            opcion=sc.nextInt();
            opcion=validarOpcion(opcion,"Ingrese una opción valida: ");
            ejecutarOpcion(opcion,ps,pps,personas,perros);
        } while (opcion!=7);
    }
    
    public static void ejecutarOpcion(int opc,PersonaService ps,PerroService pps,ArrayList <Persona> personas,ArrayList <Perro> perros){
        switch (opc){
            case 1:
                pps.cargarPerro(perros);
                break;
            case 2:
                if (perros.size()>0){
                    pps.mostrarPerrosCargados(perros);
                }else {
                    System.out.println("Debe cargar los perros primeros!");
                }
                presioneUnaTecla();
                break;
            case 3:
                if (perros.size()>0){
                    pps.mostrarPerrosDisponibles(perros);
                }else {
                    System.out.println("Debe cargar los perros primeros!");
                }
                presioneUnaTecla();
                break;
            case 4:
                if(perros.size()>0){
                    ps.cargarPersona(personas, perros);
                }else{
                    System.out.println("Debe cargar los perros primeros!");
                }
                break;
            case 5:
                if (personas.size()>0){
                    ps.mostrarPersonasCargadas(personas);
                }else {
                    System.out.println("Debe cargar las personas primeros!");
                }
                presioneUnaTecla();
                break;
            case 6:
                ps.mostrarPersonasCargadas(personas);
                ps.buscarPersona(personas, perros);
                break;
            case 7:
                System.out.println("Saliendo del Sistema...");
                presioneUnaTecla();
                break;
        }
    }
    public static void mostrarMenu(){
        System.out.println("");
        System.out.println(" __________ Menú de Opciones __________");
        System.out.println("| 1. Cargar Perros                     |");
        System.out.println("| 2. Mostrar todos los Perros          |");
        System.out.println("| 3. Mostrar los Perros disponibles    |");
        System.out.println("| 4. Cargar Personas                   |");
        System.out.println("| 5. Mostrar todas Personas            |");
        System.out.println("| 6. Adoptar un perro                  |");
        System.out.println("| 7. Salir                             |");
        System.out.println("|______________________________________|");
        System.out.print("  Elija opcion: ");
        //locate(11,11);
    }
    
    public static int validarOpcion(int opc,String message){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int retorno=0;
        do {            
            if (opc>0 && opc<=7){
                retorno=opc;
            }else{
                System.out.println("Ingreso una opción invalida!!!");
                System.out.println(message);
                opc=sc.nextInt();
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
     public static void locate(int row, int column) {
        System.out.print("\033[" + row + ";" + column + "H");
    }
}
