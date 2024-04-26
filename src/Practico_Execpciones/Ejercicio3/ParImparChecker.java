package Practico_Execpciones.Ejercicio3;

import java.util.Random;

// Definición de la excepción personalizada
class NumeroImparException extends Exception {
    public NumeroImparException(String message) {
        super(message);
    }
}

public class ParImparChecker {
    public static void main(String[] args) {
        try {
            // Generar un número aleatorio entre 1 y 100
            int numeroAleatorio = generarNumeroAleatorio(1, 100);
            System.out.println("Número generado: " + numeroAleatorio);

            // Verificar si el número generado es par o impar
            verificarParidad(numeroAleatorio);

            System.out.println("El número es par.");
        } catch (NumeroImparException e) {
            System.out.println("¡Error! El número generado es impar: " + e.getMessage());
        }
    }

    // Método para generar un número aleatorio en un rango especificado
    public static int generarNumeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    // Método para verificar si un número es par o lanzar una excepción si es impar
    public static void verificarParidad(int numero) throws NumeroImparException {
        if (numero % 2 != 0) {
            throw new NumeroImparException("El número es impar.");
        }
    }
}

