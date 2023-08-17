import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        1) En un nuevo proyecto implementaremos una Pila, una Pila es una estructura de datos donde las
        inserciones y recuperaciones/borrados de datos se hacen en uno de los finales, que es conocido
        como tope de la pila. Como el último elemento insertado es el primero en recuperarse/borrarse,
        los desarrolladores se refieren a estas pilas como pilas LIFO (last-in, first-out).
         */

        Pila pilaS = new Pila(10);
        Scanner leer = new Scanner(System.in);
        String elemento;
        System.out.println("Ingrese datos en la Pila:");
        for (int i=0;i<5;i++){
            elemento=leer.nextLine();
            pilaS.agregar(elemento);

        }
        System.out.println("Mostrando elementos: ");
        for (int i= pilaS.getTope();i>-1;i--){
            System.out.print("["+pilaS.getElementos()[i]+"]");
        }
        System.out.println("");
        System.out.println("Quitando un elemento...");
        pilaS.quitar();

        System.out.println("Mostrando otra vez la pila...");
        for (int i= pilaS.getTope();i>-1;i--){
            System.out.print("["+pilaS.getElementos()[i]+"]");
        }
    }
}