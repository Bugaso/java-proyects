import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        6) Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma
        de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir
        un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá
        comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.
         */
        JPanel Panel = new JPanel();
        Panel.setVisible(true);

        Panel.setSize(800,400);
        Scanner leer = new Scanner(System.in);

        int[][] Matriz = new int[3][3];

        int j=0;
        System.out.println("Ingrese numeros");
        for (int i=0;i<3;i++){
            do {
                Matriz[i][j]= leer.nextInt();
                if(Matriz[i][j]>0 && Matriz[i][j]<=9){
                    j++;
                }else {
                    System.out.println("El numero debe estar entre 1 y 9");
                }
            }while (j<3);
            System.out.println("Primer bucle completado");
            j=0;
        }

        int diagonal1=0;int[]fc= new int[3];int[] cf= new int[3];
        int diagonal2=0;
        fc[0]=0;fc[1]=0;fc[2]=0;
        cf[0]=0;cf[1]=0;cf[2]=0;
        j=2;
        int contador=0;
        for(int i=0;i<3;i++){
            for(int k=0;k<3;k++){
                fc[i]+=Matriz[i][k];
                cf[i]+=Matriz[j][k];

            }
            if(cf[i]==fc[i]){
                contador++;
            }
            diagonal2+=Matriz[i][j-i];
            diagonal1+=Matriz[i][i];
        }
        System.out.println("Valor de diagonal principal = "+diagonal1);
        System.out.println("Valor de diagonal secundaria = "+diagonal2);
        System.out.println("Valor de filas respecto columnas = "+fc[0]+" | "+fc[1]+" | "+fc[2]);
        System.out.println("Valor de columnas respecto filas = "+cf[0]+" | "+cf[1]+" | "+cf[2]);

        if(diagonal2== diagonal1 && diagonal1 == fc[0] && contador==3){
            System.out.println("La matriz es un cuadrado magico!!!");
        }else{
            System.out.println("La matriz no es un cuadrado magico...");
        }


    }

}