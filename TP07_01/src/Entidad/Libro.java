/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Libro {
   private String ISBN; // Definición de atributos
   private String Titulo;
   private String Autor;
   private int numPaginas;
   
   public Libro (String ISBN, String Titulo, String Autor,int numPaginas){ //constructor con parametros
       this.ISBN= ISBN;
       this.Titulo= Titulo;
       this.Autor= Autor;
       this.numPaginas= numPaginas;
   }
   
   public Libro(){
       //contructor vacio
   }
   public void cargarLibro(){ //Método para cargar los datos
       Scanner sc=new Scanner(System.in);
       System.out.print("Ingrese ISBN: ");
       this.ISBN= sc.nextLine();
       System.out.print("Ingrese Título: ");
       this.Titulo= sc.nextLine();
       System.out.print("Ingrese Autor: ");
       this.Autor= sc.nextLine();
       System.out.print("Ingrese Nro de Páginas: ");
       this.numPaginas= sc.nextInt();
   }
   public void mostrarDetalles(){//Método para mostrar los detalles
       System.out.println("ISBN: " + this.ISBN);
       System.out.println("Título: " + this.Titulo);
       System.out.println("Autor: " + this.Autor);
       System.out.println("Número de Páginas: " + this.numPaginas);
   }
}
