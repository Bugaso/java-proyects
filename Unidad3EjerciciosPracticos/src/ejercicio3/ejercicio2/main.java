package ejercicio3.ejercicio2;

import java.time.LocalDate;

/*
Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.
 */
public class main {

    public static void main(String[] args) {

        Kiosco turian = new Kiosco();
        LocalDate pastDate = LocalDate.of(2016, 01, 23);
        LocalDate pastDate1 = LocalDate.of(2018, 01, 23);
        LocalDate pastDate2 = LocalDate.of(2020, 01, 23);
        LocalDate pastDate3 = LocalDate.of(2012, 01, 23);
        Empleado[] Empleado = new Empleado[4];

        Empleado [0] = new Empleado("Juan","Ponz",pastDate,32315);
        Empleado [1] = new Empleado("Enzo","Ugarte",pastDate1,321314);
        Empleado [2] = new Empleado("Esteban","Leguizamon",pastDate2,3213145);
        Empleado [3] = new Empleado("Nicolas","Ruiz",pastDate3,3213145);

        //turian.empleador((ejercicio3.Empleado) Empleado[1]);
        //turian.empleador((ejercicio3.Empleado) Empleado[2]);

       // for (Object empleado : Empleado) {
        //    turian.empleador((ejercicio3.Empleado) empleado);
        //}

        for (int i = 0; i < Math.min(Empleado.length, 3); i++) {
            turian.empleador(Empleado[i]);
        }
        Empleado empleadoMasViejo = turian.masViejo(Empleado);


        System.out.println("El empleado "+empleadoMasViejo.getNombre()+" "+empleadoMasViejo.getApellido()+" es el mas viejo por comprar el: "+empleadoMasViejo.getFecha());
    }
}
