package ejercicio9;

import java.util.Scanner;

public class main {
/*
 * Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el
dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo,
y el número de restas realizadas es el cociente. Por ejemplo: 50 / 13:
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in);
		
		System.out.println("Ingrese un numero: ");
		int n = scann.nextInt();
		System.out.println("Ingrese otro numero: ");
		int n1=scann.nextInt();
		
		dividiendo.restas(n, n1);
	}
	
}
