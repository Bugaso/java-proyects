package Ejercicio1;

public class Animal {
    /*
    1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. La clase
    Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
    Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego
    un mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice
    lo siguiente:
     */
    protected String Name;
    protected String Alimento;
    protected int edad;
    protected String raza;

    public Animal(String Name, String Alimento, int edad, String raza) {
        Name = this.Name;
        Alimento = this.Alimento;
        edad = this.edad;
        raza = this.raza;
    }

    public String getAlimento() {

        return Alimento;
    }

    public void setAlimento(String alimento) {
        Alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    protected void Alimento(String Alimento) {
        System.out.println(Alimento);
    }

}
