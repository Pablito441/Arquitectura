package Creacion_Thread_herencia.Metodo_Join;

public class Ejemplo_join {
    public static void main(String[] args) {
        Obrera agente = new Obrera();
        agente.start();

        // Hace algo durante el cálculo.
        try {
            // Espera a que agente termine
            agente.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Utiliza el resultado.
        System.out.println(agente.getResultado());
    }
}
