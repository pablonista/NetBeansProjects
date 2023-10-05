package ar.com.nst.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String password;
    
    @OneToMany
    @JoinColumn(name="id_usuario")
    private List<Rol> roles;

}
