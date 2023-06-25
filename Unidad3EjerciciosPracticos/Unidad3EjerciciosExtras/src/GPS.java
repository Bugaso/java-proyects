import java.util.Random;

public class GPS {

      /*
    Como vemos en el modelo, una Persona usa un GPS y el GPS tiene una Posición. Con respecto a
    la clase GPS la lógica de sus métodos especiales es la siguiente:
    - mover() Este método generará una nueva Posición con valores aleatorios para la latitud
    y longitud de la misma entre 0 y 1. Esta nueva Posicion quedará registrada en la variable
    atributo “ultimaUbicacion”
    - obtenerUltimaPosicion() Este método retornará el estado actual de la variable atributo
    “ultimaUbicacion”

    En la clase Persona, el método ubicarme() es el que usa el GPS para solicitar que se mueva y
    luego le pide la última posición que luego mostrará por pantalla.
     */
    private String marca;
    private String modelo;
    private Posicion ultimaUbicacion;

    public GPS() {
    }

    public GPS(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
    }

    /*
    mover() Este método generará una nueva Posición con valores aleatorios para la latitud
    y longitud de la misma entre 0 y 1. Esta nueva Posicion quedará registrada en la variable
    atributo “ultimaUbicacion”
     */
    public void mover(){

        Random random = new Random();
        Double numeroAleatorio = random.nextDouble(1);
        Double numeroAleatorio2 = random.nextDouble(1);
        ultimaUbicacion = new Posicion( numeroAleatorio, numeroAleatorio2);

    }
    /*
    obtenerUltimaPosicion() Este método retornará el estado actual de la variable atributo
    “ultimaUbicacion”
     */
    public Posicion ObtenerUltimaubicacion(){

        return ultimaUbicacion;
    }


}
