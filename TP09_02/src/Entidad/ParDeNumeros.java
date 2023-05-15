/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. 
 */
package Entidad;

/**
 *
 * @author HP
 */
public class ParDeNumeros {
    private double Num1;
    private double Num2;

    public ParDeNumeros() {
        this.Num1=(double)(Math.random()*(1000+1000+1))-1000;
        this.Num2=(double)(Math.random()*(1000+1000+1))-1000;
    }

    public double getNum1() {
        return Num1;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public double getNum2() {
        return Num2;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }
    
    
}
