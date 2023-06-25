package ejercicio6;
import java.util.Scanner;
public class main {
//Implementar un método que reciba por parámetro dos números enteros y determine cuál es
//	el mayor y lo muestre por pantalla.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Ingrese 2 numeros teneros: ");
		
		int n=leer.nextInt();
		
		int n1 = leer.nextInt();
		
		determina.calculo( n, n1);
		
		
		}

}
