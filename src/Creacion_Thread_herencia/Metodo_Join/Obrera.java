package Creacion_Thread_herencia.Metodo_Join;

public class Obrera extends Thread {
    private String resultado = "No calculado";

    public void run() {
        resultado = Calcula();
    }

    String Calcula() {
        // Realiza un cálculo largo.
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Ya calculado";
    }

    public String getResultado() {
        return resultado;
    }
}

