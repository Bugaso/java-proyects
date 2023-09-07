public abstract class Producto {
    /*
        6) La tienda RopaLinda SA, nos contrata para que armemos una aplicación que permita crear un
        Catálogo con los distintos productos que ofrecerá a sus clientes. La tienda posee 3 tipos de tipos
        de productos: Ropa, Electrodomesticos y Perfumeria. Todos los Productos tiene código,
        descripción, marca, precioLista y stock;
        la Ropa además posee como atributo: tipoDeTela;
        los Electrodomesticos poseen como atributo adicional: consumoEnW
        los productos de Perfumería: tamañoEnCC (Tamaño en centímetros cúbicos).
        Todos los productos tienen un método calcularPrecioPublico, pero que cada tipo de producto implementará de la siguiente forma:
        Los Electrodomésticos incrementarán un 25% el precioLista.
        La Ropa incrementará un 40% el precioLista.
        Los artículos de Perfumeria incrementarán un 20% por cada 100cc.
         */
    private int codigo;
    private String descripcion;
    private String marca;
    private float precioLista;
    private int stock;

    public Producto() {
    }

    public Producto(int codigo,String descripcion,String marca,float precioLista,int stock) {
        this.descripcion = descripcion;
        this.marca = marca;
        this.precioLista = precioLista;
        this.stock = stock;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }

    public float getPrecioLista() {
        return precioLista;
    }

    public void setPrecioLista(float precioLista) {
        this.precioLista = precioLista;
    }

    public abstract void calcularPrecioPublico();

    @Override
    public String toString() {
        return "\ndescripcion = " + descripcion +
                "\nmarca = " + marca  +
                "\nprecioLista = " + precioLista +
                "\nstock = " + stock +
                "\ncodigo = " + codigo;
    }
}
