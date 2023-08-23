import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        2) En un nuevo proyecto, nos piden modelar e implementar en Java una aplicación que permita
        llevar un Registro del promedio mensual de lluvias para las localidades de San Luis, Merlo y Villa
        Mercedes; registrando como Dato milímetros promedio caídos; apellido y nombre de la persona
        que hizo ese registro. El Registro debe permitir agregar un Dato para un mes y localidad
        determinada; obtener el promedio más alto registrado y otro comportamiento es el de permitir
        obtener el promedio más alto registrado por localidad. El siguiente gráfico representaría el
        Registro de lluvias:
         */
        System.out.println("Ingrese la cantidad de maxima localidades a registrar");

        Scanner leer = new Scanner(System.in);
        int cant=leer.nextInt();
        Registro Lluvias = new Registro(cant);

        System.out.println("Ingrese la cantidad de localidades a agregar al registro");
        cant=leer.nextInt();
        for(int i=0;i<cant;i++){
            Lluvias.Agregar();
        }

        System.out.println("Ingrese la localidad para saber el promedio mas alto de lluvias en los meses: ");
        for (int i=0;i<=Lluvias.getTope();i++){
            System.out.println(Lluvias.getLocalidad()[i]+" ["+i+"]");
        }
        cant=leer.nextInt();
        System.out.println("El promedio mas alto de la localidad "+Lluvias.getLocalidad()[cant]+ " es: "+Lluvias.promAltoL(cant));
        System.out.println("El promedio mas alto de todas las localidades es: "+Lluvias.promAlto());

    }
}