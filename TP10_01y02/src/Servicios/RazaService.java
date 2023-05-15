/*
1 - Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList. 
2 - Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RazaService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
   //1
    private void agregarRaza(ArrayList <String> r){
        System.out.print("Ingrese la raza del Perro: ");
        r.add(sc.next().toUpperCase());
    }
    
    public void cargarRaza(ArrayList <String> r){
        String salir="N";
        do {            
            agregarRaza(r);
            System.out.print("Desea continuar cargando razas de Perro? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
    }
    
    public void mostrarRaza(ArrayList <String> r){
        System.out.println("Se imprimen las razas de Perros disponibles: ");
        for (String string : r) {
            System.out.println(string);
        }
    }
    //2
    public void eliminarRaza(ArrayList <String> r){
        boolean find=false;
        String raza="";
        System.out.print("Ingrese la raza a buscar y eliminar: ");
        raza=sc.next().toUpperCase();
        Iterator<String> it = r.iterator();
        while (it.hasNext()) {
            if (it.next().equals(raza)) {
                it.remove();
                find=true;
            }
        }
        if (find!=true) {
            System.out.println("No se encontró "+raza+" en las razas disponibles!!!");
        }
    }
    public void mostrarOrdenadoRaza(ArrayList <String> r){
        Collections.sort(r);
        mostrarRaza(r);
    }
    private String validarOpcion (String op){
        String retorno="";
        do {            
            if (op.equalsIgnoreCase("S")||op.equalsIgnoreCase("N")) {
                retorno=op;
        } else {
                System.out.print("Ingrese nuevamente la opción (S/N): ");
                op=String.valueOf(sc.next().toUpperCase().charAt(0));
        }
        } while (retorno.equalsIgnoreCase(""));
        return retorno;
    }
}
