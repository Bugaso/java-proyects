public class Posicion {

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
    private double latitud;
    private double longitud;

    public Posicion() {
    }
    public Posicion(double latitud,double longitud) {
        this.latitud=latitud;
        this.longitud=longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Posicion: " + "latitud= " + latitud + ", longitud= " + longitud;
    }
}
