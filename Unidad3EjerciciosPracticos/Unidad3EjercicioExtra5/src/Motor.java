import java.util.Scanner;
public class Motor {
    /*
        El Motor puede trabajar con 3 velocidades distintas (ALTA, MEDIA y BAJA) y un
        comportamiento consumirAgua que cada vez que se lo invoca consume 10 litros si trabaja a
        velocidad ALTA, 5 litros si trabaja a velocidad MEDIA y 1 litro si trabaja a velocidad BAJA; otro
        comportamiento cambiarVelocidad que cada vez que se lo usa, cambia la velocidad de Alta a
        Media y de Media a Baja y vuelve a empezar.
     */
    private int velocidad;
    private TanqueAgua Ñoki;

    public Motor() {
    }
    public Motor(int velocidad,TanqueAgua Ñoki) {
        this.velocidad=velocidad;
        this.Ñoki=Ñoki;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public TanqueAgua getÑoki() {
        return Ñoki;
    }

    public void setÑoki(TanqueAgua ñoki) {
        Ñoki = ñoki;
    }

    public void consumirAgua(){
        while (Ñoki.Capacidad()==true){

            switch (velocidad){
                case 1:
                    Ñoki.setLitros(Ñoki.getLitros()-1);
                    break;
                case 2:
                    Ñoki.setLitros(Ñoki.getLitros()-5);
                    break;
                case 3:
                    Ñoki.setLitros(Ñoki.getLitros()-10);
            }
        }
    }
    public void cambiarVelocidad(){
        Scanner cambio = new Scanner(System.in);
        velocidad=cambio.nextInt();
        consumirAgua();

    }
}