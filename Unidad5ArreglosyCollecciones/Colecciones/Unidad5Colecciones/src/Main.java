public class Main {
    public static void main(String[] args) {

        Cine ROMA = new Cine("ROMA SRL", "Rivadavia 325");
        Pelicula Predator = new Pelicula("Predator", "AB", 4);
        Pelicula Terminator = new Pelicula("Terminator", "Aa", 2);
        Pelicula OnePiece = new Pelicula("Seven seas", "AC", 3);

        ROMA.agregarPelicula(Predator);
        ROMA.agregarPelicula(Terminator);
        ROMA.agregarPelicula(OnePiece);
        ROMA.listarTodo();
        ROMA.listarDuranMas(2);
        ROMA.listarMenorDuracionAMayor();
        ROMA.listarOrdenadasPorTituloAZ();
        ROMA.listarOrdenadasPorDirectorAZ();
    }
}