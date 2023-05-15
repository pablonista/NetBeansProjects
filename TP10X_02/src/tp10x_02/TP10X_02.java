/*
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios.
 */
package tp10x_02;

import Entidad.CantanteFamoso;
import Servicios.CantanteFamosoService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TP10X_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in).useDelimiter("\n");
        CantanteFamosoService cs=new CantanteFamosoService();
        ArrayList <CantanteFamoso> ListaCantantes=new ArrayList();
        cs.cargarCantante(ListaCantantes, 5);
        cs.mostrarCantante(ListaCantantes);
        cs.ordenarCantante(ListaCantantes);
        //cs.eliminarCantante(ListaCantantes);
        //cs.mostrarCantante(ListaCantantes);
        char opc=' ';
        do {            
            cs.imprimirMenu();
            opc=sc.next().charAt(0);
            opc=cs.validarMenu(opc);
            cs.ejecutarMenu(opc, ListaCantantes);
        } while (opc!='5');       
    }
    
}
