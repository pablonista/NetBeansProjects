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
public class Velero extends Barco{
    private int numeroMastiles;

    public Velero(String matricula, double eslora, int agnoFabricacion, int numeroMastiles) {
        super(matricula, eslora, agnoFabricacion);
        this.numeroMastiles=numeroMastiles;
    }

    public int getNumeroMastiles() {
        return numeroMastiles;
    }

    @Override
    public double calcularModulo() {
       return getEslora() * 10 + numeroMastiles;
    }
    
}
