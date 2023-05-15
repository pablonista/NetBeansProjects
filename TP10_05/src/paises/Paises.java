/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paises;

import Entidad.Pais;
import Servicios.PaisService;
import java.util.HashSet;

/**
 *
 * @author HP
 */
public class Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet <Pais> paises = new HashSet();
        PaisService ps=new PaisService();
        ps.cargarPais(paises);
        System.out.println("Se muestran los Paises Cargados: ");
        ps.mostrarPaises(paises);
        System.out.println("Se muestran los Paises Cargados ordenados: ");
        ps.mostrarOrdenaPaises(paises);
        ps.eliminarPais(paises);
        System.out.println("Se muestran los Paises Cargados despues de la eliminación: ");
        ps.mostrarOrdenaPaises(paises);
    }
    
}
