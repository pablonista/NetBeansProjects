/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.

 */
package calculoimcv2;

import Entidad.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CalculoIMCv2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cantPer=0;
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese la cantidad de personas a cargar: ");
        cantPer=sc.nextInt();
        cantPer=validarN(cantPer);
        PersonaServicio persServ = new PersonaServicio();
        Persona [] pers=new Persona[cantPer];
        cargarPersonas(pers,persServ);
        ClearScreen();
        mostrarPersonas(pers,persServ);
        porcentajePeso(pers,persServ);
        porcentajeEdad(pers,persServ);
        
    }
    
    public static void porcentajeEdad(Persona[]persona, PersonaServicio persServ){
        int cantMenor=0,cantMayor=0;
        double resultado=0;
        for (int i = 0; i < persona.length; i++) {
            if (persServ.esMayorDeEdad(persona[i])==true) {
                cantMayor++;
            } else {
                cantMenor++;
            }
        }
        System.out.println("");
        resultado = (cantMenor*100.0)/persona.length;
        System.out.printf("Porcentaje de Personas Menores de Edad: %.2f",resultado);
        System.out.println("%");
        resultado=(cantMayor*100.0)/persona.length;
        System.out.printf("Porcentaje de Personas Mayores de Edad: %.2f",resultado);
        System.out.println("%");
    }
    public static void porcentajePeso(Persona[]persona, PersonaServicio persServ){
        int cantBajoPeso=0,cantIdealPeso=0,cantSobrePeso=0;
        double resultado=0;
        for (int i = 0; i <persona.length; i++) {
            switch(persServ.calcularIMC(persona[i])){
                case -1:
                    cantBajoPeso++;
                    break;
                case 0:
                    cantIdealPeso++;
                    break;
                case 1:
                    cantSobrePeso++;
                    break;
            }
        }
        System.out.println("");
        resultado=(cantBajoPeso*100.0)/persona.length;    
        System.out.printf("Porcentaje de Personas con bajo Peso: %.2f",resultado);
        System.out.println("%");
        resultado=(cantIdealPeso*100.0)/persona.length;
        System.out.printf("Porcentaje de Personas con Peso Ideal: %.2f",resultado);
        System.out.println("%");
        resultado=(cantSobrePeso*100.0)/persona.length;
        System.out.printf("Porcentaje de Personas con Sobrepeso: %.2f",resultado);
        System.out.println("%");
}
    public static void cargarPersonas(Persona [] persona, PersonaServicio persServ){
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Persona N°:"+(i+1));
            persona[i]=persServ.crearPersona();
        }
    }
    public static void mostrarPersonas(Persona [] persona, PersonaServicio persServ){
        for (int i = 0; i < persona.length; i++) {
            persServ.mostrarPersona(persona[i]);
            switch (persServ.calcularIMC(persona[i])){
                case -1:
                    System.out.println("Se encuentra por debajo de su peso ideal.");
                    break;
                case 0:
                    System.out.println("Se encuentra en su peso ideal.");
                    break;
                case 1:
                    System.out.println("Se encuentra por arriba de su peso ideal.");
                    break;
            }
            if (persServ.esMayorDeEdad(persona[i])==true) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
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
                    System.out.print("Ingrese nuevamente la cantidad de personas a cargar: ");
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
