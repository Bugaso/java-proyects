

public class Main {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        matriz[0][0] = 0 ; matriz[1][1] = 0; matriz[2][2] = 0;
        matriz[0][1] = -2; matriz[1][0] = 2; matriz[0][2] = 4; matriz[2][0] = -4; matriz[1][2] = 2; matriz[2][1] = -2;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){

                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }

        System.out.println("Traspuesta de la matriz");

        int aux,count = 0;

        for (int i=0;i<3;i++){
            for (int j=i+1;j<3;j++){
                if(matriz[i][j]== -(matriz[j][i])){
                    count++;
                }
                aux = matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;

            }
        }

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");

        if(count==3){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz no es antisimetrica");
        }
    }
}