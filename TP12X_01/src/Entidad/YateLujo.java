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
public class YateLujo extends Barco{
    private double potenciaCV;
    private int numeroCamarotes;

    public YateLujo(String matricula, double eslora, int agnoFabricacion,double potenciaCV, int numeroCamarotes) {
        super(matricula, eslora, agnoFabricacion);
        this.potenciaCV=potenciaCV;
        this.numeroCamarotes=numeroCamarotes;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public int getNumeroCamarotes() {
        return numeroCamarotes;
    }
    
    @Override
    public double calcularModulo() {
        return getEslora() * 10 + potenciaCV + numeroCamarotes;
    }
    
}
