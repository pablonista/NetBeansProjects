/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private final List<Receta> recetas;

    public Cocina() {
        this.recetas = new ArrayList<>();
    }

    public void agregarReceta(Receta receta) {
        this.recetas.add(receta);
    }

    public Receta buscarReceta(String nombre) {
        for (Receta receta : this.recetas) {
            if (receta.getNombre().equals(nombre)) {
                return receta;
            }
        }
        return null;
    }

    public List<Receta> recetasDisponibles(List<Ingrediente> ingredientesDisponibles) {
        List<Receta> recetasDisponibles = new ArrayList<>();
        for (Receta receta : this.recetas) {
            if (receta.sePuedePrepararCon(ingredientesDisponibles)) {
                recetasDisponibles.add(receta);
            }
        }
        return recetasDisponibles;
    }
}
