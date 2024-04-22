package Concurrencia_Sincronizacion.Ejemplo_Lectores_Y_Escritores;

public class Main {
    public static void main(String[] args) {
        LectoresEscritores monitor = new LectoresEscritores();

        // Crear hilos de lectores
        for (int i = 1; i <= 5; i++) {
            final int idLector = i;
            new Thread(() -> {
                try {
                    while (true) {
                        monitor.leer(idLector);
                        Thread.sleep(1000); // Simular tiempo de lectura
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

        // Crear hilos de escritores
        for (int i = 1; i <= 2; i++) {
            final int idEscritor = i;
            new Thread(() -> {
                try {
                    while (true) {
                        monitor.escribir(idEscritor);
                        Thread.sleep(2000); // Simular tiempo de escritura
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
