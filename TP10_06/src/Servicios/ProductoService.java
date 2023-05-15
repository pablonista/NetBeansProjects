/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. 
 */
package Servicios;

import Entidad.Producto;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author HP
 */
public class ProductoService {
    private Scanner sc=new Scanner (System.in).useDelimiter("\n");
    
    private Producto crearProducto(){
        System.out.print("Ingrese el Nombre del Producto: ");
        String nombre=sc.next().toUpperCase();
        System.out.print("Ingrese el Precio del Producto: ");
        double precio=sc.nextDouble();
        return new Producto(nombre,precio);
    }
    public void cargarProducto(HashMap <String, Producto> productos){
        String salir="N";
        do {            
            Producto prod=crearProducto();
            productos.put(prod.getNombre(), prod);
            System.out.print("Desea continuar cargando Productos? (S/N): ");
            salir=String.valueOf(sc.next().toUpperCase().charAt(0));
            salir=validarOpcion(salir);
        } while (salir.equalsIgnoreCase("S"));
    }
    public void modificarProducto(HashMap <String, Producto> productos){
        System.out.print("Ingrese el producto a modificar el precio: ");
        String nameProducto =sc.next().toUpperCase();
        if (productos.containsKey(nameProducto)==true) {
            Producto producto = productos.get(nameProducto);
            System.out.print("Ingrese el nuevo precio del producto: ");
            double precio=sc.nextDouble();
            producto.setPrecio(precio);
        }else {
            System.out.println("No se encontró el producto ingresado.");
        }
    }
    public void eliminarProducto(HashMap <String, Producto> productos){
        System.out.print("Ingrese el producto a eliminar: ");
        String nameProducto =sc.next().toUpperCase();
        if (productos.containsKey(nameProducto)==true) {
            productos.remove(nameProducto);
        }else {
            System.out.println("No se encontró el producto ingresado.");
        }
    }
    public void ordenarProducto(HashMap <String, Producto> productos){
        TreeMap<String, Producto> treeProductos = new TreeMap<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2); // Ordenar por clave en orden ascendente
            }
        });
        
        // Agregar todos los elementos del HashMap al TreeMap
        treeProductos.putAll(productos);
        
        // Imprimir el TreeMap ordenado
        mostrarProductoOrdenado(treeProductos);
    }

    private void mostrarProductoOrdenado(TreeMap <String, Producto> TreeProductos){
        System.out.println("Lista de productos ordenado:");
        for (String nombreProducto : TreeProductos.keySet()) {
            Producto producto = TreeProductos.get(nombreProducto);
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
        }
    }
    public void mostrarProducto(HashMap <String, Producto> productos){
        System.out.println("Lista de productos:");
        for (String nombreProducto : productos.keySet()) {
            Producto producto = productos.get(nombreProducto);
            System.out.println(producto.getNombre() + ": $" + producto.getPrecio());
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
