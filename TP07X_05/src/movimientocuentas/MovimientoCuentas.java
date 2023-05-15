/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimientocuentas;

import Entidad.Cuenta;

/**
 *
 * @author HP
 */
public class MovimientoCuentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cta=new Cuenta();
        cta.cargarCuenta();
        cta.retirarDinero();
        cta.mostrarDatos();
    }
    
}
