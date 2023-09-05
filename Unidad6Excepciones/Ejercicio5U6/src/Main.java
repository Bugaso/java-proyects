import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
       /*
       5. Escribir un programa en Java que juegue con el usuario a adivinar un número.
        La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene
        que intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, la
        computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor
        que el que ha introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e
        imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número. Si
        el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo
        por pantalla. En este último caso también se debe contar el carácter fallido como un
        intento.
        */

        int NumAleatorio = new Random().nextInt(1,2);
        Scanner leer = new Scanner(System.in);
        String adivinador = "0";
        int contador=0;
        int num = parseInt(adivinador);
        System.out.println("Ingrese un numero entre el 1 y 500: \n");
        do{

            try{
                adivinador= leer.nextLine();
                num = parseInt(adivinador);
                if(num>NumAleatorio){
                    System.out.println("El numero ingresado es mayor al buscado... \n");
                    contador++;
                }else if(num<NumAleatorio){
                    System.out.println("El numero ingresado es menor al buscado... \n");
                    contador++;
                }

            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
                System.err.println("Ingrese un numero valido para poder pasarla a un numero entero...\n");
                contador++;
            }


        }while (num != NumAleatorio);
        System.out.println("\nExelente, adivino el numero: "+NumAleatorio+"\nY la cantidad de intentos fueron: "+contador);
    }

}