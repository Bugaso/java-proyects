import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
    2) En un nuevo proyecto en el método main de su clase principal, se pide crear un algoritmo que
    rellene un vector con los 100 primeros números enteros y los muestre por pantalla en orden
    descendente.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int vector[]= new int[5];

        for (int i=0;i<vector.length;i++){
            vector[i]= leer.nextInt();
        }
        int may=0;
        for (int i=0;i< vector.length;i++){

            //System.out.println("Valor del supuesto mayor: "+vector[i]);

            for (int j=0;j< vector.length-1;j++){

                if(vector[i]>vector[j]){
                    may=vector[i];
                    vector[i]=vector[j];
                    vector[j]=may;
                    /*
                    System.out.println("Valor de vector["+i+"]: "+vector[i]);
                    System.out.println("Valoor de vector["+j+"]: "+vector[j]);
                    */
                }

            }
        }
        System.out.print("Resultado del vector ordenado: ");
        for (int i:vector){
            System.out.print("{"+i+"}, ");
        }
    }
}