/*
 Implementa los anteriores métodos en las clases Videojuego y Serie. Ahora crea una aplicación ejecutable y realiza lo siguiente:
•	Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
•	Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
•	Entrega algunos Videojuegos y Series con el método entregar().
•	Cuenta cuantos Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
•	Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas. Muestralos en pantalla con toda su información (usa el método toString()).

 */
package videoclub;

import Entidad.Serie;
import Entidad.Videojuego;
import Servicios.SerieService;
import Servicios.VideojuegosService;

/**
 *
 * @author HP
 */
public class VideoClub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int []vector=new int [5];
        SerieService SS=new SerieService();
        VideojuegosService SV=new VideojuegosService();
        Serie [] VectorSeries=new Serie [5];
        Videojuego [] VectorVideoJuego=new Videojuego [5];
    
    }
    public static void cargarVectorSerie(Serie [] VS, SerieService SS){
        for (int i = 0; i < VS.length; i++) {
            VS[i]=SS.CrearSerie();
        }
    }
    
    public static void cargarVectorVideojuego(Videojuego [] VV, VideojuegosService SV){
        for (int i = 0; i < VV.length; i++) {
            VV[i]=SV.CrearVideojuego();
        }
    }
    
    public static void mostrarMenu(){
        System.out.println("");
        System.out.println(" _____________ Menú ______________");
        System.out.println("| 1. Alquiler de Serie            |");
        System.out.println("| 2. Devolucion de Serie          |");
        System.out.println("| 3. Listado de Serie             |");
        System.out.println("| 4. Alquiler de Videos Juegos    |");
        System.out.println("| 5. Devolucion de Videos Juegos  |");
        System.out.println("| 6. Listado de Serie             |");
        System.out.println("| 7. Salir                        |");
        System.out.println("| Elija opcion:                   |");
        System.out.println("|_________________________________|");
    }
    
    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla: " + e.getMessage());
        }
    }
}
