package pruebasdeljava;
import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Scanner scanner1 = new Scanner (System.in);
		System.out.print("Ingrese el numero de la cuenta: ");
		int numero = scanner.nextInt();



		System.out.print("Ingrese el nombre del titular: ");

		String nombre = scanner1.nextLine();

		System.out.print("Ingrese su saldo: ");
		int saldo = scanner.nextInt();

		System.out.print("Ingrese la taza de interez: ");

		double interes = scanner.nextDouble();
		interes= interes/100;
		boolean opcion = false;

		do {
			System.out.print("Desea depositar dinero?: ");
			String desicion = scanner1.nextLine();
			if (desicion.equals("no")||desicion.equals("No")||desicion.equals("NO")||desicion.equals("nO")) {

				opcion = false;
			}
			else {

				System.out.print("Ingrese el dinero a depositar: ");
				int deposito = scanner.nextInt();
				System.out.print("El dinero fue acreditado a su cuenta!"+"\nSu nuevo salario es: "+(deposito+saldo));
			}
			System.out.print("\nDesea retirar su saldo?: ");
			desicion = scanner1.nextLine();
			if (desicion.equals("no")||desicion.equals("No")||desicion.equals("NO")||desicion.equals("nO")) {
				opcion = false;

			}else {
				System.out.print("Cuanto desea retirar:?");
				int retiro = scanner.nextInt();

				System.out.print("Usted retirará: "+retiro+"\nY se descontara un %"+interes+"\nSu saldo a retirar total será: "+(retiro-retiro*interes));

		}
			System.out.print("\nDesea realizar otra operacion?: ");
			desicion = scanner1.nextLine();
			if (desicion.equals("no")||desicion.equals("No")||desicion.equals("NO")||desicion.equals("nO")) {
				opcion = false;

				}else {
					opcion = true;
				}

			} while (opcion);
	}

}
