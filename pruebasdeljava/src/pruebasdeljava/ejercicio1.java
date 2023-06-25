package pruebasdeljava;
//Pedir al usuario que ingrese un número entero positivo y luego 
//calcular la suma de los números impares del 1 al número ingresado utilizando un bucle while.

import java.util.Scanner;
public class ejercicio1 {

	public static void main(String[] args) {
		Scanner scann = new Scanner (System.in);
		System.out.println("Ingrese un numero");
		int lados=scann.nextInt();
		for (int i=0;i<=lados;i++) {
			for (int j=0;j<=lados;j++) {
					if (i==0||i==lados) {
					System.out.print("* ");
				}else if(j==0||j==lados){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
