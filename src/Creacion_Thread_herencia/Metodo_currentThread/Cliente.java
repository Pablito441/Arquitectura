package Creacion_Thread_herencia.Metodo_currentThread;
public class Cliente extends Thread {
    public void run() {
        Recurso.uso();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

