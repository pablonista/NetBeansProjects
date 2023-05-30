/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12x_02;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12X_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> edificios=new ArrayList();
        Polideportivo polideportivo1=new Polideportivo(78,8,90,"CLUB ATLETICO TUCUMAN","CERRADO");
        Polideportivo polideportivo2=new Polideportivo(40,5,45,"CLUB ATLETICO SAN MARTIN","ABIERTO");
        EdificioDeOficinas edificiodeoficinas1=new EdificioDeOficinas(25,5,40,4,14,4);
        EdificioDeOficinas edificiodeoficinas2=new EdificioDeOficinas(30,6,25,3,10,3);
        edificios.add(polideportivo1);
        edificios.add(edificiodeoficinas1);
        edificios.add(polideportivo2);
        edificios.add(edificiodeoficinas2);
        for (Edificio edificio : edificios) {
            if (edificio instanceof Polideportivo) {
                System.out.println(edificio.toString());
                System.out.println("Su Volumen es: "+edificio.calcularVolumen());
                System.out.println("Su área es: "+edificio.calcularSuperficie());
            }
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println(edificio.toString());
                System.out.println("Su Volumen es: "+edificio.calcularVolumen());
                System.out.println("Su área es: "+edificio.calcularSuperficie());
                ((EdificioDeOficinas) edificio).cantPersonas();
            }
        }
    }
}
