/*
 *1. Implementar una función que permita obtener un número entero aleatorio 
comprendido entre dos límites que introduciremos por teclado. El número obtenido 
se debe mostrar por pantalla.
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CXAintervalo {
    public static void main(String[] args) {
        int min,max;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el número minimo del intervalo: ");
        min=sc.nextInt();
        System.out.print("Ingrese el número máximo del intervalo: ");
        max=sc.nextInt();
        System.out.println("El número dentro del intervalo determinado: "+calcularIntervalo(min,max));
        sc.close();
    }
    public static int calcularIntervalo(int x,int y) {
        return (int)(Math.random()*(y-x+1)+x);//formula para utilizar los numeros comprendidos entre x e y
    }
    
}
