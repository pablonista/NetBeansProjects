/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoahorcado;

import Servicio.AhorcadoService;

/**
 *
 * @author HP
 */
public class JuegoAhorcado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AhorcadoService as=new AhorcadoService();
        as.juego();
    }
}
