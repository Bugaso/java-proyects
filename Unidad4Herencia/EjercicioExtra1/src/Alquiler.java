import java.time.LocalDate;


public abstract class Alquiler {
    /*
    En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
    nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del amarre y
    el barco que lo ocupará.
     */
    protected String name;
    protected int documento;
    protected LocalDate fAlqui;
    protected LocalDate fDevol;
    protected String amarre;

    public Alquiler() {
    }
    public Alquiler(String name,int documento,LocalDate fAlqui,LocalDate fDevol,String amarre) {
        this.name=name;
        this.documento=documento;
        this.fAlqui=fAlqui;
        this.fDevol=fDevol;
        this.amarre=amarre;
    }

    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
    alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente multiplicando
    por 10 los metros de eslora).
     */
    public abstract double CalcAlqui();
}
