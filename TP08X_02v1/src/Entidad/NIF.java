/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author HP
 */
public class NIF {
    private long dni;
    private char letra;

    public NIF() {
    }

    public NIF(long dni) {
        this.dni = dni;
        this.letra = calcularLetra();
    }

    public long getDNI() {
        return dni;
    }

    public void setDNI(long dni) {
        this.dni = dni;
        this.letra = calcularLetra();
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    private char calcularLetra() {
        
        char[]vector={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int resto = (int) (dni % 23);
        return vector[resto];
    }
    
}
