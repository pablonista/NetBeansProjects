/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Arrays;

/**
 *
 * @author HP
 */
public class Mensaje {
    private String Saludo;
    private int [] Numeros;

    public Mensaje() {
    }

    public Mensaje(String Saludo, int[] Numeros) {
        this.Saludo = Saludo;
        this.Numeros = Numeros;
    }

    public String getSaludo() {
        return Saludo;
    }

    public void setSaludo(String Saludo) {
        this.Saludo = Saludo;
    }

    public int[] getNumeros() {
        return Numeros;
    }

    public void setNumeros(int[] Numeros) {
        this.Numeros = Numeros;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "Saludo=" + Saludo + ", Numeros=" + Arrays.toString(Numeros)+ '}';
    }
    
}
