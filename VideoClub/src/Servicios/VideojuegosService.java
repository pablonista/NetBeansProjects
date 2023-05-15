/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Videojuego;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class VideojuegosService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public Videojuego CrearVideojuego(){
     //Videojuego(String Titulo, int HorasEstimadas, boolean Entregado, String Genero, String Cia)
        System.out.print("Ingrese el Nombre del Video Juego: ");
        String Titulo=sc.nextLine();
        System.out.print("Ingrese el Número Horas Estimadas: ");
        int HorasEstimadas=sc.nextInt();
        boolean Entregado=true;
        System.out.print("Ingrese el Genero: ");
        String Genero=sc.nextLine();
        System.out.print("Ingrese la Compañia: ");
        String Cia=sc.nextLine();
        return new Videojuego(Titulo, HorasEstimadas, Entregado, Genero, Cia);
    }

    public void entregar(Videojuego VJ){
        VJ.Entregado=true;
    }
    
    public void devolver(Videojuego VJ){
        VJ.Entregado=false;
    }
    
    public boolean isEntregado (Videojuego VJ){
        return VJ.Entregado;
    }
}
