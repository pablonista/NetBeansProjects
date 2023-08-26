/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.persistencia;

import java.util.List;
import libreria.entidades.Editorial;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class EditorialDAO extends DAO<Editorial>{
    
    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial); 
    }
    
    public void editarEditorial(Integer id,String nombre)throws Exception{
        Editorial editorial=buscarPorId(id);
        editorial.setNombre(nombre);
        super.editar(editorial);
    }

    public void eliminarFisico(Integer id)throws Exception {
        Editorial editorial= buscarPorId(id);
        super.eliminarFisico(editorial); 
    }
    
    public void eliminarLogico(Integer id)throws Exception {
        Editorial editorial= buscarPorId(id);
        editorial.setAlta(Boolean.FALSE);
        super.eliminarFisico(editorial); 
    }
    
    public List<Editorial> listarTodos() {
        conectar();
        List<Editorial> editorials = em.createQuery("SELECT e FROM Editorial e ORDER BY e.nombre")
                .getResultList();
        desconectar();
        return editorials;
    }
    
    public List<Editorial> listarTodosAltas() {
        conectar();
        List<Editorial> editorials = em.createQuery("SELECT e FROM Editorial e WHERE e.alta=true ORDER BY e.nombre")
                .getResultList();
        desconectar();
        return editorials;
    }
     
    public List<Editorial> listarTodosBajas() {
        conectar();
        List<Editorial> editorials = em.createQuery("SELECT e FROM Editorial e WHERE e.alta=false ORDER BY e.nombre")
                .getResultList();
        desconectar();
        return editorials;
    } 

    public Editorial buscarPorId(Integer id) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id")
                .setParameter("id", id).getSingleResult();
        desconectar();
        return editorial;
    }
    
    public Editorial buscarPorTitulo(String nombre) {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.nombre LIKE :nombre")
                .setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return editorial;
    }
}
