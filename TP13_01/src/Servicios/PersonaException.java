/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class PersonaException extends Exception {

    /**
     * Creates a new instance of <code>PersonaException</code> without detail
     * message.
     */
    public PersonaException() {
    }

    /**
     * Constructs an instance of <code>PersonaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PersonaException(String msg) {
        super(msg);
    }
}
