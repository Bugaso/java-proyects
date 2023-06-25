import java.util.Random;

public class RevolverAgua {
    /*
    Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición del
    tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del tambor donde
    se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
    Métodos:

    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores deben
    ser aleatorios.

    • mojar(): devuelve true si la posición del agua coincide con la posición actual

    • siguienteChorro(): cambia a la siguiente posición del tambor.

    • toString(): muestra información del revolver (posición actual y donde está el agua)

     */

    private boolean agua;
    private int posicionActual;
    private int posicion;


    public RevolverAgua() {
    }

    public RevolverAgua(boolean agua,int posicion,int posicionActual) {
        this.agua=agua;
        this.posicion=posicion;
        this.posicionActual=posicionActual;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void llenarRevolver(){
        Random waterPosition = new Random();
        Random positionactual= new Random();
        posicion= waterPosition.nextInt(1,6);
        posicionActual=positionactual.nextInt(1,6);

    }

    public boolean mojar(){
        if(posicion==posicionActual){
            return true;
        }
        return false;

    }

    public void siguienteChorro(){
        if (posicionActual >= 6){
            posicionActual=0;
        }
            posicionActual++;

    }

    @Override
    public String toString() {
        return "RevolverAgua: " + "posicionActual= " + posicionActual + " posicionDelAgua= "+posicion;
    }

}
