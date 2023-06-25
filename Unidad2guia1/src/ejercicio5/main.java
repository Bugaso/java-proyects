package ejercicio5;
//5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
//triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt().

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		
		int n = leer.nextInt();
		
		double doble = n*2;
		double triple =n*3;
		
		double raiz = Math.sqrt(n);
		
		System.out.println("El doble de "+n+" es "+doble+" su triple "+triple+" y su raiz "+raiz);
	}

}
