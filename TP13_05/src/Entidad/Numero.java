/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Numero {
    private int aleatorio;

    public Numero(int aleatorio) {
        this.aleatorio = aleatorio;
    }

    public int getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(int aleatorio) {
        this.aleatorio = aleatorio;
    }

    @Override
    public String toString() {
        return "El número era =" + aleatorio + '}';
    }
    
}
