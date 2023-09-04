import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        5) Un Colegio nos pide un sistema para llevar un registro de los alumnos que se encuentran
        cursando actualmente. Los datos que necesita de un Alumno son: legajo, apellido, nombre y año
        que cursa. El sistema debe permitir agregar alumnos al Colegio sin que se repitan, quitar alumnos
        en base a su legajo, listar los alumnos ordenados alfabéticamente por su apellido y listar los
        alumnos cuyos apellidos comiencen por un carácter en particular. Luego desde el método main de
        una clase Test, nos piden:
         */

        Colegio ESPEA = new Colegio("Nicolas Segundo Genero");
        /*
        Alumno estudiante1 = new Alumno(3050423, "Elli", "Baltsar Enrique", 2023);
        Alumno estudiante2 = new Alumno(3050425, "Alli", "Baltsar Enrique", 2023);
        Alumno estudiante3 = new Alumno(3050421, "Blli", "Baltsar Enrique", 2023);

        ESPEA.agregarEstudiante(estudiante1.getLegajo(),estudiante1);
        ESPEA.agregarEstudiante(estudiante2.getLegajo(),estudiante2);
        ESPEA.agregarEstudiante(estudiante3.getLegajo(),estudiante3);
        */

        System.out.println("Ingrese la cantidad de alumnos a agregar: ");
        Scanner leer = new Scanner(System.in);
        int dim=leer.nextInt();
        int legajo,año;
        String Apellido,Nombre;
        Alumno[] estudiante = new Alumno[dim];

        for(int i=0;i<dim;i++){
            System.out.println("Ingrese el legajo del alumno "+(i+1)+": ");
            legajo = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese su apellido: ");

            Apellido= leer.nextLine();
            System.out.println("Ingrese su nombre: ");

            Nombre = leer.nextLine();
            System.out.println("Ingrese el año de ingreso: ");
            año = leer.nextInt();

            estudiante[i] = new Alumno(legajo,Apellido,Nombre,año);
            ESPEA.agregarEstudiante(estudiante[i].getLegajo(),estudiante[i]);
        }
        System.out.println("Listado de alumnos: ");
        for(Alumno alum : ESPEA.listarAlumnos()){
            System.out.println(alum.toString());
        }
        System.out.println("\nLista ordenada Alfabeticamente: ");
        for(Alumno alum : ESPEA.listarAlumnosAlf()){
            System.out.println(alum);
        }
        System.out.println("Ingrese un caracter para buscar alumnos: ");
        String charr = leer.nextLine();
        System.out.println("\nLista de alumnos con un char especial: ");
        for(Alumno alumno : ESPEA.listarAlumnoEspecial(charr.charAt(0))){
            System.out.println(alumno);
        }
    }
}