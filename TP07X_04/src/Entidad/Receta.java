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
import java.util.List;


    public class Receta {
    private String nombre;
    private List<Ingrediente> ingredientes;

    public Receta(String nombre, List<Ingrediente> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return this.ingredientes;
    }

    public boolean sePuedePrepararCon(List<Ingrediente> ingredientesDisponibles) {
        for (Ingrediente ingrediente : this.ingredientes) {
            if (!ingredientesDisponibles.contains(ingrediente)) {
                return false;
            }
        }
        return true;
    }
}