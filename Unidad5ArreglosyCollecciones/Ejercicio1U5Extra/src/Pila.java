import java.util.ArrayList;
import java.util.Deque;

public class Pila {

    private int tope=-1;
    private String[] elementos;

    public int getTope() {
        return tope;
    }

    public Pila(int tamaño){
        elementos = new String[tamaño];
    }

    public String[] getElementos() {
        return elementos;
    }

    public void agregar(String elem){
        tope++;
        if(tope<elementos.length){
            elementos[tope]=elem;
        }

    }

    public String verTope(){

        return elementos[tope];
    }

    public String quitar(){
        elementos[tope]="";
        tope--;
        return elementos[tope];
    }

    public boolean pilaVacia(){
        if(tope==-1){
            return true;
        }
        return false;
    }

    public boolean pilaLlena(){
        if(tope==elementos.length-1){
            return true;
        }
        return false;
    }

}
