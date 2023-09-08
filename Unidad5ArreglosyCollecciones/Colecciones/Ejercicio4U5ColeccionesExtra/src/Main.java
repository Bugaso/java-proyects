import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        4. Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta página:
        https://mapanet.eu/index.htm. Nota: Poner el código postal sin la letra, solo el número.
        • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades. • Muestra por pantalla los datos
        introducidos
        • Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario. • Muestra por
        pantalla los datos
        • Agregar una ciudad con su código postal correspondiente más al HashMap. • Elimina 3 ciudades
        existentes dentro del HashMap, que pida el usuario. • Muestra por pantalla los datos.
         */

        HashMap<Integer,Ciudades> ciudades = new HashMap<>();
        Ciudades[] ciudad = new Ciudades[10];
        ciudad[0] = new Ciudades(4225,"Antilo");
        ciudades.put(ciudad[0].getCodigoPostal(),ciudad[0]);
        Mostrar(ciudades);
    }

    public static void Mostrar(HashMap<Integer,Ciudades> ciudadesHashMap){
        for (Map.Entry<Integer,Ciudades> entry: ciudadesHashMap.entrySet()){
            System.out.println("\nNombre de la ciudad: "+entry.getValue());
            System.out.println("\nCodigo postal: G"+entry.getKey());
        }
    }
}