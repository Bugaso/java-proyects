package Ejercicio4;
import java.util.Scanner;
public class perritoguauguau {

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		Scanner scandouble = new Scanner (System.in);
		String nombre = scann.nextLine();
		String raza = scann.nextLine();
		
		
		
		int edad = scandouble.nextInt();
		
		
		double peso = scandouble.nextDouble();
		
		Atributos perro = new Atributos ();
		
		
		perro.setNombre(nombre);
		perro.setRaza(raza);
		perro.setPeso(peso);
		perro.setEdad(edad);
		perro.datos();
	}

}
