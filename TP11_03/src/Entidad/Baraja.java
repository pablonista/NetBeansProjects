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
            int aux=(int)(Math.random()*40+1);
            if (juegoCartas[aux]!=null) {
                cartas.add(juegoCartas[aux]);
                juegoCartas[aux]=null;
                i++;
            }
        }
    }
    public void siguienteCarta(int idx){
        if (idx>0) {
            System.out.println(cartas.get(idx).toString());
        }else {
            System.out.println("No hay más cartas para mostrar!!!");
        }
    }
    public void cartasDisponibles(){
        System.out.println("Cantidad de cartas disponibles: "+ this.getCantidadDisponibles());
    }
    public void darCartas(){
        Scanner sc=new Scanner (System.in).useDelimiter("\n");
        System.out.print("cuantas cartas pide?");
        int cant =sc.nextInt();
        Iterator <Carta> it = cartas.iterator();
        int i=1;
        if(cant>cantidadDisponibles){
            System.out.println("Quedan disponibles "+cantidadDisponibles+" cartas.");
        }
        while (it.hasNext()) {
            Carta next = it.next();
            if (next.isSacada()!=true && i<=cant) {
                System.out.println("La carta sacada es: "+next.toString());
                next.setSacada(true);
                i++;
            }
        }
    }
    public void cartasMonton(){
        Iterator <Carta> it = cartas.iterator();
        while (it.hasNext()) {
            Carta next = it.next();
            if (next.isSacada()==true) {
                System.out.println("Cartas ya mostradas en la mesa: ");
                System.out.println(next.toString());
            }
        }
    }
    public void mostrarBaraja(){
        Iterator <Carta> it = cartas.iterator();
        while (it.hasNext()) {
            Carta next = it.next();
            if (next.isSacada()==false) {
                System.out.println("Cartas no mostradas en la mesa: ");
                System.out.println(next.toString());
            }
        }
    }
}
