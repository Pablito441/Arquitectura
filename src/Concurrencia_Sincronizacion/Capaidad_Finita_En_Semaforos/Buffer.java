package Concurrencia_Sincronizacion.Capaidad_Finita_En_Semaforos;

public interface Buffer {
    void put(Object obj) throws InterruptedException;
    Object get() throws InterruptedException;
}