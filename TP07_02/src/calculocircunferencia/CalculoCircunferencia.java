/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculocircunferencia;
import entidad.Circunferencia;
/**
 *
 * @author HP
 */
public class CalculoCircunferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circunferencia Circ1=new Circunferencia(4.5);
        System.out.println("La circunferencia tiene un radio: "+Circ1.getRadio());
        System.out.println("El área del circulo es: "+Circ1.area());
        System.out.println("El Perimetro de la circunferencia: "+Circ1.perimetro());
    }
    
}
