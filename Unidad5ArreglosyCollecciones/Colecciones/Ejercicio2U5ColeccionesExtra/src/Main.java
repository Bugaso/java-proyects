import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        2. Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y tendrá como
        atributos el nombre y discoConMasVentas.
        Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos de tipo
        CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante y su disco con
        más ventas por pantalla.
        Una vez agregado los 5, en otro bucle, crear un menú que le dé la opción al usuario de agregar un
        cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario elija o de salir del
        programa. Al final se deberá mostrar la lista con todos los cambios.
         */

        ArrayList<CantanteFamoso> cantantes = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        CantanteFamoso[] cantante = new CantanteFamoso[2];
        cantante[0] = new CantanteFamoso("Michael Jackson","Thriller");
        cantantes.add(cantante[0]);
        cantante[1] = new CantanteFamoso("Damian Leguizamon","La vaca pirata");
        cantantes.add(cantante[1]);

        int opcion = 0;
        String datos1,datos2;

        for (CantanteFamoso cantante1 : cantantes){
            System.out.println(cantante1.toString());
        }

        do{
            System.out.println("Desea añadir algun cantante?: Si[1] No[0]");
            opcion = leer.nextInt();
            if(opcion == 1){

                System.out.println("Ingrese el nombre del cantante: ");
                datos1 = leer.nextLine();
                System.out.println("Ingrese su disco con mas ventas: ");
                datos2 = leer.nextLine();
                cantantes.add(new CantanteFamoso(datos1,datos2));

            }else if(opcion == 0){

                System.out.println("Desea eliminar algun cantante?: Si[1] No[0]");
                opcion= leer.nextInt();
                leer.nextLine();

                if(opcion == 1){

                    System.out.println("Ingrese el nombre del cantante: ");
                    datos1 = leer.nextLine();
                    System.out.println("\nValor de datos1: "+datos1);
                    System.out.println("Ingrese su disco con mas ventas: ");
                    datos2 = leer.nextLine();
                    System.out.println("\nValor de datos2: "+datos2);

                    for (CantanteFamoso cantante1 : cantantes){
                        if(cantante1.getNombre().equals(datos1) && cantante1.getDiscoConMasVentas().equals(datos2)){
                            cantantes.remove(cantante1);
                        }
                    }

                }

                System.out.println("Desea salir del programa?: Si[1] No[0]");
                opcion = leer.nextInt();

            }
        }while (opcion != 1);

        for (CantanteFamoso cantante1 : cantantes){
            System.out.println(cantante1.toString());
        }

    }
}