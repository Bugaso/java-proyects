import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Date date = new Date(77,06,25);
        LocalDate nacimiento = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Cliente Juan = new Cliente("Juan","Lucero","Merlo",nacimiento);

        Cuenta cuenta = new Cuenta(1234,Juan);

        cuenta.depositar(60000);
        cuenta.extraer(10000);
        System.out.println("Saldo de la cuenta: "+cuenta.verSaldo());
        cuenta.listarMovimientos();
        System.out.println(cuenta.verTitular().toString());
    }
}