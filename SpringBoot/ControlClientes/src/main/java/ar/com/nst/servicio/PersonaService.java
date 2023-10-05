package ar.com.nst.servicio;
/**
 *@author: Pablo Alejandro Nista Casanova
 *@E-mail: pablonista@gmail.com
 *@Phone: +54 9 381 5235454
 **/
import ar.com.nst.domain.Persona;
import java.util.List;

public interface PersonaService {
    
    public List<Persona> listarPersonas();

    public void guardar(Persona persona);
    
    public void eliminar (Persona persona);

    public Persona encontrarPersona(Persona persona);

}
