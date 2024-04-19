package Creacion_Thread_herencia.Interfaz_Runnable;

public class PingPong implements Runnable {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras

    public PingPong(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    public void run() {
        while(true) {
            System.out.print(word + " ");
            try {
                Thread.sleep(delay); // Se llama a Thread.sleep() correctamente
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}

