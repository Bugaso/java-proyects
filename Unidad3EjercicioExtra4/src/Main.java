
public class Main {
    /*
    En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
    Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de un
    número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua, se dispara
    y se moja. Las clases a hacer del juego son las siguientes:
     */
    public static void main(String[] args) {
        Jugador[] Ps = new Jugador[2];
        Ps[0] = new Jugador(32131, "Juan", false);
        Ps[1] = new Jugador(32132, "Enzo", false);
        RevolverAgua R8 = new RevolverAgua();
        Juego Play = new Juego();
        R8.llenarRevolver();
        Play.llenarJuego(Ps[0], Ps[1], R8);
        System.out.println("Primer posicion del revolver" + R8.toString());

        Play.ronda();

        System.out.println(Ps[0].isMojado());
        System.out.println(Ps[1].isMojado());


        if(Ps[0].isMojado()){
            System.out.println("Jugador 1 mojado");
        }
        if(Ps[1].isMojado()){
            System.out.println("Jugador 2 mojado");
        }

    }
}