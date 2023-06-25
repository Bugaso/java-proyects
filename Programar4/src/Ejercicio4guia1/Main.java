package Ejercicio4guia1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			Convertidor convert = new Convertidor();
			
			System.out.println("Introduzca Dolares: ");
			double montoD = scan.nextDouble();
			
			System.out.println("Introduzca Pesos: ");
			double montoP = scan.nextDouble();
			
			convert.convertirAPesos(montoD);
			convert.convertirADolar(montoP);
		 scan.close();
	}

}
