/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp13_05;

import Servicios.NumeroService;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP13_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumeroService ns= new NumeroService();
        ns.jugar(ns.crearNumero());
    }
    
}
