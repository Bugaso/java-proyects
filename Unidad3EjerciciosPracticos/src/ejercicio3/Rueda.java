package ejercicio3;
/*
B- Hacer la clase Rueda, con atributos: marca y presión, Luego el auto debe tener 4 ruedas, además
Rueda tendrá los siguientes comportamientos:

• Inflar: la presión regresa a 28.0 PSI
• Pinchar: se debe reducir la presión al mínimo.
• Desinflar: reduce la presión de la rueda -0.5 PSI

 */
public class Rueda {

    private String marca;
    private double presion;

    public Rueda() {
        this.marca = "";
        this.presion = 0.0;
    }

    public void inflar() {
        presion = 28.0;
    }

    public void pinchar() {
        presion = 0.0;
    }

    public void desinflar() {
        presion -= 0.5;
    }


}
