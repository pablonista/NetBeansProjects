package ar.com.nst.dao;

import ar.com.nst.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

}
