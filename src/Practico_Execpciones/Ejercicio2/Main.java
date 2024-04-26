package Practico_Execpciones.Ejercicio2;
import Practico_Execpciones.Ejercicio2.MatriculaVencidaException;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        try {
            LocalDate fechaVencimiento = LocalDate.of(2025, 12, 12);
            Matricula matricula = new Matricula(123, fechaVencimiento);
            Chofer chofer = new Chofer("Raul", matricula);

            Camion camion = new Camion(90, chofer);
            Auto auto = new Auto(100);

            // Intentamos acelerar el camión y el auto
            camion.acelera(40); // Esto lanzará una MiException si la velocidad supera 120 km/h
            auto.acelera(40);   // Esto lanzará una MiException si la velocidad supera 120 km/h

        } catch (MatriculaVencidaException e) {
            System.out.println("Se produjo una excepción de matrícula vencida: " + e.getMessage());

        } catch (MiException e) {
            System.out.println("Se produjo una excepción al acelerar: " + e.getMessage());
        } finally {
            // Código que se ejecuta siempre, independientemente de si se lanzó una excepción o no
            System.out.println("Finalizando la ejecución del programa...");
        }
    }
}

