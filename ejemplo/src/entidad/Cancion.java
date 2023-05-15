/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author HP
 */
public class Cancion {
    public String titulo;
    public String autor;
/// Constructores
    public Cancion() {
        this.autor = "";
        this.titulo = "";
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    /// Metodos gett and sett

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void mostrarDatos(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("El artista es: "+this.autor);
    }
}
