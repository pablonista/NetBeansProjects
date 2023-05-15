/*
 4. Crea un programa que pida el nombre al usuario y lo escriba al revés 
(de la última letra a la primera).
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CXDinvertirNombre {
    public static void main(String[] args) {
        String nombre;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el nombre a invertir: ");
        nombre=sc.nextLine().toUpperCase();
        System.out.println("El nombre invertido: "+invertirNombre(nombre));
    }
    public static String invertirNombre(String n){
        String retorno="";
        for (int i = n.length()-1; i>=0; i--) {
            retorno=retorno+String.valueOf(n.charAt(i));
        }
        return retorno;
    }
}
