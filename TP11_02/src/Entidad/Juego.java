/*
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
10
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Juego {
    private ArrayList <Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }
    public void llenarJuego(ArrayList<Jugador>jugadores, Revolver r){
        this.setJugadores(jugadores);
        this.setRevolver(r);
    }
    public void ronda(){
        int jugadorActual = 0;
        boolean alguienMojado = false;

        while (!alguienMojado) {
            Jugador jugador = jugadores.get(jugadorActual);
            alguienMojado = jugador.disparo(revolver);

            if (alguienMojado) {
                System.out.println(jugador.toString() + " Se pegó un corchazo de agua.");
            } else {
                System.out.println(jugador.toString() + " Sigue con vida.");
                jugadorActual = (jugadorActual + 1) % jugadores.size();
            }
        }
    }
    
}
