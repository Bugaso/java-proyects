package ejercicio1;



/*
 * Realizar un programa para que una Persona pueda adoptar hasta tres Perros. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño, un constructor que
permita inicializar todos sus atributos y los respectivos métodos getter y setter de sus atributos; y
la clase Persona con atributos: nombre, apellido, edad, documento y tres atributos de tipo Perro,
un constructor que sólo permita inicializar los atributos: nombre, apellido, edad y documento. La
Persona cuenta además con los siguientes métodos:
adoptarPerro() Este método recibe por parámetro un Perro y lo asigna en alguna de las variables
vacías; si todas las variables atributos Perro están ocupadas, mostrará un mensaje “Ya no puedo
adoptar”.
perroMasGrande() Este método retornará el Perro de mayor edad.

Ahora deberemos en el main crear una Persona y 4(cuatro) Perros. Después, vamos a hacer que
persona adopte cada uno de esos Perros (luego al ejecutar veremos que pasa), por último pediremos
a la Persona que nos diga cual es el Perro más viejo.
 */
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		persona yo = new persona();

		Object[] perro = new Object[4];

		perro [0] = new perro("sid", "calle", 12, 1.3);
		perro [1] = new perro("Max", "uwu", 15, 1.5);
		perro [2] = new perro("Luna", "A", 11, 1.3);
		perro [3] = new perro("Rex", "b", 9, 2);

		yo.adoptarPerro((ejercicio1.perro) perro[0]);
		yo.adoptarPerro((ejercicio1.perro) perro[1]);
		yo.adoptarPerro((ejercicio1.perro) perro[2]);

		perro perromasViejo=yo.MayorEdad((ejercicio1.perro) perro[0],(ejercicio1.perro) perro[1],(ejercicio1.perro) perro[2]);

		if (perromasViejo != null) {
			System.out.println("El perro más viejo es " + perromasViejo.getNombre() + " con " + perromasViejo.getEdad() + " años.");
		} else {
			System.out.println("No hay perros adoptados.");
		}

	}

}
