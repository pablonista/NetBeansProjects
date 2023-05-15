/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculoedad;

import Servicios.FechaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CalculoEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FechaService fs=new FechaService();
        Date fechaNacimiento=fs.fechaNacimiento();
        Date fechaHoy=fs.fechaActual();
        System.out.println("Fecha de Nacimiento: "+fechaNacimiento.toString());
        System.out.println("Fecha Actual:"+fechaHoy.toString());
        System.out.println("La diferencia de Años: "+fs.diferencia(fechaNacimiento, fechaHoy));
        System.out.println("Saliendo del Sistema.");
        presioneUnaTecla();
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
