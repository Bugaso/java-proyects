public class Bomba {
    /*
        La Bomba tiene un comportamiento regar que hace
        que el Motor consuma agua hasta que su tanque quede completamente vacío y otro
        comportamiento mostrarInfor que muestra por pantalla la carga inicial del tanque, la velocidad del
        motor.
     */
    private Motor velocidad;

    public Bomba() {
    }
    public Bomba(Motor velocidad) {
        this.velocidad=velocidad;

    }
    public void Regar(){

        velocidad.consumirAgua();

    }

    @Override
    public String toString() {
        return "Bomba" +" velocidad=" + velocidad.getVelocidad() +" Capacidad del tanque= "+velocidad.getÑoki().getLitros();
    }
}
