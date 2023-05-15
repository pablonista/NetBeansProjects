/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Baraja {
    private ArrayList <Carta> cartas;
    private int cantidadDisponibles;

    public Baraja(ArrayList<Carta> cartas) {
        this.cartas = cartas;
        this.cantidadDisponibles=40;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public int getCantidadDisponibles() {
        return cantidadDisponibles;
    }

    public void setCantidadDisponibles(int cantidadDisponibles) {
        this.cantidadDisponibles = cantidadDisponibles;
    }
    
    public void barajar(){
        Carta [] juegoCartas=new Carta[cartas.size()];
        int i=0;
        for (Carta next : cartas) {
            juegoCartas[i]=next;
            i++;
        }
        cartas.removeAll(cartas);
        i=0;
        while (i<juegoCartas.length) {
            int aux=(int)(Math.random()*40);
            if (juegoCartas[aux]!=null) {
                cartas.add(juegoCartas[aux]);
                juegoCartas[aux]=null;
                i++;
            }
        }
    }
    public void siguienteCarta(int idx, Carta carta ){
        if (idx>0) {
            System.out.println(carta.toString());
        }else {
            System.out.println("No hay más cartas para mostrar!!!");
        }
    }
    public void cartasDisponibles(){
        System.out.println("Cantidad de cartas disponibles: "+ this.getCantidadDisponibles());
    }
    public void darCartas(){
        Scanner sc=new Scanner (System.in).useDelimiter("\n");
        String salir="N";
        do {
            System.out.print("cuantas cartas pide? ");
            int cant =sc.nextInt();
            Iterator <Carta> it = cartas.iterator();
            int i=1;
            if(cant>cantidadDisponibles){
                System.out.println("Quedan disponibles "+cantidadDisponibles+" cartas.");
            }
            while (it.hasNext()) {
                Carta next = it.next();
                if (!next.isSacada() && i<=cant) {
                    //System.out.println("La carta sacada es: "+next.toString());
                    siguienteCarta(cantidadDisponibles,next);
                    next.setSacada(true);
                    i++;
                    cantidadDisponibles--;
                }
            }
            System.out.print("Desea seguir sacando cartas (S/N):");
            salir=String.valueOf(sc.next().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
 
    }
    public void cartasMonton(){
        Iterator <Carta> it = cartas.iterator();
        System.out.println("\nCartas ya mostradas en la mesa: \n");
        while (it.hasNext()) {
            Carta next = it.next();
            if (next.isSacada()==true) {
                System.out.println(next.toString());
            }
        }
    }
    public void mostrarBaraja(){
        Iterator <Carta> it = cartas.iterator();
        System.out.println("\nCartas no mostradas en la mesa: \n");
        while (it.hasNext()) {
            Carta next = it.next();
            if (!next.isSacada()) {
                System.out.println(next.toString());
            }
        }
    }
    private static String validarOpcion(String opc){
        String retorno = "";
        Scanner sc=new Scanner (System.in);
        do {            
            if ((opc.equalsIgnoreCase("S"))||(opc.equalsIgnoreCase("N"))) {
                retorno=opc;
            } else {
                    System.out.println("Ingreso una opción invalidad.");
                    System.out.print("Desea continuar sacando cartas (S/N): ");
                    opc=String.valueOf(sc.next().charAt(0));
                    retorno="";
            }
        } while (retorno.equalsIgnoreCase(""));
        return retorno;
    }
}
