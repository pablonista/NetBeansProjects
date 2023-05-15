/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Secreto;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SecretoService {
    private Scanner sc=new Scanner(System.in);
    public void adivinarMes(Secreto s){
        int cantIntentos=0;
        boolean encontrado=false;
        String mes;
        String mesSecreto=definirMes(s);
        System.out.println("Tienes 3 intentos para hallar el Mes Secreto!!!");
        do {
            cantIntentos++;
            System.out.print("Ingrese el Mes a adivinar: ");
            mes=sc.next();
            if (mes.equalsIgnoreCase(mesSecreto)) {
                System.out.println("Enhorabuena!!! El mes secreto era: "+mes.toUpperCase());
                System.out.println("Cantidad de intentos: "+cantIntentos);
                cantIntentos=4;
                encontrado=true;
                presioneUnaTecla();
            } else {
                System.out.println("Sigue intentando");
                System.out.println("Cantidad de intentos: "+cantIntentos);
                presioneUnaTecla();
            }
        } while (cantIntentos <3);
        if (encontrado==false) {
            System.out.println("El mes secreto era: "+mesSecreto); 
        }
    }
    
    public String definirMes(Secreto s){
        return s.getMes()[(int) (Math.random() * 12) + 1];
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
