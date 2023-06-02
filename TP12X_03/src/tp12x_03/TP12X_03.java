/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12x_03;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.Hotel4Star;
import Entidad.Hotel5Star;
import Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12X_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Alojamiento> alojamientos=new ArrayList();
        Alojamiento alojamiento1 = new Hotel("Hotel 1", "Dirección 1", "Localidad 1", "Gerente 1", 50, 100, 5);
        alojamientos.add(alojamiento1);

        Alojamiento alojamiento2 = new Hotel4Star("Hotel 2", "Dirección 2", "Localidad 2", "Gerente 2", 30, 60, 3, 'A', "Restaurante 2", 40);
        alojamientos.add(alojamiento2);

        Alojamiento alojamiento3 = new Hotel5Star("Hotel 3", "Dirección 3", "Localidad 3", "Gerente 3", 100, 200, 10, 'B', "Restaurante 3", 80, 5, 20, 3);
        alojamientos.add(alojamiento3);

        Alojamiento alojamiento4 = new Camping("Camping 1", "Dirección 4", "Localidad 4", "Gerente 4", true, 500, 100, 10, true);
        alojamientos.add(alojamiento4);
        //public Residencia(String nombre, String direccion, String localidad, String gerente,boolean privado,double area,int cantidadMaximaCarpas,int cantidadBagnos,boolean restaurante,int cantidadHabitaciones,boolean descuentoGremio,boolean campoDeportivo)
        Alojamiento alojamiento5 = new Residencia("Residencia 1", "Dirección 5", "Localidad 5", "Gerente 5", false, 800, 40, 10, true, 25, false, true);
        alojamientos.add(alojamiento5);
        Alojamiento alojamiento6 = new Residencia("Residencia 2", "Dirección 6", "Localidad 6", "Gerente 6", true, 900, 50, 20, true, 35, true, true);
        alojamientos.add(alojamiento6);
        
        // Consulta: Todos los alojamientos
        System.out.println("\n----- Todos los alojamientos -----");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento);
        }

        // Consulta: Todos los hoteles de más caro a más barato
        System.out.println("\n----- Todos los hoteles de más caro a más barato -----");
        List<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        Collections.sort(hoteles, new Comparator<Hotel>() {
            @Override
            public int compare(Hotel hotel1, Hotel hotel2) {
                return Double.compare(hotel2.getPrecioDeHabitaciones(), hotel1.getPrecioDeHabitaciones());
            }
        });
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }

        // Consulta: Todos los campings con restaurante
        System.out.println("\n----- Todos los campings con restaurante -----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;
                if (camping.isRestaurante()) {
                    System.out.println(camping);
                }
            }
        }

        // Consulta: Todos las residencias que tienen descuento
        System.out.println("\n----- Todos las residencias que tienen descuento -----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.isDescuentoGremio()) {
                    System.out.println(residencia);
                }
            }
        }
    }
    
}
