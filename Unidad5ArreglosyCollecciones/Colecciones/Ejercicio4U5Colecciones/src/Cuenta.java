import java.time.LocalDate;
import java.util.LinkedList;

public class Cuenta {
    private long numero;
    private double saldo;
    private double interesAnual;
    private Cliente titular;
    private LinkedList<Movimiento> movimientos;

    public Cuenta() {
    }

    public Cuenta(long numero,Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.movimientos = new LinkedList<>();
    }

    public void depositar (double cantidad) {
        Movimiento mov = new Movimiento();
        saldo+=cantidad;
        mov.setSaldo(saldo);
        mov.setImporte(cantidad);
        mov.setTipo('D');
        mov.setFecha(LocalDate.ofEpochDay(4));
        movimientos.add(mov);
    }

    public void extraer (double cantidad){
        Movimiento mov = new Movimiento();
        if(saldo>cantidad){
            saldo-=cantidad;
                mov.setSaldo(saldo);
                mov.setImporte(-cantidad);
                mov.setTipo('E');
                mov.setFecha(LocalDate.ofEpochDay(2));
                movimientos.add(mov);
        }


    }

    public void cambiarInteresAnual(double valor){
        interesAnual=valor;
    }

    public Cliente verTitular(){

        return titular;
    }

    public double verSaldo(){
        return saldo;
    }

    public void listarMovimientos(){
        System.out.println("Lista de movimientos realizados: ");
        for (Movimiento mov : movimientos){
            System.out.println(mov.toString());
        }
    }
}
