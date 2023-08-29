import java.time.LocalDate;

public class Movimiento {

    private LocalDate fecha;
    private char tipo;
    private double importe;
    private double  saldo;

    public Movimiento() {
    }

    public Movimiento(LocalDate fecha,char tipo, double importe,double saldo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nMovimiento: " +
                "\nFecha = " + fecha +
                "\ntipo = " + tipo +
                "\nimporte = " + importe +
                "\nsaldo = " + saldo;
    }
}
