package pruebasdeljava;
import java.util.Scanner;
public class Coche {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
Scanner scanner1 = new Scanner (System.in);
		System.out.print("Ingrese la marca del auto: ");
		String marca = scanner1.nextLine();
		System.out.print("Ingrese el modelo del auto: ");
		String modelo = scanner1.nextLine();
		System.out.print("Ingrese el color del auto: ");
		String color = scanner1.nextLine();
		System.out.print("Ingrese el año del auto: ");
		int año = scanner.nextInt();
		System.out.print("Ingrese la velocidad del auto en Km/h: ");
		int velocidad = scanner.nextInt();
		
		System.out.print("Cuantas horas acelerara el auto?: ");
		int time = scanner.nextInt();
		
		int distancia = velocidad*time;
		
		System.out.print("La distancia recorrida fue: "+distancia+"Km");
		
	}

}
