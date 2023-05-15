/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 *
 *
 */
public class LibroService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    private Libro crearLibro(){
        System.out.print("Ingrese el Titulo del Libro: ");
        String titulo=sc.next().toUpperCase();
        System.out.print("Ingrese el Autor del Libro: ");
        String autor=sc.next().toUpperCase();
        System.out.print("Ingrese la cantidad de Libros: ");
        int ejemplares=sc.nextInt();
        return new Libro(titulo,autor,ejemplares,0);
    }
    public void cargarLibro(HashSet <Libro> libros){
        String salir="N";
        do {            
            libros.add(crearLibro());
            System.out.print("Desea cargar otro Libro? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
    }
    public void mostrarLibro(HashSet <Libro> libros){
        for (Libro libro : libros) {
            System.out.println(libro.toString());
        }
    }
    public boolean prestamos(HashSet <Libro> libros){
        Iterator <Libro> it= libros.iterator();
        boolean find=false, realizado=false;
        System.out.print("Ingrese el Titulo del Libro a prestar: ");
        String titulo=sc.next().toUpperCase();
        while (it.hasNext()) {
            Libro libro = it.next();
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                if (libro.getEjemplares()-libro.getPrestados()>0){
                    int prest=libro.getPrestados()+1;
                    libro.setPrestados(prest);
                    realizado=true;
//                    System.out.println("Se proceso exitosamente el prestamo del libro");
                }else {
                    System.out.println("No se encuentra ninguna copia disponible del libro");
                }
//                System.out.println("Presione intro para continuar...");
//                sc.next();
                find=true;
            }
        }
//        if (find==false) {
//                System.out.println("No se encontró el libro");
//        }
        return realizado;
    }
    public boolean devolucion(HashSet <Libro> libros){
        Iterator <Libro> it= libros.iterator();
        boolean find=false, realizado=false;
        System.out.print("Ingrese el Titulo del Libro a devolver: ");
        String titulo=sc.next().toUpperCase();
        while (it.hasNext()) {
            Libro libro = it.next();
            if (libro.getTitulo().equalsIgnoreCase(titulo)){
                if (libro.getPrestados()>0){
                    int devuel=libro.getPrestados()-1;
                    libro.setPrestados(devuel);
                    realizado=true;
                    //System.out.println("Se proceso exitosamente la devolucion del libro");
                }else {
                    System.out.println("No se encuentra prestado en sistema el libro");
                }
//                System.out.println("Presione intro para continuar...");
//                sc.next();
                find=true;
            }
        }
//        if (find==false) {
//                System.out.println("No se encontró el libro");
//        }
        return realizado;
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
