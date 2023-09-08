import java.util.HashSet;

public class Libreria {

    /*
    La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto.
• Constructor con parámetros.
• Métodos Setters/getters
     */

    private HashSet<Libro> Libros = new HashSet<>();

    public Libreria() {
    }

    public Libreria(HashSet<Libro> libros) {
        Libros = libros;
    }

    public HashSet<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        Libros = libros;
    }
    /*
    • Método prestamo(): El usuario ingresa el título del libro que quiere prestar y se lo busca en el
    conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa
    de a uno, como un carrito de compras, el atributo ejemplares prestados, del libro que ingresó el
    usuario. Esto sucederá cada vez que se realice un préstamo del libro. No se podrán prestar libros

    de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar
    la operación y false en caso contrario.
     */

    public boolean prestamo(String titulo) {

        for (Libro libro1 : Libros) {
            if (libro1.getTitulo().equals(titulo) && libro1.getNumeroEjemplares()>0) {

                libro1.setNumeroEjemplares(libro1.getNumeroEjemplares() - 1);
                libro1.setNumeroPrestados(libro1.getNumeroPrestados() + 1);

                return true;
            }
        }
        return false;
    }

    /*
    • Método devolucion(): El usuario ingresa el título del libro que quiere devolver y se lo busca en
    el conjunto. Si está en el conjunto, se llama con ese objeto al método. El método decrementa de a
    uno, como un carrito de compras, el atributo ejemplares prestados, del libro seleccionado por el
    usuario. Esto sucederá cada vez que se produzca la devolución de un libro. No se podrán devolver
    libros donde que no tengan ejemplares prestados. Devuelve true si se ha podido realizar la
    operación y false en caso contrario.
     */

    public boolean devolucion(String Titulo){
        for (Libro libro : Libros){
            if(libro.getTitulo().equals(Titulo)){
                libro.setNumeroEjemplares(libro.getNumeroEjemplares() + 1);
                libro.setNumeroPrestados(libro.getNumeroPrestados() - 1);
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Libreria " + "Libros = " + Libros.toString();
    }
}
