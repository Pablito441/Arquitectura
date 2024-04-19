package Creacion_Thread_herencia.Metodo_isAlive;

public class Obrera extends Thread {
    private String resultado = "No calculado";

    public void run() {
        resultado = calcula();
    }

    private String calcula() {
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

class Ejemplo_isAlive {
    public static void main(String[] args) {
        Obrera agente = new Obrera();
        agente.start();
        // Hace algo durante el cálculo.
        // Aquí puedes realizar otras tareas mientras el hilo "agente" está calculando.

        // Espera que agente haya terminado
        while (agente.isAlive()) {
            try {
                agente.join(); // Utilizamos join() en lugar de yield() para esperar a que el hilo termine.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}

