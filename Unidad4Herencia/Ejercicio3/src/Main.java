
public class Main {
    /*
    Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
    geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las dos
    formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los dos
    métodos para calcular el área, el perímetro y el valor de PI como constante.
    Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se calcule el
    área y el perímetro de los dos. En el main se crearán las formas y se mostrará el resultado final.
     */
    public static void main(String[] args) {
        rectangulo REC = new rectangulo(3,4);
        circulo CIR = new circulo(4);
        System.out.println("Rectangulo \n"+"Area: "+REC.calculoArea()+"\nPerimetro: "+REC.calculoPerimetro());

        System.out.println("\nCirculo \n"+"Area: "+CIR.calculoArea()+"\nPerimetro: "+CIR.calculoPerimetro());
    }
}