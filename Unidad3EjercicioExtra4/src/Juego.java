public class Juego {

    /*
    Clase Juego: esta clase posee los siguientes atributos: 2 Jugadores y Revolver

    Métodos:
    • llenarJuego(Jugador jugador1,Jugador jugador2, Revolver r): este método recibe los 2 jugadores
    y el revolver para guardarlos en los atributos del juego.
    • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y aprieta el
    gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se moja, se pasa al
    siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar. Al final del juego, se
    debe mostrar que jugador se mojó. Pensar la lógica necesaria para realizar esto, usando los
    atributos de la clase Juego.
     */

    private Jugador P1;
    private Jugador P2;

    private RevolverAgua R;

    public Juego() {
    }

    public void llenarJuego(Jugador P1, Jugador P2, RevolverAgua R) {

        this.P1 = P1;
        this.P2 = P2;
        this.R = R;


    }

    public void ronda() {
        R.setPosicionActual(R.getPosicionActual()-1);
        while(R.mojar()==false){

            if(P1.isMojado()==false){
                P1.disparo(R);
            }
            if (P1.isMojado()==false){
                P2.disparo(R);
            }
            System.out.println(R.toString());
        }

    }
}
