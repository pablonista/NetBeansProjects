/*
 Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y
la cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes
métodos con los parámetros que sean necesarios:
• Constructores, tanto el vacío como el parametrizado.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ahorcado {
   
    private char [] Palabra;
    private int CountFindLetter;
    private int CantPlayMax;
    private boolean []FindLetter;

    public Ahorcado() {
    }

    public Ahorcado(char[] Palabra, int CountFindLetter, int CantPlayMax, boolean[] FindLetter) {
        this.Palabra = Palabra;
        this.CountFindLetter = CountFindLetter;
        this.CantPlayMax = CantPlayMax;
        this.FindLetter = FindLetter;
    }

    public char[] getPalabra() {
        return Palabra;
    }

    public void setPalabra(char[] palabra) {
        this.Palabra = Palabra;
    }

    public int getCountFindLetter() {
        return CountFindLetter;
    }

    public void setCountFindLetter(int CountFindLetter) {
        this.CountFindLetter = CountFindLetter;
    }

    public int getCantPlayMax() {
        return CantPlayMax;
    }

    public void setCantPlayMax(int CantPlayMax) {
        this.CantPlayMax = CantPlayMax;
    }

    public boolean[] getFindLetter() {
        return FindLetter;
    }

    public void setFindLetter(boolean[] FindLetter) {
        this.FindLetter = FindLetter;
    }
    
   

    
    
    
            
}
