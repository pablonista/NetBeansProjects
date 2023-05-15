/*
 En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.

 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PersonaServicio {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        boolean realizado;
        int edad=0;
        char sexo='\0';
        double peso=0;
        double altura=0;
        System.out.print("Ingrese el Nombre de la persona: ");
        String nombre=sc.next().toUpperCase();
        do {            
            realizado=false;
            System.out.print("Ingrese la Edad de la persona: ");
            edad=sc.nextInt();
            if (edad>0) {
                realizado=true;
            } else {
                System.out.print("La edad de la persona debe ser mayor a 1, no se acepta 0 ni edades negativas.\nIngrese nuevamente la Edad de la persona: ");
                edad=sc.nextInt();
                realizado=false;
            }
        } while (realizado==false);
       
        do {
            realizado=false;
            System.out.print("Ingrese el Sexo de la persona: ");
            sexo =sc.next().toUpperCase().charAt(0);
            if (sexo=='M'||sexo=='H'||sexo=='O') {
                realizado=true;
            } else {
                System.out.print("Ingreso un tipo incorrecto.\nLos tipos aceptados son Hombre (H),Mujer (M)y Otro (O).\nIngrese nuevamente el Sexo de la persona: ");
                sexo=sc.next().toUpperCase().charAt(0);
                realizado=false;
            }
        } while (realizado==false);
        
        do {            
            realizado=false;
            System.out.print("Ingrese el Peso de la persona (kg): ");
            peso=sc.nextDouble();
            if (peso>0) {
                realizado=true;
            } else {
                System.out.print("El peso de la persona debe ser mayor a 0, no se acepta 0 ni pesos negativos.\nIngrese nuevamente el Peso de la persona: ");
                peso=sc.nextDouble();
                realizado=false;
            }
        } while (realizado==false);
        do {            
            realizado=false;
            System.out.print("Ingrese la Altura de la persona (m): ");
            altura=sc.nextDouble();
            if (altura>0) {
                realizado=true;
            } else {
                System.out.print("La altura de la persona debe ser mayor a 0, no se acepta 0 ni alturas negativas.\nIngrese nuevamente la Altura de la persona: ");
                altura=sc.nextDouble();
                realizado=false;
            }
        } while (realizado==false);
        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
    public void mostrarPersona(Persona persona){
        System.out.println("");
        System.out.println("Nombre de la Persona: "+persona.getNombre());
        System.out.println("Edad de la Persona: "+persona.getEdad());
        System.out.println("Sexo de la Persona: "+persona.getSexo());
        System.out.printf("Peso de la Persona (kg): %.2f \n",persona.getPeso());
        System.out.printf("Altura de la Persona (m): %.2f \n",persona.getAltura());
        //System.out.println("");
    }
    
    public boolean esMayorDeEdad(Persona persona){
        return persona.getEdad()>=18;
    }
    
    public int calcularIMC(Persona persona){
        double IMC=0;
        int retorno;
        IMC=persona.getPeso()/Math.pow(persona.getAltura(), 2);
        if (IMC<20) {
            retorno= -1;
        } else {
            if (IMC>=20 && IMC<=25) {
                retorno = 0;
            } else {
                retorno=1;
            }
        }
        return retorno;
    }
}
