/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;

import java.util.Scanner;
//import java.lang.InterruptedException;

/**
 *
 * @author HP
 */
public class CAoperaMatematicas {
    public static void main(String[] args) {
    double num1,num2;
    int opc=0;
    double resultado=0;
    String tecla;
    Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        num1=sc.nextDouble();
        System.out.print("Ingrese otro número: ");
        num2=sc.nextDouble();
        do {            
            ClearScreen();
            imprimirMenu();
            opc=sc.nextInt();
            switch (opc) {
                case 1:
                    resultado=sumar(num1,num2);
                    System.out.println(num1+"+"+num2+"= "+resultado);
                    presioneUnaTecla();
                    /*try {
                        Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                    }*/
                    
                    break;
                case 2:
                    resultado=restar(num1,num2);
                    System.out.println(num1+"-"+num2+"= "+resultado);
                    presioneUnaTecla();
                    break;
                case 3:
                    resultado=multiplicar(num1,num2);
                    System.out.println(num1+"*"+num2+"= "+resultado);
                    presioneUnaTecla();
                    break;
                case 4:
                    if (num2!=0) {
                        resultado=dividir(num1,num2);
                        System.out.println(num1+"/"+num2+"= "+resultado);
                    } else {
                        System.out.println("No se puede realizar la división en 0.");
                    }
                    presioneUnaTecla();
                    break;
                case 5:
                    System.out.println("Saliendo del sistema.");
                    presioneUnaTecla();
                    break;
            }
        } while (opc!=5);
        sc.close();
            
    
    }
    private static double sumar(double a, double b){
        double suma=a+b;
        return suma;
    }
    private static double restar(double a, double b){
        double resta=a-b;
        return resta;
    }
    private static double multiplicar(double a, double b){
        double multiplicacion=a*b;
        return multiplicacion;
    }
    private static double dividir(double a, double b){
        double division=a/b;
        return division;
    }
    public static double validarNum(double num)  {
        double retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>0) {
                retorno=num;
            } else {
                if (num<=0) {
                    ClearScreen();
                    System.out.println("No puede ser Cero o negativo.");
                    System.out.print("Ingrese nuevamente el numero: ");
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
    public static void imprimirMenu(){
        System.out.println("");
        System.out.println(" _______ Menu _______");
        System.out.println("| 1. Sumar           |");
        System.out.println("| 2. Restar          |");
        System.out.println("| 3. Multiplicar     |");
        System.out.println("| 4. Dividir         |");
        System.out.println("| 5. Salir           |");
        System.out.println("| Elija opcion:      |");
        System.out.println("|____________________|");
        
    }
    static public void presioneUnaTecla()
      { 
          String seguir;
          Scanner teclado = new Scanner(System.in);
          System.out.println("Presione una tecla para continuar...");
          try
            {
             seguir = teclado.nextLine();
            }   
         catch(Exception e)
          {}  
     }
}
