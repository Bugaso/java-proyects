public class Perfumeria extends Producto{
    /*
    la Ropa además posee como atributo: tipoDeTela;
    los Electrodomesticos poseen como atributo adicional: consumoEnW
    los productos de Perfumería: tamañoEnCC (Tamaño en centímetros cúbicos).
    Todos los productos tienen un método calcularPrecioPublico, pero que cada tipo de producto implementará de la siguiente forma:
    Los Electrodomésticos incrementarán un 25% el precioLista.
    La Ropa incrementará un 40% el precioLista.
    Los artículos de Perfumeria incrementarán un 20% por cada 100cc.
     */
    private float tamanoEnCC;

    public Perfumeria() {
    }

    public Perfumeria(int codigo, String descripcion, String marca, float precioLista, int stock, float tamanoEnCC) {
        super( codigo,descripcion, marca, precioLista, stock);
        this.tamanoEnCC = tamanoEnCC;
    }

    @Override
    public void calcularPrecioPublico() {
        for(int i=0;i<tamanoEnCC;i=i+100){
            super.setPrecioLista((float) (super.getPrecioLista()+super.getPrecioLista()*0.20));
        }
    }

    @Override
    public String toString() {
        return "\nPerfumeria :" +
                "\ntamanoEnCC=" + tamanoEnCC + super.toString();
    }
}
