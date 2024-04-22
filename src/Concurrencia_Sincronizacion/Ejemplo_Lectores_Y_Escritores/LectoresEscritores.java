package Concurrencia_Sincronizacion.Ejemplo_Lectores_Y_Escritores;

import java.util.concurrent.Semaphore;

public class LectoresEscritores {
    private int numLectores = 0; // Número de lectores dentro de la sala
    private boolean escribiendo = false; // Indica si hay un escritor dentro de la sala

    private Semaphore mutex = new Semaphore(1); // Semáforo para garantizar la exclusión mutua
    private Semaphore escritura = new Semaphore(1); // Semáforo para permitir acceso exclusivo de escritores

    public void leer(int idLector) throws InterruptedException {
        mutex.acquire(); // Asegurar exclusión mutua al acceder a numLectores
        numLectores++;
        if (numLectores == 1) {
            escritura.acquire(); // Si es el primer lector, bloquear escritura
        }
        mutex.release();

        // Leer el recurso
        System.out.println("Lector " + idLector + " está leyendo.");

        mutex.acquire(); // Asegurar exclusión mutua al acceder a numLectores
        numLectores--;
        if (numLectores == 0) {
            escritura.release(); // Si no hay más lectores, liberar escritura
        }
        mutex.release();
    }

    public void escribir(int idEscritor) throws InterruptedException {
        escritura.acquire(); // Bloquear escritura para evitar escritores concurrentes
        // Escribir en el recurso
        System.out.println("Escritor " + idEscritor + " está escribiendo.");
        escritura.release(); // Liberar escritura después de escribir
    }

}

