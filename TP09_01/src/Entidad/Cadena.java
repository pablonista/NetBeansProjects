/*
 Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática.
 */
package Entidad;

/**
 *
 * @author HP
 */
public class Cadena {
    //atributos
    private String Frase;
    private int Largo;
    //constructores

    public Cadena() {
    }

    public Cadena(String Frase) {
        this.Frase = Frase;
        this.Largo=Frase.length();
    }
    //métodos

    public String getFrase() {
        return Frase;
    }

    public void setFrase(String Frase) {
        this.Frase = Frase;
        setLargo(Frase);
    }

    public int getLargo() {
        return Largo;
    }

    public void setLargo(String Frase) {
        this.Largo = Frase.length();
    }
}
