package ar.com.nst.dao;
/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
import ar.com.nst.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Long>{
    
}
