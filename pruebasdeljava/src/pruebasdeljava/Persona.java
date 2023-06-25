package pruebasdeljava;
import java.util.Scanner;
public class Persona {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("Ingrese su edad: ");
		int edad = scanner.nextInt();
		System.out.print("Ingrese su numero de telefono: ");
		long numero = scanner.nextLong();
		
		System.out.print("Los datos ingresados son: "+"\nNombre: "+nombre+"\nEdad: "+edad+"\nNumero de telefono: "+numero);
	}

}
