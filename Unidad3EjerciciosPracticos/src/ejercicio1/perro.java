package ejercicio1;

/*
 * nombre, raza, edad y tamaño
 */

public class perro {
	private String nombre;
	private String raza;
	private int edad;
	private double tamaño;

	
	
		public perro(String nombre, String raza, int edad, double tamaño) {
		
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
		this.tamaño = tamaño;
	}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getRaza() {
			return raza;
		}
		public void setRaza(String raza) {
			this.raza = raza;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public double getTamaño() {
			return tamaño;
		}
		public void setTamaño(double tamaño) {
			this.tamaño = tamaño;
		}
		
		
}
