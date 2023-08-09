public final class rectangulo implements calculoFormas{
    private double base,altura;

    public rectangulo() {
    }
    public rectangulo(double base,double altura) {
        this.altura=altura;
        this.base=base;
    }
    @Override
    public double calculoArea() {

        return base*altura;
    }

    @Override
    public double calculoPerimetro() {

        return (base+altura)*2;
    }
}
