package Concurrencia_Sincronizacion.Ejercicio_Filosofo;

import java.util.Random;

class Filosofo extends Thread {
    private int id;
    private Cubierto izquierdo;
    private Cubierto derecho;
    private Random random = new Random();

    public Filosofo(int id, Cubierto izquierdo, Cubierto derecho) {
        this.id = id;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Simula el tiempo que pasa pensando
                System.out.println("El filósofo " + id + " está pensando");
                Thread.sleep(random.nextInt(4000) + 1000);

                // Tratar de tomar los cubiertos
                synchronized (izquierdo) {
                    synchronized (derecho) {
                        // Come si puede tomar ambos cubiertos
                        System.out.println("Filósofo " + id + " comiendo");
                        Thread.sleep(1000);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Cubierto {
    private int id;

    public Cubierto(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

