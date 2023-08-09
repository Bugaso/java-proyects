public final class  Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(float precio, String color, char letra, float peso, double carga) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    /*
        • Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si
        tiene una carga mayor de 30 kg, aumentará el precio en $500, si la carga es menor o igual, no se
        incrementará el precio. Este método debe llamar al método padre y añadir el código necesario.
        Recuerda que las condiciones que hemos visto en la clase Electrodoméstico también deben afectar
        al precio.
     */

    @Override
    public float precioFinal() {
        if(carga>30){
            precio+=500;
        }
        return super.precioFinal();
    }
}
