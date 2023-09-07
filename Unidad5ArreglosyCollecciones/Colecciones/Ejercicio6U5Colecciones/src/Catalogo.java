import java.util.HashMap;
import java.util.Map;

public class Catalogo {
     /*
        6) La tienda RopaLinda SA, nos contrata para que armemos una aplicación que permita crear un
        Catálogo con los distintos productos que ofrecerá a sus clientes. La tienda posee 3 tipos de tipos
        de productos: Ropa, Electrodomesticos y Perfumeria. Todos los Productos tiene código,
        descripción, marca, precioLista y stock; la Ropa además posee como atributo: tipoDeTela; los
        Electrodomesticos poseen como atributo adicional: consumoEnW y los productos de Perfumería:
        tamañoEnCC (Tamaño en centímetros cúbicos). Todos los productos tienen un método
        calcularPrecioPublico, pero que cada tipo de producto implementará de la siguiente forma:
        Los Electrodomésticos incrementarán un 25% el precioLista.
        La Ropa incrementará un 40% el precioLista.
        Los artículos de Perfumeria incrementarán un 20% por cada 100cc.
     */
    private HashMap<Integer,Ropa> ropas = new HashMap<>();
    private HashMap<Integer,Electrodomesticos> electros = new HashMap<>();
    private HashMap<Integer,Perfumeria> perfumes = new HashMap<>();
    /*
    El Catalogo deberá permitir:
    a) Agregar productos
    b) Informar la cantidad de productos que posee de cada categoría: Ropa, Perfumería y
    Electrodomésticos.
    c) Listar los productos que son Electrodomesticos.
    d) Listar los productos que son Ropa.
    e) Listar los productos que son de Perfumería.
     */
    public void AgregarP (Producto producto,int categoria){
        switch (categoria){
            case 1:
                ropas.put(producto.getCodigo(), (Ropa) producto);
                break;
            case 2:
                electros.put(producto.getCodigo(),(Electrodomesticos) producto);
                break;
            case 3:
                perfumes.put(producto.getCodigo(),(Perfumeria) producto);
                break;
        }

    }
    /*
   El Catalogo deberá permitir:
   a) Agregar productos
   b) Informar la cantidad de productos que posee de cada categoría: Ropa, Perfumería y
   Electrodomésticos.
   c) Listar los productos que son Electrodomesticos.
   d) Listar los productos que son Ropa.
   e) Listar los productos que son de Perfumería.
    */
    public void ListarRopa(){
        for (Map.Entry<Integer,Ropa> entry : ropas.entrySet()){
            entry.getValue().calcularPrecioPublico();
            System.out.println(entry.getValue().toString());
        }
    }
    public void ListarElectros(){
        for (Map.Entry<Integer,Electrodomesticos> entry : electros.entrySet()){
            entry.getValue().calcularPrecioPublico();
            System.out.println(entry.getValue().toString());
        }
    }

    public void ListarPerfumes(){

        for(Map.Entry<Integer,Perfumeria> entry : perfumes.entrySet()){
            entry.getValue().calcularPrecioPublico();
            System.out.println(entry.getValue().toString());
        }
    }
     /*
   El Catalogo deberá permitir:
   a) Agregar productos
   b) Informar la cantidad de productos que posee de cada categoría: Ropa, Perfumería y
   Electrodomésticos.
   c) Listar los productos que son Electrodomesticos.
   d) Listar los productos que son Ropa.
   e) Listar los productos que son de Perfumería.
    */
    public void InformeStock(){

        int cant=0;
        for (Map.Entry<Integer, Ropa> entry : ropas.entrySet()){
            cant += entry.getValue().getStock();
        }
        System.out.println("Cantidad de stock de la categoria Ropa: "+cant);

        cant=0;
        for (Map.Entry<Integer, Electrodomesticos> entry : electros.entrySet()){
            cant += entry.getValue().getStock();
        }
        System.out.println("Cantidad de stock de la categoria Electrodomesticos: "+cant);

        cant=0;
        for (Map.Entry<Integer, Perfumeria> entry : perfumes.entrySet()){
            cant += entry.getValue().getStock();
        }
        System.out.println("Cantidad de stock de la categoria Perfumes: "+cant);
    }
}
