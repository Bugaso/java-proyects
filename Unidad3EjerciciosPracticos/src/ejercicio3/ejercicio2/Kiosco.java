package ejercicio3.ejercicio2;

/*
Un Kiosco tiene 3 Empleados. Vamos a contar de dos clases. Kiosco, que tendrá los atributos:
dirección, nombre, cuit y 3 atributos de tipo Empleado; y la clase Empleado posee los atributos:
nombre, apellido, fecha de ingreso y dni. Usted deberá pensar en que funcionalidad incorporar en
la clase Kiosoco para que podamos incorporar sólo hasta 3 Empleados y poder mostrar cual es el
Empleado con mayor antigüedad.
 */
public class Kiosco {

    private int direccion;
    private String nombre;
    private int cuit;

    public Empleado emp1;
    public Empleado emp2;
    public Empleado emp3;



    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public int getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }




    public void empleador (Empleado Empleado) {

        if (emp1 == null){
            emp1=Empleado;
            System.out.println("Empleado "+emp1.getNombre()+" Registrado");
        }else if (emp2 == null){
            emp2=Empleado;
            System.out.println("Empleado "+emp2.getNombre()+" Registrado");
        }else if (emp3 == null){
            emp3=Empleado;
            System.out.println("Empleado "+emp3.getNombre()+" Registrado");
        }else {
            System.out.println("No puede ingresar mas empleados");
        }

    }

    /*
    public  Empleado MasViejo(){

            Empleado may=null;
            LocalDate mayor= LocalDate.ofEpochDay(0);
            LocalDate fecha1= emp1.getFecha();
            LocalDate fecha2= emp2.getFecha();
            LocalDate fecha3= emp3.getFecha();
        if  (fecha1.isBefore(fecha2)) {
            mayor=emp1.getFecha();
            may=emp1;
        }else if(fecha2.isBefore(fecha3)){
            mayor=emp2.getFecha();
            may=emp2;
        }else{
            mayor=emp3.getFecha();
            may=emp3;
        }



        return may;
    }
*/

    public Empleado masViejo(Empleado[] Empleado) {
        Empleado masViejo = Empleado[0];
        for (int i = 1; i < Empleado.length-1; i++) {
            if (Empleado[i].getFecha().isBefore(masViejo.getFecha())) {
                masViejo = Empleado[i];
            }
        }
        return masViejo;
    }
}
