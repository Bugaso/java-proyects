package pruebasdeljava;

public class persona1 {

	public static void main(String[] args) {
	}
	public class Persona {
	    // Atributos
	    private String nombre;
	    private int edad;
	    private String direccion;
	    private String telefono;
	    
	    // Constructor
	    public Persona(String nombre, int edad, String direccion, String telefono) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.direccion = direccion;
	        this.telefono = telefono;
	    }
	    
	    // Métodos
	    public String getNombre() {
	        return nombre;
	    }
	    
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    public int getEdad() {
	        return edad;
	    }
	    
	    public void setEdad(int edad) {
	        this.edad = edad;
	    }
	    
	    public String getDireccion() {
	        return direccion;
	    }
	    
	    public void setDireccion(String direccion) {
	        this.direccion = direccion;
	    }
	    
	    public String getTelefono() {
	        return telefono;
	    }
	    
	    public void setTelefono(String telefono) {
	        this.telefono = telefono;
	    }
	}

	
}


