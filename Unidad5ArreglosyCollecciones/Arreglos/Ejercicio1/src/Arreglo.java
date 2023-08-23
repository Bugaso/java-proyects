import static java.lang.Character.toLowerCase;

public class Arreglo {
        /*
    1) En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos
    estáticos (static):

    a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
    enteros y muestre por pantalla la suma y promedio de los mismos.

    b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
    irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.

    c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
    de vocales que tiene la cadena.

    d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
    retorne la cantidad de veces que se repite en la cadena el carácter recibido.

    Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
    de la clase Arreglo creada por usted.
     */

    public static void sumarLista(int num[]){
        int resultado = 0;
        for (int i: num){
            resultado += i;
        }
        System.out.println("La suma de los numeros enteros es: "+resultado);
    }

    public static void buscarMayor(int num[]){
        int may=num[0];
        for (int i=0; i< num.length;i++){
            if (may<=num[i]){
                may=num[i];
            }

        }
        System.out.println("El mayor numero ingresado fue: "+may);
    }

    /*
    c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
    de vocales que tiene la cadena.
     */

    public static int cuentaVocales(String cadena){
        int cantV=0;
       for (int i = 0; i < cadena.length(); i++){
           System.out.println(cadena.charAt(i));
            if (toLowerCase (cadena.charAt(i)) == 'a' ||toLowerCase (cadena.charAt(i)) == 'e' || toLowerCase (cadena.charAt(i)) == 'i' || toLowerCase (cadena.charAt(i)) == 'o' || toLowerCase (cadena.charAt(i)) == 'u'){
                cantV++;
            }
       }

        return cantV;
    }

    /*
    d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
    retorne la cantidad de veces que se repite en la cadena el carácter recibido.
     */

    public static int cuentaCaracter(String cadena, char caracter){

        int cantC=0;

        for(int i=0;i<cadena.length();i++){
            if(toLowerCase(cadena.charAt(i)) == toLowerCase(caracter)){
                cantC++;
            }
        }


        return cantC;
    }
}
