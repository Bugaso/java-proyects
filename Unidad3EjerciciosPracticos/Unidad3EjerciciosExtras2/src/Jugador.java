public class Jugador {

    private String name;
    private int classly;

    public Jugador() {
    }
    public Jugador(String name) {

        this.name = name;

    }
    /*
    tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es invocar el método
    generarNro del dado y acumulará el valor del Dado en su atributo clasificación.
     */
    public void tirarDado(Dado dadito){

        dadito.generarNum();
       classly += dadito.verNum();

    }

    /*
    verClasificación(): Retornará la clasificación del jugador.
    Por otro lado, tenemos la clase Dado que posee como atributo: número que es un valor entero y
    los métodos:
     */

    public int verClasificacion(){

      return classly;

    }
}
