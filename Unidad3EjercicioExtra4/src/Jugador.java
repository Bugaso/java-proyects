public class Jugador {
    /*
    Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del jugador),
    nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica si está
    mojado o no el jugador).

    Métodos:

    disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de mojar() y
    siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el revolver tira el agua,
    el jugador se moja; por lo tanto el atributo mojado pasa a true, sino false.
     */

    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id,String nombre,boolean mojado) {
        this.id = id;
        this.nombre=nombre;
        this.mojado=mojado;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public boolean disparo(RevolverAgua r) {

        r.siguienteChorro();

        if (r.mojar()==true) {
            return mojado = true;
        }

        System.out.println(r.toString());

        return mojado = false;
    }

}
