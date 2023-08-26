/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class AutorDAO extends DAO<Autor>{

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor); 
    }
    public void editarAutor(Integer id,String nombre)throws Exception{
        Autor autor=buscarPorId(id);
        autor.setNombre(nombre);
        super.editar(autor);
    }
    public void eliminarFisico(Integer id)throws Exception {
        Autor autor= buscarPorId(id);
        super.eliminarFisico(autor); 
    }
    
    public void eliminarLogico(Integer id)throws Exception {
        Autor autor= buscarPorId(id);
        autor.setAlta(false);
        super.eliminarLogico(autor); 
    }
    
    public List<Autor> listarTodos() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a ORDER BY a.nombre")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public List<Autor> listarTodosAltas() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta = true ORDER BY a.nombre ASC")
                .getResultList();
        desconectar();
        return autores;
    }
    
    public List<Autor> listarTodosBajas() {
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.alta= false ORDER BY a.nombre")
                .getResultList();
        desconectar();
        return autores;
    }

    public Autor buscarPorId(Integer id) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return autor;
    }
    
    public Autor buscarPorNombre(String nombre) {
        conectar();
        Autor autor = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return autor;
    }
}
