import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
    1) En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos
    estáticos (static):

    a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
    enteros y muestre por pantalla la suma y promedio de los mismos.

    b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
    irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
    c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
    de vocales que tiene la cadena.

    d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
    retorne la cantidad de veces que se repite en la cadena el carácter recibido.

    Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
    de la clase Arreglo creada por usted.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de numeros a sumar: ");
        int n= leer.nextInt();
        int num[] = new int[n];
        System.out.println("Ingrese los numeros: ");
        for (int i=0;i<num.length;i++){

            num[i]=leer.nextInt();
        }
        Arreglo.sumarLista(num);
        Arreglo.buscarMayor(num);

        leer.nextLine();

        System.out.println("Ingrese una frase: ");
        String cadena= leer.nextLine();

        System.out.println("Ingrese un caracter a buscar: ");
        char caracter = leer.next().charAt(0);

        System.out.println("La cantidad de vocales que tiene la frase es: "+Arreglo.cuentaVocales(cadena));
        System.out.println("La cantidad de veces en que se repite el caracter "+caracter+ "son:"+Arreglo.cuentaCaracter(cadena,caracter));

    }
}