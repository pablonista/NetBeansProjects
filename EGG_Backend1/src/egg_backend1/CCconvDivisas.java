/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class CCconvDivisas {
    public static void main(String[] args) {
        double moneyOrg; 
        String moneyConv;
        int opc=0;
        Scanner sc=new Scanner(System.in);
        ClearScreen();
        System.out.println("Sistema convertidor de Divisas");
        System.out.println("");
        System.out.print("Ingrese la cifra en Euro a convertir: ");
        moneyOrg=sc.nextDouble();
        moneyOrg=validarNum(moneyOrg);
        do {            
            ClearScreen();
            imprimirPantalla();
            opc=sc.nextInt();
            if (opc!=4) {
                moneyConv=convertirDivisas(moneyOrg,opc);
                System.out.println("Euros ingresados: "+moneyOrg+moneyConv);
                presioneUnaTecla();
            } else {
                break;
            }
        } while (opc!=4);
        sc.close();
    }
    public static String convertirDivisas(double money1,int tipo) {
        String conversion="";
        switch (tipo){
            case 1:
                conversion=" equivalen a libras $: "+String.valueOf(money1*0.86);
                break;
            case 2:
                conversion=" equivalen a Dolares $: "+String.valueOf(money1*1.28611);
                break;
            case 3:
                conversion=" equivalen a Yenes $: "+String.valueOf(money1*129.852);
                break;
        }
        return conversion;
    }
    public static void imprimirPantalla(){
        System.out.println("");
        System.out.println(" ____ Convertir a ____");
        System.out.println("| 1. Libra           |");
        System.out.println("| 2. Dolar           |");
        System.out.println("| 3. Yen             |");
        System.out.println("| 4. Salir           |");
        System.out.println("| Elija opcion:      |");
        System.out.println("|____________________|");
    }
    public static double validarNum(double num)  {
        double retorno = 0;
        Scanner sc=new Scanner (System.in);
        do {            
            if (num>=0) {
                retorno=num;
            } else {
                if (num<=0) {
                    ClearScreen();
                    System.out.println("No puede ser negativo.");
                    System.out.print("Ingrese nuevamente el monto a convertir: ");
                    num=sc.nextInt();
                    retorno=num;
                }
            }
        } while (retorno<0);
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