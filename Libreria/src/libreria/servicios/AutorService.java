/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class AutorService {
   private final AutorDAO DAO;
   
   public AutorService (){
       this.DAO = new AutorDAO();
   }
   public Autor crearAutor(String nombre){
       Autor autor=new Autor();
       try{
           autor.setNombre(nombre);
           autor.setAlta(true);
           DAO.guardar(autor);
           return autor;
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }    
   }
   public boolean editarAutor(Integer Id, String nombre){
       try{
           DAO.editarAutor(Id, nombre);
           return true;
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
       }    
   }
   public Autor buscarAutorporId(Integer id){
       try{
           return DAO.buscarPorId(id);  
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
   }
   public Autor buscarAutorporNombre(String nombre){
       try{
           return DAO.buscarPorNombre(nombre);  
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
   }
   public boolean eliminarAutor(Integer id){
       try{
           DAO.eliminarLogico(id);
           return true;
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
       }
   }
   public List<Autor> listarAutoresAltas(){
       try{
           return DAO.listarTodosAltas();
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
   }
   
   public List<Autor> listarAutoresBajas(){
       try{
           return DAO.listarTodosBajas();
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
   }
   
   public List<Autor> listarAutores(){
       try{
           return DAO.listarTodos();
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
   }
}
