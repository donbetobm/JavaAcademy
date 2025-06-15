package Semana1.InyeccionDependencias;

public class App {

    public static void main(String[] args) {
        RAM ram = new Ram32();
//      RAM ram = new Ram16();

        //Inyectando la dependencia
        Computadora computadora = new Computadora(ram);

        //Usando el objeto ya configurado
        computadora.computar();
    }
}
