package ejercicio1;

/*
 * nombre, apellido, edad, documento
 */
public class persona {
	private String nombre;
	private String apellido;
	private int edad;
	private int documento;
	private perro perro1;
	private perro perro2;
	private perro perro3;
	
	
	public persona() {}
	
			public persona(String nombre, String apellido, int edad, int documento) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.edad = edad;
			this.documento = documento;
			this.perro1 = perro1;
			this.perro2 = perro2;
			this.perro3 = perro3;
			
			}

	public  void adoptarPerro(perro perro) {
			
					if (perro1==null) {
						perro1=perro;
						System.out.println("perro adoptado");
					}else if (perro2==null) {
						perro2=perro;
						System.out.println("perro adoptado");
					}else if (perro3==null) {
						perro3=perro;
						
						System.out.println("perro adoptado");
					}else {
						System.out.println("Ya no puedo adoptar mas perros.");
					}
			
	}
	public perro MayorEdad(perro perro1, perro perro2, perro perro3) {
		perro perroMasViejo = perro1;

		if (perro2.getEdad() > perroMasViejo.getEdad()) {
			perroMasViejo = perro2;
		}

		if (perro3.getEdad() > perroMasViejo.getEdad()) {
			perroMasViejo = perro3;
		}

		return perroMasViejo;
	}


}

