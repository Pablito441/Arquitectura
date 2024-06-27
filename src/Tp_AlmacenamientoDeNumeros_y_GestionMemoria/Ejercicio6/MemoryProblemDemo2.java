package Tp_AlmacenamientoDeNumeros_y_GestionMemoria.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class MemoryProblemDemo2 {
    public static void main(String[] args) {
        while (true) {
            processBatch();
            try {
                Thread.sleep(10); // Pausa breve para simular procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void processBatch() {
        List<DataHolder2> dataList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            DataHolder2 data = new DataHolder2(i, "Data " + i);
            dataList.add(data);
        }
        // dataList se sale del ámbito aquí, permitiendo que los objetos sean recolectados
    }
}

class DataHolder2 {
    private int id;
    private String data;

    public DataHolder2(int id, String data) {
        this.id = id;
        this.data = data;
    }
}

