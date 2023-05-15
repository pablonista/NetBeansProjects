/*
 3. Diseñar un procedimiento que permita convertir coordenadas polares (radio, 
ángulo) en cartesianas (x,y). NOTA: x=radio*cos(ángulo) e y=radio*sen(ángulo).
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CXCconvPolares {
    public static void main(String[] args) {
        double radio, angulo;
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese el radio: ");
        radio=sc.nextDouble();
        System.out.print("Ingrese el angulo en sexagesimal: ");
        angulo=sc.nextDouble();
        convPolaresCartesianas(radio,angulo);
    }
    public static void convPolaresCartesianas(double r, double a){
        double x,y;
        double aRad=a*Math.PI/180;
        x=r*Math.cos(aRad);
        y=r*Math.sin(aRad);
        System.out.println("La coordenada polar ingresada:");
        System.out.println("Radio: "+r);
        System.out.println("Angulo: "+a);
        System.out.println("La coordena cartesiana x= "+x);
        System.out.println("La coordena cartesiana y= "+y);
    }
}
