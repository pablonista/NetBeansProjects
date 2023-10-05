package ar.com.nst.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;
import lombok.Data;

/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
@Entity
@Data
@Table(name="rol")
public class Rol implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;
    
    @NotEmpty
    private String nombre;
}
