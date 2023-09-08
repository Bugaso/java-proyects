import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        1. Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los
        guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se introduzca el
        valor -99. Este valor no se guarda en el ArrayList. A continuación, el programa mostrará por
        pantalla el número de valores que se han leído, su suma y su media (promedio).
         */

        ArrayList<Integer> Lista = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        int num,cant = 0,sum=0;
        do{
            System.out.println("Ingrese numeros enteros: ");
            num = leer.nextInt();

            if(num != -99){
                Lista.add(num);
                sum+=num;
                cant++;
            }
        }while (num !=-99);
        System.out.println("Valores leidos: ");
        for (int number : Lista){
            System.out.println("Valor: "+number);
        }
        System.out.println("La suma de los valores es: "+sum);
        System.out.println("Y su promedio es: "+(float)sum/cant);
    }
}