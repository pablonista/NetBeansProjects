/*
• Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
palabra en un índice del vector. Y también, guarda en cantidad de jugadas máximas,
el valor que ingresó el usuario y encontradas en 0.
• Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
• Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
• Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
• Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
• Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AhorcadoService {
    public Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public Ahorcado crearJuego(){
         System.out.print("Ingrese la palabra a encontar:");
         String Palabra=sc.nextLine();
         char [] VectorPalabra=new char [Palabra.length()];
         boolean [] VectorBooleano=new boolean[Palabra.length()];
         for (int i = 0; i < Palabra.length(); i++) {
             VectorPalabra[i]=Palabra.charAt(i);
             VectorBooleano[i]=false;
         }
         int CountFindLetter=0;
         System.out.print("Ingrese la cantidad de intentos:");
         int CantPlayMax=sc.nextInt();
         return new Ahorcado(VectorPalabra,CountFindLetter,CantPlayMax,VectorBooleano);
     }
    public int longitud(Ahorcado A){
        return A.getPalabra().length;
    }
    public boolean buscar(char L, Ahorcado A){
        char [] vector=new char[longitud(A)];
        boolean []vectorBooleano=new boolean [longitud(A)];
        boolean retorno;
        vector=A.getPalabra();
        vectorBooleano=A.getFindLetter();
        int count=A.getCountFindLetter();
        int countFind=0;
        for (int i = 0; i < A.getPalabra().length; i++) {
            if ( L == vector[i]) {
                count++;
                countFind++;
                A.setCountFindLetter(count);
                vectorBooleano[i]=true;
            }
        }
        if (count>0) {
            mostrarVector(A);
            System.out.println("La letra "+L+" se encontró "+countFind);
            A.setFindLetter(vectorBooleano);
            retorno= true;
        }else {
            System.out.println("No se encontro la letra ("+L+")...");
            retorno= false;
        }
        return retorno;
    }
    public boolean encontradas(char L,Ahorcado A){
        boolean retorno;
        if (buscar(L,A)==true) {
            retorno=true;
        } else {
            retorno=false;
        }
        return retorno;
    }
    public void intentos(Ahorcado A){
        System.out.print("Ingrese la letra buscar: ");
        char L=sc.next().charAt(0);
        if (encontradas(L,A)==false) {
            int intento=A.getCantPlayMax()-1;
            A.setCantPlayMax(intento);   
        }
        if (A.getCantPlayMax()==0) {
                System.out.println("Te quedaste sin intentos...");
                System.out.println("La palabra era; "+Arrays.toString(A.getPalabra()));
            }else {
                System.out.println("Cantidad de Intentos disponibles: "+A.getCantPlayMax());
        }
        if(A.getCountFindLetter()==A.getPalabra().length){
            System.out.println("ENHORABUENA encontraste la palabra!!!!");
        }
    }
    public void mostrarVector(Ahorcado A){
        char[] vectResultado=new char [A.getPalabra().length];
        for (int i = 0; i < vectResultado.length; i++) {
            if (A.getFindLetter()[i]==true) {
                vectResultado[i]=A.getPalabra()[i];
            } else {
                vectResultado[i]='-';
            }
        }
        System.out.println(Arrays.toString(vectResultado));
    }
    public void juego(){
        Ahorcado A = crearJuego();
        while (A.getCantPlayMax()>0&&A.getCountFindLetter()<A.getPalabra().length) {            
            intentos(A);
        }
    }
}
