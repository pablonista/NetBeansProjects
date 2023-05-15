/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculador;

import entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Calculador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int n=10;
        //Operacion[] oper = new Operacion[n];//definiendo un array de Operacion
        /*
        *for(int i=0; i<n; i++){ 
        *    Operacion operacion = new Operacion();
        *    operacion.crearOperacion();
        *    operacion[i] = operacion;
        *}
        */
        String resp="";
        Scanner sc=new Scanner(System.in);
        Operacion oper=new Operacion();
        do {            
            oper.crearOperacion();
            System.out.println("La suma de "+oper.getNumero1()+" + "+oper.getNumero2()+" = "+oper.sumar());
            System.out.println("La resta de "+oper.getNumero1()+" - "+oper.getNumero2()+" = "+oper.restar());
            System.out.println("La multiplicación de "+oper.getNumero1()+" * "+oper.getNumero2()+" = "+oper.multiplicar());
            System.out.println("La división de "+oper.getNumero1()+" / "+oper.getNumero2()+" = "+oper.dividir());
            System.out.print("Desea realizar la carga de otros números: ");
            resp=sc.nextLine();
            resp=String.valueOf(resp.charAt(0));
        } while (!resp.equalsIgnoreCase("n"));        
    }
}
