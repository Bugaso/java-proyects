public class Alumno {

    /*
    Alumno son: legajo, apellido, nombre y año que cursa.
     */

    private int legajo;
    private String apellido;
    private String nombre;
    private int año;

    public Alumno() {
    }
    public Alumno(int legajo, String apellido, String nombre, int año) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.año = año;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApellido() {
        return apellido;
    }

    @Override
    public String toString() {
        return "\nAlumno: " +
                "\nLegajo = " + legajo +
                "\nApellido = " + apellido +
                "\nNombre = " + nombre +
                "\nAño = " + año;
    }
}
