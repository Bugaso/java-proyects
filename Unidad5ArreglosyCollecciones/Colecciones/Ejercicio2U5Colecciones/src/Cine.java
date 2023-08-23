import java.util.*;

public class Cine {
    private String nombre;
    private String direccion;
    private HashSet<Pelicula> proyecciones;
    private List<Pelicula>proyeccionesL;
    public Cine(String nombre, String direccion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.proyecciones=new HashSet<>();
        this.proyeccionesL= new ArrayList<>(proyecciones);
    }
    public void agregarPelicula(Pelicula pelicula) {

       if(!proyecciones.contains(pelicula)){
           proyecciones.add(pelicula);

       }
    }
    public void listarTodo(){
        System.out.println("Lista de peliculas disponibles en el cine: ");
        for (Pelicula peliculas:proyecciones) {
            System.out.println(peliculas.getTitulo());
            System.out.println(peliculas.getDirector());
            System.out.println(peliculas.getDuracion());
            System.out.println("");
        }
    }
    public void listarDuranMas(int horas){
        System.out.println("Lista de peliculas con una duracion mayor a la seleccionada: \n");
        for (Pelicula peliculas:proyecciones){
            if(peliculas.getDuracion()>horas){
                System.out.println(peliculas.getTitulo());
                System.out.println(peliculas.getDirector());
                System.out.println(peliculas.getDuracion());
                System.out.println("");
            }
        }
    }
    public void listarMenorDuracionAMayor() {
        System.out.println("Lista de menor a mayor duracion");

        Collections.sort(proyeccionesL, Comparator.comparingInt(Pelicula::getDuracion));

        for(Pelicula pelicula:proyecciones){
            System.out.println(pelicula.getTitulo());
            System.out.println(pelicula.getDirector());
            System.out.println(pelicula.getDuracion());
        }
    }
    public void listarOrdenadasPorTituloAZ() {
        System.out.println("Lista ordenada por titulo AZ");
                Collections.sort(proyeccionesL, Comparator.comparing(Pelicula::getTitulo));
                for(Pelicula pelicula: proyecciones){
                    System.out.println(pelicula.getTitulo());
                    System.out.println(pelicula.getDirector());
                    System.out.println(pelicula.getDuracion());
                }
    }
    public void listarOrdenadasPorDirectorAZ() {
        System.out.println("Lista ordenada por director AZ");
        Collections.sort(proyeccionesL, Comparator.comparing(Pelicula::getDirector));
        for(Pelicula pelicula: proyecciones){
            System.out.println(pelicula.getTitulo());
            System.out.println(pelicula.getDirector());
            System.out.println(pelicula.getDuracion());
        }
    }


}




