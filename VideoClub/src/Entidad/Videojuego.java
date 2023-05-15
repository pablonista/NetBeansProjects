/*
 Crearemos una clase Videojuego con las siguientes características:
•	Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
•	Por defecto, las horas estimadas serán de 10 horas y entregado false. El resto de atributos serán valores por defecto según el tipo del atributo.
•	Los constructores que se implementaran serán:
o	Un constructor por defecto.
o	Un constructor con el titulo y horas estimadas. El resto por defecto.
o	Un constructor con todos los atributos, excepto de entregado.
•	Los métodos que se implementara serán:
o	Métodos get de todos los atributos, excepto de entregado.
o	Métodos set de todos los atributos, excepto de entregado.
o	Sobrescribe los métodos toString.

 */
package Entidad;

/**
 *
 * @author HP
 */
public class Videojuego {
    //atributos
    private String Titulo;
    private int HorasEstimadas;
    public boolean Entregado;
    private String Genero;
    private String Cia;
    //constructores

    public Videojuego() {
    }

    public Videojuego(String Titulo, int HorasEstimadas, boolean Entregado, String Genero, String Cia) {
        this.Titulo = Titulo;
        this.HorasEstimadas = HorasEstimadas;
        this.Entregado = Entregado;
        this.Genero = Genero;
        this.Cia = Cia;
    }

    public Videojuego(String Titulo, int HorasEstimadas) {
        this.Titulo = Titulo;
        this.HorasEstimadas = HorasEstimadas;
    }

    public Videojuego(String Titulo, int HorasEstimadas, String Genero, String Cia) {
        this.Titulo = Titulo;
        this.HorasEstimadas = HorasEstimadas;
        this.Genero = Genero;
        this.Cia = Cia;
    }
    //Métodos

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getHorasEstimadas() {
        return HorasEstimadas;
    }

    public void setHorasEstimadas(int HorasEstimadas) {
        this.HorasEstimadas = HorasEstimadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCia() {
        return Cia;
    }

    public void setCia(String Cia) {
        this.Cia = Cia;
    }

    @Override
    public String toString() {
        return "Videojuego{" + "Titulo=" + Titulo + ", HorasEstimadas=" + HorasEstimadas + ", Entregado=" + Entregado + ", Genero=" + Genero + ", Cia=" + Cia + '}';
    }
    
}
