package EjerciciorobotGuia3;

/*
La Bateria tiene como atributos carga que es un valor entero, posee un constructor que permite
inicializar su carga y los métodos get y set para dicho atributo.
 */
public class Bateria {

    private int carga;

    public Bateria() {
    }

    public Bateria(int carga) {
        this.carga=carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }
}
