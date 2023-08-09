public final class circulo implements calculoFormas{
    private double radio;

    public circulo() {
    }

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculoArea() {

        return (PI*radio*radio);
    }

    @Override
    public double calculoPerimetro() {
        return (PI*radio*2);
    }
}
