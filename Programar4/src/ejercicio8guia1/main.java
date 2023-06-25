package ejercicio8guia1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		 calculo calc = new calculo();
		 
		 int n;
		 
		 System.out.println("Ingrese algun numero: ");
		 n=scan.nextInt();
		 
		 calculo.esPrimo(n);
		 System.out.println(calculo.esPrimo(n));
		 
		 
		 
		 System.out.println("Ingrese un numero para saber su valor absoluto: ");
		 
		 n=scan.nextInt();
		 
		 sacarabsoluto.Absoluto(n, 0);
		 
		 
	}

}
