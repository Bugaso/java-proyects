import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        3. Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos
            repetidos. Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno
            de los libros de una Biblioteca. La clase Libro debe guardar el título del libro, autor, número de
            ejemplares y número de ejemplares prestados. También se creará en el main un HashSet de tipo
            Libro que guardará todos los libros creados.
            En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus datos y
            los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le pregunta al usuario
            si quiere crear otro Libro o no.
         */

        HashSet<Libro> Libros = new HashSet<>();
        Libro libro = new Libro();
        Scanner leer = new Scanner(System.in);

        String titulo, autor;
        int numeroEjemplares;
        int opcion;
        do {
            System.out.println("Desea agregar un libro? Si[1] No[0]");
            opcion = leer.nextInt();
            if (opcion == 1) {
                leer.nextLine();
                System.out.println("Ingrese el titulo: ");
                titulo = leer.nextLine();
                System.out.println("Ingrese su autor: ");
                autor = leer.nextLine();
                System.out.println("Ingrese la cantidad de ejemplares: ");
                numeroEjemplares = leer.nextInt();
                libro = new Libro(titulo, autor, numeroEjemplares, 0);
                Libros.add(libro);
            }

        } while (opcion != 0);

        Libreria libreria = new Libreria();

        libreria.setLibros(Libros);

        for (Libro libros1 : libreria.getLibros()) {
            System.out.println(libros1.toString());
        }

        do {
            System.out.println("Desea pedir un libro? Si[1] No[0]");
            opcion = leer.nextInt();
            if (opcion == 1) {
                leer.nextLine();
                System.out.println("Ingrese el titulo: ");
                titulo = leer.nextLine();

                if(libreria.prestamo(titulo)){
                    System.out.println("El libro prestado exitosamente!");
                }else {
                    System.out.println("El libro no se encuentra o no quedan ejemplares...");
                }
            }
        } while (opcion != 0);

        for (Libro libros1 : libreria.getLibros()) {
            System.out.println(libros1.toString());
        }
        opcion =1;

        do {
            System.out.println("Desea devolver un libro? Si[1] No[0]");
            opcion = leer.nextInt();
            if (opcion == 1) {
                leer.nextLine();
                System.out.println("Ingrese el titulo: ");
                titulo = leer.nextLine();

                if (libreria.devolucion(titulo)){

                    System.out.println("Libro devuelto con exito!");
                }else{
                    System.out.println("El libro no se pudo devolver...");
                }
            }
        } while (opcion != 0);

        for (Libro libros1 : libreria.getLibros()) {
            System.out.println(libros1.toString());
        }
    }
}