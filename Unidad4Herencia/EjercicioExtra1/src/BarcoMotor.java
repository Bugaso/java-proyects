import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BarcoMotor extends Barco{
    /*
 Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
 • Número de mástiles para veleros.
 • Potencia en CV para barcos a motor.
 • Potencia en CV y número de camarotes para yates de lujo.
  */
    protected double CV;
    public BarcoMotor(String matricula, double esloraM, LocalDate fechaDev, double CV) {
        super(matricula, esloraM, fechaDev);
        this.CV=CV;
    }

    public double getCV() {
        return CV;
    }

    public void setCV(double CV) {
        this.CV = CV;
    }
    @Override
    public double CalcAlqui() {
        long Intervalo = ChronoUnit.DAYS.between(fAlqui, fechaDev);
        int dias = (int)Intervalo;
        double Alquiler = dias*10*esloraM+CV;

        return Alquiler;
    }
}
