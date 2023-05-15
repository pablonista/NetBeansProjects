/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CursoService {
    /*
    Método cargarAlumnos(): este método le permitirá al usuario ingresar
    los alumnos que asisten a las clases. Nosotros nos encargaremos de 
    almacenar esta información en un arreglo e iterar con un bucle, 
    solicitando en cada repetición que se ingrese el nombre de cada alumno.
    */
    static Scanner entrada = new Scanner(System.in).useDelimiter("\n");
    public static String[] cargarAlumnos(){
        String nombre;
        String alumnos [] = new String[5];
        for (int i = 0; i < alumnos.length;i++) {
            System.out.print("Ingrese los nombres del alumno "+(i+1)+": ");
            alumnos[i] = entrada.next();
        }
        return alumnos;
    }
    /*
    Método crearCurso(): el método crear curso, le pide los valores
    de los atributos al usuario y después se le asignan a sus respectivos
    atributos para llenar el objeto Curso. En este método invocamos al método
    cargarAlumnos() para asignarle valor al atributo alumnos.
    */
    public static Curso crearCurso(){
        String nombreCurso;
        int cantidadHorasPorDia;
        int cantidadDiasPorSemana;
        String turno;
        double precioPorHora;
        System.out.print("Ingrese nombre del curso: ");
        nombreCurso = entrada.next();
        System.out.print("Cantidad de horas por dias: ");
        cantidadHorasPorDia = entrada.nextInt();
        System.out.print("Ingrese cantidad de dias por semana: ");
        cantidadDiasPorSemana = entrada.nextInt();
        System.out.print("Ingrese turno: ");
        turno = entrada.next();
        System.out.print("Ingrese precio por hora: ");
        precioPorHora = entrada.nextDouble();
        return new Curso(nombreCurso,cantidadHorasPorDia,cantidadDiasPorSemana,turno,precioPorHora,cargarAlumnos());
    }
    /*
    Método calcularGananciaSemanal(): este método se encarga de calcular 
    la ganancia en una semana por curso. Para ello, se deben multiplicar
    la cantidad de horas por día, el precio por hora, la cantidad de
    alumnos y la cantidad de días a la semana que se repite el encuentro.
    */
    public static double  calcularGananciaSemanal(Curso obj){
        double formula;
        formula = obj.getCantidadHorasPorDia()*obj.getPrecioPorHora() * obj.getalumnos().length * obj.getCantidadDiasPorSemana();
        return formula;
    }
}
