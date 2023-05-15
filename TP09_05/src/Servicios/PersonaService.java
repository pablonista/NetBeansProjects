/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.

 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author HP
 */
public class PersonaService {
    private final Scanner sc=new Scanner(System.in).useDelimiter("\n");
    //A
    public Persona crearPersona(){
        System.out.print("Ingrese el Nombre de la Persona: ");
        String nombre=sc.next().toUpperCase();
        System.out.println("Datos de Nacimiento");
        System.out.print("Ingrese el Año: ");
        int anio=sc.nextInt();
        anio=validarAnio(anio);
        System.out.print("Ingrese el Mes: ");
        int mes=sc.nextInt();
        mes=validarMes(mes);
        System.out.print("Ingrese el Día: ");
        int dia=sc.nextInt();
        dia=validarDia(dia,mes,anio);
        Date fnac= new Date(anio-1900,mes-1,dia);
        return new Persona(nombre, fnac);
    } 
    //B
    public int calcularEdad(Persona ps){
        int edad;
        Date fact=new Date();
        return edad =(int)((fact.getTime()-ps.getFnac().getTime())/31536000000.0);
    }
    //C
    public boolean menorQue(Persona ps,int age){
        return age>=18;
    }
    //D
    public void mostrarPersona(Persona ps){
        System.out.println(ps.toString());
        System.out.println("Edad: "+calcularEdad(ps));
        if (menorQue(ps,calcularEdad(ps))==true) {
            System.out.println("Es mayor de edad.");    
        }else {
            System.out.println("Es menor de edad.");
        }
    }
    private  int validarAnio(int year){
        int retorno=0;
        do {            
            if (year>=1900) {
                retorno=year;
            } else {
                System.out.print("Ha ingresado un año de manera erronea.\nIngrese un año superior a 1900:");
                year=sc.nextInt();
                retorno=0;
            }
        } while (retorno==0);
        return retorno;
    }
    private int validarMes(int month){
        int retorno=0;
        do {            
            if (month>=1&&month<=12) {
                retorno=month;
            } else {
                System.out.print("Ha ingresado el mes de manera erronea.\nIngrese nuevamente el mes :");
                month=sc.nextInt();
                retorno=0;
            }
        } while (retorno==0);
         return retorno;
    }
    private int validarDia(int d, int m, int y){
        int diasEnMes = 0;
        boolean esBisiesto = esBisiesto(y);
        boolean fechaValida = true;
        // Validar si el mes es febrero y si el año es bisiesto
        if (m == 2 && esBisiesto) {
            diasEnMes = 29;
        } else {
            if ((m==1)||(m==3)||(m==5)||(m==1)||(m==7)||(m==8)||(m==10)||(m==12)){
                diasEnMes = 31;
            }else
                { 
                    if ((m==4)||(m==6)||(m==9)||(m==11)) {
                        diasEnMes = 30;
                    } else {
                        fechaValida = false;
                    }
                }
        }
        // Validar el día
        while (fechaValida) {
            if (d < 1 || d > diasEnMes) {
                System.out.println("El día ingresado no es válido.");
                System.out.print("Ingrese el día nuevamente: ");
                d = sc.nextInt();
                diasEnMes = m == 2 && esBisiesto ? 29 : diasEnMes; // actualizar los días del mes si es febrero y el año es bisiesto
            } else {
                break;
            }
        }
        if (fechaValida) {
            return d;
        } else {
            return -1; // retornar -1 si la fecha no es válida
        }
    }
    private static boolean esBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
