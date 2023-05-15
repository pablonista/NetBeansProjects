/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Carta;
import java.util.ArrayList;

/**
 *
 * BASTO,COPA,ESPADA,ORO;
 */
public class BarajaService {
    public ArrayList <Carta> crearBaraja(){
        ArrayList <Carta> cartas=new ArrayList();
        for (int i = 1; i <= 12; i++) {
            for (int j = 0; j < 4; j++) {
                if (i!=8 && i!=9) {
                    switch (j){
                        case 0: cartas.add(new Carta(i,"BASTO"));
                                break;
                        case 1: cartas.add(new Carta(i,"COPA"));
                                break;
                        case 2: cartas.add(new Carta(i,"ESPADA")); 
                                break;
                        case 3: cartas.add(new Carta(i,"ORO"));
                                break;
                    }
                }
            }
        }
        return cartas;
    }
}
