public class TanqueAgua {

    /*
    El Tanque de Agua tiene una capacidad máxima es de 10.000 litros y los comportamientos para
    saber si su capacidad está al límite o vacía y otro cargar que cada vez que se lo invoca carga 500
    litros.
     */

    private int litros;
    private boolean estado;

    public TanqueAgua() {
    }
    public TanqueAgua(int litros) {
        this.litros=litros;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }
    public boolean Capacidad(){
        if(litros>10000){
            return estado=true;
        }else if(litros<1 ){
            return estado=false;
        } else if (litros>0) {
            estado=true;
        }

        return estado;
    }
    public void Cargar(){
        if(estado==false){
            litros+=500;
        }
    }

}
