/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.List;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Sala {
    private List <Asiento> asientos;

    public Sala(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    @Override
    public String toString() {
        return "Sala{" + "asientos=" + asientos + '}';
    }
    
}
