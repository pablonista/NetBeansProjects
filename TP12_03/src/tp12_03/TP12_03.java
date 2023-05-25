/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12_03;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Electrodomestico> electrodomesticos =new ArrayList();
        Electrodomestico tv1=new Televisor(50,true,150000,"Negro",'A',10);
        Electrodomestico lv1=new Lavadora(20,220000,"Blanco",'C',45);
        Electrodomestico tv2=new Televisor(48,true,120000,"Negro",'A',9);
        Electrodomestico lv2=new Lavadora(30,250000,"Rojo",'B',50);
        
        electrodomesticos.add(tv1);
        electrodomesticos.add(lv1);
        electrodomesticos.add(tv2);
        electrodomesticos.add(lv2);
        
        double totalElectrodomesticos = 0;
        double totalLavadoras = 0;
        double totalTelevisores = 0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                totalLavadoras+=electrodomestico.getPrecio();
            }
            if (electrodomestico instanceof Televisor) {
                totalTelevisores+=electrodomestico.getPrecio();
            }
            totalElectrodomesticos += electrodomestico.getPrecio();
            electrodomestico.mostrarInformacion();
            System.out.println("---------------------------");
        }
        System.out.println("El precio total de Televisores: $"+totalTelevisores);
        System.out.println("El precio total de Lavadoras: $"+totalLavadoras);
        System.out.println("El precio total de Electrodomesticos: $"+totalElectrodomesticos);
    }
    
}
