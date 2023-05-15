/*
 
 */
package tp11_02;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TP11_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cantPlayer = ingresarCantidadJugadores();
       ArrayList <Jugador> jugadores = cargarJugadores(cantPlayer);
       Revolver revolver=new Revolver();
       revolver.llenarRevolver();
       Juego juego=new Juego();
       juego.llenarJuego(jugadores, revolver);       
       juego.ronda();
    }
    private static int ingresarCantidadJugadores(){
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        int cantJugadores, retorno=0;
        do {            
            System.out.print("Ingrese la cantidad de Jugadores(1-6): ");
            cantJugadores=sc.nextInt();
            if (cantJugadores>=1 && cantJugadores <= 6){
                retorno=cantJugadores;
            }else{
                System.out.println("Ingreso un numero fuera del rango. Se asignará 6 jugadores al juego.");
                retorno=6;
            }
        } while (retorno==0);   
        return retorno;
    }
    private static ArrayList <Jugador> cargarJugadores(int cantidadJugadores){
        ArrayList <Jugador> jugadores =new ArrayList();
        for (int i = 1; i <= cantidadJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        return jugadores;
    }
}
