import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

        Catalogo catalogo = new Catalogo();
        Scanner leer = new Scanner(System.in);
        /*
        Luego desde el main, desde una clase Test se pide:

         Instanciar un Catálogo.
         Crear manualmente 2 productos de cada categoría.
         Agregar los productos creados al Catálogo.
         Solicitar al Catálogo la cantidad de productos por categoría.
         Solicitar al Catálogo un listado de los productos de cada categoría.
         */

        Producto[] Ropa = new Ropa[2];
        Producto[] Electrodomesticos = new Electrodomesticos[2];
        Producto[] Perfumes = new Perfumeria[2];
        int codigo,stock;
        String descripcion,marca,tela;
        float precio;
        leer.useLocale(Locale.US);

        for (int i=0;i<Ropa.length;i++){
            System.out.println("Ingrese el codigo de la ropa: ");
            codigo = leer.nextInt();
            System.out.println("Ingrese la descripcion: ");
            leer.nextLine();
            descripcion = leer.nextLine();
            System.out.println("Ingrese la marca: ");
            marca = leer.nextLine();
            System.out.println("Ingrese su precio: ");
            precio = leer.nextFloat();
            System.out.println("Ingrese su stock");
            leer.nextLine();
            stock = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese su tipo de tela: ");
            tela= leer.nextLine();
            Ropa[i] = new Ropa(codigo,descripcion,marca,precio,stock,tela);
            catalogo.AgregarP(Ropa[i],1);
        }

        float Watts;
        for (int i = 0; i< Electrodomesticos.length; i++){
            System.out.println("Ingrese el codigo del electrodomestico: ");
            codigo = leer.nextInt();
            System.out.println("Ingrese la descripcion: ");
            leer.nextLine();
            descripcion = leer.nextLine();
            System.out.println("Ingrese la marca: ");
            marca = leer.nextLine();
            System.out.println("Ingrese su precio: ");
            precio = leer.nextFloat();
            System.out.println("Ingrese su stock");
            leer.nextLine();
            stock = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese el consumo en Watts: ");
            Watts = leer.nextFloat();
            Electrodomesticos[i] = new Electrodomesticos(codigo,descripcion,marca,precio,stock,Watts);
            catalogo.AgregarP(Electrodomesticos[i],2);
        }

        Float CentimetrosCubicos;
        for (int i=0;i<Perfumes.length;i++){
            System.out.println("Ingrese el codigo de los perfumes: ");
            codigo = leer.nextInt();
            System.out.println("Ingrese la descripcion: ");
            leer.nextLine();
            descripcion = leer.nextLine();
            System.out.println("Ingrese la marca: ");
            marca = leer.nextLine();
            System.out.println("Ingrese su precio: ");
            precio = leer.nextFloat();
            System.out.println("Ingrese su stock: ");

            stock = leer.nextInt();

            System.out.println("Ingrese el tamaño en centimetros cubicos: ");
            CentimetrosCubicos = leer.nextFloat();
            Perfumes[i] = new Perfumeria(codigo,descripcion,marca,precio,stock,CentimetrosCubicos);
            catalogo.AgregarP(Perfumes[i],3 );
        }
        catalogo.InformeStock();
        catalogo.ListarElectros();
        catalogo.ListarRopa();
        catalogo.ListarPerfumes();
    }
}