package Ejercicio4guia1;

public class Convertidor {
	
	private double peso;
	private double dolar;
	
	public void construc(double dolar, double peso) {
		this.peso=peso;
		this.dolar=dolar;
	}
	public void construc1() {}
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getDolar() {
		return dolar;
	}

	public void setDolar(double dolar) {
		this.dolar = dolar;
	}
	public void convertirAPesos(double montoD) {
		
		System.out.println("El monto en dolar pasado a pesos es: "+(peso=montoD*211.34));
	}
	public void convertirADolar(double montoP) {
		
		System.out.println("El monto en pesos pasado a dolar es: "+(dolar=montoP/211.34));
	}
}
