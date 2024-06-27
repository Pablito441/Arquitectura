package Tp_AlmacenamientoDeNumeros_y_GestionMemoria.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class MemoryProblemDemo1 {
    public static void main(String[] args) {
        List<DataHolder1> dataList = new ArrayList<>();
        while (true) {
            for (int i = 0; i < 1000; i++) {
                DataHolder1 data = new DataHolder1(i, "Data " + i);
                dataList.add(data);
            }
            try {
                Thread.sleep(10); // Pausa breve para simular procesamiento
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DataHolder1 {
    private int id;
    private String data;

    public DataHolder1(int id, String data) {
        this.id = id;
        this.data = data;
    }
}

