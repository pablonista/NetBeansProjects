/*
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.
d) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.
e) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.
f) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.
g) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package Servicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CadenaServicio {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    
    public Cadena CrearCadena(){
        Cadena cad1=new Cadena();
        System.out.print("Ingrese la cadena: ");
        cad1.setFrase(sc.nextLine());
        return cad1;
    }
    //A
    public void mostrarVocales(Cadena cad1){
        int contVocales=0;
        for (int i = 0; i < cad1.getLargo(); i++) {
            if ((cad1.getFrase().toUpperCase().charAt(i)=='A')||(cad1.getFrase().toUpperCase().charAt(i)=='E')||(cad1.getFrase().toUpperCase().charAt(i)=='I')||(cad1.getFrase().toUpperCase().charAt(i)=='O')||(cad1.getFrase().toUpperCase().charAt(i)=='U')){
                contVocales++;
            }
        }
        System.out.println("Cantidad de vocales encontradas: "+contVocales);
    }
    //B
    public void invertirFrase(Cadena cad1){
        String cadenaInvertida="";
        for (int i = cad1.getLargo()-1; i >=0; i--) {
            cadenaInvertida=cadenaInvertida+(String.valueOf(cad1.getFrase().charAt(i)));
        }
        System.out.println("La frase invertida: "+cadenaInvertida);
    }
    //C
    public void vecesRepetido(Cadena cad1,char letra){
        int contLetra=0;
        for (int i = 0; i < cad1.getLargo(); i++) {
            if ((cad1.getFrase().toUpperCase().charAt(i)==Character.toUpperCase(letra))){
                contLetra++;
            }
        }
        System.out.println("La frase ingresada: "+cad1.getFrase());
        System.out.println("La letra "+letra+" se repite: "+contLetra+" veces.");
    }
    //D
    public void compararLongitud(Cadena cad1){
        String frase2;
        System.out.println("Ingrese otra frase: ");
        frase2=sc.nextLine();
        if (cad1.getFrase().length()==frase2.length()){
            System.out.println("Tienen la misma longitud");
        }else{
            System.out.println("Tienen distinta longitud");
        }
    }
    //E
    public void unirFrases(Cadena cad1){
        String frase2;
        System.out.println("Ingrese otra frase: ");
        frase2=sc.nextLine();
        System.out.println(cad1.getFrase()+" "+frase2);
    }
    //F
    public void reemplazar(Cadena cad1){
        String caracter;
        System.out.println("La frase es "+cad1.getFrase().toUpperCase());
        System.out.println("Ingrese un caracter para reemplazar la letra (a) de la frase");
        caracter=sc.nextLine().toUpperCase();
        cad1.setFrase(cad1.getFrase().toUpperCase().replaceAll("A", caracter));
    }
    //G
    public boolean contieneLetra(Cadena cad1, char letra){
        for (int i = 0; i < cad1.getLargo(); i++) {
            if ((cad1.getFrase().toUpperCase().charAt(i)==Character.toUpperCase(letra))){
                return true;
            }
        }
        return false;
    }
}
