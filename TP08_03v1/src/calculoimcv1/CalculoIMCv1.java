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
package calculoimcv1;

import Entidad.Persona;
import Servicios.PersonaServicio;

/**
 *
 * @author HP
 */
public class CalculoIMCv1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    boolean [] vectMay=new boolean[4];
    int [] vectIMC=new int[4];
    PersonaServicio persServ=new PersonaServicio();
    Persona persona0 = persServ.crearPersona();//Persona persona0 = new Persona(nombre, edad, sexo, peso, altura);
    System.out.println("\nLa primera persona cargada");
    persServ.mostrarPersona(persona0);
    mostrarMayor(persona0,persServ);
    mostrarIMC(persona0,persServ);
    Persona persona1 = persServ.crearPersona();
    System.out.println("\nLa segunda persona cargada");
    persServ.mostrarPersona(persona1);
    mostrarMayor(persona1,persServ);
    mostrarIMC(persona1,persServ);
    Persona persona2 = persServ.crearPersona();
    System.out.println("\nLa tercera persona cargada");
    persServ.mostrarPersona(persona2);
    mostrarMayor(persona2,persServ);
    mostrarIMC(persona2,persServ);
    Persona persona3 = persServ.crearPersona();
    System.out.println("\nLa cuarta persona cargada");
    persServ.mostrarPersona(persona3);
    mostrarMayor(persona3,persServ); 
    mostrarIMC(persona3,persServ);
    cargarVectorMayor(vectMay,persona0,persona1,persona2,persona3,persServ);
    porcentajeMayor(vectMay);
    cargarVectorIMC(vectIMC,persona0,persona1,persona2,persona3,persServ);
    porcentajeIMC(vectIMC);
    }
    
    public static void cargarVectorIMC(int []v, Persona p0, Persona p1, Persona p2,Persona p3, PersonaServicio persServ){
        v[0]=persServ.calcularIMC(p0);
        v[1]=persServ.calcularIMC(p1);
        v[2]=persServ.calcularIMC(p2);
        v[3]=persServ.calcularIMC(p3);
    }
    
    public static void porcentajeIMC(int[] v){
        int cantBajoPeso=0,cantIdealPeso=0,cantSobrePeso=0;
        double resultado=0;
        for (int i = 0; i <v.length; i++) {
            switch(v[i]){
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
        resultado=(cantBajoPeso*100.0)/v.length;    
        System.out.printf("Porcentaje de Personas con bajo Peso: %.2f",resultado);
        System.out.println("%");
        resultado=(cantIdealPeso*100.0)/v.length;
        System.out.printf("Porcentaje de Personas con Peso Ideal: %.2f",resultado);
        System.out.println("%");
        resultado=(cantSobrePeso*100.0)/v.length;
        System.out.printf("Porcentaje de Personas con Sobrepeso: %.2f",resultado);
        System.out.println("%");
    }
    
    public static void cargarVectorMayor(boolean []v, Persona p0, Persona p1, Persona p2,Persona p3, PersonaServicio persServ){
        v[0]=persServ.esMayorDeEdad(p0);
        v[1]=persServ.esMayorDeEdad(p1);
        v[2]=persServ.esMayorDeEdad(p2);
        v[3]=persServ.esMayorDeEdad(p3);
    }
    
    public static void porcentajeMayor(boolean[] v){
        int cantMay=0,cantMen=0;
        double resultado=0;
        for (int i = 0; i < v.length; i++) {
            if (v[0]==true) {
                cantMay++;
            } else {
                cantMen++;
            }
        }
        System.out.println("");
        resultado = (cantMen*100.0)/v.length;
        System.out.printf("Porcentaje de Personas Menores de Edad: %.2f",resultado);
        System.out.println("%");
        resultado=(cantMay*100.0)/v.length;
        System.out.printf("Porcentaje de Personas Mayores de Edad: %.2f",resultado);
        System.out.println("%");
    }
    
    public static void mostrarMayor (Persona persona,PersonaServicio persServ){
        if (persServ.esMayorDeEdad(persona)==true) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }
    }
    public static void mostrarIMC(Persona persona,PersonaServicio persServ){
        switch(persServ.calcularIMC(persona)){
            case -1:
                System.out.println("Se encuentra con Bajo Peso.");
                break;
            case 0:
                System.out.println("Se encuentra con Peso Ideal.");
                break;
            case 1:
                System.out.println("Se encuentra con Sobrepeso.");
                break;
        }
        System.out.println("");
    }
    
}
