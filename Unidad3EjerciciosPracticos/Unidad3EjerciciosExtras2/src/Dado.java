import java.util.Random;

public class Dado {

    private int num;

    public void Dado(){

        generarNum();

    }

    public void generarNum(){

        Random Num = new Random();
        int Lado= Num.nextInt(1,6);
        num+=Lado;

    }

    public int verNum(){

        return num;

    }
}
