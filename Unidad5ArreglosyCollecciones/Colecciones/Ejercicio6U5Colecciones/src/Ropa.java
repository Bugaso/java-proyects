public class Ropa extends Producto {
    private String tipoTela;

    public Ropa() {
    }
    /*
    la Ropa además posee como atributo: tipoDeTela;
    los Electrodomesticos poseen como atributo adicional: consumoEnW
    los productos de Perfumería: tamañoEnCC (Tamaño en centímetros cúbicos).
    Todos los productos tienen un método calcularPrecioPublico, pero que cada tipo de producto implementará de la siguiente forma:
    Los Electrodomésticos incrementarán un 25% el precioLista.
    La Ropa incrementará un 40% el precioLista.
    Los artículos de Perfumeria incrementarán un 20% por cada 100cc.
     */
    public Ropa( int codigo,String descripcion, String marca, float precioLista, int stock, String tipoTela) {
        super(codigo, descripcion, marca, precioLista, stock);
        this.tipoTela = tipoTela;
    }

    @Override
    public void calcularPrecioPublico() {
        super.setPrecioLista((float) (super.getPrecioLista()+super.getPrecioLista()*0.40));

    }

    @Override
    public String toString() {
        return "\nRopa: " +
                "\nTipoTela = " + tipoTela + super.toString();
    }

}
