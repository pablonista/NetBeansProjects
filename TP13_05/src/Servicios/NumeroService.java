/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Numero;
import java.util.Scanner;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class NumeroService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public Numero crearNumero(){
        int numeroAleatorio = (int) (Math.random() * 500) + 1;
        return new Numero(numeroAleatorio);
    }
    public void jugar(Numero num){
        int cont=1;
        boolean encontrado=false;
        int numeroBuscado;
        System.out.println("Averigua que número calculo el sistema!!!");
        while (!encontrado && cont<=3) {
            try{
                System.out.print("Ingresa el número que crees: ");
                numeroBuscado=sc.nextInt();
                if (numeroBuscado==num.getAleatorio()) {
                    System.out.println("Enhorabuena lo encontraste!!!");
                    System.out.println("El número era: "+numeroBuscado);
                    encontrado=true;
                }else{
                    if (cont!=3) {
                        System.out.println("Intento "+(cont));
                        System.out.println("No era ese número!!!");
                        System.out.println("Intenta de nuevo...");
                    } else {
                        System.out.println("Intento "+(cont));
                        System.out.println("No era ese número!!!");
                        System.out.println("Te quedaste sin intentos");
                    }
                }        
            }catch (Exception e){
                System.out.println("Error: "+e.getMessage());
                System.out.println("Error: "+e);
                System.out.println("No ingreso un número!!!");
                break;
            }
            cont++;
        }
        System.out.println("El número era: "+num.getAleatorio());        
    }
}
