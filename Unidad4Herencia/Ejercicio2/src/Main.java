
public class Main {

/*
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio
final de los dos electrodomésticos.
 */
    public static void main(String[] args) {

        Lavadora Lavadora = new Lavadora(2000,"red",'F',40,60);
        Electrodomestico Televisor = new Televisor(4000,"black",'B',60,40,true);

        System.out.println("El precio de la lavadora UgarteT313 es: "+Lavadora.precioFinal());
        System.out.println("El precio de la Television LedesmaTV2 es :"+ Televisor.precioFinal());

    }
}