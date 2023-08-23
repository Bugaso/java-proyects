import java.util.Objects;
import java.util.HashSet;
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;

    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pelicula pelicula = (Pelicula) obj;
        return duracion == pelicula.duracion &&
                Objects.equals(titulo, pelicula.titulo) &&
                Objects.equals(director, pelicula.director);
    }
    @Override
    public int hashCode() {
        return Objects.hash(director, titulo, duracion);
    }
}


