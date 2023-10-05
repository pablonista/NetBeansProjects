package ar.com.nst.domain;
/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @NotEmpty//(message = "El Nombre no puede estar en Blanco!!!")
    private String nombre;
     @NotEmpty//(message = "El Apellido no puede estar en Blanco!!!")
    private String apellido;
      @NotEmpty//(message = "El Correo Electrónico no puede estar en Blanco!!!")
      @Email//(message = "No se reconoce el formato de E-Mail: aaaa@aaa.com")
    private String email;
    private String telefono;
    @NotNull
    private Double saldo;
}
