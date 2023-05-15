/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlproductos;

import Entidad.Producto;
import Servicios.ProductoService;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class ControlProductos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ProductoService ps=new ProductoService();
       HashMap <String, Producto> productos = new HashMap();
       ps.cargarProducto(productos);
       ps.mostrarProducto(productos);
       ps.modificarProducto(productos);
       ps.mostrarProducto(productos);
       ps.eliminarProducto(productos);
       ps.mostrarProducto(productos);
       ps.ordenarProducto(productos);
    }
    
}
