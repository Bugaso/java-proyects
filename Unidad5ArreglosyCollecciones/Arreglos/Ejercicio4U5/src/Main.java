import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*

        4) En un nuevo proyecto, en el método main de su clase principal, se pide realizar un algoritmo
        que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz.

         */
        int[][] matriz = new int[4][4];
        Random aleatorio = new Random();
        for (int i=0;i< 4;i++){
            for (int j=0;j<4;j++){
                matriz[i][j]= aleatorio.nextInt(0,3);
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }

        System.out.println("Traspuesta de la matriz");

        int aux;

        for (int i=0;i<4;i++){
            for (int j=i+1;j<4;j++){
                aux = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;

            }
        }

        for (int i=0;i< 4;i++){
            for (int j=0;j<4;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}