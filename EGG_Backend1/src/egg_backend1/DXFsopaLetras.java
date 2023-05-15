package egg_backend1;

/*
 Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().

 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class DXFsopaLetras {
    public static void main(String[] args) {
        int n=20,np=1;
        String palabra;
        Scanner sc=new Scanner(System.in);
        char[][]matriz=new char[n][n];
        do {            
            System.out.print("Ingrese la palabra "+np+": ");
            palabra=sc.nextLine();
            palabra=validarPalabra(palabra);
            cargarMatriz(matriz,n,palabra.toUpperCase());
            np++;
        } while (np<=5);
        rellenarMatriz(matriz,n);
        ClearScreen();
        mostrarMatriz(matriz,n);
        
    }
    public static void rellenarMatriz(char[][]mat,int tam){
        int campo,radix=10;
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                if (mat[i][j]=='\0') {
                    campo=(int)(Math.random()*10);
                    mat[i][j]=Character.forDigit(campo , radix);;
                }
            }
        }
    }
    public static void mostrarMatriz(char[][]mat,int tam){
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    public static void cargarMatriz(char[][]mat,int tam,String w){
        int i,j;
        boolean asig=false;
        do {            
            i=(int)(Math.random()*tam);
            j=(int)(Math.random()*tam);
            if ((j+w.length()<tam)&&(mat[i][j]=='\0')) {
                for (int k = 0; k < w.length(); k++) {
                    mat[i][j+k]=w.charAt(k);
                }
                asig=true;
            }
            
        } while (asig==false);
        
            
    }
    public static String validarPalabra(String w){
        Scanner sc=new Scanner(System.in);
        String retorno="";
        do {            
            if (w.length()<=5&&w.length()>=3) {
                retorno=w;
            } else {
                ClearScreen();
                System.out.println("Debe ingresar una palabra de 3 a 5 letras.");
                System.out.println("Ingrese nuevamente la palabra: ");
                w=sc.nextLine();
            }
        } while (retorno=="");
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