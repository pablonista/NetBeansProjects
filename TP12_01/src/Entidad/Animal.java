/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Animal {
    protected String nombre;
    protected String alimento;
    protected Integer edad;
    protected String razaAnimal;

    public Animal(String nombre, String alimento, Integer edad, String razaAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razaAnimal = razaAnimal;
    }
    public void Alimentarse(){
        System.out.println("Soy un "+nombre+" y me alimento de "+alimento);
    }
}
