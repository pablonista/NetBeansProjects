/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CodPostal;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CodPostalService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public CodPostal crearCodPostal(){
        System.out.print("Ingrese el Código Postal: ");
        int codigo=sc.nextInt();
        System.out.print("Ingrese el Nombre de la Ciudad: ");
        String ciudad=sc.next().toUpperCase();
        return new CodPostal(codigo,ciudad);
    }
    public void cargarCodPostal(HashMap <Integer, CodPostal> codPostales){
        String salir="N";
        do {            
            CodPostal cp=crearCodPostal();
            codPostales.put(cp.getCodigo(), cp);
            System.out.print("Desea continuar cargando Códigos Postales? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
    }
    public void mostrarCodPostal(HashMap <Integer, CodPostal> codPostales){
        System.out.println("Listado de Códigos Postales cargados: ");
        for (Integer codigo : codPostales.keySet()) {
            CodPostal codpostal=codPostales.get(codigo);
            System.out.println("Código Postal: "+codpostal.getCodigo() + " Ciudad " + codpostal.getCiudad());
        }
    }
    public void buscarCodPostal(HashMap <Integer, CodPostal> codPostales){
        System.out.print("Ingrese el Código Postal a buscar: ");
        int buscarCodigo=sc.nextInt();
        if (codPostales.containsKey(buscarCodigo)==true){
            CodPostal codpostal=codPostales.get(buscarCodigo);
            System.out.println("Código Postal: "+codpostal.getCodigo() + " Ciudad " + codpostal.getCiudad());
        }else {
            System.out.println("Código Postal no encontrado.");
        }
    }
     public void eliminarCodPostal(HashMap <Integer, CodPostal> codPostales){
        System.out.print("Ingrese el Código Postal a eliminar: ");
        int buscarCodigo=sc.nextInt();
        if (codPostales.containsKey(buscarCodigo)==true){
            codPostales.remove(buscarCodigo);
        }else {
            System.out.println("Código Postal no encontrado.");
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
}
