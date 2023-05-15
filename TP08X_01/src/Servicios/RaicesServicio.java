/*
Luego, en RaicesServicio las operaciones que se podrán realizar 
son las siguientes:
a) Método getDiscriminante(): devuelve el valor del discriminante
(double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
b) Método tieneRaices(): devuelve un booleano indicando si tiene dos
soluciones, para que esto ocurra, el discriminante debe ser mayor o
igual que 0.
c) Método tieneRaiz(): devuelve un booleano indicando si tiene una
única solución, para que esto ocurra, el discriminante debe ser igual
que 0.
d) Método obtenerRaices(): llama a tieneRaíces() y si devolvió́true,
imprime las 2 posibles soluciones.
e) Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́true imprime
una única raíz. Es en el caso en que se tenga una única solución
posible.
f) Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
y mostrará por pantalla las posibles soluciones que tiene nuestra
ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo
que devuelvan nuestros métodos y en caso de no existir solución, se
mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía
el signo delante de -b
 */
package Servicios;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class RaicesServicio {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Raices crearRaices(){
        System.out.print("Ingrese el valor de a:");
        int a=sc.nextInt();
        System.out.print("Ingrese el valor de b:");
        int b=sc.nextInt();
        System.out.print("Ingrese el valor de c:");
        int c=sc.nextInt();
        return new Raices(a,b,c);
    }
    //Punto a
    public double getDiscriminante(Raices r){
        return Math.pow(r.getB(), 2)-4*r.getA()*r.getC();
    }
    //Punto b
    public boolean tieneRaices(Raices r){
        boolean retorno;
        retorno = getDiscriminante(r)>0;
        return retorno;
    }
    //Punto c
    public boolean tieneRaiz(Raices r){
        boolean retorno;
        retorno = getDiscriminante(r)==0;
        return retorno;
    }
    //Punto d
    public void obtenerRaices(Raices r){
        double raiz1,raiz2;
        if (tieneRaices(r)==true) {
            raiz1=(-r.getB()+Math.sqrt(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/(2*r.getA());
            raiz2=(-r.getB()-Math.sqrt(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/(2*r.getA());
            System.out.printf("La raiz 1: %.2f",raiz1);
            System.out.println("");
            System.out.printf("La raiz 2: %.2f",raiz2);
            System.out.println("");
        }else {
            System.out.println("No tiene 2 raices");
        }
    }
    //Punto e
    public void obtenerRaiz(Raices r){
        double raiz;
        if (tieneRaiz(r)==true) {
            raiz=(-r.getB()+Math.sqrt(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/(2*r.getA());
            System.out.printf("La raiz: %.2f",raiz);
            System.out.println("");
        }else{
            System.out.println("No tiene raiz.");
        }
    }
    //Punto f
   public void calcular(Raices r){
       obtenerRaices(r);
       obtenerRaiz(r);
   } 
}
