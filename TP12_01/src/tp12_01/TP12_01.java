/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp12_01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class TP12_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaración del objeto Perro
        Animal perro1=new Perro("Stich","Carne",15,"Doberman");
        perro1.Alimentarse();
        
        //Declaración del objeto Perro
        Animal perro2=new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.Alimentarse();
        
        //Declaración del objeto Gato
        Animal gato1=new Gato("Pelusa","Galletas",15,"Siames");
        gato1.Alimentarse();
        
        //Declaración del objeto Caballo
        Animal caballo1=new Caballo("Spark","Pasto",25,"Fino");
        caballo1.Alimentarse();
    }
    
}
