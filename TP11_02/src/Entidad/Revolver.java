/*
 *  atributos: posición actual (posición
    del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
    tambor donde se encuentra el agua).
 Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Entidad;

/**
 *
 * @author HP
 */
public class Revolver {
    private int posicionactual;
    private int posicionagua;

    public Revolver() {
    }

    public Revolver(int posicionactual, int posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    public int getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(int posicionactual) {
        this.posicionactual = posicionactual;
    }

    public int getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(int posicionagua) {
        this.posicionagua = posicionagua;
    }

    @Override
    public String toString() {
        return "RevolverAgua{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }
    public void llenarRevolver(){
        this.setPosicionactual((int)(Math.random()*6)+1);
        this.setPosicionagua((int)(Math.random()*6)+1);
    }
    public boolean mojar(){
        boolean retorno;
        retorno = this.getPosicionactual()==this.getPosicionagua();
        return retorno;
    }
    public void siguienteChorro(){
        this.setPosicionactual(this.getPosicionactual()%6+1);
    }
    
}
