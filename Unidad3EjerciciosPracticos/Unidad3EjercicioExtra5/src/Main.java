/*
        En un nuevo proyecto, nos piden modelar e implementar lo siguiente:
        Para regar un parque se dispone de una Bomba, la cual posee un Motor y este un Tanque de Agua.

        Se pide desde el método main de una clase TestRegar:
        a) Crear un Tanque y llenarlo con 5000 litros de agua.
        b) Crear un Motor con este Tanque y que trabaje a velocidad Media.
        c) Crear una Bomba con el motor instanciado en el punto b.
        d) Hacer que la Bomba riegue y al finalizar invocar al método mostrarInfo.
 */
public class Main {
    public static void main(String[] args) {

        TanqueAgua Ñoquicito = new TanqueAgua(5000);
        Motor Motorcito = new Motor(2, Ñoquicito);
        Bomba Bomberman = new Bomba(Motorcito);

        System.out.println(Bomberman.toString());
        Bomberman.Regar();
        System.out.println(Bomberman.toString());

    }
}