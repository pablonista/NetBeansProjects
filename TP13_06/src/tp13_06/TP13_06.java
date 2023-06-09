/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp13_06;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP13_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        class A {
            public void metodoA() {
            sentencia_a1
            sentencia_a2
            try {
                sentencia_a3
                sentencia_a4
            } catch (MioException e){
                sentencia_a6
            }
            sentencia_a5
            }
        }
    }
    /*
    Sino se ingresa un dato incorrecto se ejecutaran:
    sentencia_a1
    sentencia_a2
    sentencia_a3
    sentencia_a4
    sentencia_a5
    En caso de error se ejecutan:
    CASO A
    sentencia_a1
    sentencia_a2
    sentencia_a3 tiene el error
    sentencia_a6
    sentencia_a5
    CASO B
    sentencia_a1
    sentencia_a2
    sentencia_a3 
    sentencia_a4 tiene el error
    sentencia_a6
    sentencia_a5
    */
}
