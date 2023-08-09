import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class BarcoMotorYate extends BarcoMotor{
    protected int camarotes;
    public BarcoMotorYate(String matricula, double esloraM, LocalDate fechaDev, double CV, int camarotes) {
        super(matricula, esloraM, fechaDev,CV);
        this.camarotes=camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    @Override
    public double CalcAlqui() {
        long Intervalo = ChronoUnit.DAYS.between(fAlqui, fechaDev);
        int dias = (int)Intervalo;
        double Alquiler = dias*10*esloraM+camarotes+CV;

        return Alquiler;
    }
}
