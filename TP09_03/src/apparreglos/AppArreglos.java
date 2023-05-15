/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
 */
package apparreglos;

import Servicios.ArreglosService;

/**
 *
 * @author HP
 */
public class AppArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double [] ArregloA=new double[50];
        double [] ArregloB=new double[20];
        ArreglosService as=new ArreglosService();
        as.inicializarA(ArregloA);
        as.mostrar(ArregloA);
        as.ordenar(ArregloA);
        as.mostrar(ArregloA);
        as.inicializarB(ArregloA, ArregloB);
        as.mostrar(ArregloB);
    }
    
}
