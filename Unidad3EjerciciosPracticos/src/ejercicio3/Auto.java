package ejercicio3;

import java.awt.*;

/*
A- El auto debe tener: color, patente y combustible con una carga inicial de 50lts. El auto sólo
tendrá como comportamiento:
• Avanzar: Al que le indicaremos la cantidad de metros que deseamos avance y deberemos tener
en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay combustible
suficiente.
• Retroceder: Al que le indicaremos la cantidad de metros que deseamos retroceda y deberemos
tener en cuenta que por cada 10 mts consume 1lt de combustible y solo podrá avanzar si hay
combustible suficiente.

• LlenarTanque: Llenará el tanque de este auto nuevamente con 50lts de combustible.
 */
public class Auto {

    private String color;
    private String patente;
    private double combustible;
    private Rueda[] ruedas;
    public Auto(String rojo, String abc123){ }

    public Auto (String color,String patente,Float combustible){
        this.color=color;
        this.patente=patente;
        this.combustible=50.0f;
        this.ruedas = new Rueda[4]; // Auto con 4 ruedas
        // Inicializar las ruedas del auto
        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Rueda();
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }



    /*
    public void CompAuto(float mts,Float combustible){
        Float tanque=combustible;
       int resp=0;
        do {
            if (tanque > 0) {
                if (mts > 0) {
                    tanque = tanque - mts / 10;
                } else {
                    tanque = tanque - mts / 10;
                }
            } else {
                System.out.println("El auto se a quedado sin combustible");

            }

        }while (resp == 1);
        System.out.println("Tanque: L"+tanque);
    }
*/

    public void avanzar(int metros) {
        double consumo = metros / 10.0;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println("El auto avanzó " + metros + " metros.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar.");
        }
    }

    public void retroceder(int metros) {
        double consumo = metros / 10.0;
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println("El auto retrocedió " + metros + " metros.");
        } else {
            System.out.println("No hay suficiente combustible para retroceder.");
        }
    }

    public void llenarTanque() {
        combustible = 50.0; // Llenar el tanque con 50 litros
        System.out.println("El tanque del auto ha sido llenado.");
    }

    public void inflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.inflar();
        }
        System.out.println("Las ruedas del auto han sido infladas.");
    }

    public void desinflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.desinflar();
        }
        System.out.println("Las ruedas del auto han sido desinfladas.");
    }

}
