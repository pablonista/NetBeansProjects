/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg_backend1;

/**
 *
 * @author HP
 */
public class caramelos {
	
	public static void main (String[] args) {
		
		System.out.println("El prisionero "+prisioneroDulce(455, 1582, 500)+" recibe el caramelo podrido");
	}
	public static int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadPresos) {
		// Calculamos el número de vueltas completas que dará la ronda de caramelos
		int vueltasCompletas = cantidadCaramelos / cantidadPresos;
		// Calculamos el número de caramelos que sobran después de las vueltas completas
		int caramelosSobrantes = cantidadCaramelos % cantidadPresos;
		// Calculamos el número de presos que recibirán un caramelo extra por los caramelos sobrantes
		int presosConCarameloExtra;
		if (caramelosSobrantes > 0) {
			presosConCarameloExtra = caramelosSobrantes - 1;
		} else {
			presosConCarameloExtra = 0;
		}
		// Calculamos la posición del preso que recibirá el último caramelo podrido
		int posicionUltimoCaramelo = (inicio + vueltasCompletas + presosConCarameloExtra) % cantidadPresos;
		return posicionUltimoCaramelo;
	}
}

