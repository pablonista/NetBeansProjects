/*
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada.

 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CafeteraServicio {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    //Punto A
    public Cafetera llenarCafetera(){
        boolean realizado=false;
        int cantCoffe=0;
        do {            
            System.out.print("Ingrese la Capacidad Máxima de Café de la cafetera: ");
            cantCoffe=sc.nextInt();
            if (cantCoffe>0) {
               realizado=true;
            } else {
                System.out.println("No puede ser 0 o negativa la Capacidad Máxima de Café.");
                System.out.print("Ingrese nuevamente la Capacidad Máxima de Café: ");
                cantCoffe=sc.nextInt();
                realizado=false;
            }
        } while (realizado==false);
        return new Cafetera(cantCoffe,cantCoffe);
    }
    //Punto B
    public void servirTaza(Cafetera coffe){
        int tamanoTaza=0;
        System.out.print("Ingrese el tamaño de la Taza de Café: ");
        tamanoTaza=sc.nextInt();
        if (coffe.getCantidadActual()>=tamanoTaza) {
            int restoCafe=coffe.getCantidadActual()-tamanoTaza;
            coffe.setCantidadActual(restoCafe);
            System.out.println("Se sirvio la taza completa de café.");
            System.out.println("Quedó en la Cafera "+coffe.getCantidadActual()+" unidades disponibles.");
        } else {
            System.out.println("La taza no se lleno en su totalidad.\nSolo se lleno: "+coffe.getCantidadActual());
            coffe.setCantidadActual(0);
            System.out.println("Quedó en la Cafera "+coffe.getCantidadActual()+" unidades disponibles.");
        }
    }
    //Punto C
     public void vaciarCafetera(Cafetera coffe){
        coffe.setCantidadActual(0);
    }
    //Punto D
     public void agregarCafe(Cafetera coffe){
         int cantCoffe=0;
         boolean realizado=false;
         do {             
            System.out.println("La cafetera tiene disponible: "+coffe.getCantidadActual()+" unidades de café.");
            System.out.println("La cantidad Máxima de la cafetera: "+coffe.getCapacidadMáxima());
            System.out.println("La cantidad maxima a carga no puede exceder las "+(coffe.getCapacidadMáxima()-coffe.getCantidadActual())+" unidades de café.");
            System.out.print("Ingrese la cantidad de unidades de café a cargar: ");
            cantCoffe=sc.nextInt();
             if ((coffe.getCapacidadMáxima()-coffe.getCantidadActual())>=cantCoffe) {
                 int cantAgregada=coffe.getCantidadActual()+cantCoffe;
                 coffe.setCantidadActual(cantAgregada);
                 realizado=true;
             } else {
                 System.out.println("La cantidad ingresada es erronea.");
                 System.out.print("Ingrese nuevamente la cantidad de café a cargar: ");
                 cantCoffe=sc.nextInt();
                 realizado=false;
             }
         } while (realizado==false);         
     }
    //Punto E
    public void mostrarEstado(Cafetera coffe){
        System.out.println("La unidades de Café disponible: "+coffe.getCantidadActual());
        System.out.println("La Capacidad Maxima Disponible: "+coffe.getCapacidadMáxima());
    } 
}
