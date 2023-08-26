/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class LibroDAO extends DAO<Libro>{
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro); 
    }

    public void editarLibro(Libro libro)throws Exception{
        super.editar(libro);
    }
    
    public void eliminarFisico(Long isbn)throws Exception {
        Libro libro= buscarPorId(isbn);
        super.eliminarFisico(libro); 
    }
    
    public void eliminarLogico(Long isbn)throws Exception {
        Libro libro= buscarPorId(isbn);
        libro.setAlta(false);
        super.eliminarLogico(libro); 
    }
    
    public List<Libro> listarTodos() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l ORDER BY l.titulo")
                .getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> listarTodosAltas() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = true ORDER BY l.titulo")
                .getResultList();
        desconectar();
        return libros;
    }
    
    public List<Libro> listarTodosBajas() {
        conectar();
        List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.alta = false ORDER BY l.titulo")
                .getResultList();
        desconectar();
        return libros;
    }

    public Libro buscarPorId(Long isbn) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn")
                .setParameter("isbn", isbn).getSingleResult();
        desconectar();
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo) {
        conectar();
        Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                .setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
    }
}
    

