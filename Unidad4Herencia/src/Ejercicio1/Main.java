package Ejercicio1;
import java.util.Scanner;
public class Main {
/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
lo siguiente:
 */
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        Animal[]gatos = new Gato[1];


           gatos[0]= new Gato("hola","Carnivoro",18,"persa");
           gatos[0].Alimento("Carnivoro");
    }
}