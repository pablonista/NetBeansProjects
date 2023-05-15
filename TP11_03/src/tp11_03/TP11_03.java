/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp11_03;

import Entidad.Baraja;
import Entidad.Carta;
import Servicios.BarajaService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class TP11_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarajaService bs=new BarajaService();
        ArrayList <Carta> cartas=new ArrayList();
        cartas=bs.crearBaraja();
        Baraja baraja=new Baraja(cartas);
        baraja.barajar();
        baraja.darCartas();
        baraja.cartasMonton();
        baraja.mostrarBaraja();
    }
    
}
