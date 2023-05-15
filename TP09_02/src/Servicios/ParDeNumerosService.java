/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.

 */
package Servicios;

import Entidad.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ParDeNumerosService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public ParDeNumeros crearParesNumericos(){
        ParDeNumeros pn=new ParDeNumeros();
        System.out.print("Ingrese el Primer Número:");
        pn.setNum1(sc.nextDouble());
        System.out.print("Ingrese el Segundo Número:");
        pn.setNum2(sc.nextDouble());
        return pn;   
    }
    //A
    public void mostrarValores(ParDeNumeros pn){
        System.out.println("Número 1: "+pn.getNum1());
        System.out.println("Número 2: "+pn.getNum2());
    }
    //B
    public double devolverMayor(ParDeNumeros pn){
        double mayor;
        if (pn.getNum1()>=pn.getNum2()) {
            mayor=pn.getNum1();
        } else {
            mayor=pn.getNum2();
        }
        return mayor;
    }
    public double devolverMenor(ParDeNumeros pn){
        double menor;
        if (pn.getNum1()<=pn.getNum2()) {
            menor=pn.getNum1();
        } else {
            menor=pn.getNum2();
        }
        return menor;
    }
    //C
    public void calcularPotencia (ParDeNumeros pn){
        int mayor=(int)devolverMayor(pn);
        int menor=(int)devolverMenor(pn);
        int resultado=(int) Math.pow(mayor, menor);
        System.out.println(mayor+" ^ "+menor+" = "+resultado);
    }
    //D
    public void calculaRaiz(ParDeNumeros pn){
       double raiz=Math.sqrt(Math.abs(devolverMenor(pn)));
        System.out.println("√"+devolverMenor(pn)+" = "+raiz);
    }
}
