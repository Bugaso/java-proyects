package ejercicio5guia1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		new cuadrado();
		Scanner scanC = new Scanner(System.in);
		
		int n=0;
		int aux=0;
		int cv=0;
		System.out.println("Ingrese el tamaño del cuadrado: ");
		
		cuadrado.grafico(1, 1, scanC.nextInt());

		System.out.println("Ingrese un numero: ");
		
			
			int i = 1;
			elMayorEs.detector(n,i,aux,cv);
			
			
		System.out.println("Ingrese algun numero entre el 1 y el 7");
		
			diadelasemana.elDiaEs(scanC.nextInt());
			
			scanC.close();
	}
	
	
}
