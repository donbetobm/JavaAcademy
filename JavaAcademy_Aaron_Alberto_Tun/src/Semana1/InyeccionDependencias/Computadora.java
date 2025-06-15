package Semana1.InyeccionDependencias;

public class Computadora {
    private RAM ram;

    public Computadora(RAM ram){
        this.ram = ram;
    }

    public void computar(){
        ram.procesar();
    }
}
