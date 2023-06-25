package EjerciciorobotGuia3;


import java.util.Scanner;

/*
Por otro lado el Hombre sabe:

• JugarConRobot(Robot) Este método recibe por parámetro un Robot y con hace lo siguiente:

 Hacer que el Robot Avance 500 pasos.
 El robot Retroceda 20 pasos.
 Informe por pantalla cuanta energía tiene el robot Actualmente.
 Ponga el robot a dormir.
 */
public class Hombre {
    public static void JugarConRobot(Robot Walli, Bateria Pilas) {
        int pasos;
        String opcion=null;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);

            System.out.println("Desea avanzar o retroceder? ");
            opcion = scan1.nextLine();

            System.out.println("Cuantos pasos desea realizar?");

            pasos = scan.nextInt();

            if (Walli.Despertar(Pilas) == true && (opcion == "avanzar" || opcion == "Avanzar")) {
                pasos = Walli.Avanzar(Pilas, pasos);


            } else if (Walli.Despertar(Pilas) == true && (opcion == "retroceder" || opcion == "Retroceder")) {
                pasos = Walli.Avanzar(Pilas, pasos);

                System.out.println(Walli.energiaActual(Pilas, pasos));
            } else {
                System.out.println("No pude avanzar por falta de energia o estoy dormido");
            }


            System.out.println(Walli.energiaActual(Pilas, pasos));
            System.out.println("Desea recargar las pilas?");
            opcion = scan1.nextLine();


            if ((opcion == "si" || opcion == "Si") || Walli.bateriaLlena(Pilas) == false) {
                Walli.Recargar(Pilas);
            } else {
                System.out.println("La bateria ya está llena");
            }

    }
}