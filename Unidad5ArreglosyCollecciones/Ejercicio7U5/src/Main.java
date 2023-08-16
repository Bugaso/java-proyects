import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*

        7) Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3,
        se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la
        matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar
        en la matriz M, desplazándose por filas o columnas, existe al menos una que coincida con la matriz
        P. En ese caso, el programa debe indicar la fila y la columna de la matriz M en la cual empieza
        el primer elemento de la submatriz P.

         */

        int[][] M = new int[6][6];
        int[][] P = new int[3][3];
        Random random = new Random();
        for (int i=0;i<M.length;i++){
            for(int j=0;j<M.length;j++){
                M[i][j]= (int) random.nextInt(0,10);
                System.out.print("["+M[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (int i=0;i<P.length;i++){
            for(int j=0;j<P.length;j++){
                P[i][j] = M[i][j+2];
                System.out.print("["+P[i][j]+"]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int count=0;
        int i = 0,j = 0;

        while (i< M.length-2 && count!=9){
            while (j< M.length-2 && count!=9){
                for(int k=0;k< P.length;k++){
                    for (int m=0;m< P.length;m++) {

                        if (P[k][m] == M[i + k][j + m]) {
                            count++;

                        }else{
                            count=0;
                        }
                    }
                }j++;
            }i++;
        }
        if(count==9){
            System.out.println("La matriz P si se encuentra en la matriz M");
        }else{
            System.out.println("La matriz P no se encuentra en la matriz M");
        }
    }
}