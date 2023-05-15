/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CantanteFamosoService {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private CantanteFamoso crearCantante(){
        System.out.print("Ingrese el Nombre del Cantante: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Nombre del Disco más vendido: ");
        String disco=sc.next().toUpperCase();
        return new CantanteFamoso(nombre,disco);
    }
    public void cargarCantante(ArrayList <CantanteFamoso> ListaCantantes,int n){
        for (int i = 0; i < n; i++) {
            System.out.println("Cantante N°"+(i+1));
            ListaCantantes.add(crearCantante());
        }
    }
    public Comparator <CantanteFamoso> compararCantante =new Comparator <CantanteFamoso>(){
        @Override
        public int compare(CantanteFamoso c1, CantanteFamoso c2) {
            return c1.getNombre().compareTo(c2.getNombre());
        }
    };
    public void ordenarCantante(ArrayList <CantanteFamoso> ListaCantantes){
        ListaCantantes.sort(compararCantante);
    }
    public void mostrarCantante(ArrayList <CantanteFamoso> ListaCantantes){
        ordenarCantante(ListaCantantes);
        System.out.println("Lista de Cantantes Famosos:");
        int i=1;
        for (CantanteFamoso cantante: ListaCantantes) {
            System.out.println(i+" "+cantante);
            i++;
        }
    }
    public void buscarCantante(ArrayList <CantanteFamoso> ListaCantantes){
        boolean find=false;
        Iterator <CantanteFamoso> it = ListaCantantes.iterator();
        System.out.print("Ingrese el Nombre del Cantante a buscar: ");
        String cnombre=sc.next().toUpperCase();
        while (it.hasNext()){
            CantanteFamoso cf=it.next();
            if (cf.getNombre().equalsIgnoreCase(cnombre)) {
                    find=true;
                    System.out.println(cf.toString());
                    break;
            }
        }
        if (find==false) {
            System.out.println("No se encontró al Cantante "+cnombre+" en la lista!!!");
        }
    }
    public void eliminarCantante(ArrayList <CantanteFamoso> ListaCantantes){
        boolean find=false;
        Iterator <CantanteFamoso> it = ListaCantantes.iterator();
        System.out.print("Ingrese el Nombre del Cantante a borrar: ");
        String cnombre=sc.next().toUpperCase();
        while (it.hasNext()){
            CantanteFamoso cf=it.next();
            if (cf.getNombre().equalsIgnoreCase(cnombre)) {
                System.out.print("Esta seguro que desea eliminar a "+cnombre+" de la lista? (S/N): ");
                String salir=String.valueOf(sc.next().toUpperCase().charAt(0));
                salir=validarOpcion(salir);
                if (salir.equalsIgnoreCase("S")) {
                    ListaCantantes.remove(cf);
                    find=true;
                    break;
                }else {
                    find=true;
                    break;
                }
            }
        }
        if (find==false) {
            System.out.println("No se encontró al Cantante "+cnombre+" en la lista!!!");
        }
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
    public void imprimirMenu(){
        System.out.println("");
        System.out.println("______________ Menu ______________");
        System.out.println("| 1. Cargar Cantante              |");
        System.out.println("| 2. Mostrar Cantantes            |");
        System.out.println("| 3. Buscar Cantante              |");
        System.out.println("| 4. Eliminar Cantante            |");
        System.out.println("| 5. Salir                        |");
        System.out.println("|_________________________________|");
        System.out.print("Ingrese la opcion: ");
    }
    public char validarMenu(char opc){
        char retorno=' ';
        do {            
            if (opc=='1'||opc=='2'||opc=='3'||opc=='4'||opc=='5') {
            retorno=opc;
            } else {
                System.out.print("Ingrese nuevamente la opción: ");
                opc=sc.next().charAt(0);
            }
        } while (retorno==' ');
        return retorno;
    } 
    public void ejecutarMenu(char opc, ArrayList <CantanteFamoso> ListaCantantes){
        switch (opc){
            case '1': 
                cargarCantante(ListaCantantes,1);
                break;
            case '2':
                mostrarCantante(ListaCantantes);
                break;
            case '3':
                buscarCantante(ListaCantantes);
                break;
            case '4':
                eliminarCantante(ListaCantantes);
                break;
            case '5':
                System.out.print("Saliendo del Sistema. \nPresione intro para salir");
                sc.next();
                break;
        }
    }
}
