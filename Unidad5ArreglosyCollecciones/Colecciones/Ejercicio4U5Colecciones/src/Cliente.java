import java.time.LocalDate;

public class Cliente {
    private String nombre;
    private String apellido;
    private String localidad;
    private LocalDate fNacimiento;

    public Cliente() {
    }

    public Cliente(String nombre,String apellido,String localidad,LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad= localidad;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(LocalDate fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "\nCliente: " +
                "\nNombre= " + nombre +
                "\nApellido= " + apellido +
                "\nLocalidad= " + localidad +
                "\nfNacimiento= " + fNacimiento;
    }
}
