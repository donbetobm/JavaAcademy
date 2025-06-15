package Semana1.Exceptions.Unchecked;

public class Calculadora {
    public int dividir(int a, int b) {
        return a / b; // Puede lanzar ArithmeticException si b es 0
    }

    public int longitudTexto(String texto) {
        return texto.length(); // Puede lanzar NullPointerException si texto es null
    }
}
