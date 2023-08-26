/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.EditorialDAO;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class EditorialService {
    private final EditorialDAO DAO;
    
    public EditorialService (){
        this.DAO = new EditorialDAO();
    }
    
    public Editorial crearEditorial (String nombre){
        Editorial editorial=new Editorial();
        try{
            editorial.setNombre(nombre);
            editorial.setAlta(Boolean.TRUE);
            DAO.guardar(editorial);
            return editorial;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }   
    }
    public boolean editarEditorial(Integer Id, String nombre){
       try{
           DAO.editarEditorial(Id, nombre);
           return true;
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
       }    
   }
    
    public Editorial buscarEditorialporId(Integer id){
        try{
            return DAO.buscarPorId(id);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
    
    public Editorial buscarEditorialporNombre(String nombre){
        try{
            return DAO.buscarPorTitulo(nombre);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
    public boolean eliminarEditorial(Integer id){
        try{
            DAO.eliminarLogico(id);
            return true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public List<Editorial> listarEditorialAltas(){
        try{
            return DAO.listarTodosAltas();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
    
    public List<Editorial> listarEditorialBajas(){
        try{
            return DAO.listarTodosBajas();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
    
    public List<Editorial> listarEditorial(){
        try{
            return DAO.listarTodos();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
}
