package Semana1.Exceptions.Unchecked;

public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Ejemplo 1: División por cero (Semana1.Exceptions.Unchecked)
        try {
            int resultado = calc.dividir(10, 0); // <-- Aquí falla
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero no permitida.");
        }

        // Ejemplo 2: String nulo (Semana1.Exceptions.Unchecked)
        try {
            String texto = null;
            int longitud = calc.longitudTexto(texto); // <-- Aquí falla
            System.out.println("Longitud: " + longitud);
        } catch (NullPointerException e) {
            System.out.println("Error: Texto nulo, no se puede obtener su longitud.");
        }

        // Ejemplo 3: Sin capturar la excepción (para ver que sigue siendo válida)
        int x = calc.dividir(100, 5); // No lanza excepción
        System.out.println("División exitosa: " + x);
    }
}
