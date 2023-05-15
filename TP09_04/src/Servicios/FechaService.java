/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).

 */
package Servicios;

//import static calculoedad.CalculoEdad.presioneUnaTecla;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FechaService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    public Date fechaNacimiento(){
        System.out.print("Ingrese el Año: ");
        int anio=sc.nextInt();
        anio=validarAnio(anio);
        System.out.print("Ingrese el Mes: ");
        int mes=sc.nextInt();
        mes=validarMes(mes);
        System.out.print("Ingrese el Día: ");
        int dia=sc.nextInt();
        dia=validarDia(dia,mes,anio);
        Date fecha=new Date(anio-1900,mes-1,dia);
        return fecha;
    }
    public Date fechaActual(){
        Date fechaActual=new Date();
        return fechaActual;
    }
    public double diferencia(Date f1, Date f2){
        return (f2.getTime()-f1.getTime())/31536000000.0;
    }
    public int validarAnio(int year){
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
    public int validarMes(int month){
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
    public int validarDia(int d, int m, int y){
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
    public static boolean esBisiesto(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
