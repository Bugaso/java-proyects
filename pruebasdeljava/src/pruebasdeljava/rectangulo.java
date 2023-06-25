package pruebasdeljava;
import java.util.Scanner;
public class rectangulo {
/*
 * Crear una clase "Rectángulo" con los siguientes atributos: base y altura.
 *  La clase debe tener un constructor y métodos para calcular el área y el perímetro del rectángulo.
 *   Luego, crear un objeto de la clase "Rectángulo" en el método "main" y utilizar 
 *   los métodos para calcular y mostrar el área y el perímetro del rectángulo.
 */
	public static void main(String[] args) {
		
		Scanner lados = new Scanner(System.in);
		System.out.println("Ingrese la base");
		
		int base = lados.nextInt();
		
		System.out.println("Ingrese la altura");
		
		int altura = lados.nextInt();
		
		double area = base*altura;
	}

}
