/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrolclases;

import Entidad.Curso;
import Servicios.CursoService;

/**
 *
 * @author HP
 */
public class AppControlClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CursoService cs=new CursoService();
        Curso c1=cs.crearCurso();
        System.out.println(c1.toString());
        System.out.printf("La Ganancia semanal del curso: $ %.2f",cs.calcularGananciaSemanal(c1));
    }
    
}
