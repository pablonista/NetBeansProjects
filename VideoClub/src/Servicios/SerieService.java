/*
 Como vemos, en principio, las clases anteriores no son padre-hija, pero si tienen en común, por eso vamos a hacer una interfaz llamada Entregable con los siguientes métodos:
•	entregar(): cambia el atributo prestado a true.
•	devolver(): cambia el atributo prestado a false.
•	isEntregado(): devuelve el estado del atributo prestado.
•	Método compareTo (Object a), compara las horas estimadas en los videojuegos y en las series el numero de temporadas. Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable. Recuerda el uso de los casting de objetos.

 */
package Servicios;

import Entidad.Serie;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SerieService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Serie CrearSerie(){
        //Serie(String Titulo, int NumTemp, boolean Entregado, String Genero, String Creador)
        System.out.print("Ingrese el Nombre de la Serie: ");
        String Titulo=sc.nextLine();
        System.out.print("Ingrese el Número de Temporada: ");
        int NumTemp=sc.nextInt();
        boolean Entregado=true;
        System.out.print("Ingrese el Genero: ");
        String Genero=sc.nextLine();
        System.out.print("Ingrese el Creador: ");
        String Creador=sc.nextLine();
        return new Serie(Titulo, NumTemp, Entregado, Genero, Creador);
    }
    public void entregar(Serie S){
        S.Entregado=true;
    }
    public void devolver(Serie S){
        S.Entregado=false;
    }
    public boolean isEntregado (Serie S){
        return S.Entregado;
    }
}
