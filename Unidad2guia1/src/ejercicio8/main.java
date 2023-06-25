package ejercicio8;

import java.util.Scanner;

//Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un
//mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals()
//de String.

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		
		String cadena = leer.nextLine();
		
		
		frase.verificar(cadena);
		leer.close();
	}

}
