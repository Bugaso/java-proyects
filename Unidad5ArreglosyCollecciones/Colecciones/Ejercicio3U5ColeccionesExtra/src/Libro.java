public class Libro {

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

    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroPrestados;

    public Libro(){

    }
    public Libro(String titulo,String autor,int numeroEjemplares,int numeroPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = numeroPrestados;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public void setNumeroPrestados(int numeroPrestados) {
        this.numeroPrestados = numeroPrestados;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public int getNumeroPrestados() {
        return numeroPrestados;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "\ntitulo = " + titulo +
                "\nautor = " + autor +
                "\nnumeroEjemplares = " + numeroEjemplares +
                "\nnumeroPrestados = " + numeroPrestados +"\n";
    }
}
