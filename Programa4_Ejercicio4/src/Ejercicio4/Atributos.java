package Ejercicio4;

public class Atributos {
	
	private String nombre;
	private String raza;
	private double peso;
	private int edad;
	//construct
	public Atributos(String nombre,String raza,double peso,int edad){
		this.nombre=nombre;
		this.raza=raza;
		this.peso=peso;
		this.edad=edad;
	}
	public Atributos() {}
		
	

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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	public void datos() {
		
		System.out.println(nombre+"\n"+raza+"\n"+peso+"\n"+edad+"\n");
	}
}
