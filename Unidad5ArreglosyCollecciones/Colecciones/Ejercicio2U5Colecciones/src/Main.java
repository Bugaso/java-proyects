import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        2) Basados en el ejemplo anterior, ahora nos piden que las Películas no deben repetirse en el Cine,
        para ello en lugar de utilizar un ArrayList, utilizaremos un HashSet; pero ojo!!! Para que el
        HashSet sepa cuando una Película está repetida, es decir, tienen el mismo título, bastará con
        sobreescribir los métodos equals y hashCode en la clase Película.
         */
        Cine ROMA = new Cine("ROMA SRL","Rivadavia 325");


        System.out.println("Ingrese la cantidad de peliculas a agregar: ");
        Scanner leer = new Scanner(System.in);
        int cantP= leer.nextInt();
        Pelicula[] peliculas = new Pelicula[cantP];
        int duracion;
        String TituloDirec;
        String TituloPeli;
        leer.nextLine();
        for(int i=0;i<peliculas.length;i++){
            System.out.println("Ingrese los datos de la pelicula "+(i+1));

            System.out.println("Titulo: ");
            TituloPeli = leer.nextLine();


            System.out.println("Duracion: ");
            duracion=leer.nextInt();


            System.out.println("Director: ");
            leer.nextLine();
            TituloDirec=leer.nextLine();

            peliculas[i] = new Pelicula(TituloPeli,TituloDirec,duracion);
            ROMA.agregarPelicula(peliculas[i]);
        }

        ROMA.listarTodo();

    }
}