package Tp_AlmacenamientoDeNumeros_y_GestionMemoria.Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class AnalisisRecoleccionBasura {
    public static void main(String[] args) {
        List<Object> lista = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            // Crear muchos objetos
            lista.add(new Object());

            // Liberar objetos periódicamente
            if (i % 100 == 0) {
                lista.clear();
            }
        }
    }
}

