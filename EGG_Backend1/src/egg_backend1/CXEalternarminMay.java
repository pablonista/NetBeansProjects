/*
 5.Crea un programa que pida el nombre al usuario y lo escriba alternando 
mayúsculas y minúsculas
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CXEalternarminMay {
    public static void main(String[] args) {
        String nombre;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese su nombre: ");
        nombre=sc.nextLine();
        System.out.println("Su nombre en minusculas y Mayusculas: "+invertirminMay(nombre));
    }
    public static String invertirminMay(String n){
        String retorno="",letra="";
        for (int i = 1; i <= n.length(); i++) {
            if (i%2==0) {
                letra=String.valueOf(n.charAt(i-1));
                retorno=retorno+letra.toUpperCase();
            } else {
                letra=String.valueOf(n.charAt(i-1));
                retorno=retorno+letra.toLowerCase();
            }
        }
        return retorno;
    }
}
