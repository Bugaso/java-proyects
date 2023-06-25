package ejercicio5guia1;


public class diadelasemana {
	private int dia;
	
	public diadelasemana () {}
	
	public diadelasemana(int dia) {
		this.dia=dia;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public static void elDiaEs(int dia) {
		
		switch (dia) {
			case 1:
				System.out.println("El dia es Lunes");
			break;
			
			case 2:
				System.out.println("El dia es Martes");
			break;
			
			case 3:
				System.out.println("El dia es Miercoles");
			break;
			
			case 4:
				System.out.println("El dia es FELIZ JUEVES");
			break;
			
			case 5:
				System.out.println("El dia es Viernes");
			break;
			
			case 6:
				System.out.println("El dia es Sabado");
			break;
			
			case 7:
				System.out.println("El dia es Domingo");
			break;
			
			default:
				System.out.println("El numero ingresado es invalido...");
		}
	}
}
