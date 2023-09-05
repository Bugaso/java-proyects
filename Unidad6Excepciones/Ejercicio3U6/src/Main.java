import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        /*
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer
        dos números en forma de cadena. A continuación, utilice el método parseInt() de la clase
        Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por
        ultimo realizar una división con los dos números y mostrar el resultado.
         */
        // Ejercicio 4:
        /*
        Demuestre como provocar intencionalmente una excepción del tipo
        NumberFormatException, luego agregue las sentencias try/catch para mostrar los
        mensajes de error.
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros:");
        String n1 = leer.nextLine();
        String n2 = leer.nextLine();

        try{
            int var1 = parseInt(n1);
            int var2 = parseInt(n2);

            float resul = var1/var2;

        }catch (NumberFormatException e){

            System.out.println(e.fillInStackTrace());
        }


    }
}