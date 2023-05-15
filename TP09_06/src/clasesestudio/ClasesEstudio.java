/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesestudio;

import Entidad.Curso;
import Servicios.CursoService;

/**
 *
 * @author HP
 */
public class ClasesEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Curso cur1=CursoService.crearCurso();
        System.out.printf("Calculo de Ganancia Semanal: $ %.2f",CursoService.calcularGananciaSemanal(cur1));
        System.out.println("");
    }
    
}
