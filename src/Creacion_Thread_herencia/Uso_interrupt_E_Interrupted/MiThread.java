package Creacion_Thread_herencia.Uso_interrupt_E_Interrupted;

public class MiThread extends Thread {
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Ejecuto");
        }
        System.out.println("Termino");
        return;
    }
}

