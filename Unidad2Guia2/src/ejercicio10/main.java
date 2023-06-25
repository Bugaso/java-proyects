package ejercicio10;

import java.util.Scanner;

public class main {
/*
 * Realice un método para que el usuario adivine el resultado de una multiplicación entre dos
números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta
es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su
respuesta nuevamente. Para realizar este ejercicio investigue como utilizar la función
Math.random() de Java.
 */

	public static void main(String[] args) {
		int n = 0;
		int n1 = 0;
		n1= (int) (Math.random()*10+0); 
		n=(int) (Math.random()*10+0);
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Intenta adivinar el numero secreto! ");
		
		int adivi = scann.nextInt();
		
		mathrandom.calc(adivi,n,n1);
		scann.close();
	}
	
}
