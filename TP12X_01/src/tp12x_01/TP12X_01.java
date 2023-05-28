/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12x_01;

import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.YateLujo;
import java.util.Date;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12X_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int agno= 2023-1900;//Hay que recordar que al año en el Date hay que restarle los 1900.
        Date fechaAlquiler=new Date(agno,05,28);//formato(yyyy,mm,dd)
        Date fechaDevolucion=new Date(agno,06,06);
        System.out.println("Fecha de Alquiler: "+fechaAlquiler.toString());
        System.out.println("Fecha de Devolución: "+fechaDevolucion.toString());
        
        Barco velero=new Velero("V001",15.5,2005,2);
        double precioVelero=velero.calcularPrecioAlquiler(fechaAlquiler, fechaDevolucion);
        System.out.println("Precio del alquiler del velero: $" + precioVelero);
        
        Barco barcoAMotor = new BarcoMotor("M001", 12.2, 2010, 250);
        double precioBarcoAMotor = barcoAMotor.calcularPrecioAlquiler(fechaAlquiler, fechaDevolucion);
        System.out.println("Precio del alquiler del barco a motor: $" + precioBarcoAMotor);
        
        Barco yateDeLujo = new YateLujo("Y001", 20.0, 2018, 500, 4);
        double precioYateDeLujo = yateDeLujo.calcularPrecioAlquiler(fechaAlquiler, fechaDevolucion);
        System.out.println("Precio del alquiler del yate de lujo: $" + precioYateDeLujo);
    }
}
