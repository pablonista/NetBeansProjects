/*
 2. Implementar una función que permita obtener el valor absoluto de un número 
positivo y otra que obtenga la raíz cuadrada. Para ello utilice los métodos 
abs() y sqrt() de la clase Math.
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CXBabsSqr {
    public static void main(String[] args) {
        double num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num=sc.nextDouble();
        System.out.println("El número ingresado: "+num);
        System.out.println("El valor absoluto es: "+calcularAbsoluto(num));
        if (num<0) {
            System.out.println("No se puede sacar la raiz cuadrada de un número negativo.");
            System.out.println("Pero si aplicamos el valor absoluto del numero puedo calcular su raiz: "+calcularRaiz(calcularAbsoluto(num)));
        } else {
            System.out.println("La raiz es: "+calcularRaiz(num));
        }
    }
    public static double calcularAbsoluto(double x){
        return Math.abs(x);
    }
    public static double calcularRaiz(double x){
        return Math.sqrt(x);
    }
}
