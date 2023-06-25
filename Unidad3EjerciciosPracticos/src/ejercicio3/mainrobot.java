package ejercicio3;

import java.util.Scanner;
import  java.awt.Color;
/*
Nos piden modelar un Auto con las siguientes características y comportamiento para poder ser
anexado al proyecto.

A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo
tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener
en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible
suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos
tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay
combustible suficiente.

• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.

B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además
Rueda tendrá los siguientes comportamientos:

• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI

C- Desde el método main crear las instancias, relacionarlas, e inflar/descinflar sus ruedas,
avanzar/retroceder, y llenarTanque.

Nota: La medida en PSI (libra por pulgada cuadrada). Generalmente los turismos ligeros suelen
llevar una presión recomendada comprendida entre los 28 a 30 PSI.
 */
public class mainrobot {

    public static void main (String[] args) {

        /*
        Color colorRojo=new Color(73, 0, 255);
        String patente="ARG4324D";
        Auto Car1 = new Auto(colorRojo,patente,50f);

        Scanner scan = new Scanner(System.in);

        System.out.println("Indique los mts a recorrer");
        float mts= scan.nextFloat();



        System.out.println("El auto "+Car1.getPatente()+" es de color "+Car1.getColor()+" a gastado L"+" en el viaje");


        System.out.println("Elija alguna de las opciones a realizar para sus rueda");
        System.out.println("[1]Inflar\n"+"[2]Pinchar\n"+"[3]Desinflar\n");
        int resp=1;
        Rueda[] r = new Rueda[4];

*/

        Auto auto = new Auto("Rojo", "ABC123");

        auto.inflarRuedas();

        auto.avanzar(30);
        auto.retroceder(20);

        auto.desinflarRuedas();

        auto.llenarTanque();
    }


}

