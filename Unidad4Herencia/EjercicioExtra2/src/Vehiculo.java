    public abstract class Vehiculo {

    /*
    Existen diferentes tipos de vehículos: Autos, Camiones y Camionetas; todos tienen la siguiente
    información: marca, patente y combustible; además del comportamiento
    calcularCostoDeCombustible() que cada tipo de vehículo lo implementará de la siguiente forma:
    el consumo de combustible es de 7 Lts cada 100 Km para los autos, 10 Lts cada 100 Km para las
    camionetas y 12 Lts cada 100 Km para los camiones.
     */
    protected String marca;
    protected String patente;
    protected Combustible combustible;
    public Vehiculo() {}
        public Vehiculo(String marca, String patente, Combustible combustible) {
            this.marca=marca;
            this.patente=patente;
            this.combustible=combustible;
        }
        protected abstract void calcularCostoDeCombustible();

}
