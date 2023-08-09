public class Auto extends Vehiculo{

    public Auto() {
    }

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
    /*
    calcularCostoDeCombustible() que cada tipo de vehículo lo implementará de la siguiente forma:
    el consumo de combustible es de 7 Lts cada 100 Km para los autos, 10 Lts cada 100 Km para las
    camionetas y 12 Lts cada 100 Km para los camiones.
     */
    @Override
    protected void calcularCostoDeCombustible() {

    }
}
