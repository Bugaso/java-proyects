public class Main {
    public static void main(String[] args) {
        /*
        Demuestre como provocar intencionalmente una excepción del tipo
        ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango); luego agregue las
        sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
         */


        try{
            int [] arreglo = new int[1];
            int valor = arreglo[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.fillInStackTrace());

        }
    }
}