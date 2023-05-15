/*
 3. Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package egg_backend1;
import java.util.*;
/**
 *
 * @author HP
 */
public class DXCcargaimpresionVector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n=sc.nextInt();
        n=validarN(n);
        int[]vector=new int [n];
        cargarVector(vector);
        System.out.println("El vector cargado: ");
        mostrarVector(vector);
    }
    public static void mostrarVector(int[]v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("");
    }
    public static void cargarVector(int[]v){
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random()*v.length);
        }
    }
    public static int validarN(int num)  {
        int retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>0) {
                retorno=num;
            } else {
                if (num<=0) {
                    ClearScreen();
                    System.out.println("No puede ser negativo o cero.");
                    System.out.print("Ingrese nuevamente el tamaño del vector: ");
                    num=sc.nextInt();
                    retorno=num;
                }
            }
        } while (retorno<=0);
        return retorno; 
    }
    public static void ClearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("No se pudo limpiar la pantalla: " + e.getMessage());
        }
    }
}
