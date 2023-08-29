import java.util.*;

public class Directorio {

     /*
    Un directorio telefónico posee una lista de Clientes de los que interesa conocer: dni, nombre,
apellido, ciudad y dirección. El directorio está compuesto por el número de teléfono y los datos
del Cliente (Directorio: <teléfono,Cliente> donde el teléfono no es un atributo del cliente. Cuando
agendamos un cliente al directorio telefónico lo agendamos con su número de teléfono, que es
único)
     */

    private HashMap<Integer,Clientes> personas = new HashMap<>();

    public Directorio() {}

    public HashMap<Integer, Clientes> getPersonas() {
        return personas;
    }

    public void setPersonas(HashMap<Integer, Clientes> personas) {
        this.personas = personas;
    }

    /*
● agregarCliente(nroTel, Cliente):void  que permite registrar un nuevo cliente con su
respectivo nro de teléfono. Siendo el nro del teléfono la clave del mismo.
● buscarCliente(nroTel):Cliente  que en base al nro de teléfono retorna el Cliente asociado al
mismo.
● buscarTeléfono(apellido):List  que en base a un apellido nos devuelve una lista con los nros.
de teléfono asociados a dicho apellido.
● buscarClientes(ciudad):List  que en base a una ciudad nos devuelve una lista con los
Clientes asociados a dicha ciudad.
● borrarCliente(telefono):void que en base a un nro de teléfono elimina el cliente del directorio.
     */

    public void agregarCliente(int nroTel, Clientes Cliente){
                personas.put(nroTel,Cliente);
    }

    public Clientes buscarCliente(int nroTel){
        return personas.get(nroTel);
    }

    public List<Integer> buscarTelefono(String apellido){
        List <Integer> numeros = new ArrayList<>();

        for(Map.Entry<Integer,Clientes> entry : personas.entrySet()){
            if(entry.getValue().getApellido()==apellido){
                numeros.add(entry.getKey());
            }
        }

        return numeros;
    }

    public List<Clientes> buscarClientes(String ciudad){
        List<Clientes> asociados = new ArrayList<>();

        for(Map.Entry<Integer,Clientes> entry : personas.entrySet()){
            if(entry.getValue().getCiudad()== ciudad){
                asociados.add(entry.getValue());
            }
        }
        return asociados;
    }

    public void borrarCliente(int telefono){
        personas.remove(telefono);
    }
}
