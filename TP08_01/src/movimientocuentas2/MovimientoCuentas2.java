/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movimientocuentas2;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MovimientoCuentas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        double montoExtraer;
        //CuentaBancaria cta=new CuentaBancaria();
        CuentaBancariaServicio ctaService = new CuentaBancariaServicio();
        CuentaBancaria cta = ctaService.crearCuenta();
        System.out.println("Se muestran datos despues de la carga: ");
        ctaService.consultarDatos(cta);
        ctaService.consultarSaldo(cta);
        System.out.println("Ingrese el monto a extraer (Modo Común): ");
        montoExtraer=sc.nextDouble();
        ctaService.retirarMonto(cta, montoExtraer);
        System.out.println("Se muestran datos despues de la Extracción Común: ");
        ctaService.consultarSaldo(cta);
        System.out.println("Ingrese el monto a extraer (Modo Rápido): ");
        montoExtraer=sc.nextDouble();
        ctaService.extraccionRapida(cta, montoExtraer);
        System.out.println("Se muestran datos despues de la Extracción Rápida: ");
        ctaService.consultarSaldo(cta);
        cta=null;
        ctaService=null;
    }
}
