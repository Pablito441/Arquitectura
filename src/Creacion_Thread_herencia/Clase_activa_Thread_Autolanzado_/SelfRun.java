package Creacion_Thread_herencia.Clase_activa_Thread_Autolanzado_;

public class SelfRun implements Runnable {
    private Thread internalThread;
    private volatile boolean noStopRequired; // Usamos volatile para garantizar visibilidad entre hilos

    public SelfRun() {
        System.out.println("Comienza ejecución");
        noStopRequired = true;
        internalThread = new Thread(this);
        internalThread.start();
    }

    public void run() {
        while (noStopRequired) {
            System.out.println("En ejecución");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // Se interrumpe el hilo, salir del bucle
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public void stopRequest() {
        noStopRequired = false;
        internalThread.interrupt();
    }

    public static void main(String[] args) {
        SelfRun objActivo = new SelfRun();
        // Espera durante 2 segundos
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        // Termina el objeto activo
        System.out.println("main invoca stopRequest()");
        objActivo.stopRequest();
    }
}
