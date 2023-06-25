package EjerciciorobotGuia3;

/*
Disponemos de 3 objetos conocidos: un Hombre, un Robot y una Bateria; sabemos que el Robot
reconoce las órdenes:
• Avanzar(cantidad de pasos)
• Retroceder(cantidad de Pasos)
• Dormir()
• Despertar()
• Recargar()
• bateriaLLena():boolean
• bateriaVacia() :boolean
• energiaActual() :int

También sabemos que un Robot tiene una batería con 1000 unidades de energía y que cada vez
que avanza o retrocede por cada 100 pasos pierde 10 unidades además si damos la orden al robot
de dormir, no responderá al avanzar o retroceder hasta despertarlo.
Para volver a recargar las baterías del robot, bastará con ordenarle que recargue.
 */
public class Robot  {

    public static boolean bateriaLlena(Bateria Pilas){
        int i = Pilas.getCarga();
        if (i>=1000){
            return true;
        }else{
            return false;
        }
    }

    public static int energiaActual(Bateria Pilas,int pasos){

        int energia=Pilas.getCarga()-pasos/10;
        Pilas.setCarga(energia);
        return energia;
    }

    public static boolean Despertar(Bateria Pilas){
        if (Pilas.getCarga()>0){
            System.out.println("Despertando");
            return true;
        }
        return false;
    }
    public static int Avanzar(Bateria Pilas,int pasos){

        return pasos;
    }

    public static int Recargar(Bateria Pilas){
        Pilas.setCarga(1000);

        return Pilas.getCarga();
    }

}

