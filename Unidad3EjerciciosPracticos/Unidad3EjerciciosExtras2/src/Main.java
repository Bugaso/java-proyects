
/*
En el siguiente modelo, tenemos una clase Jugador con los atributos: nombre y clasificación; un
constructor que inicializa su atributo nombre y los métodos:
tirarDado(): Que recibe por parámetro un Dado, lo que hará este método es invocar el método
generarNro del dado y acumulará el valor del Dado en su atributo clasificación.
verClasificación(): Retornará la clasificación del jugador.
Por otro lado, tenemos la clase Dado que posee como atributo: número que es un valor entero y
los métodos:
generarNro(): Que genera un número al azar entre 1 y 6 que se lo asigna a su variable atributo
numero, si el atributo tiene un valor mayor a 0, significa que ese dado ya generó un valor y lo
mantendrá.
verNro(): Retornará el valor guardado en la variable numero.
 */
public class Main {
    public static void main(String[] args) {

        /*
        Desde una clase TestJuego se pide:
        a) Crear 3 Dados.
        b) Crear un Jugador de nombre “Pocho” y pedirle que tire los 3 Dados.
        c) Mostrar al final la clasificación del Jugador.
        d) Ahora Crear otros 3 Dados más.
        e) Crear un nuevo Jugador de nombre “Pepe” y pedirle que tire los 3 últimos dados creados.
        f) Al finalizar mostrar de los 2 jugadores el nombre que obtuvo la mayor clasificación.
         */

        Dado[] daditos = new Dado[3];

        Jugador Pocho= new Jugador();

        for (int i=0;i<3;i++) {
            daditos[i]= new Dado();
            Pocho.tirarDado(daditos[i]);
        }

        Jugador Pepe = new Jugador();

        for (int i=0;i<3;i++) {
            daditos[i]= new Dado();
            Pepe.tirarDado(daditos[i]);
        }

        System.out.println("La clasificacion de Pocho es: "+Pocho.verClasificacion());
        System.out.println("La clasificacion de Pepe es: "+Pepe.verClasificacion());

    }
}