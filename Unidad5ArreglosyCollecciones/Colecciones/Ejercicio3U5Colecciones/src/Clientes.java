public class Clientes {

    /*
    Un directorio telefónico posee una lista de Clientes de los que interesa conocer: dni, nombre,
apellido, ciudad y dirección. El directorio está compuesto por el número de teléfono y los datos
del Cliente (Directorio: <teléfono,Cliente> donde el teléfono no es un atributo del cliente. Cuando
agendamos un cliente al directorio telefónico lo agendamos con su número de teléfono, que es
único)
     */

    private int dni;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    public Clientes(int dni,String nombre,String apellido,String ciudad,String direccion) {
        this.dni = dni;
        this.nombre= nombre;
        this.apellido=apellido;
        this.ciudad= ciudad;
        this.direccion= direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        return "\nCliente: " + "\nDNI=" + dni + " \nNombre= " + nombre + "\nApellido= " + apellido + "\nCiudad= " + ciudad +"\nDireccion= " + direccion+"\n";
    }


}
