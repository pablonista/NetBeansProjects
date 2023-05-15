/*
 Crear una clase llamada Producto que contenga los siguientes atributos: nombre, código, stock y precio. A continuación crear los siguientes métodos:
- Método constructor vacío y constructor con todos los atributos pasados por parámetro OK
- Método get y set para cada atributo OK
- Método crearProducto(): pide los datos al usuario y lo guarda en los diferentes atributos
- Método venderProducto(): pide al usuario que ingrese una cantidad del producto y lo mismo se debe restar del  	atributo stock
- Método cambiarPrecio(): pide al usuario un nuevo precio y lo asigna al atributo
- Método mostrarProducto(): mostrar el nombre, código, stock y precio del producto
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Producto {
    //Atributos
    private String Nombre;
    private String Codigo;
    private int Stock;
    private double Precio;
    //Constructores
    public Producto(){    
    }
    public Producto(String Nombre, String Codigo, int Stock, double Precio) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Stock = Stock;
        this.Precio = Precio;
    }
    //Métodos
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getCodigo() {
        return Codigo;
    }
    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public int getStock() {
        return Stock;
    }
    public void setStock(int Stock) {
        this.Stock = Stock;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    public void crearProducto(){
        Scanner sc= new Scanner (System.in);// Instanciación
        System.out.print("Ingrese la descripción del Producto: ");
        Nombre=sc.nextLine();
        System.out.print("Ingrese el Código del Producto: ");
        Codigo=sc.nextLine();
        System.out.print("Ingrese el Stock del Producto: ");
        Stock=sc.nextInt();
        System.out.print("Ingrese el Precio del Producto: ");
        Precio=sc.nextDouble();
    }
    public void venderProducto(){
       Scanner sc=new Scanner(System.in);
       int venta=0;
       String resp="";
       boolean concluida=false;
        do {    
            System.out.print("Ingrese la cantidad de producto vendido: ");
            venta=sc.nextInt();
            if (Stock>= venta) {
                Stock-=venta;
                concluida=true;
            } else {
                System.out.println("Cantidad insuficiente...\n Cantidad disponible: "+Stock);
                System.out.print("Desea continuar con la venta S/N: ");
                sc.nextLine();
                resp=sc.nextLine();
                resp=String.valueOf(resp.charAt(0));
                if (!resp.equalsIgnoreCase("n")) {
                    concluida=false;
                } else {
                    concluida=true;
                }
            }    
        } while (concluida==false);       
    }
    public void cambiarPrecio(){
        Scanner sc=new Scanner (System.in);
        double newPrice=0;
        boolean concluido=false;
        do {            
            System.out.print("Ingrese el nuevo precio: ");
            newPrice=sc.nextDouble();
            if (newPrice>0) {
                Precio=newPrice;
                concluido=true;
            } else {
                System.out.println("El precio del producto no puede ser 0 o Negativo...");
                concluido=false;
            }
        } while (concluido==false);  
    }
    public void mostrarProducto(){
        System.out.println("Descripción de Producto: "+Nombre);
        System.out.println("Código de Producto: "+Codigo);
        System.out.println("Stock de Producto: "+Stock);
        System.out.println("Precio de Producto: "+Precio);
    }
    
}
