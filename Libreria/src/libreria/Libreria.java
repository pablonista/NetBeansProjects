/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorService;
import libreria.servicios.EditorialService;
import libreria.servicios.LibroService;

/**
 *
 * @author Pablo A. Nista Casanova <pablonista@gmail.com>
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        AutorService as=new AutorService();
        EditorialService es=new EditorialService();
        LibroService ls=new LibroService();
        char opc; 
        do {
            mostrarMenuPrincipal();
            opc = sc.next().charAt(0);
            opc=validarMenuPrincipal(opc,sc);
            switch (opc) {
                case '1':
                    menuAutores(as,sc);
                    break;
                case '2':
                    menuEditoriales(es,sc);
                    break;
                case '3':
                    menuLibros(ls,es,as,sc);
                    break;
                case '4':
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Introduce una opción válida.");
                    break;
            }
        } while (opc != '4');
        sc.close();
    }
    public static void mostrarMenuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1) ABM Autores");
        System.out.println("2) ABM Editoriales");
        System.out.println("3) ABM Libros");
        System.out.println("4) Salir del sistema");
        System.out.print("Ingrese una opción: ");
    }
    public static char validarMenuPrincipal(char opc, Scanner sc){
        char retorno=' ';
        do {            
            if (opc=='1'||opc=='2'||opc=='3'||opc=='4') {
            retorno=opc;
            } else {
                System.out.print("Ingrese nuevamente la opción: ");
                opc=sc.next().charAt(0);
            }
        } while (retorno==' ');
        return retorno;
    }
    public static char validarMenu(char opc, Scanner sc){
        char retorno=' ';
        do {            
            if (opc=='1'||opc=='2'||opc=='3'||opc=='4'||opc=='5'||opc=='6'||opc=='7'||opc=='8'||opc=='9') {
            retorno=opc;
            } else {
                System.out.print("Ingrese nuevamente la opción: ");
                opc=sc.next().charAt(0);
            }
        } while (retorno==' ');
        return retorno;
    }
    public static void mostrarSubMenu(String opcion) {
        System.out.println();
        System.out.println("SUBMENÚ " + opcion.toUpperCase());
        System.out.println("1) Alta de " + opcion);
        System.out.println("2) Modificación de " + opcion);
        System.out.println("3) Baja de " + opcion);
        System.out.println("4) Listar registros activos de " + opcion);
        System.out.println("5) Listar registros en baja de " + opcion);
        System.out.println("6) Listar todos los registros de " + opcion);
        System.out.println("7) Buscar por Id el " + opcion);
        System.out.println("8) Buscar por Nombre el " + opcion);
        System.out.println("9) Volver al menú anterior");
        System.out.print("Ingrese una opción: ");
    }
    public static void menuAutores(AutorService as, Scanner sc){
        char opc;
        String nombre;
        Autor encontrado;
        do {            
            mostrarSubMenu("Autor");
            opc=sc.next().charAt(0);
            opc=validarMenu(opc,sc);
            switch(opc){
                case '1':
                    System.out.println("Carga de Autor en Sistema");
                    System.out.print("Ingrese el nombre del Autor: ");
                    nombre=sc.next().toUpperCase();
                    as.crearAutor(nombre);
                    break;
                case '2':
                    System.out.println("Modificación de Autor en Sistema");
                    System.out.print("Ingrese el Id del Autor: ");
                    Integer Id = sc.nextInt();
                    System.out.print("Ingrese el Nuevo Nombre del Autor: ");
                    nombre=sc.next().toUpperCase();
                    as.editarAutor(Id, nombre);
                    break;
                case '3':    
                    System.out.println("Eliminación de Autor");
                    System.out.print("Ingrese el id del Autor a eleminar");
                    Id =sc.nextInt();
                    if (as.eliminarAutor(Id)) {
                        System.out.println("Se elimino de manera correcta al Autor.");
                    } else {
                        System.out.println("No se encontró al Autor a eliminar.");
                    }
                    break;
                case '4':
                    System.out.println("Listado de Autores Activos en Sistema");
                    List <Autor> autores = as.listarAutoresAltas();
                    for (Autor a : autores) {
                        System.out.println(a);
                    }
                    break;
                case '5':
                    System.out.println("Listado de Autores Borrados en Sistema");
                    autores = as.listarAutoresBajas();
                    for (Autor a : autores) {
                        System.out.println(a);
                    }
                    break;
                case '6':
                    System.out.println("Listado de Autores Sistema");
                    autores = as.listarAutores();
                    for (Autor a : autores) {
                        System.out.println(a);
                    }
                    break;
                case '7':
                    System.out.println("Busqueda de Autor por ID");
                    System.out.print("Ingrese el Id del Autor:");
                    Integer id=sc.nextInt();
                    encontrado=as.buscarAutorporId(id);
                    if (encontrado!=null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró el autor.");
                    }
                    break;
                case '8':
                    System.out.println("Busqueda de Autor por Nombre");
                    System.out.print("Ingrese el Nombre del Autor:");
                    nombre=sc.next().toUpperCase();
                    encontrado=as.buscarAutorporNombre(nombre);
                    if (encontrado!=null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró el autor.");
                    }
                    break;
                case '9':
                    System.out.println("Saliendo del menú Autor...");
                    break;
            }
        } while (opc!='9');
    }
    public static void menuEditoriales(EditorialService es, Scanner sc){
        char opc;
        String nombre;
        Editorial encontrado;
        do {            
            mostrarSubMenu("Editorial");
            opc=sc.next().charAt(0);
            opc=validarMenu(opc,sc);
            switch(opc){
                case '1':
                    System.out.println("Carga de Editorial en Sistema");
                    System.out.print("Ingrese el nombre de la Editorial: ");
                    nombre=sc.next().toUpperCase();
                    es.crearEditorial(nombre);
                    break;
                case '2':
                    System.out.println("Modificación de Editorial en Sistema");
                    System.out.print("Ingrese el Id de la Editorial: ");
                    Integer Id = sc.nextInt();
                    System.out.print("Ingrese el Nuevo Nombre de la Editorial: ");
                    nombre=sc.next().toUpperCase();
                    es.editarEditorial(Id, nombre);
                    break;
                case '3':    
                    System.out.println("Eliminación de Editorial");
                    System.out.print("Ingrese el id de la Editorial a eleminar");
                    Id =sc.nextInt();
                    if (es.eliminarEditorial(Id)) {
                        System.out.println("Se elimino de manera correcta la Editorial.");
                    } else {
                        System.out.println("No se encontró la Editorial a eliminar.");
                    }
                    break;
                case '4':
                    System.out.println("Listado de Editoriales Activas en Sistema");
                    List <Editorial> editoriales = es.listarEditorialAltas();
                    for (Editorial e : editoriales) {
                        System.out.println(e);
                    }
                    break;
                case '5':
                    System.out.println("Listado de Editoriales Borradas en Sistema");
                    editoriales = es.listarEditorialBajas();
                    for (Editorial e : editoriales) {
                        System.out.println(e);
                    }
                    break;
                case '6':
                    System.out.println("Listado de Editoriales en Sistema");
                    editoriales = es.listarEditorial();
                    for (Editorial e : editoriales) {
                        System.out.println(e);
                    }
                    break;
                case '7':
                    System.out.println("Busqueda de Editorial por ID");
                    System.out.print("Ingrese el Id de la Editorial:");
                    Integer id=sc.nextInt();
                    encontrado=es.buscarEditorialporId(id);
                    if (encontrado!=null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró la Editorial.");
                    }
                    break;
                case '8':
                    System.out.println("Busqueda de Editorial por Nombre");
                    System.out.print("Ingrese el Nombre de la Editorial:");
                    nombre=sc.next().toUpperCase();
                    encontrado=es.buscarEditorialporNombre(nombre);
                    if (encontrado!=null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró la Editorial.");
                    }
                    break;
                case '9':
                    System.out.println("Saliendo del menú Editorial...");
                    break;
            }
        } while (opc!='9');
    }
    public static void menuLibros(LibroService ls,EditorialService es, AutorService as, Scanner sc){
        char opc;
        Integer id;
        String titulo;
        Integer anio;
        Integer ejemplares;
        Autor autor;
        Libro libro;
        Editorial editorial;
        Libro encontrado;
        do {            
            mostrarSubMenu("Libro");
            opc=sc.next().charAt(0);
            opc=validarMenu(opc,sc);
            switch(opc){
                case '1':
                    System.out.println("Carga de Libro en Sistema");
                    System.out.print("Ingrese el Titulo del libro: ");
                    titulo=sc.next().toUpperCase();
                    System.out.print("Ingrese el Año:");
                    anio=sc.nextInt();
                    System.out.print("Ingrese el número de Ejemplares:");
                    ejemplares=sc.nextInt();
                    System.out.println("Ingrese el Id del Autor:");
                    id=sc.nextInt();
                    autor=as.buscarAutorporId(id);
                    System.out.println("Ingrese el Id de la Editorial:");
                    id=sc.nextInt();
                    editorial=es.buscarEditorialporId(id);
                    ls.crearLibro(titulo, anio, ejemplares, autor, editorial);
                    break;
                case '2':
                    System.out.println("Modificación de Libro en Sistema");
                    System.out.print("Ingrese el Isbn del Libro: ");
                    Long isbn = sc.nextLong();
                    libro=ls.buscarLibroporIsbn(isbn);
                    char opc2;
                    System.out.println("Que desea modificar del Libro:");
                    System.out.println("1) Titulo del Libro.");
                    System.out.println("2) Año del Libro.");
                    System.out.println("3) Cantidad de Ejemplares del Libro.");
                    System.out.println("4) Autor del Libro.");
                    System.out.println("5) Editorial del Libro.");
                    System.out.print("Ingrese la Opcion: ");
                    opc2=sc.next().charAt(0);
                    switch (opc2){
                        case '1':
                            titulo=sc.next().toUpperCase();
                            libro.setTitulo(titulo);
                            break;
                        case '2':
                            anio=sc.nextInt();
                            libro.setAnio(anio);
                            break;
                        case '3':
                            Integer cantidadEjemplares=sc.nextInt();
                            libro.setEjemplares(cantidadEjemplares);
                            break;
                        case '4':
                            System.out.print("Ingrese el Id del Autor: ");
                            id=sc.nextInt();
                            autor= as.buscarAutorporId(id);
                            libro.setAutor(autor);
                            break;
                        case '5':
                            System.out.println("Ingrese el id de la Editorial: ");
                            id=sc.nextInt();
                            editorial=es.buscarEditorialporId(id);
                            libro.setEditorial(editorial);
                            break;        
                    }
                    ls.editarLibro(libro);
                    break;
                case '3':    
                    System.out.println("Eliminación de Libro");
                    System.out.print("Ingrese el isbn del Libro a eleminar");
                    isbn =sc.nextLong();
                    if (ls.eliminarLibro(isbn)) {
                        System.out.println("Se elimino de manera correcta el Libro.");
                    } else {
                        System.out.println("No se encontró el Libro a eliminar.");
                    }
                    break;
                case '4':
                    System.out.println("Listado de Libros Activos en Sistema");
                    List <Libro> libros = ls.listarLibrosAltas();
                    for (Libro l : libros) {
                        System.out.println(l);
                    }
                    break;
                case '5':
                    System.out.println("Listado de Libros Borrados en Sistema");
                    libros = ls.listarLibrosBajas();
                    for (Libro l : libros) {
                        System.out.println(l);
                    }
                    break;
                case '6':
                    System.out.println("Listado de Libros en Sistema");
                    libros = ls.listarLibros();
                    for (Libro l : libros) {
                        System.out.println(l);
                    }
                    break;
                case '7':
                    System.out.println("Busqueda de Libro por ISBN");
                    System.out.print("Ingrese el ISBN del Libro:");
                    isbn=sc.nextLong();
                    encontrado=ls.buscarLibroporIsbn(isbn);
                    if (encontrado!=null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró el Libro.");
                    }
                    break;
                case '8':
                    System.out.println("Busqueda de LIbro por Titulo");
                    System.out.print("Ingrese el Titulo del Libro:");
                    titulo=sc.next().toUpperCase();
                    encontrado=ls.buscarLibroporTitulo(titulo);
                    if (encontrado!=null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("No se encontró el Libro.");
                    }
                    break;
                case '9':
                    System.out.println("Saliendo del menú Editorial...");
                    break;
            }
        } while (opc!='9');
    }
}
