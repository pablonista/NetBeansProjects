/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIFServicios;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NIFService {
    private Scanner sc=new Scanner (System.in).useDelimiter("\n");
    
    public NIF crearDNI (){
        System.out.print("Ingrese el DNI: ");
        long dni=sc.nextLong();
        return new NIF(dni);
    }
    public void mostrar(NIF nif){
        System.out.println("DNI: "+nif.getDNI());
        System.out.println("Letra: "+nif.getLetra());
    }        
    
}
