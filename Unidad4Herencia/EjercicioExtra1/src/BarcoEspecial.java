import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class BarcoEspecial extends Barco {
    /*
    Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
    • Número de mástiles para veleros.

     */

    protected int mastiles;

    public BarcoEspecial() {
    }

    public BarcoEspecial(String matricula, double esloraM, LocalDate fechaDev) {
        super(matricula, esloraM, fechaDev);
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double CalcAlqui() {
        long Intervalo = ChronoUnit.DAYS.between(fAlqui, fechaDev);
        int dias = (int)Intervalo;
        double Alquiler = dias*10*esloraM+mastiles;

        return super.CalcAlqui();
    }
}
