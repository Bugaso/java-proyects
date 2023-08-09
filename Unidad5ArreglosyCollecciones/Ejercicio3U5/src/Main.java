import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    /*
    3) En un nuevo proyecto, en el método main de su clase principal, se pide crear un algoritmo que
    rellene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el
    vector. El programa mostrará donde se encuentra el número y si se encuentra repetido
     */

    public static void main(String[] args) {

        System.out.println("Ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();

        int[] vector = new int[n];
        int[] ubicaciones = new int[n];
        Random aleatorio = new Random(System.currentTimeMillis());

        for(int i=0;i<n;i++){
            vector[i]= aleatorio.nextInt(0,9);
            System.out.println("Valor del vector["+ i +"] = "+vector[i]);
        }

        System.out.println("Ingrese un numero a buscar: ");
        n = leer.nextInt();
        int count = 0;

        for (int i = 0, j = 0; i< vector.length; i++){
            if(n == vector[i]) {
                ubicaciones[count]=i;
                count ++;
            }
        }

        if(count>=1){
            System.out.println("El numero fue encontrado en la ubicacion vector["+ubicaciones[0]+"]");
            if(count>1){
                System.out.println("Y en las sig ubicaciones: ");
                for (int i=0;i<count;i++){
                    System.out.println("Vector ["+ubicaciones[i]+"]");
                }
            }else{
                System.out.println("Y no se repite");
            }
        }
    }
}