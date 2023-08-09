import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Barco extends Alquiler {
    protected String matricula;
    protected double esloraM;

    protected LocalDate fechaDev;

    public Barco() {
    }

    @Override
    public double CalcAlqui() {
       /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente multiplicando
    por 10 los metros de eslora).
     */
        long Intervalo = ChronoUnit.DAYS.between(fAlqui, fechaDev);
        int dias = (int)Intervalo;
        double Alquiler = dias*10*esloraM;

        return Alquiler;
    }

    public Barco(String matricula, double esloraM, LocalDate fechaDev) {
        this.matricula = matricula;
        this.esloraM = esloraM;
        this.fechaDev = fechaDev;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEsloraM() {
        return esloraM;
    }

    public void setEsloraM(double esloraM) {
        this.esloraM = esloraM;
    }

    public LocalDate getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(LocalDate fechaDev) {
        this.fechaDev = fechaDev;
    }


}
