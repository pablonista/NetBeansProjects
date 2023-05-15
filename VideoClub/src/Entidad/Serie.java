/*
 Crearemos una clase llamada Serie con las siguientes características:
•	Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
•	Por defecto, el numero de temporadas es de 3 temporadas y entregado false. El resto de atributos 
        serán valores por defecto según el tipo del atributo.
•	Los constructores que se implementaran serán:
o	Un constructor por defecto.
o	Un constructor con el titulo y creador. El resto por defecto.
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
public class Serie {
    //atributos
    private String Titulo;
    private int NumTemp;
    public boolean Entregado;
    private String Genero;
    private String Creador;
    // Constructores

    public Serie() {
    }

    public Serie(String Titulo, int NumTemp, boolean Entregado, String Genero, String Creador) {
        this.Titulo = Titulo;
        this.NumTemp = NumTemp;
        this.Entregado = Entregado;
        this.Genero = Genero;
        this.Creador = Creador;
    }
    
    public Serie(String Titulo, int NumTemp, String Genero, String Creador) {
        this.Titulo = Titulo;
        this.NumTemp = NumTemp;
        this.Genero = Genero;
        this.Creador = Creador;
    }

    public Serie(String Titulo, String Creador) {
        this.Titulo = Titulo;
        this.Creador = Creador;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public int getNumTemp() {
        return NumTemp;
    }

    public void setNumTemp(int NumTemp) {
        this.NumTemp = NumTemp;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String Creador) {
        this.Creador = Creador;
    }

    @Override
    public String toString() {
        return "Serie{" + "Titulo=" + Titulo + ", NumTemp=" + NumTemp + ", Entregado=" + Entregado + ", Genero=" + Genero + ", Creador=" + Creador + '}';
    }
    
    
    
} 
