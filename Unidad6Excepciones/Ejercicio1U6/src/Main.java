public class Main {
    public static void main(String[] args) {
        /*
        1. Demuestre como provocar intencionalmente una excepción del tipo
        NullPointerException, luego agregue las sentencias try/catch para mostrar el mensaje de
        error.
         */
        try {
            System.out.println("Provocando un NullPointerException.\n");
            String cadena = null;
            int longitud = cadena.length();
            System.out.println(longitud);

        }catch (NullPointerException Nulo){
            System.out.println("La cadena no contiene ningun valor...");
        }
    }
}