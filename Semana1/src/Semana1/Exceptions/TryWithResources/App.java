package Semana1.Exceptions.TryWithResources;

public class App {
    public static void main(String[] args) {
        LectorArchivo lector = new LectorArchivo();
        lector.leerArchivo("saludo.txt");

        System.out.println("Lectura finalizada.");
    }
}
