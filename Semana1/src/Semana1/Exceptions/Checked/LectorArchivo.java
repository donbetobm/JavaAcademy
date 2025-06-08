package Semana1.Exceptions.Checked;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LectorArchivo {
    public void leerArchivo(String ruta) throws IOException {
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        String linea;
        while ((linea = lector.readLine()) != null) {
            System.out.println(linea);
        }
        lector.close();
    }
}
