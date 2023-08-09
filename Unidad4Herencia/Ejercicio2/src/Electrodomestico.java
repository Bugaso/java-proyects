public class Electrodomestico {
    /*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.

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
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es
    correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
     */
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
    protected float precioFinal(){
        switch (letra){
            case 'A':
                precio+=1000;
            break;

            case 'B':
                precio+=800;
            break;

            case 'C':
                precio+=600;
            break;

            case 'D':
                precio+=500;
            break;

            case 'E':
                precio+=300;
            break;

            case 'F':
                precio+=100;
            break;
        }
        if(peso>=1 && peso<=19){
            precio+=100;
        }
        if(peso>=20 && peso<=49){
            precio+=500;
        }
        if(peso>=50 && peso<=79){
            precio+=800;
        }
        if(peso>=80){
            precio+=1000;
        }
        return precio;
    }

}
