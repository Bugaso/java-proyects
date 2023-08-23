public class Main {
    public static void main(String[] args) {
        /*
        2) Basados en el ejemplo anterior, ahora nos piden que las Películas no deben repetirse en el Cine,
        para ello en lugar de utilizar un ArrayList, utilizaremos un HashSet; pero ojo!!! Para que el
        HashSet sepa cuando una Película está repetida, es decir, tienen el mismo título, bastará con
        sobreescribir los métodos equals y hashCode en la clase Película.
         */
        Cine Rensi = new Cine("Rensi","Vea");
        Pelicula p1 = new Pelicula("LEGO","Yo",1);
        Pelicula p2 = new Pelicula("LEGO","Yo",1);
        Rensi.agregarPelicula(p1);
        Rensi.agregarPelicula(p2);
        Rensi.listarTodo();
    }
}