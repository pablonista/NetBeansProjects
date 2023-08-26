/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class LibroService {
    private LibroDAO DAO;
    
    public LibroService(){
        this.DAO= new LibroDAO();
    }
    public Libro crearLibro(String titulo,Integer anio,Integer ejemplares,Autor autor,Editorial editorial){
        Libro libro =new Libro();
        try{
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(0);
            libro.setEjemplaresRestantes(ejemplares);
            libro.setAlta(Boolean.TRUE);
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            DAO.guardar(libro);
            return libro;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }   
    }
    
    public boolean editarLibro(Libro Libro){
       try{
           DAO.editarLibro(Libro);
           return true;
       }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
       }    
   }
    
    public Libro buscarLibroporIsbn(Long isbn){
        try{
            return DAO.buscarPorId(isbn);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }    
    }
    
    public Libro buscarLibroporTitulo(String titulo){
        try{
            return DAO.buscarPorTitulo(titulo);
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }    
    }
    
    public boolean eliminarLibro(Long isbn){
        try{
            DAO.eliminarLogico(isbn);
            return true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    public List<Libro> listarLibrosAltas(){
        try{
            return DAO.listarTodosAltas();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
    public List<Libro> listarLibrosBajas(){
        try{
            return DAO.listarTodosBajas();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
    
    public List<Libro> listarLibros(){
        try{
            return DAO.listarTodos();
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
       }
    }
}
