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
public class BarcoMotor extends Barco{
    private double potenciaCV;

    public BarcoMotor(String matricula, double eslora, int agnoFabricacion,double potenciaCV) {
        super(matricula, eslora, agnoFabricacion);
        this.potenciaCV=potenciaCV;
        
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }
    
    @Override
    public double calcularModulo() {
        return getEslora() * 10 + potenciaCV;
    }
    
}
