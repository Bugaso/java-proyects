import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente multiplicando
por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco, se calcula sacando el modulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles, en los
barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y el número
de camarotes.
     */
    public static void main(String[] args) {

        LocalDate fecha1= LocalDate.of(2023,6,3);
        LocalDate fecha2= LocalDate.of(2023,6,10);

        Barco Yatecito = new BarcoMotorYate("AB430",4,fecha2,50,4);
        Yatecito.fAlqui=fecha1;
        System.out.println("El precio del alquiler para el barco "+Yatecito.getMatricula()+" es: $"+Yatecito.CalcAlqui());

        Barco BarcoMotorcito = new BarcoMotor("C350",8,fecha2,50);
        BarcoMotorcito.fAlqui=fecha1;
        System.out.println("El precio del alquiler para el barco "+BarcoMotorcito.getMatricula()+" es: $"+BarcoMotorcito.CalcAlqui());

        Barco BarcoVelercito = new BarcoEspecial("A150",8,fecha2);
        BarcoVelercito.fAlqui=fecha1;
        System.out.println("El precio del alquiler para el barco "+BarcoVelercito.getMatricula()+" es: $"+BarcoVelercito.CalcAlqui());

    }
}