/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public abstract class Barco {
   private String matricula;
   private double eslora;
   private int agnoFabricacion;

    public Barco(String matricula, double eslora, int agnoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.agnoFabricacion = agnoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public int getAgnoFabricacion() {
        return agnoFabricacion;
    }
   
    public abstract double calcularModulo();
   
   public double calcularPrecioAlquiler(Date fechaAlquiler, Date fechaDevolucion){
        long milisegundosPorDia = 24 * 60 * 60 * 1000; // Número de milisegundos en un día
        long diferenciaMilisegundos = fechaDevolucion.getTime() - fechaAlquiler.getTime();
        long diasOcupacion = diferenciaMilisegundos / milisegundosPorDia;
   
        double modulo = calcularModulo();
        return diasOcupacion * modulo;
   }
}
