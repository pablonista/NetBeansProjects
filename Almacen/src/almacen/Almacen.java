/*
 Crear una clase llamada Producto que contenga los siguientes atributos: nombre, código, stock y precio. A continuación crear los siguientes métodos:
- Método constructor vacío y constructor con todos los atributos pasados por parámetro
- Método get y set para cada atributo
- Método crearProducto(): pide los datos al usuario y lo guarda en los diferentes atributos
- Método venderProducto(): pide al usuario que ingrese una cantidad del producto y lo mismo se debe restar del  	atributo stock
- Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo
- Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
 */
package almacen;

import Entidad.Producto;

/**
 *
 * @author HP
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto prod=new Producto();
        prod.crearProducto();
        System.out.println("Despues de Crear");
        prod.mostrarProducto();
        prod.venderProducto();
        System.out.println("Despues de Vender");
        prod.mostrarProducto();
        prod.cambiarPrecio();
        System.out.println("Despues de Cambiar Precio");
        prod.mostrarProducto();
    }
    
}
