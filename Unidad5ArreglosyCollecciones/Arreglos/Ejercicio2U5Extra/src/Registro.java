import java.util.Scanner;

public class Registro {
    private double[][] promM;
    private String[][] persona;
    private String[] localidad;
    private int tope=-1;

    public Registro( int tamano) {

        this.promM = new double[tamano][12];
        this.persona = new String[tamano][12];
        this.localidad = new String[tamano];

    }
    public void Agregar () {

        tope++;
        Scanner leer = new Scanner(System.in);

        if(tope<localidad.length){
            System.out.println("Ingrese el nombre de la localidad");
            localidad[tope]=leer.nextLine();
            for(int i=0;i<3;i++){
                System.out.println("Ingrese el promedio mensual del mes "+(i+1));

                promM[tope][i]=leer.nextDouble();

                System.out.println("Ingrese el nombre del registrador");
                leer.nextLine();
                persona[tope][i]=leer.nextLine();
                System.out.println("Ingrese el apellido del registrador");
                persona[tope][i]+=" "+leer.nextLine();
            }
        }else{
            System.out.println("Tope excedido");
            tope--;
        }

    }
    public double promAltoL(int localidad){

        double aux = promM[localidad][0];
        for(int i=0;i<12;i++){
            if(aux<=promM[localidad][i]){
                aux=promM[localidad][i];
            }
        }
        return aux;

    }
    public double promAlto(){

        double aux= promM[0][0];
        for (int i=0;i<=tope;i++){
            for (int j=0;j<12;j++){
                if(aux<=promM[i][j]){
                    aux=promM[i][j];
                }
            }
        }
        return aux;

    }

    public String[] getLocalidad() {
        return localidad;
    }

    public int getTope() {
        return tope;
    }
}
