/*
d) Método cargarAlumnos(): este método le permitirá al usuario ingresar
los alumnos que asisten a las clases. Nosotros nos encargaremos de
almacenar esta información en un arreglo e iterar con un bucle,
solicitando en cada repetición que se ingrese el nombre de cada
alumno.
e) Método crearCurso(): el método crear curso, le pide los valores de
los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Curso. En este método invocamos al
método cargarAlumnos() para asignarle valor al atributo alumnos
f) Método calcularGananciaSemanal(): este método se encarga de
calcular la ganancia en una semana por curso. Para ello, se deben
multiplicar la cantidad de horas por día, el precio por hora, la
cantidad de alumnos y la cantidad de días a la semana que se repite
el encuentro.

 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CursoService {
    private Scanner sc=new Scanner(System.in).useDelimiter("\n");
    //D
    public String [] cargarAlumnos(){
        String [] vectAlumnos=new String [5];
        for (int i = 0; i < vectAlumnos.length; i++) {
            System.out.print((i+1)+" Ingrese el nombre del Alumno: ");
            vectAlumnos[i]=sc.next().toUpperCase();
        }
    return vectAlumnos;    
    }
    //E
    public Curso crearCurso(){
        System.out.print("Ingrese el Nombre del Curso: ");    
        String nombreCurso=sc.next().toUpperCase();
        System.out.print("Ingrese la Cantidad de horas/Día: ");    
        int cantidadHorasPorDia=sc.nextInt();
        System.out.print("Ingrese la Cantidad de Días/Semana: ");    
        int cantidadDiasPorSemana=sc.nextInt();
        System.out.print("Ingrese el turno del curso (Mañana o Tarde): ");    
        String turno=sc.next().toUpperCase();
        System.out.print("Ingrese el Precio/Hora: ");    
        double precioPorHora=sc.nextDouble();
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,cargarAlumnos());
    }
    //F
    public double calcularGananciaSemanal(Curso course){
        return course.getCantidadHorasPorDia()*course.getCantidadDiasPorSemana()*course.getPrecioPorHora()*course.getAlumnos().length;
    }
}
