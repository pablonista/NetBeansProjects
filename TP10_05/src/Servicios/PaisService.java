/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicios;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class PaisService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    private Pais crearPais(){
        System.out.print("Ingrese el Nombre del Pais: ");
        String nombre=sc.next().toUpperCase();
        return new Pais(nombre);
    }
    public void cargarPais(HashSet <Pais> paises){
        String salir="N";
        do {            
            paises.add(crearPais());
            System.out.print("Desea continuar cargando Paises? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
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
    public void mostrarPaises(HashSet <Pais> paises){
        for (Pais pais : paises) {
            System.out.println(pais.toString());
        }
    }
    public void mostrarOrdenaPaises (HashSet <Pais> paises){
        ArrayList<Pais> listaPaises = new ArrayList<>(paises);
        Collections.sort(listaPaises, new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p1.getNombre().compareTo(p2.getNombre());
        }
    });
        for (Pais pais : listaPaises) {
            System.out.println(pais);
        }   
    }
    public void eliminarPais(HashSet <Pais> paises){
        Iterator <Pais> it2 = paises.iterator();
        Boolean find = false;
        System.out.print("Ingrese el nombre del Pais a borrar: ");
        String pnombre=sc.next().toUpperCase();
        while (it2.hasNext()){
            Pais p = it2.next();
            if (p.getNombre().equalsIgnoreCase(pnombre)){
                it2.remove();
                find=true;
            }
        }
        if (find==false){
            System.out.println("No se encontró el Pais "+pnombre+" en el Conjunto de Paises.");
        }
    }
}
