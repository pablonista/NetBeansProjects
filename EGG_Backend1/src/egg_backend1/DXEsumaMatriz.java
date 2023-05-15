/*
 5. Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.

 */
package egg_backend1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class DXEsumaMatriz {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Ingrese la cantidad de Filas: ");
        int n=sc.nextInt();
        n=validarN(n);
        System.out.print("Ingrese la cantidad de Columnas: ");
        int m=sc.nextInt();
        m=validarN(m);
        int[][]matriz=new int[n][m];
        cargarMatriz(matriz,n,m);
        System.out.println("\nLa matriz cargada:\n");
        mostrarMatriz(matriz,n,m);
        System.out.println("La suma de todos los valores de la matriz es "+sumarValores(matriz,n,m));
    }
    public static int sumarValores(int[][]mat,int f, int c){
        int retorno=0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                retorno+=mat[i][j];
            }
        }
        return retorno;
    }
    public static void mostrarMatriz(int[][]mat,int f,int c){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void cargarMatriz(int[][]mat,int f,int c){
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j]=(int)(Math.random()*(f*c));
            }
            
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
