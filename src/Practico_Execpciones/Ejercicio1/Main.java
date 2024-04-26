package Practico_Execpciones.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        try {
            dividir(10, 0); // Llamada a un método que produce una ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Se produjo un error de aritmética: " + e.getMessage());
        }
    }

    public static void dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("División por cero no permitida");
        }
        int resultado = dividendo / divisor;
        System.out.println("El resultado de la división es: " + resultado);
    }
}

