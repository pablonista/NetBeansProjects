/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class ProductoService {
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }
    
    public void CrearProducto(Integer codigo, String nombre, Double precio, Integer codigoFabricante) throws Exception{
        try {
            if (codigo==0 || codigo==null || codigo<0){
                throw new Exception("Debe indicar el Código del Producto.");
            }
            if (nombre==null || nombre.trim().isEmpty() ){
                 throw new Exception("Debe indicar el Nombre del Producto.");
            }
            if (precio==0 || precio==null || precio<0){
                throw new Exception("Debe indicar el Precio del Producto.");
            }
            if (codigoFabricante==0 || codigoFabricante==null || codigoFabricante<0){
                throw new Exception("Debe indicar el Código del Fabricante.");
            }
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigoFabricante);
            dao.guardarProducto(producto);
        }catch (Exception e) {
            throw e;
        }
    }
    
}
