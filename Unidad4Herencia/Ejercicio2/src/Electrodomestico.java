public class Electrodomestico {
    /*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
9

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el
color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro,
rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se
invocará al crear el objeto y no será visible.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio.
Esta es la lista de precios:
 */

    protected float precio;
    protected String color;
    protected char letra;
    protected float peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color,char letra,float peso) {
        this.precio = precio;
        this.color = color;
        this.letra= letra;
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return letra;
    }

    public void setConsumo(char consumo) {
        this.letra = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    protected static char comprobarConsumoEnergetico(char letra){
        if(letra<='A'^letra>='F'){
            letra='F';
            return letra;
        }

        return letra;

    }

    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, usa el
color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, negro,
rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas. Este método se
invocará al crear el objeto y no será visible.
     */
    protected static String comprobarColor(String color){

        if(color!="rojo"^color!="azul"^color!="gris"^color!="blanco"^color!="negro"){

            color = "blanco";
        }
        return color;
    }
    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio.
Esta es la lista de precios:
     */
    protected static float precioFinal(char letra,float peso){
        switch (letra){
            case 'A':

        }
        return 0;
    }
}
