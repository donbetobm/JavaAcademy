package Semana1.Exceptions.Checked;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        LectorArchivo lector = new LectorArchivo();

        try {
            lector.leerArchivo("ejemplo.txt");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
