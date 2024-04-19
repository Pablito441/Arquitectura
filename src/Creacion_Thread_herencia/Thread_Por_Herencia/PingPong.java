package Creacion_Thread_herencia.Thread_Por_Herencia;

public class PingPong extends Thread {
    private String word; // Lo que va a escribir.
    private int delay; // Tiempo entre escrituras

    public PingPong(String queDecir, int cadaCuantosMs) {
        word = queDecir;
        delay = cadaCuantosMs;
    }

    public void run() { // Se sobrescribe run() de Thread
        while (true) {
            System.out.print(word + " ");
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }

//    public static void main(String[] args) {
//        // Declaración de 2 threads
//        Creacion_Thread_herencia.Interfaz_Runnable.PingPong t1 = new Creacion_Thread_herencia.Interfaz_Runnable.PingPong("PING", 33);
//        Creacion_Thread_herencia.Interfaz_Runnable.PingPong t2 = new Creacion_Thread_herencia.Interfaz_Runnable.PingPong("PONG", 10);
//        // Activación
//        t1.start();
//        t2.start();
//        // Espera 2 segundos
//        try {
//            Thread.sleep(5000); // Utilizar Thread.sleep en lugar de sleep directo
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        // Finaliza la ejecución de los threads
//        t1.interrupt(); // Interrumpir el hilo en lugar de utilizar stop()
//        t2.interrupt(); // Interrumpir el hilo en lugar de utilizar stop()
//    }
}
