package Semana1.Exceptions;

public class MultiCatch {
    public static void main(String[] args) {
        String[] datos = {"10", "0", "abc", null};

        for (String dato : datos) {
            try {
                // Podría lanzar NullPointerException si dato es null
                // Podría lanzar NumberFormatException si no es un número
                int numero = Integer.parseInt(dato);

                // Podría lanzar ArithmeticException si intenta dividir por cero
                int resultado = 100 / numero;

                System.out.println("Resultado: " + resultado);

            } catch (NumberFormatException | ArithmeticException | NullPointerException e) {
                System.out.println("Error al procesar dato \"" + dato + "\": " + e.getClass().getSimpleName());
            }
        }

        System.out.println("Programa finalizado.");
    }
}
