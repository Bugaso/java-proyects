import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*
        3) Un directorio telefónico posee una lista de Clientes de los que interesa conocer: dni, nombre,
           apellido, ciudad y dirección. El directorio está compuesto por el número de teléfono y los datos
           del Cliente (Directorio: <teléfono,Cliente> donde el teléfono no es un atributo del cliente. Cuando
           agendamos un cliente al directorio telefónico lo agendamos con su número de teléfono, que es
           único)
           El directorio telefónico posee además las siguientes funcionalidades:
         */
        Directorio directorio = new Directorio();

        Clientes balta= new Clientes(46045372,"Baltasar","Elli","Santiago Del Estero","Sector 2 Escalera 6");

        directorio.agregarCliente(385611477,balta);
        directorio.agregarCliente(385611479,balta);

        System.out.println("Lista de Numeros asociados al apellido: ");
        for(int telefonos: directorio.buscarTelefono("Elli")){
            System.out.println(telefonos);
        }

        System.out.println("Lista de Clientes asociados a la ciudad: ");
        for(Clientes clientes : directorio.buscarClientes("Santiago Del Estero")){
            System.out.println(clientes.toString());
        }
        System.out.println("Borrando Clientes \n");
        directorio.borrarCliente(385611477);

        System.out.println("Lista de Clientes asociados a la ciudad: ");

        for(Clientes clientes : directorio.buscarClientes("Santiago Del Estero")){
            System.out.println(clientes.toString());
        }
    }
}