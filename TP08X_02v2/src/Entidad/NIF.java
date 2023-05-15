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
        String tablaCaracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = (int) (dni % 23);
        return tablaCaracteres.charAt(resto);
    }
    
}
