public class Televisor extends Electrodomestico {
    /*
    Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en
    pulgadas) y sintonizador TDT (booleano), además de los atributos heredados.
    Los constructores que se implementarán serán:
    • Un constructor vacío.
    • Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. Recuerda
    que debes llamar al constructor de la clase padre.
    Los métodos que se implementara serán:
     */
    private double resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(float precio, String color, char letra, float peso, double resolucion, boolean TDT) {
        super(precio, color, letra, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    /*
    •   Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad. Si el
        televisor tiene una resolución mayor de 40 pulgadas, se incrementará el precio un 30% y si tiene un
        sintonizador TDT incorporado, aumentará $500. Recuerda que las condiciones que hemos visto en
        la clase Electrodomestico también deben afectar al precio.
        Finalmente, en el main debemos realizar lo siguiente:
        Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio
        final de los dos electrodomésticos.
     */

    @Override
    public float precioFinal() {
        if (resolucion>40){
            precio= (float) (precio+precio*0.30);
        }
        if (TDT==true){
            precio+=500;
        }
        return super.precioFinal();
    }
}
