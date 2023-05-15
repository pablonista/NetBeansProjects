/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manualcocina;

import Entidad.Cocina;
import Entidad.Receta;
import Entidad.Ingrediente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class ManualCocina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cocina [] Cocinas=new Cocina[5];//Definicion Array
        List<Ingrediente> ingredientesDisponibles = new ArrayList<>();
        ingredientesDisponibles.add(new Ingrediente("Harina"));
        ingredientesDisponibles.add(new Ingrediente("Leche"));
        ingredientesDisponibles.add(new Ingrediente("Huevos"));
        ingredientesDisponibles.add(new Ingrediente("Azúcar"));

        // Creamos una cocina
        Cocina cocina = new Cocina();
        

        // Creamos algunas recetas y las agregamos a la lista de recetas de la cocina
        List<Ingrediente> ingredientesTorta = new ArrayList<>();
        ingredientesTorta.add(new Ingrediente("Harina"));
        ingredientesTorta.add(new Ingrediente("Huevos"));
        ingredientesTorta.add(new Ingrediente("Azúcar"));
        ingredientesTorta.add(new Ingrediente("Leche"));
        ingredientesTorta.add(new Ingrediente("Polvo para hornear"));
        Receta torta = new Receta("Torta", ingredientesTorta);
        cocina.agregarReceta(torta);

        List<Ingrediente> ingredientesPanqueques = new ArrayList<>();
        ingredientesPanqueques.add(new Ingrediente("Harina"));
        ingredientesPanqueques.add(new Ingrediente("Huevos"));
        ingredientesPanqueques.add(new Ingrediente("Leche"));
        Receta panqueques = new Receta("Panqueques", ingredientesPanqueques);
        cocina.agregarReceta(panqueques);

        // Buscamos una receta por su nombre
        Receta recetaBuscada = cocina.buscarReceta("Torta");
        System.out.println("Receta buscada: " + recetaBuscada.getNombre());

        // Obtenemos la lista de recetas que se pueden preparar con los ingredientes disponibles en la cocina
        List<Receta> recetasDisponibles = cocina.recetasDisponibles(ingredientesDisponibles);
        System.out.println("Recetas disponibles:");
        for (Receta receta : recetasDisponibles) {
            System.out.println("- " + receta.getNombre());
        }
    }
    
}
